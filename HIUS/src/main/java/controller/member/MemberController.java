package controller.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import command.MemberCommand;
import model.MemberDTO;
import service.member.MemberDeleteService;
import service.member.MemberDetailService;
import service.member.MemberJoinService;
import service.member.MemberListService;

@Controller
@RequestMapping("member")
public class MemberController {
	@Autowired
	MemberJoinService memberJoinService;
	@Autowired
	MemberListService memberListService;
	@Autowired
	MemberDetailService memberDetailService;
	@Autowired
	MemberDeleteService memberDeleteService;
	@RequestMapping("memberRegist")
	public String memberRegist() {
	 return "member/memberRegist";
	}
	@RequestMapping("memberJoinAction")
	public String memberJoinAction(MemberCommand memberCommand) {
		memberJoinService.numUpdate(memberCommand);
		return "redirect:/member/memberRegist";
	}
	@RequestMapping("memberList")
	public String memberList(Model model) {
		memberListService.memberList(model);
		return "member/memberList";
	}
	@RequestMapping("memberDetail")
	public String memberDetail(
			@RequestParam(value="mem_id") String memId, Model model) {
	 System.out.println(memId);
	 memberDetailService.memberDetail(memId, model);
	 return "member/memberDetail";
	}
	@RequestMapping("memberModify")
	public String memberModify(
			@RequestParam(value="mem_id") String memId, Model model) {
		memberDetailService.memberModify(memId,model);
		return "member/memModify";
	}
	@RequestMapping("memberModifyAction")
	public String MemberModifyAction(MemberCommand memberCommand, Model model) {
		memberDetailService.memberModifyAction(memberCommand, model);
		return " redirect:/member/memberDetail?memId="+memberCommand.getMemId();
	}
	@RequestMapping("memberDelete")
	public String memberDelete(
			@RequestParam(value="memId") MemberDTO dto) {
		memberDeleteService.memberDelete(dto);
		return "redirect:/member/memberList";
	}
	
	
}
