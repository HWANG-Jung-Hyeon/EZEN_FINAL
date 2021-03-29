package controller.party;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import service.party.PartyInfoService;
import service.party.PartyRoomDetailService;

@Controller
@RequestMapping("party")
public class PartyController {
	@Autowired
	PartyInfoService partyInfoService;
	@Autowired
	PartyRoomDetailService partyRoomDetailService;
	
	@RequestMapping("partyInfo")
	public String partyList(
			@RequestParam(value = "page", defaultValue = "1")
			Integer page, Model model) {
		partyInfoService.execute(model, page);
		return "PartyRoom/partyList";		
	}
	@RequestMapping("partyDetail")
	public String partyDetail(
			@RequestParam(value = "prPl")String prPl, Model model) {
		partyRoomDetailService.execute(prPl, model);
			return " partyRoom/partyDetail";
	}

}
