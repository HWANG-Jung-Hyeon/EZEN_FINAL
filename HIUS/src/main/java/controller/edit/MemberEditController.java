package controller.edit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import command.MemberCommand;
import service.edit.MemberDetailService;
import service.edit.MemberListService;
import service.edit.MemberModifyService;

@Controller
@RequestMapping("edit")
public class MemberEditController {
	@Autowired
	MemberListService memberListService;
	@Autowired
	MemberDetailService memberDetailService;
	@Autowired
	MemberModifyService memberModifyService;

	@RequestMapping("memberList")
	public String memberList(
			@RequestParam(value = "page",defaultValue = "1") 
				Integer page,	Model model) {
		memberListService.execute(model, page);
		return "edit/memberList";
	}
	@RequestMapping("memberInfo")
	public String memberInfo(
			@RequestParam(value = "memId") String memId,
			Model model) {
		memberDetailService.execute(memId,model);
		return "edit/memberInfo";
	}
	@RequestMapping("memberModify/{memId}")
	public String memberModify(
			@PathVariable(value = "memId") String memId, Model model) {
		memberDetailService.execute(memId,model);
		return "edit/memberModify";
	}
	@RequestMapping("memberModifyPro")
	public String memberModifyPro(MemberCommand memberCommand) {
		memberModifyService.execute(memberCommand);
		return "redirect:memberInfo?userId="+memberCommand.getMemId();
	}
}
