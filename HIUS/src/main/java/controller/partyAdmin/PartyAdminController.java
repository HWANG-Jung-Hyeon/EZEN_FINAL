package controller.partyAdmin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.inject.internal.Errors;

import Validator.PartyCommandValidator;
import command.PartyCommand;
import service.partyAdmin.PartyDeleteProService;
import service.partyAdmin.PartyDetailService;
import service.partyAdmin.PartyJoinService;
import service.partyAdmin.PartyListService;
import service.partyAdmin.PartyModifyService;

@Controller
@RequestMapping("partyAdmin")
public class PartyAdminController {
	@Autowired
	PartyJoinService partyJoinService;
	@Autowired
	PartyListService partyListService;
	@Autowired
	PartyDetailService partyDetailService;
	@Autowired
	PartyModifyService partyModifyService;
	@Autowired
	PartyDeleteProService partyDeleteProService;
	@RequestMapping(value="regist", method = RequestMethod.POST)
	public String regist(Model model) {
		model.addAttribute("partyCommand", new PartyCommand());
		return "partyAdmin/partyForm";
	}
	@RequestMapping("partyJoin")
	public String partyJoin(PartyCommand partyCommand, Errors errors, HttpServletRequest request) {
		new PartyCommandValidator().validate(partyCommand, errors);
		if(errors.hasErrors()) {
			return "partyAdmin/partyForm";
		}
		partyJoinService.execute(partyCommand, request);
		return "redirect:/party/partyList";
	}
	@RequestMapping("partyList")
	public String partyList(
		@RequestParam(value="page", defaultValue= "1")Integer page, Model model){
			partyListService.execute(model, page);
		return "partyAdmin/partyList";
	}
	@RequestMapping("partyDetail")
	public String partyDetail(
		@RequestParam(value="prPl") String prPl, Model model) {
		partyDetailService.execute(prPl, model);
		return "partyAdmin/partyDetail";
	}
	@RequestMapping("partyModify/{prPl}")
	public String partyModify(
			@PathVariable(value ="prPl") String prPl, Model model) {
		partyDetailService.execute(prPl, model);
		return "partyAdmin/partyModify";
	}
	@RequestMapping("partyModifyPro")
	public String partyModifyPro(PartyCommand partyCommand, HttpSession session) {
		partyModifyService.execute(partyCommand, session);
		return "redirect:/partyAdmin/partyDetail?prPl="+partyCommand.getPrPl();
	}
	@RequestMapping("partyDelete/{prPl}")
	public String partyDelete(
			@PathVariable(value="prPl") String prPl) {
		partyDeleteProService.execute(prPl);
		return "redirect:../partyList";
	}
		
	
}
