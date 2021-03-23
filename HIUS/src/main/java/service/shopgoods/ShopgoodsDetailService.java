package service.shopgoods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import model.ShopgoodsDTO;
import repository.shopgoods.ShopgoodsRepository;

public class ShopgoodsDetailService {
	@Autowired
	ShopgoodsRepository shopgoodsRepository;
	public void shopgoodsDetail(String shopgoodsNo, Model model) {
		ShopgoodsDTO dto = shopgoodsRepository.shopgoodsDetail(shopgoodsNo);
		model.addAttribute("shopgoodsDetail",dto);
	}
}
