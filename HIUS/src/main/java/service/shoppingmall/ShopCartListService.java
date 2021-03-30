package service.shoppingmall;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import model.AuthInfo;
import model.ShopCartListDTO;
import repository.shoppingmall.ShoppingmallRepository;

public class ShopCartListService {
	@Autowired
	ShoppingmallRepository shoppingmallRepository;
	public void shopCartList(Model model,HttpSession  session) {
		String memId = ((AuthInfo)session.getAttribute("authInfo")).getUserId();
		List<ShopCartListDTO> list = shoppingmallRepository.shopList(memId);
		model.addAttribute("shopCartList", list);
	}
}
