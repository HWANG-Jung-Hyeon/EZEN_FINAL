package service.party;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import model.PartyDTO;
import repository.party.PartyRepository;

public class PartyDetailService {
	@Autowired
	PartyRepository partyRepository;
	public void partyDetail(String prNo, Model model) {
		PartyDTO dto = new PartyDTO();
		dto.setPrNo(prNo);
		List<PartyDTO> list = partyRepository.getPartyList(dto);
		model.addAttribute("party", list.get(0));
	}
	
}
