package controller.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;

import Validator.MemberPasswordValidator;
import command.MemberPwCommand;
import service.member.MemberDeleteService;
import service.member.MemberPwModifyService;

@Controller
@RequestMapping("member")
public class MemberInfoController {
	@Autowired
	MemberPwModifyService memberPwModifyService;
	@Autowired
	MemberDeleteService memberDeleteService;
	@RequestMapping("memberPwModifyPro")
	public String memberPwModifyPro(MemberPwCommand memberPwCommand,
			Errors errors, HttpSession session) {
		new MemberPasswordValidator().validate(memberPwCommand, errors);
		if(errors.hasErrors()) {
			return "member/memberPwModify";		
		}
	return "redirect:memberDetail";
	}
}
	
	

