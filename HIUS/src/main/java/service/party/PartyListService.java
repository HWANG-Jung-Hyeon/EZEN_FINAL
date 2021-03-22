package service.party;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import controller.PageAction;
import model.PartyDTO;
import model.StartEndPageDTO;
import repository.party.PartyRepository;

public class PartyListService {
	@Autowired
	PartyRepository partyRepository;
	public void getPartyList(Model model, Integer page) {
		int limit = 10; 
		int limitPage = 10;
		Long startRow = ((long)page -1 ) * limit +1;
		Long endRow = startRow + limit -1;
		PartyDTO dto = new PartyDTO();
		dto.setStartEndPageDTO(
				new StartEndPageDTO(startRow,endRow));
		List<PartyDTO> list =  partyRepository.getPartyList(dto);
		int count = partyRepository.getPartyCount();
		model.addAttribute("list", list);
		model.addAttribute("count", count);
		
		PageAction pageAction = new PageAction();
		pageAction.page(
				model, count, limit, limitPage, page,"partyList?");
	}
			
}
