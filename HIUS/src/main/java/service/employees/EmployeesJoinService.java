package service.employees;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;

import command.EmployeesCommand;
import model.EmpDTO;
import repository.employees.EmployeesRepository;

public class EmployeesJoinService {
	@Autowired
	EmployeesRepository employeesRepository;
	public void numUpdate(EmployeesCommand employeesCommand) {
		EmpDTO dto = new EmpDTO();
		dto.setEMP_ID(employeesCommand.getEMP_ID());
		dto.setEMP_PW(employeesCommand.getEMP_PW());
		dto.setEMP_NAME(employeesCommand.getEMP_NAME());
		dto.setEMP_BIRTH(new Timestamp(employeesCommand.getEMP_BIRTH().getTime()));
		dto.setEMP_EMAIL(employeesCommand.getEMP_EMAIL());
		dto.setEMP_ADDR(employeesCommand.getEMP_ADDR());
		dto.setGender(employeesCommand.getGENDER());
		dto.setEMP_PH(employeesCommand.getEMP_PH());
		System.out.println(dto.getEMP_ID());
		System.out.println(dto.getEMP_PW());
		System.out.println(dto.getEMP_NAME());
		System.out.println(dto.getEMP_BIRTH());
		System.out.println(dto.getEMP_ADDR());
		System.out.println(dto.getEMP_PH());
		System.out.println(dto.getGender());
		employeesRepository.insertEmployee(dto);
	}
}
