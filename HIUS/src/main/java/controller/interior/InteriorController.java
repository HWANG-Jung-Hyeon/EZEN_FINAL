package controller.interior;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;

import Validator.GoodsCommandValidate;
import command.GoodsCommand;
import service.interior.IntAddService;

@Controller
@RequestMapping("interior")
public class InteriorController {
	@Autowired
	IntAddService intAddService;
	
	@RequestMapping("main")
	public String main() {
		return "interior/interiorMain";
	}
	@RequestMapping("addInterior")
	public String addGoodsForm() {
		return "interior/addInteriorForm";
	}
	@RequestMapping("intGoodsAddAction")
	public String intGoodsAddAction(GoodsCommand goodsCommand, Errors errors, HttpServletRequest request) {
		new GoodsCommandValidate().validate(goodsCommand, errors);
		if(errors.hasErrors()) {
			return "interior/addInteriorForm";
		}
		intAddService.InteriorAdd(goodsCommand, request);
		return "redirect:/interior/interiorList";
	}
	
	@RequestMapping("interiorList")
	public String interiorList() {
		return "interior/interiorList";
	}
	
	@RequestMapping("consultForm")
	public String consultForm() {
		return "interior/consultForm";
	}
	
	@RequestMapping("reviewList")
	public String reviewList() {
		return "interior/reviewList";
	}
	
}
