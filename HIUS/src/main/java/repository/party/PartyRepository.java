package repository.party;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import model.PartyCartDTO;
import model.PartyDTO;
import model.PartyOrderDTO;

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
/////////////////////////////////////////////////////////////////////////////////////	
	public int getPartyCount() {
		String statement = namespace + ".partyCount";
		return sqlSession.update(statement);
	}
	public Integer partyDelete(String prPl) {
		String statement = namespace + ".partyDelete";
		return sqlSession.update(statement);
	}
	public String getPrrvNo(String memId) {
		String statement = namespace + ".getPrrvNo";
		return sqlSession.selectOne(statement, memId);
	}
	public String revCart() {
		String statement = namespace + ".revCart";
		return sqlSession.selectOne(statement);
	}
	public Integer prrvInsert(PartyCartDTO dto) {
		String statement = namespace + ".prrvInsert";
		return sqlSession.update(statement, dto);
	}
	public Integer updateParty(PartyCartDTO dto) {
		String statement = namespace + ".updateParty";
		return sqlSession.update(statement, dto);
	}
	
	public Integer getPartyOrder(PartyCartDTO cartdto) {
		String statement = namespace + ".updateParty";
		return sqlSession.insert(statement, cartdto);
		
	}
	public List<PartyOrderDTO> getPartyOrderList(String memId) {
		String statement = namespace + ".getPartyOrderList";
		return sqlSession.selectList(statement, memId);
	}

}
