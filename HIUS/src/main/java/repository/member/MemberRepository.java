package repository.member;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import model.MemberDTO;

public class MemberRepository {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace ="HIUS.mappers.memberMapper";
	String statement;
	public void memberInsert(MemberDTO dto) {
		statement = namespace + ".memberInsert";
		sqlSession.insert(statement,dto);
	}
	public List<MemberDTO> memberSelect() {
		statement = namespace + ".memberSelect";
		return sqlSession.selectOne(statement);
	}
	public MemberDTO memberDetail(String MemId) {
		statement = namespace + ".memberDetail";
		return sqlSession.selectOne("statement", MemId);
	}
	
	public MemberDTO MemberModify(String MemId) {
		statement = namespace + ".memupdate";
		return sqlSession.selectOne(statement, MemId);
	}
	public void memberModifyAction(MemberDTO dto) {
		statement = namespace + ".memberModifyAction";
		sqlSession.update(statement, dto);
	}
	public void MemberDelete(String memId) {
		statement= namespace + ".memberDelete";
		sqlSession.delete(statement, memId);
	}
}
