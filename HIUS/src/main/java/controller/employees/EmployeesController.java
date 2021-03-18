package controller.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import command.EmpCommand;
import service.employees.EmployeesJoinService;

@Controller
@RequestMapping("employees")
public class EmployeesController {
	@Autowired
	EmployeesJoinService employeesJoinService;
	@RequestMapping("empRegist")
	public String empRegist() {
		return "employees/empregist";
	}
	@RequestMapping("empJoinAction")
	public String empJoin(EmpCommand empCommand) {
		employeesJoinService.numUpdate(empCommand);
		return "redirect:employees/empregist";
	}

}
