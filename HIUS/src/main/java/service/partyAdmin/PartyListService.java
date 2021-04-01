package service.partyAdmin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import model.PartyDTO;
import repository.party.PartyRepository;

public class PartyListService {
	@Autowired
	PartyRepository partyRepository;
	
	public void partyList(Model model) {
		List<PartyDTO> list =  partyRepository.getPartyList();
		model.addAttribute("partyList", list);
		
	}
			
}
