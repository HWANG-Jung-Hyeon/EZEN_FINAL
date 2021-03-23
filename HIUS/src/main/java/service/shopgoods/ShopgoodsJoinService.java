package service.shopgoods;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import command.ShopgoodsCommand;
import model.ShopgoodsDTO;
import repository.shopgoods.ShopgoodsRepository;

public class ShopgoodsJoinService {
	@Autowired
	ShopgoodsRepository shopgoodsRepository;
	public void shopgoodsJoin(ShopgoodsCommand shopgoodsCommand, HttpSession session) {
		
		ShopgoodsDTO dto = new ShopgoodsDTO();
		dto.setShopgoodsNo(shopgoodsCommand.getShopgoodsNo());
		dto.setShopgoodsClass(shopgoodsCommand.getShopgoodsClass());
		dto.setShopgoodsName(shopgoodsCommand.getShopgoodsName());
		dto.setShopgoodsSet(shopgoodsCommand.getShopgoodsSet());
		dto.setShopgoodsDetail(shopgoodsCommand.getShopgoodsDetail());
		dto.setShopgoodsQty(shopgoodsCommand.getShopgoodsQty());
		dto.setShopgoodsPrice(shopgoodsCommand.getShopgoodsPrice());
		String path = "WEB-INF/view/shopgoods/image";
		String filePath = session.getServletContext().getRealPath(path);
		String storeFileNames = "";
	
		// 파일을 저장하지 않았을때의 오류 방지
		if(shopgoodsCommand.getShopgoodsImage()[0] != null) {
			for(MultipartFile mf : shopgoodsCommand.getShopgoodsImage()) {
				String originalFileName = mf.getOriginalFilename();
				String originalFileExtension = originalFileName.substring(originalFileName.lastIndexOf("."));
				String store = UUID.randomUUID().toString().replace("-", "")+originalFileExtension;
				storeFileNames = storeFileNames + store + "`"; 
				File file = new File(filePath + "/" + store);
				try {
					mf.transferTo(file);
				} catch (IllegalStateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			  }
			dto.setShopgoodsImage(storeFileNames);
		}
		shopgoodsRepository.insertShopgoods(dto);
	}
}
		
