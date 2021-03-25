package repository.empInfo;

import org.apache.ibatis.session.SqlSession;

import model.EmpDTO;

public class EmpInfoRepository {
	SqlSession sqlSession;
	String namespace="HIUS.mappers.empMapper";
	String statement;
	public EmpDTO empInfo(String EMP_ID) {
		statement = namespace +".empDetail";
	return sqlSession.selectOne(statement, EMP_ID);
	}
	
}
