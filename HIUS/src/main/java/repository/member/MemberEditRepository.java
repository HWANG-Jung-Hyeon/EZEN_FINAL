package repository.member;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import model.MemberDTO;

public class MemberEditRepository {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace="mapper.edit.memberEditMapper";
	String statement;
	public Integer deleteMember(String memId) {
		statement = namespace + ".deleteMember";
		return sqlSession.update(statement,memId);
	}
	public List<MemberDTO> getMemberList(MemberDTO dto){
		statement = namespace + ".selectMember";
		return sqlSession.selectList(statement, dto);
	}
	public Integer getMemberCount() {
		statement = namespace + ".selectCount";
		return sqlSession.selectOne(statement);
	}
}
