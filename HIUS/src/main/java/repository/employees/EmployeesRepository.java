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
	public EmpDTO empDetail(String empId){
		statement = namespace + ".empDetail";
		return sqlSession.selectOne(statement, empId);
	}
	public EmpDTO empModify(String empId){
		statement = namespace + ".empModify";
		return sqlSession.selectOne(statement, empId);
	}
	public void empModifyAction(EmpDTO empDTO){
		statement = namespace + ".empModifyAction";
		sqlSession.update(statement, empDTO);
	}
	public void empDelete(String empId) {
		statement = namespace + ".empDelete";
		sqlSession.delete(statement, empId);
	}
}
