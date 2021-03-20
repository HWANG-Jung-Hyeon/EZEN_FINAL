package service.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import model.MemberDTO;
import repository.member.MemberRepository;

public class MemberListService {
	@Autowired
	MemberRepository memberRepository;
	public void memberList(Model model) {
		MemberDTO dto = new MemberDTO();
		List<MemberDTO> list = memberRepository.memberSelect();
		model.addAttribute("memberList",list);
	}
}
