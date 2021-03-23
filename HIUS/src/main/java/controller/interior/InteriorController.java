package controller.interior;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Validator.GoodsCommandValidate;
import command.GoodsCommand;
import service.interior.IntAddService;
import service.interior.IntListService;

@Controller
@RequestMapping("interior")
public class InteriorController {
	@Autowired
	IntAddService intAddService;
	@Autowired
	IntListService intListService;
	
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
	public String interiorList(@RequestParam(value = "page", defaultValue = "1") Integer page, Model model) {
		intListService.getIntList(model, page);
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
