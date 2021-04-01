package repository.shoppingmall;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import model.PayGoodsDTO;
import model.ShopCartDTO;
import model.ShopCartListDTO;
import model.ShopOrderListDTO;
import model.ShopPayDTO;
import model.ShopgoodsDTO;

public class ShoppingmallRepository {
	@Autowired
	SqlSession sqlSession;
	String namespace= "HIUS.mappers.shoppinmallMapper";
	String statement;
	public List<ShopgoodsDTO> shopSelect(){
		statement = namespace + ".shopSelect";
		return sqlSession.selectList(statement);
	}
	public ShopgoodsDTO shopDetail(String shopgoodsNo) {
		statement = namespace + ".shopDetail";
		return sqlSession.selectOne(statement, shopgoodsNo);
	}
	public String shopCart() {
		statement = namespace + ".shopCart";
		return sqlSession.selectOne(statement);
	}
	
	public String shopOrderNo(String memId) {
		statement = namespace + ".shopOrderNo";
		return sqlSession.selectOne(statement, memId);
	}
	
	public Integer sumPrice(String memId) {
		statement = namespace + ".sumPrice";
		return sqlSession.selectOne(statement, memId);
	}
	
	public void orderInsert(ShopCartDTO dto) {
		statement = namespace + ".orderInsert";
		sqlSession.insert(statement, dto);
	}
	public void orderUpdate(ShopCartDTO dto) {
		statement = namespace + ".orderUpdate";
		sqlSession.insert(statement, dto);
	}
	public void orderlistInsert(ShopCartListDTO dto) {
		statement = namespace + ".orderlistInsert";
		sqlSession.insert(statement, dto);
	}
	public List<ShopCartListDTO> shopList(String memId){
		statement = namespace + ".shopList";
		return sqlSession.selectList(statement, memId);
	}
	public List<ShopOrderListDTO> shopCartOrderList(String orderNum) {
		statement = namespace + ".shopCartOrderList";
		return sqlSession.selectList(statement, orderNum);
	}
	public Integer shopPayment(ShopOrderListDTO shopOrderListDTO) {
		statement = namespace + ".shopPayment";
		return sqlSession.update(statement,shopOrderListDTO );	
	}
	public void updateOrder(ShopCartDTO dto) {
		statement = namespace + ".updateOrder";
		sqlSession.update(statement, dto);
	}
	public void insertPay(ShopPayDTO dto) {
		statement = namespace + ".insertPay";
		sqlSession.insert(statement, dto);
	}
	public PayGoodsDTO shopPayList(String orderNo) {
		statement = namespace + ".shopPayList";
		return sqlSession.selectOne(statement, orderNo);
	}
	public List<String> getOrderNo(String memId){
		statement = namespace + ".payOrderNo";
		return sqlSession.selectList(statement, memId);
	}
	
}
