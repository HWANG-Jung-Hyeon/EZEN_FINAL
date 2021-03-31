package service.shoppingmall;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import model.AuthInfo;
import model.PayGoodsDTO;
import repository.shoppingmall.ShoppingmallRepository;

public class ShopPayListService {
	@Autowired
	ShoppingmallRepository shoppingmallRepository;
	public void shopPayList(Model model , HttpSession session) {
		String memId = ((AuthInfo)session.getAttribute("authInfo")).getUserId();
		List<String> orderNos = shoppingmallRepository.getOrderNo(memId);
		List<PayGoodsDTO> lists= new ArrayList<PayGoodsDTO>();
		for(String orderNo :  orderNos) {
			PayGoodsDTO dto = shoppingmallRepository.shopPayList(orderNo);
			lists.add(dto);
		}
		model.addAttribute("shopPayList", lists);
	}
}
