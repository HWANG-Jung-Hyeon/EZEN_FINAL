package repository.Interior;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.GoodsDTO;
import model.IntRevDTO;

@Repository
public class InteriorRepository {
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

	public void reviewInsert(IntRevDTO dto) {
		statement = namespace + ".reviewInsert";
		sqlSession.update(statement, dto);
	}

	public String getReviewNo(IntRevDTO dto) {
		statement = namespace + ".getReviewNo";
		return sqlSession.selectOne(statement, dto);
	}

	public List<IntRevDTO> getReviewList(IntRevDTO dto) {
		statement = namespace + ".getReviewList";
		return sqlSession.selectList(statement, dto);
	}

	public int getReviewCount() {
		statement = namespace + ".getReviewCount";
		return sqlSession.selectOne(statement);
	}

	public Map<Object, Object> getIntScore() {
		statement = namespace + ".getScorePerGoods";
		return sqlSession.selectMap(namespace+statement, "goods_no");
	}

}
