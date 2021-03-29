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
import command.IntRevCommand;
import service.interior.GoodsDetailService;
import service.interior.IntAddService;
import service.interior.IntListService;
import service.interior.ReviewAddService;
import service.interior.ReviewDetailService;
import service.interior.ReviewListService;

@Controller
@RequestMapping("interior")
public class InteriorController {
	@Autowired
	IntAddService intAddService;
	@Autowired
	IntListService intListService;
	@Autowired
	GoodsDetailService goodsDetailService;
	@Autowired
	ReviewAddService reviewAddService;
	@Autowired
	ReviewDetailService reviewDetailService;
	@Autowired
	ReviewListService reviewListService;
	
	@RequestMapping("main")
	public String main() {
		return "interior/interiorMain";
	}
	@RequestMapping("addInterior")
	public String addGoodsForm() {
		return "interior/goods/addInteriorForm";
	}
	@RequestMapping("intGoodsAddAction")
	public String intGoodsAddAction(GoodsCommand goodsCommand, Errors errors, HttpServletRequest request) {
		new GoodsCommandValidate().validate(goodsCommand, errors);
		if(errors.hasErrors()) {
			return "interior/goods/addInteriorForm";
		}
		intAddService.interiorAdd(goodsCommand, request);
		return "redirect:/interior/interiorList";
	}
	
	@RequestMapping("interiorList")
	public String interiorList(@RequestParam(value = "page", defaultValue = "1") Integer page, Model model) {
		intListService.getIntList(model, page);
		return "interior/goods/interiorList";
	}
	
	@RequestMapping("consultForm")
	public String consultForm() {
		return "interior/consult/consultForm";
	}
	
	@RequestMapping("reviewList")
	public String reviewList(@RequestParam(value="page", defaultValue = "1")Integer page, Model model) {
		reviewListService.getReviewList(page, model);
		return "interior/review/reviewList";
	}
	
	@RequestMapping("writeReview")
	public String writeReview(@RequestParam(value="goodsNo")String goodsNo, Model model) {
		goodsDetailService.goodsDetail(goodsNo, model);
		return "interior/review/reviewForm";
	}
	
	@RequestMapping("intReviewWriteAction")
	public String intReviewWriteAction(IntRevCommand revCommand, HttpServletRequest request) {
		reviewAddService.reviewAdd(revCommand, request);
		return "redirect:/interior/writeSuccess";
	}
	
	@RequestMapping("writeSuccess")
	public String writeSuccess() {
		return "interior/review/writeEnd";
	}
	
	@RequestMapping("reviewDetail")
	public String reviewDetail(@RequestParam(value="reviewNo")String reviewNo, Model model, HttpServletRequest request) {
		if(reviewNo == null) {
			reviewNo = reviewAddService.reviewNo(model, request);
		}
		reviewDetailService.reviewDetail(reviewNo, model);
		return "interior/review/reviewDetail";
	}
}
