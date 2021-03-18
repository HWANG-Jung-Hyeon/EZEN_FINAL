package command;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class EmployeesCommand {
	String EMP_ID;
	String EMP_PW;
	String EMP_NAME;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date EMP_BIRTH;
	String EMP_EMAIL;
	String EMP_ADDR;
	String GENDER;
	String EMP_PH;
	public String getEMP_ID() {
		return EMP_ID;
	}
	public void setEMP_ID(String eMP_ID) {
		EMP_ID = eMP_ID;
	}
	public String getEMP_PW() {
		return EMP_PW;
	}
	public void setEMP_PW(String eMP_PW) {
		EMP_PW = eMP_PW;
	}
	public String getEMP_NAME() {
		return EMP_NAME;
	}
	public void setEMP_NAME(String eMP_NAME) {
		EMP_NAME = eMP_NAME;
	}
	public Date getEMP_BIRTH() {
		return EMP_BIRTH;
	}
	public void setEMP_BIRTH(Date eMP_BIRTH) {
		EMP_BIRTH = eMP_BIRTH;
	}
	public String getEMP_EMAIL() {
		return EMP_EMAIL;
	}
	public void setEMP_EMAIL(String eMP_EMAIL) {
		EMP_EMAIL = eMP_EMAIL;
	}
	public String getEMP_ADDR() {
		return EMP_ADDR;
	}
	public void setEMP_ADDR(String eMP_ADDR) {
		EMP_ADDR = eMP_ADDR;
	}
	public String getGENDER() {
		return GENDER;
	}
	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}
	public String getEMP_PH() {
		return EMP_PH;
	}
	public void setEMP_PH(String eMP_PH) {
		EMP_PH = eMP_PH;
	}
	
}
