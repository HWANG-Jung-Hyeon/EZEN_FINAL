package service.employees;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import model.EmpDTO;
import repository.employees.EmployeesRepository;

public class EmployeesDetailService {
	@Autowired
	EmployeesRepository employeesRepository;
	public void empDetail( String EMP_ID, Model model) {
		System.out.println(EMP_ID);
		EmpDTO dto = employeesRepository.empDetail(EMP_ID);
		model.addAttribute("empDatail", dto);
	}
	
}
