package repository.rentmall;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import model.RentDTO;


public class RentmallRepository {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace="HIUS.mappers.rentmallMapper";
	
	public List <RentDTO> rentmall() {
		String statement = namespace + ".rentmallAllselect";
		return sqlSession.selectList(statement);
	}
	public RentDTO getSelectDetail(String no) {
		String statement = namespace +".getSelectDetail";
		return sqlSession.selectOne(statement, no);
	}
}
