package repository.prrv;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import model.PrrvDTO;

public class PrrvRepository {
	@Autowired
	SqlSession sqlSession;
	String namespace= "HIUS.mappers.prrvMapper";
	String statement;
	public List<PrrvDTO> prrvSelect() {
		statement = namespace + ".prrvSelect";
		return sqlSession.selectList(statement);
	}
	public PrrvDTO prrvDetail(String prrvNo) {
		statement = namespace + ".prrvDetail";
		return sqlSession.selectOne(statement, prrvNo);
	}

	
	

}
