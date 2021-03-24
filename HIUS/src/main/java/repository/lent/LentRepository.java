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
	public RentDTO getSelectDetail(Integer no) {
		String statement = namespace +".getSelectDetail";
		return sqlSession.selectOne(statement, no);
	}
	public void lentRevise(RentDTO dto) {
		String statement = namespace +".lentRevise";
		sqlSession.selectOne(statement, dto);
	}
	public void lentDelete(String no) {
		String statement = namespace + ".lentDelete";
		sqlSession.update(statement, no);
	}
}
