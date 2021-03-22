package controller.party;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import service.party.PartyDetailService;
import service.party.PartyListService;

@Controller
@RequestMapping("parman")
public class ParmanController {
	@Autowired
	PartyListService partyListService;
	@Autowired
	PartyDetailService partyDetailService;
	
	@RequestMapping("partyList")
	public String partyList(
			@RequestParam(value ="page", defaultValue = "1")Integer page, Model model) {
		partyListService.getPartyList(model, page);
		return "partyRoom/parmanList";
	}
	@RequestMapping("partyDetail/{prPl}")
	public String partyDetail(
			@PathVariable(value = "prPl")String prPl, Model model) {
		partyDetailService.partyDetail(prPl, model);
		return "partyRoom/parmanDetail";
	}
}
