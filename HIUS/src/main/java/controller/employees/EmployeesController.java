package controller.employees;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeesController {
	@RequestMapping("/employees/empRegist")
	public String emp_regist() {
		return "employees/empregist";
	}
}
