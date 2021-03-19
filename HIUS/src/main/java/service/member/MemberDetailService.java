package service.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;

import command.MemberCommand;
import model.AuthInfo;
import model.MemDTO;
import repository.member.MemberRepository;

public class MemberDetailService {
	@Autowired
	MemberRepository memberRepository;
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	public void execute(HttpSession session, Model model) {
		AuthInfo authInfo = (AuthInfo)session.getAttribute("authInfo");
		MemDTO dto = new MemDTO();
		dto.setMEM_ID(authInfo.getMEM_ID());
		dto = memberRepository.memSelect(dto);
		model.addAttribute("memberCommand", dto);
	}
	public void memberUpdate(MemberCommand memberCommand, Errors errors) {
		MemDTO dto = new MemDTO();
		dto.setMEM_ID(memberCommand.getMEM_ID());
		dto = memberRepository.memSelect(dto);
		if(dto!= null) {
			if(bCryptPasswordEncoder.matches(memberCommand.getMEM_PW(),dto.getMEM_PW())) {
				dto.setMEM_ID(memberCommand.getMEM_ID());
				dto.setMEM_PH(memberCommand.getMEM_PH());
				dto.setMEM_ADDR(memberCommand.getMEM_ADDR());
				dto.setMEM_EMAIL(memberCommand.getMEM_EMAIL());	
			}
			memberRepository.UpdateMember(dto);
		}else {
			errors.rejectValue("MEM_PW","wrong");
		}
	}

}
