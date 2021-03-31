package service.rentmall;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import model.AuthInfo;
import model.RentOrderBuyDTO;
import repository.rentmall.RentmallRepository;

public class RentOrderBuyService {
	@Autowired
	RentmallRepository rentmallRepository;
	public void rentOrderBuy(Model model, HttpSession session) {
		String memId = 
				((AuthInfo)session.getAttribute("authInfo")).getUserId();
		List<RentOrderBuyDTO> list = rentmallRepository.orderList(memId);
		System.out.println(list.size());
		model.addAttribute("lists", list);
		System.out.println("sjbvsdxvh");
	}
}
