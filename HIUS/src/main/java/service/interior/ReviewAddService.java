package service.interior;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import command.IntRevCommand;
import model.AuthInfo;
import model.IntRevDTO;
import repository.Interior.InteriorRepository;

@Service
public class ReviewAddService {
	@Autowired
	InteriorRepository interiorRepository;
	public void reviewAdd(IntRevCommand revCommand, HttpServletRequest request) {
		HttpSession session = request.getSession();
		AuthInfo authInfo = (AuthInfo)session.getAttribute("authInfo");
		IntRevDTO dto = new IntRevDTO();
		dto.setGoodsNo(revCommand.getGoodsNo());
		dto.setReviewScore(revCommand.getReviewScore());
		String path = "WEB-INF/view/interior/review/upload";
		String filePath = session.getServletContext().getRealPath(path);
		String reviewImage = "";
		if(revCommand.getReviewImg() != null) {
			for(MultipartFile mf : revCommand.getReviewImg()) {
				String original = mf.getOriginalFilename();
				String originalFileExtension = original.substring(original.lastIndexOf("."));
				String store = UUID.randomUUID().toString().replace("-", "") + originalFileExtension;
				reviewImage += store + ":";
				File file = new File(filePath + "\\" + store);
				try {
					mf.transferTo(file);
				} catch (IllegalStateException | IOException e) {
					e.printStackTrace();
				}
			}
		}
		dto.setGoodsImg(reviewImage);
		dto.setGoodsDetail(revCommand.getReviewDetail());
		dto.setMemId(authInfo.getUserId());
		interiorRepository.reviewInsert(dto);
		request.setAttribute("intGoodsNo", revCommand.getGoodsNo());
	}
	public String reviewNo(Model model, HttpServletRequest request) {
		HttpSession session = request.getSession();
		AuthInfo authInfo = (AuthInfo)session.getAttribute("authInfo");
		IntRevDTO dto = new IntRevDTO();
		dto.setMemId(authInfo.getUserId());
		String goodsNo = (String)request.getAttribute("intGoodsNo");
		dto.setGoodsNo(goodsNo);
		String reviewNo = interiorRepository.getReviewNo(dto);
		return reviewNo;
	}
}
