package service.empInfo;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import model.AuthInfo;
import repository.empInfo.EmpInfoRepository;


public class EmpInfoService {
	@Autowired
	EmpInfoRepository empInfoRepository;
	public void empInfo( Model model,HttpSession session) {
		String empId = ((AuthInfo)session.getAttribute("authInfo")).getUserId();
			
	}
}
