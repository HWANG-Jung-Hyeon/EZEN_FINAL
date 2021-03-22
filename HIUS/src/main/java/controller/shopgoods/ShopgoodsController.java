package controller.shopgoods;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import command.ShopgoodsCommand;
import service.shopgoods.ShopgoodsJoinService;
import service.shopgoods.ShopgoodsListService;

@Controller
@RequestMapping("shopgoods")
public class ShopgoodsController {
	@Autowired
	ShopgoodsJoinService shopgoodsJoinService;
	@Autowired
	ShopgoodsListService shopgoodsListService;
	@RequestMapping(value="shopgoodsRegist" , method = RequestMethod.GET)
	public String shopgoodsRegist() {
		return "shopgoods/shopgoodsRegist";
	}
	@RequestMapping("shopgoodsJoinAction")
	public String shopgoodsJoin(ShopgoodsCommand shopgoodsCommand,
			HttpSession session) {
		shopgoodsJoinService.shopgoodsJoin(shopgoodsCommand, session);
		return "redirect:/shopgoods/shopgoodsRegist";
	}
	@RequestMapping("shopgoodsList")
	public String shopgoodsList(Model model) {
		shopgoodsListService.shopgoodsList(model);
		return "shopgoods/shopgoodsList";
	}
}

