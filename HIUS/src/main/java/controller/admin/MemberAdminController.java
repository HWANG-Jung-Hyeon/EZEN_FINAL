package controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import command.MemberCommand;
import service.admin.MemberDeleteProService;
import service.admin.MemberDetailService;
import service.admin.MemberListService;
import service.admin.MemberModifyService;

@Controller
@RequestMapping("admin")
public class MemberAdminController {
	@Autowired
	MemberListService memberListService;
	@Autowired
	MemberDetailService memberDetailService;
	@Autowired
	MemberModifyService memberModifyService;
	@Autowired
	MemberDeleteProService memberDeleteProService;
	
	@RequestMapping("memberList")
	public String memberList(
			@RequestParam(value="page", defaultValue = "1")Integer page, Model model) {
		memberListService.execute(model, page);
		return "admin/memberList";
	}
	@RequestMapping("memberDetail")
	public String memberDetail(
			@RequestParam(value="memId")String memId, Model model) {
		memberDetailService.execute(memId,model);
		return "admin/memberDetail";
	}
	@RequestMapping("memberModify/{memId}")
	public String memberModify(
			@PathVariable(value ="memId") String memId, Model model) {
		memberDetailService.execute(memId, model);
		return "admin/memberModify";
	}
	@RequestMapping("memberModifyPro")
	public String memberModifyPro(MemberCommand memberCommand) {
		memberModifyService.execute(memberCommand);
		return "redirect:/admin/memberDetail?memId="+memberCommand.getMemId();
	}
	@RequestMapping("memberDelete/{memId}")
	public String memberDelete(
			@PathVariable(value ="memId") String memId) {
		memberDeleteProService.execute(memId);
		return "redirect:../memberList";
	}
}
