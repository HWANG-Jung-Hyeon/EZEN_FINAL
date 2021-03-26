package controller.rentmall;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import service.rentmall.RentmallDetailService;
import service.rentmall.RentmallService;

@RequestMapping(value="rent")
public class RentrmallController {
	@Autowired
	RentmallService rentmallService;
	@Autowired
	RentmallDetailService rentmallDetailService;
	
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

}


