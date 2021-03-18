package repository.member;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

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
	public List<MemDTO> memSelect(Model model) {
		statement = namespace + ".memSelect";
		return sqlSession.selectList(statement);

	}

}
