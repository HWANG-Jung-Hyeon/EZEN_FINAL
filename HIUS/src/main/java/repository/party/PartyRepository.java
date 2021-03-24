package repository.party;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.PartyDTO;

@Repository
public class PartyRepository {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace="PartyMapper";
	
	public void partyInsert(PartyDTO dto) {
		String statement = namespace + ".partyInsert";
		sqlSession.update(statement, dto);
	}

	public List<PartyDTO> getPartyList(PartyDTO dto) {
		String statement = namespace + ".getPartyList";
		return sqlSession.selectList(statement, dto);
	}
	public Integer getPartyCount() {
		String statement = namespace + ".getPartyCount";
		return sqlSession.selectOne(statement);
	}
	public void partyUpdate(PartyDTO dto) {
		String statement = namespace + ".partyUpdate";
		sqlSession.update(statement, dto);
	}
	public void partyDelete(String prNo) {
		String statement = namespace + ".partyDelete";
		sqlSession.update(statement,prNo);
	}
}
