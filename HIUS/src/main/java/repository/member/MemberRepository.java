package repository.member;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import model.MemberDTO;

public class MemberRepository {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace ="HIUS.mappers.memberMapper";
	private String statement;

	/////////member
	public Integer insertMember(MemberDTO dto) {
		statement = namespace + ".memberInsert";
		return sqlSession.update(statement,dto);
	}
	
	public MemberDTO selectByMember(MemberDTO dto) {
		statement = namespace + ".selectByMember";
		return sqlSession.selectOne(statement, dto);
	}
	public Integer updateMember(MemberDTO dto) {
		statement = namespace + ".updateMember";
		return sqlSession.update(statement, dto);	
	}
	public Integer pwUpdate(MemberDTO dto) {
		statement= namespace + ".updateMemberPw";
		return sqlSession.update(statement, dto);
	}
	public Integer deleteMember(MemberDTO dto) {
		statement = namespace +".deleteMember";
		return sqlSession.update(statement, dto);
	}
	
	
}
