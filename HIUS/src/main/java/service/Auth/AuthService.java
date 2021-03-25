package service.Auth;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.Errors;

import command.LoginCommand;
import model.AuthInfo;
import repository.login.LoginRepository;

public class AuthService {
	@Autowired
	LoginRepository loginRepository;
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	AuthInfo authInfo;
	public void authenticate(LoginCommand loginCommand, Errors errors, HttpSession session) {
		System.out.println(loginCommand.getLoginId());
		authInfo = loginRepository.loginSelect(loginCommand.getLoginId());
		if(authInfo == null) {
			errors.rejectValue("loginId", "notId");
		}else {
			if(bCryptPasswordEncoder.matches(loginCommand.getLoginPw(),
					authInfo.getUserPw())) {
				session.setAttribute("authInfo", authInfo);
				
			}else {
				errors.rejectValue("loginPw", "wrong");
			}
		}
	}
}