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
			@RequestParam(value="emp_id") String empId,Model model) {
		System.out.println(empId);
		employeesDetailService.empDetail(empId,model);
		return "emp/empDetail";
	}
	@RequestMapping("empModify")
	public String empModify(
			@RequestParam(value="emp_id") String empId,Model model) {
		employeesDetailService.empModify(empId,model);
		return "emp/empModify";
	}
	@RequestMapping("empModifyAction")
	public String empModifyAction(EmployeesCommand employeesCommand, Model model) {
		employeesDetailService.empModifyAction(employeesCommand, model);
		return "redirect:/employees/empDetail?EMP_ID="+employeesCommand.getEmpId();
	}
	@RequestMapping("empDelete")
	public String empDelete(
			@RequestParam(value="emp_id") String empId) {
		empPloyeesDeleteService.empDelete(empId);
		return "redirect:/employees/empList";
	}
}
