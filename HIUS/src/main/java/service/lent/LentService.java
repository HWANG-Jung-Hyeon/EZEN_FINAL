package service.lent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import model.RentDTO;
import repository.lent.LentRepository;

@Service
public class LentService {
	@Autowired
	LentRepository lentRepository;
	public void execute(Model model) {
		List<RentDTO> list = lentRepository.listAllSelect();


		model.addAttribute("lists", list);

	}
}
