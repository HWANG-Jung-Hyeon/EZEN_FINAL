package service.shoppingmall;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import command.ShopOrderCommand;
import model.AuthInfo;
import model.ShopCartDTO;
import model.ShopCartListDTO;
import repository.shoppingmall.ShoppingmallRepository;

public class ShopCartService {
	@Autowired
	ShoppingmallRepository shoppingmallRepository;
	public void shopCart(ShopOrderCommand shopOrderCommand,Model model, HttpSession session) {
		// 결제가 안된 구매를 가져옴
		String memId = ((AuthInfo)session.getAttribute("authInfo")).getUserId();
		ShopCartDTO dto = new ShopCartDTO();
		String orderNo = shoppingmallRepository.shopOrderNo(memId);
		// 구매자 번호
		dto.setMemId(memId);
		System.out.println("kdjbvjkdbjv : " + shopOrderCommand.getShopgoodsPrice());
		if(orderNo == null) {
			// 구매번호가 없을 때 번호 자동 생성기로 부터 번호를 가져 옴.
			orderNo = shoppingmallRepository.shopCart();
			dto.setOrderNo(orderNo);
			dto.setOrderPay(shopOrderCommand.getShopgoodsPrice() * Integer.parseInt(shopOrderCommand.getShopgoodsQty()));	
			//최초 구매번호일 때는 insert
			shoppingmallRepository.orderInsert(dto);
		}else {		
		// 구매 번호가 있어서 상품을 추가하는 경우는 update
			System.out.println(orderNo);
			System.out.println("5456469464646 : " + shopOrderCommand.getShopgoodsPrice());
			dto.setOrderNo(orderNo);
			Integer sumGoodsPrice =  shoppingmallRepository.sumPrice(memId);
			dto.setOrderPay(sumGoodsPrice + shopOrderCommand.getShopgoodsPrice() * Integer.parseInt(shopOrderCommand.getShopgoodsQty() ));
			shoppingmallRepository.orderUpdate(dto);
		}
		
		/// 구매 테이블 저장 
		
		ShopCartListDTO listdto = new ShopCartListDTO();
		/// 구매리스트 테이블에 저장
		
		listdto.setOrderNo(orderNo);
		listdto.setShopgoodsName(shopOrderCommand.getShopgoodsName());
		listdto.setShopgoodsNo(shopOrderCommand.getShopgoodsNo());
		listdto.setShopgoodsQty(shopOrderCommand.getShopgoodsQty());
		
		shoppingmallRepository.orderlistInsert(listdto);
		
		
	}
}
