package controller.lent;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import command.LentCommand;
import service.lent.LentRegistService;
import service.lent.LentService;

@RequestMapping(value="lent")
public class LentController {
	@Autowired
	LentRegistService lentRegistService;
	@Autowired
	LentService lentService;
	
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
}
