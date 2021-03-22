package service.employees;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import command.EmployeesCommand;
import model.EmpDTO;
import repository.employees.EmployeesRepository;

public class EmployeesDetailService {
	@Autowired
	EmployeesRepository employeesRepository;
	public void empDetail( String empId, Model model) {
		System.out.println(empId);
		EmpDTO dto = employeesRepository.empDetail(empId);
		model.addAttribute("empDetail", dto);
	}
	public void empModify(String empId, Model model) {
		EmpDTO dto = employeesRepository.empModify(empId);
		model.addAttribute("empModify", dto);
	}
	public void empModifyAction(EmployeesCommand employeesCommand, Model model) {
		EmpDTO dto = new EmpDTO();
		dto.setEmpId(employeesCommand.getEmpId());
		dto.setEmpPw(employeesCommand.getEmpPw());
		dto.setEmpName(employeesCommand.getEmpName());
		dto.setEmpBirth(new Timestamp(employeesCommand.getEmpBirth().getTime()));
		dto.setEmpEmail(employeesCommand.getEmpEmail());
		dto.setEmpAddr(employeesCommand.getEmpAddr());
		dto.setGender(employeesCommand.getGender());
		dto.setEmpPh(employeesCommand.getEmpPh());
		employeesRepository.empModifyAction(dto);
	}
}
