package controller.shoppingmall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import service.shoppingmall.ShoppingDetailService;
import service.shoppingmall.ShoppingmallService;

@Controller
@RequestMapping("shop")
public class ShoppingmallController {
	@Autowired
	ShoppingmallService shoppingmallService;
	@Autowired
	ShoppingDetailService shoppingDetailService;
	@RequestMapping("shoppingmall")
	public String shopMain(Model model) {
		shoppingmallService.shopMain(model);
		return "shop/shoppingmall";
	}
	@RequestMapping("shoppingmallDetail")
	public String shopDetail(
		@RequestParam(value="shopgoodsNo") String shopgoodsNo, Model model) {
		shoppingDetailService.shopDetail(shopgoodsNo,model);
		return "shop/shoppingDetail";
	}
}

