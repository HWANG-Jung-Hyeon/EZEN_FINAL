package service.prrv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import model.PrrvDTO;
import repository.prrv.PrrvRepository;

public class PrrvDetailService {
	@Autowired
	PrrvRepository prrvRepository;
	public void prrvDetail(String prrvNo, Model model) {
		PrrvDTO dto = prrvRepository.prrvDetail(prrvNo);
		model.addAttribute("prrvDetail",dto);
		
	}

}
