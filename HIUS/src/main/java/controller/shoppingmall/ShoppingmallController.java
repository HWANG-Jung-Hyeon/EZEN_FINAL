package controller.shoppingmall;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import command.ShopOrderCommand;
import service.shoppingmall.ShopCartListService;
import service.shoppingmall.ShopCartService;
import service.shoppingmall.ShoppingDetailService;
import service.shoppingmall.ShoppingmallService;

@Controller
@RequestMapping("shop")
public class ShoppingmallController {
	@Autowired
	ShoppingmallService shoppingmallService;
	@Autowired
	ShoppingDetailService shoppingDetailService;
	@Autowired
	ShopCartService shopCartService;
	@Autowired
	ShopCartListService shopCartListService;
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
//	@RequestMapping("shopOrder")
//	public String shopOrder(ShopgoodsCommand shopgoodsCommand) {
//		shopOrderService.shopOrder(shopgoodsCommand);
//		return "shop/shopOrder";
//	}
	@RequestMapping("shopCart")
	public String shopCart(ShopOrderCommand shopOrderCommand,Model model, HttpSession session) {
		shopCartService.shopCart(shopOrderCommand, model, session);
		return "shop/orderOk";	
	}
	
	@RequestMapping("shopCartList")
	public String shopCartList(Model model , HttpSession session) {
		shopCartListService.shopCartList(model, session);
		return "shop/shopCartList";
	}
	
	
	
}

