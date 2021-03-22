package service.party;

import java.io.File;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import model.PartyDTO;
import repository.party.PartyRepository;

public class PartyDeleteService {
	@Autowired
	PartyRepository partyRepository;
	public void execute(String prPl, HttpSession session) {
		PartyDTO dto = new PartyDTO();
		dto.setPrPl(prPl);
		dto = partyRepository.getPartyList(dto).get(0);
		String filePath = session.getServletContext().getRealPath("WEB_INF/partyRoom/upload");
		String [] store = dto.getPrImg().split("'");
		for(String f : store) {
			File file = new File(filePath + "/" + f);
			file.delete();
		}
		partyRepository.partyDelete(prPl);
	}
}
