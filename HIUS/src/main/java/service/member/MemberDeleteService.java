package service.member;

import org.springframework.beans.factory.annotation.Autowired;

import repository.member.MemberRepository;

public class MemberDeleteService {
	@Autowired
	MemberRepository memberRepository;
	public void memberDelete(String memId) {
		memberRepository.MemberDelete(memId);
	}

}
