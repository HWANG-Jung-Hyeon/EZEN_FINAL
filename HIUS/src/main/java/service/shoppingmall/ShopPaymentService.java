package service.shoppingmall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import command.ShopPayCommand;
import model.ShopCartDTO;
import model.ShopPayDTO;
import repository.shoppingmall.ShoppingmallRepository;

public class ShopPaymentService {
	@Autowired
	ShoppingmallRepository shoppingmallRepository;
	public void shopPayment(ShopPayCommand shopPayCommand, Model model) {
		ShopPayDTO dto = new ShopPayDTO();
		ShopCartDTO dto1 = new ShopCartDTO();
		dto1.setRcvName(shopPayCommand.getRcvName());
		dto1.setRcvAddr(shopPayCommand.getRcvAddr());
		dto1.setOrderNo(shopPayCommand.getOrderNo());
		dto.setShopPaysum(shopPayCommand.getShopPaysum());
		dto.setShopPaymet(shopPayCommand.getShopPaymet());
		dto.setOrderNo(shopPayCommand.getOrderNo());
		
		shoppingmallRepository.updateOrder(dto1);
		shoppingmallRepository.insertPay(dto);
		model.addAttribute("dto", dto);
	}
}
