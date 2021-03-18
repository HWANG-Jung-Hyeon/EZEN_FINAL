package repository.employees;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import model.EmpDTO;



public class EmployeesRepository {
	@Autowired
	SqlSession sqlSession;
	String namespace= "HIUS.mappers.employeesMapper";
	String statement;
	public Integer insertEmployee(EmpDTO empDTO) {
		statement = namespace + ".employeesInsert";
		return sqlSession.update(statement,empDTO );	
	}
	public List<EmpDTO> empSelect(){
		statement = namespace + ".empSelect";
		return sqlSession.selectList(statement);
	}
}
