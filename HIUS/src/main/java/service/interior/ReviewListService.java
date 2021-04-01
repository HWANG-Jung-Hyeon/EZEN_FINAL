package service.interior;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import controller.PageAction;
import model.IntRevDTO;
import model.StartEndPageDTO;
import repository.Interior.InteriorRepository;

@Service
public class ReviewListService {
	@Autowired
	InteriorRepository interiorRepository;
	public void getReviewList(Integer page, Model model) {
		int limit = 10; 
		int limitPage = 10;
		Long startRow = ((long)page -1 ) * limit +1;
		Long endRow = startRow + limit -1;
		IntRevDTO dto = new IntRevDTO();
		dto.setStartEndPageDTO(
				new StartEndPageDTO(startRow,endRow));
		List<IntRevDTO> list = 
				interiorRepository.getReviewList(dto);
		int count = interiorRepository.getReviewCount();
		model.addAttribute("list", list);
		model.addAttribute("count", count);
		
		PageAction pageAction = new PageAction();
		pageAction.page(
				model, count, limit, limitPage, page,"reviewList?");
	}
}
