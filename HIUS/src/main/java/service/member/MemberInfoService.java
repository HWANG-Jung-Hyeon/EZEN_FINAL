package service.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;

import command.MemberCommand;
import command.MemberPwCommand;
import model.AuthInfo;
import model.MemberDTO;
import repository.member.MemberRepository;

public class MemberInfoService {
	@Autowired
	MemberRepository memberRepository;
	@Autowired
	BCryptPasswordEncoder bcryptPasswordEncoder;
	public String pwUpdate(String memPw,HttpSession session,
			Model model) {
		MemberDTO dto = new MemberDTO();
		AuthInfo authInfo = (AuthInfo)session.getAttribute("authInfo");
		dto.setMemId(authInfo.getUserId());
		dto = memberRepository.selectByMember(dto);
		if(bcryptPasswordEncoder.matches(memPw,dto.getMemPw())){
			model.addAttribute("memberPwCommand", new MemberPwCommand());
			return "member/memberPwModify";
		}else {
			model.addAttribute("err", "비밀번호가 틀립니다.");
			return "member/memberPwForm";
		}
	}
	public void memberUpdate(MemberCommand memberCommand,
			Errors errors) {
		MemberDTO dto = new MemberDTO();
		dto.setMemId(memberCommand.getMemId());
		dto = memberRepository.selectByMember(dto);
		if(dto != null) {
			if(bcryptPasswordEncoder.matches(
					memberCommand.getMemPw(), 
					dto.getMemPw())){
				dto.setMemId(memberCommand.getMemId());
				dto.setMemAddr(memberCommand.getMemAddr());
				dto.setMemPh(memberCommand.getMemPh());
				memberRepository.updateMember(dto);
			}else {
				errors.rejectValue("MemPw","wrong");
			}
		}
	}
	public void execute(HttpSession session, 
			Model model) {
		AuthInfo authInfo = 
				(AuthInfo)session.getAttribute("authInfo");
		MemberDTO dto = new MemberDTO();
		dto.setMemId(authInfo.getUserId());
		dto = memberRepository.selectByMember(dto);
		model.addAttribute("memberCommand",dto);
	}
}
