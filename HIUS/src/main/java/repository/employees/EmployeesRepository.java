package repository.employees;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import model.EmpDTO;

public class EmployeesRepository {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace= "HIUS.mappers.employeesMapper";
	String statement;
	public void empinsert(EmpDTO dto) {
		statement = namespace + ".empInsert";
		sqlSession.insert(statement,dto);
	}
}
