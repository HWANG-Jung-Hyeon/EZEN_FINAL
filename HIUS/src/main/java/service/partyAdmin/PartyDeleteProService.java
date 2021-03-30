package service.partyAdmin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.party.PartyRepository;

@Service
public class PartyDeleteProService {
	@Autowired
	PartyRepository partyRepository;
	public void execute(String prPl) {
		partyRepository.deleteParty(prPl);
	}

}
