package controller.interior;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;

import Validator.GoodsCommandValidate;
import command.GoodsCommand;
import service.goods.GoodsAddService;

@Controller
@RequestMapping("interior")
public class InteriorController {
	@Autowired
	GoodsAddService goodsAddService;
	
	@RequestMapping("main")
	public String main() {
		return "interior/interiorMain";
	}
	@RequestMapping("addGoods")
	public String addGoods() {
		return "interior/addGoodsForm";
	}
	@RequestMapping("intGoodsAddAction")
	public String intGoodsAddAction(GoodsCommand goodsCommand, Errors errors, HttpServletRequest request) {
		new GoodsCommandValidate().validate(goodsCommand, errors);
		if(errors.hasErrors()) {
			return "interior/addGoodsForm";
		}
		goodsAddService.goodsAdd(goodsCommand, request);
		return "redirect:/interior/goodsList";
	}
	
}
