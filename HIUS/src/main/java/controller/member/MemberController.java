package controller.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import command.MemberCommand;
import service.member.MemberJoinService;
import service.member.MemberListService;

@Controller
public class MemberController {
	@Autowired
	MemberJoinService memberJoinService;
	@Autowired
	MemberListService memberListService;
	@RequestMapping("member/memRegist")
	public String MemRegist() {
	 return "member/memRegist";
	}
	@RequestMapping("member/MemberJoinAction")
	public String memJoin(MemberCommand memberCommand) {
		memberJoinService.numUpdate(memberCommand);
		return "redirect:/member/memRegist";
	}
	@RequestMapping("member/memberList")
	public String memList(Model model) {
		memberListService.memList(model);
		return "member/memberList";
	}
}
