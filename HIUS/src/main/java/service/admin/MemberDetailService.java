package service.admin;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import command.MemberCommand;
import model.MemberDTO;
import repository.member.MemberAdminRepository;

public class MemberDetailService {
	@Autowired
	MemberAdminRepository memberAdminRepository;

	public void execute(String memId, Model model) {
		MemberDTO dto = new MemberDTO();
		dto.setMemId(memId);
		List<MemberDTO> list = 
				memberAdminRepository.getMemberList(dto);
		model.addAttribute("memberCommand", list.get(0));
		
	}
	
}