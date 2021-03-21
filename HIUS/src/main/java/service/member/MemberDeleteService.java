package service.member;

import org.springframework.beans.factory.annotation.Autowired;

import model.MemberDTO;
import repository.member.MemberRepository;

public class MemberDeleteService {
	@Autowired
	MemberRepository memberRepository;
	public void memberDelete(MemberDTO dto) {
		memberRepository.MemberDelete(dto);
	}

}
