package controller.rentmall;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import command.RentCommand;
import service.rentmall.RentCartListService;
import service.rentmall.RentCartService;
import service.rentmall.RentmallDetailService;
import service.rentmall.RentmallService;

@RequestMapping(value="rent")
public class RentrmallController {
	@Autowired
	RentmallService rentmallService;
	@Autowired
	RentmallDetailService rentmallDetailService;
	@Autowired
	RentCartService rentCartService;
	@Autowired
	RentCartListService rentCartListService;
	@RequestMapping(value = "rentmall", method = RequestMethod.GET)
	public String rentmall(Model model) {
		rentmallService.execute(model);
		return "rent/rentmall";
	}
	@RequestMapping(value = "rentmallDetail", method = RequestMethod.GET)
	public String rentmallDetail(
			@RequestParam(value = "no")String no, Model model) {
		rentmallDetailService.execute(no, model);
		return "rent/rentDetail";
	}
	@RequestMapping(value = "rentCart")
	public String rentCart(RentCommand rentCommand, Model model, HttpSession session) {
		rentCartService.rentCart(rentCommand, model, session);
		return "rent/rentOk";
	}
	@RequestMapping(value = "rentCartList")
	public String rentCartList( Model model, HttpSession session) {
		 rentCartListService.rentCartList(model, session);
		return "rent/rentCartList";
	}
}


