package controller.lent;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import command.LentCommand;
import service.lent.LentDetailService;
import service.lent.LentRegistService;
import service.lent.LentService;

@RequestMapping(value="lent")
public class LentController {
	@Autowired
	LentRegistService lentRegistService;
	@Autowired
	LentService lentService;
	@Autowired 
	LentDetailService lentDetailService;

	@RequestMapping( value = "lentList", method = RequestMethod.GET )
	public String lentList(Model model) {
		lentService.execute(model);
		return "lent/lentList";
	}
	@RequestMapping(value = "lentRegist", method = RequestMethod.GET)
	public String lentRegist() {
		return "lent/lentRegist";
	}
	@RequestMapping(value = "lentRegistOK", method = RequestMethod.POST)
	public String lentRegistOK(LentCommand lentCommand, HttpSession session) {
		lentRegistService.execute(lentCommand, session);
		return "lent/lentRegistOK";
	}
	@RequestMapping(value = "lentDetail", method = RequestMethod.GET)
	public String lentDetial(@RequestParam(value = "no")Integer no ,Model model)	{
		lentDetailService.lentDetail(no , model);
		return "lent/lentDetail";
	}
	@RequestMapping(value = "/lent/lentRevise", method = RequestMethod.GET)
	public String lentRevise(@Request(value = "no") Integer no, Model model) {
		lentReviseService.execute(no, model);
		return "lent/lentRevise";
	}
}
