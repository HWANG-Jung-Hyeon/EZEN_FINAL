package repository.shopgoods;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import model.ShopgoodsDTO;

public class ShopgoodsRepository {
	@Autowired
	SqlSession sqlSession;
	String namespace = "HIUS.mappers.shopgoodsMapper";
	String statement;
	public Integer insertShopgoods(ShopgoodsDTO shopgoodsDTO) {
		statement = namespace + ".shopgoodsInsert";
		return sqlSession.update(statement,shopgoodsDTO);
	}
	public List<ShopgoodsDTO> shopgoodsSelect(){
		statement = namespace + ".shopgoodsSelect";
		return sqlSession.selectList(statement);
	}
}
