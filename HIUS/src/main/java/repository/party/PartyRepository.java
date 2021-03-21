package repository.party;

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
	
}
