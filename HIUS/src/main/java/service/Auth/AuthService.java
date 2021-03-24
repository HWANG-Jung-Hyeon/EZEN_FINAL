package service.Auth;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.Errors;

import command.LoginCommand;
import model.AuthInfo;
import model.MemberDTO;
import repository.member.MemberRepository;

public class AuthService {
	@Autowired
	MemberRepository memberRepository;
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	private AuthInfo authInfo;
	public void authenticate(LoginCommand loginCommand, Errors errors, HttpSession session) {
		MemberDTO dto = new MemberDTO();
		dto.setMemId(loginCommand.getLoginId());
		dto = memberRepository.selectByMember(dto);
		if(dto == null) {
			errors.rejectValue("loginId", "notId");
		}else {
			if(bCryptPasswordEncoder.matches(loginCommand.getLoginPw(), dto.getMemPw())) {
				authInfo = new AuthInfo(dto.getMemId(), dto.getMemEmail(), dto.getMemName());
				session.setAttribute("authInfo", authInfo);
					
				}else {
					errors.rejectValue("loginPw", "wrong");
				}
				
			}
		}
	}

