package service.employees;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;

import command.EmpCommand;
import model.EmpDTO;
import repository.employees.EmployeesRepository;

public class EmployeesJoinService {
	@Autowired
	EmployeesRepository employeesRepository;
	public void numUpdate(EmpCommand empCommand) {
		EmpDTO dto = new EmpDTO();		
		dto.setEMP_ID(empCommand.getEMP_ID());
		dto.setEMP_PW(empCommand.getEMP_PW());
		dto.setEMP_NAME(empCommand.getEMP_NAME());
		
		dto.setEMP_BIRTH(new Timestamp(empCommand.getEMP_BIRTH().getTime()));
		dto.setEMP_EMAIL(empCommand.getEMP_EMAIL());
		dto.setEMP_ADDR(empCommand.getEMP_ADDR());
		dto.setGENDER(empCommand.getGender());
		dto.setEMP_PH(empCommand.getEMP_PH());
		employeesRepository.empinsert(dto);
	}
}
