package service.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.Errors;

import command.MemberPwCommand;
import model.AuthInfo;
import model.MemberDTO;
import repository.member.MemberRepository;

public class MemberPwModifyService {
	@Autowired
	MemberRepository memberRepository;
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	public void execute(MemberPwCommand memberPwCommand, 
			HttpSession session, Errors errors) {
		MemberDTO dto = new MemberDTO();
		AuthInfo authInfo = (AuthInfo)session.getAttribute("authInfo");
		dto.setMemId(authInfo.getMemId());
		dto = memberRepository.selectByMember(dto);
		if(!bCryptPasswordEncoder.matches(memberPwCommand.getOldPw(), dto.getMemPw())) {
			errors.rejectValue("oldPw", "wrong");
		}else {
			dto.setMemPw(bCryptPasswordEncoder.encode(memberPwCommand.getNewPw()));
			memberRepository.pwUpdate(dto);
		}
	}
}
