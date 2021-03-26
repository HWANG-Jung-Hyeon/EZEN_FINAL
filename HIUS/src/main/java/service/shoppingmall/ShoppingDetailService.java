package service.shoppingmall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import model.ShopgoodsDTO;
import repository.shoppingmall.ShoppingmallRepository;

public class ShoppingDetailService {
	@Autowired
	ShoppingmallRepository shoppingmallRepository;
	public void shopDetail(String shopgoodsNo, Model model) {
		ShopgoodsDTO dto = shoppingmallRepository.shopDetail(shopgoodsNo);
		model.addAttribute("shopDetail",dto);
	}
}
