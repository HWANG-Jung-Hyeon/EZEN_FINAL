package service.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.member.MemberAdminRepository;

@Service
public class MemberDeleteProService {
	@Autowired
	MemberAdminRepository memberAdminRepository;
	public void execute(String memId) {
		memberAdminRepository.deleteMember(memId);
	}
}
