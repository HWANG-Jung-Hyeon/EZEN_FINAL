package controller.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Validator.MemberCommandValidator;
import Validator.MemberPasswordValidator;
import command.MemberCommand;
import command.MemberPwCommand;
import service.admin.MemberModifyService;
import service.member.MemberDeleteService;
import service.member.MemberInfoService;
import service.member.MemberJoinService;
import service.member.MemberPwModifyService;

@Controller
@RequestMapping("member")
public class MemberController {
	@Autowired
	MemberJoinService memberJoinService;
	@Autowired
	MemberInfoService memberInfoService;
	@Autowired
	MemberModifyService memberModifyService;
	@Autowired
	MemberPwModifyService memberPwModifyService;
	@Autowired
	MemberDeleteService memberDeleteService;
	
	@RequestMapping("agree")
	public String agree() {
		return "member/agree";
	}
	@RequestMapping(value="regist", method = RequestMethod.POST)
	public String regist(Model model) {
		model.addAttribute("memberCommand", new MemberCommand());
		return "member/memberForm";
	}
	@RequestMapping(value = "memberJoin")
	public String memberJoin(MemberCommand memberCommand, Errors errors, Model model) {
		new MemberCommandValidator().validate(memberCommand, errors);
		if(errors.hasErrors()) {
			return "member/memberForm";
		}
		memberJoinService.execute(memberCommand);
		return "member/memberWelcome";
	}
	@RequestMapping("memberInfo")
	public String memberInfo(HttpSession session, Model model) {
		memberInfoService.execute(session, model);
		return "member/memberInfo";
	}
	@RequestMapping("memberModify")
	public String memberModify(HttpSession session, Model model) {
		memberInfoService.execute(session, model);
		return "member/memberModify";
	}
	@RequestMapping("memberModifyPro")
	public String memberModifyPro(MemberCommand memberCommand, Errors errors) {
		new MemberCommandValidator().validate(memberCommand, errors);
		memberInfoService.memberUpdate(memberCommand, errors);
		if(errors.hasErrors()) {
			return "member/memberModify";
		}
		return "redirect:memberInfo";
	}
	@RequestMapping("memberPwform")
	public String memberPwform() {
		return "member/memberPwForm";
	}
	@RequestMapping("memberPwModify")
	public String memberPwModify (
			@RequestParam(value="memPw") String memPw, HttpSession session, Model model) {
		String path = memberInfoService.pwUpdate(memPw, session, model);
		return path;
	}
	@RequestMapping("memberPwModifyPro")
	public String memberPwModifyPro(MemberPwCommand memberPwCommand, Errors errors, HttpSession session) {
		new MemberPasswordValidator().validate(memberPwCommand, errors);
		memberPwModifyService.execute(memberPwCommand, session, errors);
		if(errors.hasErrors()) {
			return "member/memberPwModify";
		}
		return "redirect:memberInfo";
	}
	@RequestMapping("memberUserDel")
	public String memberUserDel() {
		return "member/memberDelForm";
	}
	
	@RequestMapping("memberUserDelPro")
	public String memberUserDelPro(
			@RequestParam(value ="memPw")String memPw, HttpSession session, Model model) {
		String path = memberDeleteService.execute(memPw, session, model);
		return path;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}