package controller.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import command.EmployeesCommand;
import service.employees.EmployeesJoinService;
import service.employees.EmployeesListService;
@Controller
@RequestMapping("employees")
public class EmployeesController {
	@Autowired
	EmployeesJoinService employeesJoinService;
	@Autowired
	EmployeesListService employeesListService;
	@RequestMapping("empRegist")
	public String empRegist() {
		return "emp/empRegist";
	}
	@RequestMapping("empJoinAction")
	public String empJoin(EmployeesCommand employeesCommand) {
		employeesJoinService.numUpdate(employeesCommand);
		return "redirect:/employees/empRegist";
	}
	@RequestMapping("empList")
	public String empList(Model model) {
		employeesListService.empList(model);
		return "emp/empList";
	}
}
