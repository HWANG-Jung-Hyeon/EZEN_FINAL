package repository.shoppingmall;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import model.ShopCartDTO;
import model.ShopCartListDTO;
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
	
	public String shopOrderNo() {
		statement = namespace + ".shopOrderNo";
		return sqlSession.selectOne(statement);
	}
	
	public Integer sumPrice() {
		statement = namespace + ".sumPrice";
		return sqlSession.selectOne(statement);
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
	
}
