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
		dto.setEmpId(employeesCommand.getEmpId());
		dto.setEmpPw(employeesCommand.getEmpPw());
		dto.setEmpName(employeesCommand.getEmpName());
		dto.setEmpBirth(new Timestamp(employeesCommand.getEmpBirth().getTime()));
		dto.setEmpEmail(employeesCommand.getEmpEmail());
		dto.setEmpAddr(employeesCommand.getEmpAddr());
		dto.setGender(employeesCommand.getGender());
		dto.setEmpPh(employeesCommand.getEmpPh());
		System.out.println(dto.getEmpId());
		System.out.println(dto.getEmpPw());
		System.out.println(dto.getEmpName());
		System.out.println(dto.getEmpBirth());
		System.out.println(dto.getEmpAddr());
		System.out.println(dto.getEmpPh());
		System.out.println(dto.getGender());
		employeesRepository.insertEmployee(dto);
	}
}
