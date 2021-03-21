package service.party;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import command.PartyCommand;
import model.AuthInfo;
import model.PartyDTO;
import repository.party.PartyRepository;

@Service
public class PartyWriteService {
	@Autowired
	PartyRepository partyRepository;
	public void partyWrite(PartyCommand partyCommand, HttpServletRequest request) {
		HttpSession session = request.getSession();
		AuthInfo authInfo = (AuthInfo)session.getAttribute("authInfo");
		PartyDTO dto = new PartyDTO();
		dto.setPrPl(partyCommand.getPrPl());
		dto.setPrContent(partyCommand.getPrContent());
		dto.setPrPrice(partyCommand.getPrPrice());
		dto.setPrMax(partyCommand.getPrMax());
		dto.setPrMintime(partyCommand.getPrMintime());
		dto.setPrOp(partyCommand.getPrOp());
		dto.setPrPh(partyCommand.getPrPh());
		
		
		String path="WEB-INF/view/partyRoom/upload";
		String filePath = session.getServletContext().getRealPath(path);
		String prImg = "";
		if(partyCommand.getPrImg() != null) {
			for(MultipartFile mf : partyCommand.getPrImg()) {
				String original = mf.getOriginalFilename();
				String originalFileExtension = original.substring(original.lastIndexOf("."));
				String store = UUID.randomUUID().toString().replace("-", "")+originalFileExtension;
				prImg += store + "'";
				File file = new File(filePath + "\\" +store);
				try {
					mf.transferTo(file);
				} catch (IllegalStateException |IOException e) {
					e.printStackTrace();
				}				
			}
		}
		dto.setPrImg(prImg);
		partyRepository.partyInsert(dto);
	}
}
