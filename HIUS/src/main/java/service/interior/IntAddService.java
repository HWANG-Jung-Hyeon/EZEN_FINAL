package service.interior;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import command.GoodsCommand;
import model.GoodsDTO;
import repository.Interior.InteriorRepository;

@Service
public class IntAddService {
	@Autowired
	InteriorRepository interiorRepository;
	public void interiorAdd(GoodsCommand goodsCommand, HttpServletRequest request) {
		HttpSession session = request.getSession();
		GoodsDTO dto = new GoodsDTO();
		dto.setGoodsNo(goodsCommand.getGoodsNo());
		dto.setGoodsClass(goodsCommand.getGoodsClass());
		dto.setGoodsName(goodsCommand.getGoodsName());
		dto.setGoodsSet(goodsCommand.getGoodsSet());
		dto.setGoodsDetail(goodsCommand.getGoodsDetail());
		dto.setGoodsPrice(null);
		dto.setGoodsQty(null);
		
		String path = "WEB-INF/view/interior/goods/upload";
		String filePath = session.getServletContext().getRealPath(path);
		String goodsImage = "";
		if(goodsCommand.getGoodsImg() != null) {
			for(MultipartFile mf : goodsCommand.getGoodsImg()) {
				String original = mf.getOriginalFilename();
				String originalFileExtension = original.substring(original.lastIndexOf("."));
				String store = UUID.randomUUID().toString().replace("-", "") + originalFileExtension;
				goodsImage += store + ":";
				File file = new File(filePath + "\\" + store);
				try {
					mf.transferTo(file);
				} catch (IllegalStateException | IOException e) {
					e.printStackTrace();
				}
			}
		}
		dto.setGoodsImg(goodsImage);
		interiorRepository.goodsInsert(dto);
	}
}
