package service.party;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import model.PartyDTO;
import repository.party.PartyRepository;
@Service
public class PartyInfoService {
	@Autowired
	PartyRepository partyRepository;
	public void execute(Model model, Integer page) {
		PartyDTO dto = new PartyDTO();
		List <PartyDTO> list = partyRepository.getPartyList(dto);
		System.out.println(list.size());
		model.addAttribute("list", list);
		int count = partyRepository.getPartyCount();
		model.addAttribute("count", count);
		
	}

}
