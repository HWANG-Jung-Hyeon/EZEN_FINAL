package controller.party;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Validator.PartyCommandValidator;
import command.PartyCommand;
import service.party.PartyDetailService;
import service.party.PartyListService;
import service.party.PartyUpdateService;
import service.party.PartyWriteService;

@Controller
@RequestMapping("pr")
public class PartyController {
	@Autowired
	PartyWriteService partyWriteService;
	@Autowired
	PartyListService partyListService;
	@Autowired
	PartyDetailService partyDetailService;
	@Autowired
	PartyUpdateService partyUpdateService;
	@RequestMapping("partyForm")
	public String partyForm(PartyCommand partyCommand) {
		return "partyRoom/partyForm";
	}
	@RequestMapping("partyPro")
	public String partyPro(PartyCommand partyCommand, Errors errors, HttpServletRequest request) {
		new PartyCommandValidator().validate(partyCommand, errors);
		if(errors.hasErrors()) {
			return "partyRoom/partyForm";
		}
		partyWriteService.partyWrite(partyCommand, request);
		return "redirect:/pr/partyList";
	}
	@RequestMapping("partyList")
	public String partyList(
			@RequestParam(value = "page", defaultValue = "1")
			Integer page, Model model) {
		partyListService.getPartyList(model, page);
		return "PartyRoom/partyList";		
	}
	@RequestMapping("partyDetail")
	public String partyDetail(
			@RequestParam(value = "prNo")String prNo, Model model) {
		partyDetailService.partyDetail(prNo, model);
			return " partyRoom/partyDetail";
	}
	@RequestMapping("partyModify")
	public String partyModify(
			@RequestParam(value ="prNo")String prNo, Model model) {
		partyDetailService.partyDetail(prNo, model);
		return "partyRoom/partyModify";
	}
	@RequestMapping("partyModifyPro")
	public String partyModifyPro(PartyCommand partyCommand, HttpSession session) {
		partyUpdateService.execute(partyCommand, session);
		return "redirect:partyDetail?prPl="+partyCommand.getPrPl();
	}
			
}
