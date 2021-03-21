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
	public void memberDetail( String memId, Model model) {
		System.out.println(memId);
		MemberDTO dto = memberRepository.memberDetail(memId);
		model.addAttribute("memberDetail", dto);
	}
	public void memberModify(String memId, Model model) {
		MemberDTO dto = memberRepository.memberModify(memId);
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
