package service.party;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import model.AuthInfo;
import model.PartyOrderDTO;
import repository.party.PartyRepository;

public class PartyCartListService {
	@Autowired
	PartyRepository partyRepository;
	public void execute(Model model, HttpSession session) {
		String memId = ((AuthInfo)session.getAttribute("authInfo")).getUserId();
		List<PartyOrderDTO> list = partyRepository.getPartyOrderList(memId);
		model.addAttribute("lists", list);
	}

}
