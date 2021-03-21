package service.member;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import command.MemberCommand;
import model.MemberDTO;
import repository.member.MemberRepository;

public class MemberJoinService {
	@Autowired
	MemberRepository memberRepository;
	public void numUpdate(MemberCommand memberCommand) {				
		MemberDTO dto = new MemberDTO();
		dto.setMemId(memberCommand.getMemId());
		dto.setMemPw(memberCommand.getMemPw());
		dto.setMemName(memberCommand.getMemName());
		dto.setMemBirth(new Timestamp(memberCommand.getMemBirth().getTime()));
		dto.setMemPh(memberCommand.getMemPh());
		dto.setMemAddr(memberCommand.getMemAddr());
		dto.setMemEmail(memberCommand.getMemEmail());
		dto.setGender(memberCommand.getGender());
		dto.setMemPw(memberCommand.getMemPw());
		memberRepository.memberInsert(dto);
		
	}
	
}
