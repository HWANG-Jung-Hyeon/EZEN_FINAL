package service.rentmall;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import command.RentCommand;
import model.AuthInfo;
import model.RentOrderDTO;
import model.RentOrderListDTO;
import repository.rentmall.RentmallRepository;

public class RentCartService {
	@Autowired
	RentmallRepository rentmallRepository;
	public void rentCart(RentCommand rentOrderCommand, Model model, HttpSession session) {
		//결제가 안된 구매 호출
		String memId = ((AuthInfo)session.getAttribute("authInfo")).getUserId();
		Integer sumGoodsPrice = rentmallRepository.sumPrice(memId);
		RentOrderDTO dto = new RentOrderDTO();
		String orderNo = rentmallRepository.rentOrderNo(memId);
		Integer sump = sumGoodsPrice + Integer.parseInt(rentOrderCommand.getRentGoodsPrice()) * Integer.parseInt(rentOrderCommand.getRentstartq()) * Integer.parseInt(rentOrderCommand.getRentstartt());
		dto.setRentPay( sump );
		dto.setMemId(memId);
		if(orderNo == null) {
			//구매번호가 없을 때 번호 자동생성기로부터 번호 호출
			orderNo = rentmallRepository.rentCart();
			dto.setRentOrderNo(orderNo);
			rentmallRepository.rentOrderInsert(dto);
		}else {
			dto.setRentOrderNo(orderNo);
			rentmallRepository.updateOrder(dto);
		}
		
		//현재까지 전체 금액
		
		
		
		//구매 테이블 저장(rent_order)

		
		
		
		RentOrderListDTO listdto = new RentOrderListDTO();
		//구매리스트 테이블에 저장(rent_list)
		listdto.setRentstartd(rentOrderCommand.getRentstartd());
		listdto.setRentstartt(rentOrderCommand.getRentstartt());
		listdto.setRentstarth(rentOrderCommand.getRentstarth());
		listdto.setRentstartq(rentOrderCommand.getRentstartq());
		listdto.setRentGoodsPrice(Integer.parseInt(rentOrderCommand.getRentGoodsPrice()) * Integer.parseInt(rentOrderCommand.getRentstartq()) * Integer.parseInt(rentOrderCommand.getRentstartt()));
		listdto.setRentGoodsNo(rentOrderCommand.getRentGoodsNo());
		listdto.setOrderNo(Integer.parseInt(orderNo));
		
		rentmallRepository.getrent_order(listdto);
		System.out.println("sjbvsdxvh");
	}
	
}
