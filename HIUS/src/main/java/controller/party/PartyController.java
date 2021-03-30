package controller.party;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import command.PartyAdminCommand;
import service.party.PartyCartListService;
import service.party.PartyInfoService;
import service.party.PartyReservationService;
import service.party.PartyRoomDetailService;

@Controller
@RequestMapping("party")
public class PartyController {
	@Autowired
	PartyInfoService partyInfoService;
	@Autowired
	PartyRoomDetailService partyRoomDetailService;
	@Autowired
	PartyReservationService partyReservationService;
	@Autowired
	PartyCartListService partyCartListService;
	@RequestMapping("partyInfo")
	public String partyInfo(
			@RequestParam(value = "page", defaultValue = "1")
			Integer page, Model model) {
		partyInfoService.execute(model, page);
		return "PartyRoom/partyInfo";		
	}
	@RequestMapping("partyDetail")
	public String partyDetail(
			@RequestParam(value = "prPl")String prPl, Model model) {
		partyRoomDetailService.execute(prPl, model);
			return " partyRoom/partyDetail";
	}
	@RequestMapping("partyReservation")
	public String partyResevation(PartyAdminCommand partyAdminCommand, HttpSession session, Model model) {
		partyReservationService.execute(partyAdminCommand, session, model);
		return "partyRoom/reserveOk";
	}
	@RequestMapping("partyCartList")
	public String partyCartList(Model model, HttpSession session) {
		partyCartListService.execute(model, session);
		return "partyRoom/partyCartList";
	}
	
}
