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
	public void empDetail( String EMP_ID, Model model) {
		System.out.println(EMP_ID);
		EmpDTO dto = employeesRepository.empDetail(EMP_ID);
		model.addAttribute("empDetail", dto);
	}
	public void empModify(String EMP_ID, Model model) {
		EmpDTO dto = employeesRepository.empModify(EMP_ID);
		model.addAttribute("empModify", dto);
	}
	public void empModifyAction(EmployeesCommand employeesCommand, Model model) {
		EmpDTO dto = new EmpDTO();
		dto.setEMP_ID(employeesCommand.getEMP_ID());
		dto.setEMP_PW(employeesCommand.getEMP_PW());
		dto.setEMP_NAME(employeesCommand.getEMP_NAME());
		dto.setEMP_BIRTH(new Timestamp(employeesCommand.getEMP_BIRTH().getTime()));
		dto.setEMP_EMAIL(employeesCommand.getEMP_EMAIL());
		dto.setEMP_ADDR(employeesCommand.getEMP_ADDR());
		dto.setGender(employeesCommand.getGENDER());
		dto.setEMP_PH(employeesCommand.getEMP_PH());
		employeesRepository.empModifyAction(dto);
	}
}
