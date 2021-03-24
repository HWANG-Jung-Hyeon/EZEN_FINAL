package service.member;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import command.MemberCommand;
import model.MemberDTO;
import repository.member.MemberRepository;

public class MemberJoinService {
	@Autowired
	BCryptPasswordEncoder bcryptPasswordEncoder;
	@Autowired
	MemberRepository memberRepository;
	public void execute(MemberCommand memberCommand) {				
		MemberDTO dto = new MemberDTO();
		dto.setMemId(memberCommand.getMemId());
		Integer result = null;
		dto.setMemName(memberCommand.getMemName());
		dto.setMemBirth(new Timestamp(memberCommand.getMemBirth().getTime()));
		dto.setMemPh(memberCommand.getMemPh());
		dto.setMemAddr(memberCommand.getMemAddr());
		dto.setMemEmail(memberCommand.getMemEmail());
		dto.setGender(memberCommand.getGender());
		String pw = bcryptPasswordEncoder.encode(memberCommand.getMemPw());
		dto.setMemPw(pw);
		result = memberRepository.insertMember(dto);
		if(result != null) {
			SimpleDateFormat dateForm = new SimpleDateFormat("yyyyMMddHHmmss");
			String num = dateForm.format(new Date());
			String subject = "가입환영인사";
			String content = "안녕하세요. '" 
					+  dto.getMemName()
					+ "'님 가입을 환영합니다.<br />";
		try {
			
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
		
}
