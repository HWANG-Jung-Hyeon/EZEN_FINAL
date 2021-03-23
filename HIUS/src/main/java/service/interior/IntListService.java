package service.interior;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import controller.PageAction;
import model.GoodsDTO;
import model.StartEndPageDTO;
import repository.goods.GoodsRepository;

public class IntListService {
	@Autowired
	GoodsRepository goodsRepository;

	public void getIntList(Model model, Integer page) {
		int limit = 10;
		int limitPage = 10;
		Long startRow = ((long) page - 1) * limit + 1;
		Long endRow = startRow + limit - 1;
		GoodsDTO dto = new GoodsDTO();
		dto.setStartEndPageDTO(new StartEndPageDTO(startRow, endRow));
		List<GoodsDTO> list = goodsRepository.getIntList(dto);
		int count = goodsRepository.getIntCount();
		model.addAttribute("list", list);
		model.addAttribute("count", count);

		PageAction pageAction = new PageAction();
		pageAction.page(model, count, limit, limitPage, page, "IntList?");
	}
}
