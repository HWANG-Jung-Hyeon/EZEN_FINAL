package repository.member;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import model.MemDTO;

public class MemberRepository {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace ="HIUS.mappers.memberMapper";
	String statement;
	public void memInsert(MemDTO dto) {
		statement = namespace + ".memInsert";
		sqlSession.insert(statement,dto);
	}
	public MemDTO memSelect(MemDTO dto) {
		statement = namespace + ".memSelect";
		return sqlSession.selectOne(statement, dto);

	}
	public List<MemDTO> getMemList(MemDTO dto) {
		statement = namespace + ".memSelect";
		return sqlSession.selectList(statement,dto);
	}
	public Integer UpdateMember(MemDTO dto) {
		statement = namespace + ".memupdate";
		return sqlSession.update(statement, dto);
	}

}
