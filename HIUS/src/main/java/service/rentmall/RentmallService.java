package service.rentmall;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import model.RentDTO;
import repository.rentmall.RentmallRepository;

@Service
public class RentmallService {
	@Autowired
	RentmallRepository rentmallRepository;
	public void execute(Model model) {
		List <RentDTO> list = rentmallRepository.rentmall();
		System.out.println(list.size());
		model.addAttribute("list", list);
	}
}
