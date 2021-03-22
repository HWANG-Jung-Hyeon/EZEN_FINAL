package service.party;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import command.PartyCommand;
import model.PartyDTO;
import repository.party.PartyRepository;

public class PartyUpdateService {
	@Autowired
	PartyRepository partyRepository;
	public void execute(PartyCommand partyCommand, HttpSession session) {
		PartyDTO dto = new PartyDTO();
		dto.setPrPl(partyCommand.getPrPl());
		dto = (PartyDTO)partyRepository.getPartyList(dto).get(0);
		List<String> list = (List<String>)session.getAttribute("imgList");
		String filePath = session.getServletContext().getRealPath("WEB-INF/partyRoom/upload");
		if(list != null) {
			for(String img : list) {
				dto.setPrImg(dto.getPrImg().replace(img+"'", ""));
				File file = new File(filePath + "/" + img);
				if(file.exists()) file.delete();
			}
			session.removeAttribute("imgfile");
		}
		String prImg = "";
		if(dto.getPrImg() != null) {
			prImg = dto.getPrImg();
		}
		for(MultipartFile mf : partyCommand.getPrImg()) {
			String original = mf.getOriginalFilename();
			if(original.equals(""))return;
			String originalFileExtension = original.substring(original.lastIndexOf("."));
			String store =UUID.randomUUID().toString().replace("-", "") + originalFileExtension;
			dto.setPrImg(prImg + "store" + "'");
			File file = new File(filePath + "/" + store);
			try {
				mf.transferTo(file);
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			} 		
		}
		dto.setPrContent(partyCommand.getPrContent());
		dto.setPrPrice(partyCommand.getPrPrice());
		partyRepository.partyUpdate(dto);
	}

}
