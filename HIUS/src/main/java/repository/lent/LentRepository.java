package repository.lent;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import model.RentDTO;

public class LentRepository {
	@Autowired
	SqlSession sqlSession;
	String namespace = "HIUS.mappers.lentMapper";
	String statement;
	public Integer insertRent(RentDTO rentDTO) {
		statement = namespace + ".rentInsert";
		return sqlSession.update(statement, rentDTO);
	}
	public List<RentDTO> listAllSelect() {
		String statement = namespace+".lentAllselect";
		return sqlSession.selectList(statement);
	}
	public Integer lentCount() {
		String statement = namespace+".lentCount";
		return sqlSession.selectOne(statement);
	}
}
