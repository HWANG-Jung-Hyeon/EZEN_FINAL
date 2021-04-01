package controller.party;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import command.PartyAdminCommand;
import service.party.PartyCartListService;
import service.party.PartyInfoService;
import service.party.PartyReservationService;
import service.party.PartyRoomDetailService;

@Controller
@RequestMapping("partyRoom")
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
	public String partyInfo(Model model) {
		partyInfoService.execute(model);
		return "partyRoom/partyInfo";		
	}
	@RequestMapping("roomDetail")	// partyDetail에서 roomDetail로 수정(requestMapping value 중복으로 인한 실행 오류)
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
