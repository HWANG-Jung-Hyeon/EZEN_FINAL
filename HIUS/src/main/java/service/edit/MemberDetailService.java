package service.edit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import model.MemberDTO;
import repository.member.MemberEditRepository;

public class MemberDetailService {
	@Autowired
	MemberEditRepository memberEditRepository;
	public void execute(String memId, Model model) {
		MemberDTO dto = new MemberDTO();
		dto.setMemId(memId);
		List<MemberDTO> list = 
				memberEditRepository.getMemberList(dto);
		model.addAttribute("memberCommand", list.get(0));

	}
}