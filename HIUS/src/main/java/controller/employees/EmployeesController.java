package controller.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import command.EmployeesCommand;
import service.employees.EmpPloyeesDeleteService;
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
	@Autowired
	EmpPloyeesDeleteService empPloyeesDeleteService;
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
	@RequestMapping("empModify")
	public String empModify(
			@RequestParam(value="EMP_ID") String EMP_ID,Model model) {
		employeesDetailService.empModify(EMP_ID,model);
		return "emp/empModify";
	}
	@RequestMapping("empModifyAction")
	public String empModifyAction(EmployeesCommand employeesCommand, Model model) {
		employeesDetailService.empModifyAction(employeesCommand, model);
		return "redirect:/employees/empDetail?EMP_ID="+employeesCommand.getEMP_ID();
	}
	@RequestMapping("empDelete")
	public String empDelete(
			@RequestParam(value="EMP_ID") String EMP_ID) {
		empPloyeesDeleteService.empDelete(EMP_ID);
		return "redirect:/employees/empList";
	}
}
