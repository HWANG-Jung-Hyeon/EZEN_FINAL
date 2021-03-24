package controller.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Validator.MemberCommandValidator;
import Validator.MemberPasswordValidator;
import command.MemberCommand;
import command.MemberPwCommand;
import service.member.MemberDeleteService;
import service.member.MemberInfoService;
import service.member.MemberPwModifyService;

@Controller
@RequestMapping("mem")
public class MemberInfoController {
	@Autowired
	MemberInfoService memberInfoService;
	@Autowired
	MemberPwModifyService memberPwModifyService;
	@Autowired
	MemberDeleteService memberDeleteService;
	@RequestMapping("memberUserDel")
	public String memberUserDel() {
		return "member/memberDelForm";
	}
	@RequestMapping("memberPwModifyPro")
	public String memberPwModifyPro(MemberPwCommand memberPwCommand,
			Errors errors, HttpSession session) {
		new MemberPasswordValidator().validate(memberPwCommand, errors);
		if(errors.hasErrors()) {
			return "member/memberPwModify";		
		}
	return "redirect:memberDetail";
	}
	@RequestMapping("memberPwModify")
	public String memberPwModify(
			@RequestParam(value = "memPw") String memPw,
			HttpSession session, Model model) {
		String path = memberInfoService.pwUpdate(
				memPw, session, model);
		return path;		
	}
	@RequestMapping("memberPwform")
	public String memberPwform() {
		return "member/memberPwForm";
	}
	@RequestMapping("memberModifyPro")
	public String memberModifyPro(
			MemberCommand memberCommand,
			Errors errors) {
		new MemberCommandValidator().validate(
				memberCommand, errors);
		memberInfoService.memberUpdate(memberCommand,errors);
		if(errors.hasErrors()) {
			return "member/memberModify";
		}
		return "redirect:memberDetail";
	}
	@RequestMapping("memberDetail")
	public String memberDetail(HttpSession session,
			Model model) {
		memberInfoService.execute(session,model);
		return "member/memberDetail";
	}
	@RequestMapping("memberModify")
	public String memberModify(HttpSession session,
			Model model) {
		memberInfoService.execute(session,model);
		return "member/memberModify";
	}
}
	

