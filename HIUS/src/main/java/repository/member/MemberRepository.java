package repository.member;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import model.MemberDTO;

public class MemberRepository {
	@Autowired
	SqlSession sqlSession;
	String namespace ="HIUS.mappers.memberMapper";
	String statement;
	public Integer insertMember(MemberDTO dto) {
		statement = namespace + ".memberInsert";
		return sqlSession.update(statement,dto);
	}
	public List<MemberDTO> memberSelect() {
		statement = namespace + ".memberSelect";
		return sqlSession.selectList(statement);
	}
	public MemberDTO memberDetail(String memId) {
		statement = namespace + ".memberDetail";
		return sqlSession.selectOne("statement", memId);
	}
	
	public MemberDTO memberModify(String memId) {
		statement = namespace + ".memupdate";
		return sqlSession.selectOne(statement, memId);
	}
	public void memberModifyAction(MemberDTO dto) {
		statement = namespace + ".memberModifyAction";
		sqlSession.update(statement, dto);
	}
	public Integer MemberDelete(MemberDTO dto) {
		statement= namespace + ".memberDelete";
		return sqlSession.delete(statement, dto);
	}
	public Integer pwUpdate(MemberDTO dto) {
		statement= namespace + ".updateMemberPw";
		return sqlSession.update(statement, dto);
	}
	public MemberDTO memberSelect(MemberDTO dto) {
		statement = namespace + ".selectMember";
		return sqlSession.selectOne(statement, dto);
	}
	
	
}
