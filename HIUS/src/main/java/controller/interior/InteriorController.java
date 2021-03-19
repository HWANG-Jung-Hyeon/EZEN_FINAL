package controller.interior;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("interior")
public class InteriorController {
	@RequestMapping("main")
	public String main() {
		return "interior/interiorMain";
	}
	@RequestMapping("addGoods")
	public String addGoods() {
		return "interior/addGoodsForm";
	}
	
}
