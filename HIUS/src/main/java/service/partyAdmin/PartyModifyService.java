package service.partyAdmin;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import command.PartyCommand;
import model.PartyDTO;
import repository.party.PartyRepository;

@Service
public class PartyModifyService {
	@Autowired
	PartyRepository partyRepository;
	public void execute(PartyCommand partyCommand, HttpSession session) {
		PartyDTO dto = new PartyDTO();
		dto.setPrPl(partyCommand.getPrPl());
		dto.setPrPh(partyCommand.getPrPh());
		dto.setPrMax(partyCommand.getPrMax());
		dto.setPrMintime(partyCommand.getPrMintime());
		partyRepository.updateParty(dto);
		dto.setPrNo(partyCommand.getPrNo());
		List<String> list = 
					(List<String>)session.getAttribute("imgList");
		String filePath =
				session.getServletContext().getRealPath(
						"WEB-INF/view/goodsView/upload");
		if(list != null) {	
			for(String img : list) {
				dto.setPrImg(dto.getPrImg()
						             .replace(img+"`", ""));
				File file = new File(filePath + "/" + img);
				if(file.exists()) file.delete();
			}
			session.removeAttribute("imgfile");
		}
		String PrImg = "";
		if(dto.getPrImg() != null) {
			PrImg = dto.getPrImg();
		}
		for(MultipartFile mf : partyCommand.getPrImg()) {
			String original = mf.getOriginalFilename();
			if(original.equals(""))return;
			String originalFileExtension = 
					original.substring(original.lastIndexOf("."));
			String store = UUID.randomUUID().toString()
			           .replace("-", "")+ originalFileExtension;
			dto.setPrImg(PrImg + store+"`");
			File file =  new File(filePath + "/" +store);
			try {
				mf.transferTo(file);//
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			} 
		}		
		dto.setPrContent(partyCommand.getPrContent());
		dto.setPrPrice(partyCommand.getPrPrice());
		partyRepository.updateParty(dto);
	}
}
