package service.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import repository.member.MemberRepository;

public class MemberListService {
	@Autowired
	MemberRepository memberRepository;
	public void memList(Model model) {
		List<MemDTO> list = MemberRepository.memSelect();
		model.addAllAttributes("memList",list);
	}
}
