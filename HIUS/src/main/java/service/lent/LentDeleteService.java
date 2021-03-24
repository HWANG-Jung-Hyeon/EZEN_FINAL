package service.lent;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import repository.lent.LentRepository;

public class LentDeleteService {
	@Autowired
	LentRepository lentRepository;
	public void execute(String no, HttpSession session) {
		lentRepository.lentDelete(no);
	}
}

