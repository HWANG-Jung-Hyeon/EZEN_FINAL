package service.employees;

import org.springframework.beans.factory.annotation.Autowired;

import repository.employees.EmployeesRepository;

public class EmpPloyeesDeleteService {
	@Autowired
	EmployeesRepository employeesRepository;
	public void empDelete(String empId) {
		employeesRepository.empDelete(empId);
	}
	
}
