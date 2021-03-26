package service.prrv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import model.PrrvDTO;
import repository.prrv.PrrvRepository;

public class PrrvService {
	@Autowired
	PrrvRepository prrvRepository;
	public void prrvList(Model model) {
		List<PrrvDTO> list = prrvRepository.prrvSelect();
		System.out.println(list.size());
		model.addAttribute("prrvList", list);
	}


}
