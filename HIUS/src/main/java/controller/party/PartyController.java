package controller.party;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;

import Validator.PartyCommandValidator;
import command.PartyCommand;
import service.party.PartyWriteService;

@Controller
@RequestMapping("partyRoom")
public class PartyController {
	@Autowired
	PartyWriteService partyWriteService;
	
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
		return "redirect:/partyRoom/partyList";
	}
}
