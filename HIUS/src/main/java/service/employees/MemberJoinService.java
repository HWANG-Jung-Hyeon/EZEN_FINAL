package service.employees;

import command.MemberCommand;
import model.MemDTO;

public class MemberJoinService {
	public void numUpdate(MemberCommand memberCommand) {
		MemDTO dto = new MemDTO();
		dto.setMEM_ID(MemberCommand.getMEM_ID());
		dto.setMEM_PW(MemberCommand.getMEM_PW());
		dto.setMEM_NAME(MemberCommand.getMEM_NAME());
		dto.setMEM_BIRTH(Timestamp(MemberCommand.getMEM_BIRTH()));
		dto.setMEM_PH(MemberCommand.getMEM_PH());
		dto.setMEM_ADDR(MemberCommand.getMEM_ADDR());
		dto.setMEM_EMAIL(MemberCommand.getMEM_EMAIL());
		dto.setGENDER(MemberCommand.getGENDER());
	}
}
