package service.rentmall;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import command.RentBuyInfoCommand;
import model.AuthInfo;
import model.RentOrderDTO;
import model.RentPayDTO;
import repository.rentmall.RentmallRepository;

public class RentBuyInfoService {
	@Autowired
	RentmallRepository rentmallRepository;
	public void rentBuyInfo (RentBuyInfoCommand rentBuyInfoCommand, Model model, HttpSession session) {
		String memId = ((AuthInfo)session.getAttribute("authInfo")).getUserId();
		RentOrderDTO dto = new  RentOrderDTO();
		dto.setRentRcvName(rentBuyInfoCommand.getResName());
		dto.setRentAddr(rentBuyInfoCommand.getPhoneNum());
		dto.setRentOrderNo(rentBuyInfoCommand.getRentOrderNo());		
		
		rentmallRepository.rentOrderUpdate(dto);
		RentPayDTO dto1 = new RentPayDTO();
		dto1.setRentOrderNo(rentBuyInfoCommand.getRentOrderNo());
		dto1.setCardCo(rentBuyInfoCommand.getCardCo());
		dto1.setRentPayMet(rentBuyInfoCommand.getCardNum());
		dto1.setRentPaySum(rentBuyInfoCommand.getRentPay());
		rentmallRepository.rentPayInsert(dto1);
		model.addAttribute("dto", dto1);
		System.out.println("sjbvsdxvh");
	}
}
