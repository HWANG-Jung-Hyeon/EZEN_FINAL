package service.partyAdmin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import model.PartyDTO;
import repository.party.PartyRepository;

@Service
public class PartyDetailService {
	@Autowired
	PartyRepository partyRepository;
	public void execute(String prPl, Model model) {
		PartyDTO dto = new PartyDTO(); 
		dto.setPrPl(prPl);
		List<PartyDTO> list = 
				partyRepository.getPartyCount(prPl);
		model.addAttribute("partyCommand", list.get(0));
		
	}
	
}
