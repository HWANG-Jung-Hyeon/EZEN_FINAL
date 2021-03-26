package controller.prrv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import service.prrv.PrrvDetailService;
import service.prrv.PrrvService;

@Controller
@RequestMapping("prrv")
public class PrrvController {
	@Autowired
	PrrvService prrvService;
	@Autowired
	PrrvDetailService prrvDetailService;
	@RequestMapping("prrvList")
	public String prrvList(Model model)  {
		prrvService.prrvList(model);
		return "prrv/prrvList";
	}
	@RequestMapping("prrvDetail")
	public String prrvDetail(
		@RequestParam(value="prrvNo") String prrvNo, Model model) {
		prrvDetailService.prrvDetail(prrvNo, model);
		return "prrv/prrvDetail";
	}
		
	
}
