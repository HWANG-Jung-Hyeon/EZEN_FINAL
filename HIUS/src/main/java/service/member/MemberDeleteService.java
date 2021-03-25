package service.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.ui.Model;

import model.AuthInfo;
import model.MemberDTO;
import repository.member.MemberRepository;

public class MemberDeleteService {
	@Autowired
	MemberRepository memberRepository;
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	public String execute(String memPw, HttpSession session, Model model) {
		MemberDTO dto = new MemberDTO();
		AuthInfo authInfo = (AuthInfo)session.getAttribute("authInfo");
		dto.setMemId(authInfo.getUserId());
		dto = memberRepository.selectByMember(dto);
		if(bCryptPasswordEncoder.matches(memPw, dto.getMemPw())) {
			memberRepository.deleteMember(dto);
			session.invalidate();
			return "redirect:/";
		}else {
			model.addAttribute("err","비밀번호가 틀렸습니다.");
			return " member/memberDelForm";
		}
	}

}
