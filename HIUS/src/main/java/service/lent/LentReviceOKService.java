package service.lent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import command.LentCommand;
import model.RentDTO;
import repository.lent.LentRepository;

public class LentReviceOKService {
	@Autowired
	LentRepository lentrepository;
	public void lentReviseOK(LentCommand lentCommand , Model model) {
		RentDTO dto = new RentDTO();
		dto.setRentGoodsNo(lentCommand.getRentGoodsNo());
		dto.setRentGoodsName(lentCommand.getRentGoodsName());
		dto.setRentGoodsDetail(lentCommand.getRentGoodsDetail());
		dto.setRentGoodsQty(lentCommand.getRentGoodsQty());
		dto.setRentGoodsPrice(lentCommand.getRentGoodsPrice());
		System.out.println(dto.getRentGoodsNo());
		System.out.println(dto.getRentGoodsName());
		System.out.println(dto.getRentGoodsDetail());
		System.out.println(dto.getRentGoodsQty());
		System.out.println(dto.getRentGoodsPrice());
		lentrepository.lentRevise(dto);
	}
}
