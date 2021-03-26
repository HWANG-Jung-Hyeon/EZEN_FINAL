package service.shoppingmall;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import model.ShopgoodsDTO;
import repository.shoppingmall.ShoppingmallRepository;

public class ShoppingmallService {
	@Autowired
	ShoppingmallRepository shoppingmallRepository;
	public void shopMain(Model model) {
		List<ShopgoodsDTO> list = shoppingmallRepository.shopSelect();
		System.out.println(list.size());
		model.addAttribute("shopMain", list);
	}
}
