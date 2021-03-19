package controller.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import command.EmployeesCommand;
import service.employees.EmployeesDetailService;
import service.employees.EmployeesJoinService;
import service.employees.EmployeesListService;
@Controller
@RequestMapping("employees")
public class EmployeesController {
	@Autowired
	EmployeesJoinService employeesJoinService;
	@Autowired
	EmployeesListService employeesListService;
	@Autowired
	EmployeesDetailService employeesDetailService;
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
	@RequestMapping("empDetail")
	public String empDetail(
			@RequestParam(value="EMP_ID") String EMP_ID,Model model) {
		System.out.println(EMP_ID);
		employeesDetailService.empDetail(EMP_ID,model);
		return "emp/empDetail";
	}
}
