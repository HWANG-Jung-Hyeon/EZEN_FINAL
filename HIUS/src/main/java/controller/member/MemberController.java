package controller.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import command.MemberCommand;
import service.member.MemberJoinService;

@Controller
public class MemberController {
	@Autowired
	MemberJoinService memberJoinService;
	@RequestMapping("member/memRegist")
	public String MemRegist() {
	 return "member/memRegist";
	}
	@RequestMapping("member/MemberJoinAction")
	public String memJoin(MemberCommand memberCommand) {
		memberJoinService.numUpdate(memberCommand);
		return "redirect:/member/memRegist";
	}
<<<<<<< HEAD
=======
	@RequestMapping("member/memberList")
	public String memList() {
		return "member/memberList";
	}
	
>>>>>>> branch 'main' of https://github.com/pkjohn91/EzenITFinalProject.git
}
