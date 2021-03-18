package controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import command.MemberCommand;
import service.employees.MemberJoinService;

@Controller
public class MemberController {
	@RequestMapping("member/memRegist")
	public String MemRegist() {
	 return "member/memRegist";
	}
	@RequestMapping("MemberJoinAction")
	public String memJoin(MemberCommand memberCommand) {
		MemberJoinService.numupdate(memberCommand);
		return "redirect:/member/memRegist";
	}
}
