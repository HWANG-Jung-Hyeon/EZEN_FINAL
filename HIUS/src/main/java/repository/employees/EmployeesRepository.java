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
	public EmpDTO empDetail(String EMP_ID){
		statement = namespace + ".empDetail";
		return sqlSession.selectOne(statement, EMP_ID);
	}
	public EmpDTO empModify(String EMP_ID){
		statement = namespace + ".empModify";
		return sqlSession.selectOne(statement, EMP_ID);
	}
	public void empModifyAction(EmpDTO empDTO){
		statement = namespace + ".empModifyAction";
		sqlSession.update(statement, empDTO);
	}
	public void empDelete(String EMP_ID) {
		statement = namespace + ".empDelete";
		sqlSession.delete(statement, EMP_ID);
	}
}
