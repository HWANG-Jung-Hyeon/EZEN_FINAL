package service.lent;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import command.LentCommand;
import model.RentDTO;
import repository.lent.LentRepository;

@Service
public class LentRegistService {
	@Autowired
	LentRepository LentRepository;
	public void execute(LentCommand lentCommand, HttpSession session) {
		System.out.println("s vfgshdavdavfa");
		RentDTO dto = new RentDTO();
		dto.setRentGoodsNo(lentCommand.getRentGoodsNo());
		dto.setRentGoodsName(lentCommand.getRentGoodsName());
		dto.setRentGoodsDetail(lentCommand.getRentGoodsDetail());
		dto.setRentGoodsQty(lentCommand.getRentGoodsQty());
		dto.setRentGoodsPrice(lentCommand.getRentGoodsPrice());
		
		String path = "WEB-INF/view/lent/image";
		String filepath = session.getServletContext().getRealPath(path);
		String storeFileNames = "";
		/// 파일을 저장하지 않았을때의 오류 방지
		if(lentCommand.getRentGoodsImg()[0] != null) {
			for(MultipartFile mf : lentCommand.getRentGoodsImg()) {
				String originalFileName = mf.getOriginalFilename();
				//originalfilename에서 확장자 가져오기.
				String originalFileExtension 
				= originalFileName.substring(originalFileName.lastIndexOf("."));
				String store = UUID.randomUUID().toString().replace("-", "")
								+originalFileExtension;
				storeFileNames = storeFileNames + store + "`";
				File file = new File(filepath + "/" + store);
				try {
					mf.transferTo(file);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			dto.setRentGoodsImg(storeFileNames);
		}
		LentRepository.insertRent(dto);
	}
}
