package service.edit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import controller.PageAction;
import model.MemberDTO;
import model.StartEndPageDTO;
import repository.member.MemberEditRepository;

public class MemberListService {
	@Autowired
	MemberEditRepository memberEditRepository;
	public void execute(Model model, Integer page) {
		int limit = 10;
		int limitPage = 10;
		Long startRow =  ((long)page - 1) * limit + 1; 
		Long endRow = startRow + limit - 1;            
		
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setStartEndPageDTO(
				new StartEndPageDTO(startRow,endRow));
		
		List<MemberDTO> list =
				memberEditRepository.getMemberList(memberDTO);
		int count = memberEditRepository.getMemberCount();
		model.addAttribute("memberList", list);
		model.addAttribute("count", count);
		PageAction pageAction = new PageAction();
		pageAction.page(model, count, limit, limitPage, page, "memberList?");
	} 
}
