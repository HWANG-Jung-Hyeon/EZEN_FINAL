package service.rentmall;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import model.AuthInfo;
import model.RentBuyListDTO;
import repository.rentmall.RentmallRepository;

public class RentBuyListService {
	@Autowired
	RentmallRepository rentmallRepository;
	public void rentBuyList (Model model, HttpSession session) {
		String memId = ((AuthInfo)session.getAttribute("authInfo")).getUserId();
		List<String> orderNos = rentmallRepository.getOrderNo(memId);
		List<RentBuyListDTO> lists = new ArrayList<RentBuyListDTO>();
		for(String orderNo : orderNos) {
			System.out.println(orderNo);
			RentBuyListDTO dto = rentmallRepository.rentBuyList(orderNo);
			lists.add(dto);
		}
		model.addAttribute("lists", lists);
	}
}
