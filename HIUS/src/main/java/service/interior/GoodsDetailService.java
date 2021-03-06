package service.interior;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import model.GoodsDTO;
import repository.Interior.InteriorRepository;

@Service
public class GoodsDetailService {
	@Autowired
	InteriorRepository interiorRepository;
	public void goodsDetail(String goodsNo, Model model) {
		GoodsDTO dto = new GoodsDTO();
		dto.setGoodsNo(goodsNo);
		List<GoodsDTO> list = interiorRepository.getIntList(dto);
		model.addAttribute("goods", list.get(0));
	}

}
