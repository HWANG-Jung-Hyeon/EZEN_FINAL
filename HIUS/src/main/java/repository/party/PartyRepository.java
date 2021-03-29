package repository.party;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import model.PartyDTO;

public class PartyRepository {
	@Autowired
	private SqlSession sqlSession;
	private String namespace= "HIUS.mappers.partyAdminMapper";
	String statement;	

	public List<PartyDTO> getPartyList(PartyDTO dto) {
		statement = namespace + ".selectParty";
		return sqlSession.selectList(statement, dto);
	}
	public List<PartyDTO> getPartyCount(String prPl) {
		statement = namespace + ".selectCount";
		return sqlSession.selectOne(statement, prPl);
	}
///////////////////////////////////////////////////////////////////////////////////	
	public Integer partyInsert(PartyDTO dto) {
		String statement = namespace +".partyInsert";
		return sqlSession.update(statement, dto);	
	}
	public Integer deleteParty(String prPl) {
		statement = namespace +".deleteParty";
		return sqlSession.update(statement, prPl);	
	}
	public Integer updateParty(PartyDTO dto) {
		statement = namespace = ".updateParty";
		return sqlSession.update(statement, dto);
	}
	
	public Integer partyUpdate(PartyDTO dto) {
		String statement = namespace + ".partyUpdate";
		return sqlSession.update(statement, dto);
	}
	public int getPartyCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
