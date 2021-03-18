package service.employees;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import model.EmpDTO;
import repository.employees.EmployeesRepository;

public class EmployeesListService {
	@Autowired
	EmployeesRepository employeesRepository;
	public void empList(Model model) {
		List<EmpDTO> list = employeesRepository.empSelect();
		model.addAttribute("empList", list);
	}
}
