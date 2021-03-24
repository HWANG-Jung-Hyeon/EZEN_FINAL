package service.lent;

import java.io.File;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import model.RentDTO;
import repository.lent.LentRepository;

public class LentReviseService {
	@Autowired
	LentRepository lentrepository;
	public void execute(Integer no, Model model) {
		
	}
}
