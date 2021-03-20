package service.member;

import java.sql.Timestamp;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import command.MemberCommand;
import model.MemberDTO;
import repository.member.MemberRepository;

public class MemberDetailService {
	@Autowired
	MemberRepository memberRepository;
	public void memberDetail( String mem_id, Model model) {
		System.out.println(mem_id);
		MemberDTO dto = memberRepository.memberDetail(mem_id);
		model.addAttribute("memberDetail", dto);
	}
	public void memberModify(String Memid, Model model) {
		MemberDTO dto = new MemberDTO();
		model.addAttribute("memberModify",dto);
	}
	public void memberModifyAction(MemberCommand memberCommand, Model model) {
		MemberDTO dto = new MemberDTO();
		dto.setMemId(memberCommand.getMemId());
		dto.setMemPw(memberCommand.getMemPw());
		dto.setMemName(memberCommand.getMemName());
		dto.setMemBirth(new Timestamp(memberCommand.getMemBirth().getTime()));
		dto.setMemEmail(memberCommand.getMemEmail());
		dto.setMemAddr(memberCommand.getMemAddr());
		dto.setMemPh(memberCommand.getMemPh());
		memberRepository.memberModifyAction(dto);
	}
	
		

}
