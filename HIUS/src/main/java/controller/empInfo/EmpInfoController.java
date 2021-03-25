package controller.empInfo;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import service.empInfo.EmpInfoService;

@Controller
@RequestMapping("employees")
public class EmpInfoController {
	@Autowired
	EmpInfoService empInfoService;
	@RequestMapping("empInfo")
	public String empInfo( Model model,HttpSession session) {
			empInfoService.empInfo( model, session);
			return "employees/empInfo";
	}
}
