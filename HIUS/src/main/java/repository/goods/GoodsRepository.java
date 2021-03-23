package repository.goods;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.GoodsDTO;

@Repository
public class GoodsRepository {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "HIUS.mappers.goodsMapper";
	String statement;
	
	public void goodsInsert(GoodsDTO dto) {
		statement = namespace + ".goodsInsert";
		sqlSession.update(statement, dto);
	}

	public List<GoodsDTO> getIntList(GoodsDTO dto) {
		statement = namespace + ".getIntList";
		return sqlSession.selectList(statement, dto);
	}

	public int getIntCount() {
		statement = namespace + ".getIntCount";
		return sqlSession.selectOne(statement);
	}

}
