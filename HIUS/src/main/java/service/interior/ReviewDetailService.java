package service.interior;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import model.IntRevDTO;
import repository.Interior.InteriorRepository;

@Service
public class ReviewDetailService {
	@Autowired
	InteriorRepository interiorRepository;
	public void reviewDetail(String reviewNo, Model model) {
		IntRevDTO dto = new IntRevDTO();
		dto.setReviewNo(reviewNo);
		List<IntRevDTO> list = interiorRepository.getReviewList(dto);
		model.addAttribute("intRevList", list);
	}
	
}
