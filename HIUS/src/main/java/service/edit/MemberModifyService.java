package service.edit;

import org.springframework.beans.factory.annotation.Autowired;

import command.MemberCommand;
import model.MemberDTO;
import repository.member.MemberRepository;

public class MemberModifyService {
	@Autowired
	MemberRepository memberRepository;
	public void execute(MemberCommand memberCommand) {
		MemberDTO dto = new MemberDTO();
		dto.setMemId(memberCommand.getMemId());
		dto.setMemPh(memberCommand.getMemPh());
		dto.setMemAddr(memberCommand.getMemAddr());
		memberRepository.updateMember(dto);
	}
}