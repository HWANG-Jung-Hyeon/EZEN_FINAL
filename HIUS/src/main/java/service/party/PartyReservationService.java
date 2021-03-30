package service.party;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import command.PartyAdminCommand;
import model.AuthInfo;
import model.PartyCartDTO;
import repository.party.PartyRepository;
	
public class PartyReservationService {
	@Autowired
	PartyRepository partyRepository;
	public void execute(PartyAdminCommand partyAdminCommand, HttpSession session, Model model) {
		String memId = ((AuthInfo)session.getAttribute("authInfo")).getUserId();
		PartyCartDTO dto = new PartyCartDTO();
		String prrvNo = partyRepository.getPrrvNo(memId);
		dto.setMemId(memId);
		if(prrvNo == null)	{
			prrvNo = partyRepository.revCart();
			dto.setPrrvNo(prrvNo);
			partyRepository.prrvInsert(dto);
		}else {
			dto.setPrrvNo(prrvNo);
			partyRepository.updateParty(dto);
		}
	
	PartyCartDTO cartdto = new PartyCartDTO();
	cartdto.setPrrvNo(partyAdminCommand.getPrrvNo());
	cartdto.setPrrvDate(partyAdminCommand.getPrrvDate());
	cartdto.setPrrvStartTime(partyAdminCommand.getPrrvStartTime());
	cartdto.setPrrvEndTime(partyAdminCommand.getPrrvEndTime());
	
	partyRepository.getPartyOrder(cartdto);
	}
	
}
