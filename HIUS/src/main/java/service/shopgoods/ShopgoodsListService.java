package service.shopgoods;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import model.ShopgoodsDTO;
import repository.shopgoods.ShopgoodsRepository;

public class ShopgoodsListService {
	@Autowired
	ShopgoodsRepository shopgoodsRepository;
	public void shopgoodsList(Model model) {
		List<ShopgoodsDTO> list = shopgoodsRepository.shopgoodsSelect();
		model.addAttribute("shopgoodsList", list);
	}
}
