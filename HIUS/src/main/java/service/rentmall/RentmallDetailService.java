package service.rentmall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import model.RentDTO;
import repository.rentmall.RentmallRepository;

public class RentmallDetailService {
	@Autowired
	RentmallRepository rentmallRepository;
	public void execute(String no, Model model) {
		RentDTO dto = rentmallRepository.getSelectDetail(no);
		model.addAttribute("lent", dto);
	}
}
