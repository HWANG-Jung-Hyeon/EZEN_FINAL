package repository.member;

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

}
