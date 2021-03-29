package service.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import controller.PageAction;
import model.MemberDTO;
import model.StartEndPageDTO;
import repository.member.MemberAdminRepository;

public class MemberListService {
	@Autowired
	MemberAdminRepository memberAdminRepository;
	
	public void execute(Model model, Integer page) {
		int limit = 10;
		int limitPage = 10;
		Long startRow =  ((long)page - 1) * limit + 1; 
		Long endRow = startRow + limit - 1;            
		
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setStartEndPageDTO(
				new StartEndPageDTO(startRow,endRow));
		
		List<MemberDTO> list =
				memberAdminRepository.getMemberList(memberDTO);
		int count = memberAdminRepository.getMemberCount();
		model.addAttribute("memberList", list);
		model.addAttribute("count", count);
		PageAction pageAction = new PageAction();
		pageAction.page(model, count, limit, limitPage, page, "memberList?");
		
	}

}
