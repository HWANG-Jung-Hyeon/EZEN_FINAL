package service.member;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;

import command.MemberCommand;
import model.MemDTO;
import repository.member.MemberRepository;

public class MemberJoinService {
	@Autowired
	MemberRepository memberRepository;
	public void numUpdate(MemberCommand memberCommand) {				
		MemDTO dto = new MemDTO();
		dto.setMEM_ID(memberCommand.getMEM_ID());
		dto.setMEM_PW(memberCommand.getMEM_PW());
		dto.setMEM_NAME(memberCommand.getMEM_NAME());
		dto.setMEM_BIRTH(new Timestamp(memberCommand.getMEM_BIRTH().getTime()));
		dto.setMEM_PH(memberCommand.getMEM_PH());
		dto.setMEM_ADDR(memberCommand.getMEM_ADDR());
		dto.setMEM_EMAIL(memberCommand.getMEM_EMAIL());
		dto.setGENDER(memberCommand.getGENDER());
		memberRepository.memInsert(dto);
	}
}
