package service.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import model.MemDTO;
import repository.member.MemberRepository;

public class MemberListService {
	@Autowired
	MemberRepository memberRepository;
	public void memList(Model model) {
		MemDTO dto = new MemDTO();
		List<MemDTO> list = memberRepository.getMemList(dto);
		model.addAttribute("memList",list);
	}
}
