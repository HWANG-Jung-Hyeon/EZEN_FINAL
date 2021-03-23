package service.lent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import model.RentDTO;
import repository.lent.LentRepository;

public class LentDetailService {
	@Autowired
	LentRepository lentRepository;
	public void lentDetail(Integer no, Model model) {
		RentDTO dto = lentRepository.getSelectDetail(no);
		model.addAttribute("lent", dto);
	}
	
}