package repository.login;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import model.AuthInfo;

public class LoginRepository {
	@Autowired
	SqlSession sqlSession;
	String namespace= "HIUS.mappers.loginMapper";
	String statement;
	public AuthInfo loginSelect(String userId) {
		System.out.println(userId);
		statement = namespace + ".loginSelect";
		return sqlSession.selectOne(statement, userId);
	}
}
