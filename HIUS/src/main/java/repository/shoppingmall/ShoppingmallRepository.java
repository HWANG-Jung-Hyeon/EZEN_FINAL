package repository.shoppingmall;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

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
}
