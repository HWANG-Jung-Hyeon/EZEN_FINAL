package service.interior;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import controller.PageAction;
import model.GoodsDTO;
import model.IntRevDTO;
import model.StartEndPageDTO;
import repository.Interior.InteriorRepository;

@Service
public class IntListService {
	@Autowired
	InteriorRepository interiorRepository;

	public void getIntList(Model model, Integer page) {
		int limit = 10;
		int limitPage = 10;
		Long startRow = ((long) page - 1) * limit + 1;
		Long endRow = startRow + limit - 1;
		GoodsDTO dto = new GoodsDTO();
		dto.setStartEndPageDTO(new StartEndPageDTO(startRow, endRow));
		List<GoodsDTO> list = interiorRepository.getIntList(dto);
		int count = interiorRepository.getIntCount();
		model.addAttribute("list", list);
		model.addAttribute("count", count);
		Map<Object, Object> revScore = interiorRepository.getIntScore();
		model.addAttribute("revScore", revScore);

		PageAction pageAction = new PageAction();
		pageAction.page(model, count, limit, limitPage, page, "IntList?");
	}
}
