package command;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class EmployeesCommand {
	String empId;
	String empPw;
	String empName;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date empBirth;
	String empEmail;
	String empAddr;
	String gender;
	String empPh;
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpPw() {
		return empPw;
	}
	public void setEmpPw(String empPw) {
		this.empPw = empPw;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Date getEmpBirth() {
		return empBirth;
	}
	public void setEmpBirth(Date empBirth) {
		this.empBirth = empBirth;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpAddr() {
		return empAddr;
	}
	public void setEmpAddr(String empAddr) {
		this.empAddr = empAddr;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmpPh() {
		return empPh;
	}
	public void setEmpPh(String empPh) {
		this.empPh = empPh;
	}
	
	
}
