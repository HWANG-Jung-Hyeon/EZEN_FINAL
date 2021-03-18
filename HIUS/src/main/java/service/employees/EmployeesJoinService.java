package service.employees;

import command.EmpCommand;
import model.EmpDTO;

public class EmployeesJoinService {
	public void numUpdate(EmpCommand empCommand) {
		EmpDTO dto = new EmpDTO();		
		dto.setEMP_ID(empCommand.getEMP_ID());
		dto.setEMP_PW(empCommand.getEMP_PW());
		dto.setEMP_NAME(empCommand.getEMP_NAME());
		dto.setEMP_BIRTH(empCommand.getEMP_BIRTH());
		dto.setEMP_EMAIL(empCommand.getEMP_EMAIL());
		dto.setEMP_ADDR(empCommand.getEMP_ADDR());
		dto.setGENDER(empCommand.getGender());
		dto.setEMP_PH(empCommand.getEMP_PH());
	}
}
