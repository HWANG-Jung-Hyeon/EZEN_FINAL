package service.rentmall;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import model.AuthInfo;
import model.RentCartListDTO;
import repository.rentmall.RentmallRepository;

public class RentCartListService {
	@Autowired
	RentmallRepository rentmallRepository;
	public void rentCartList ( Model model, HttpSession session) {
		String memId = ((AuthInfo)session.getAttribute("authInfo")).getUserId();
		List<RentCartListDTO> list = rentmallRepository.rentCartList(memId);
		model.addAttribute("lists", list);
	}
}
