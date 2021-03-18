package command;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class MemberCommand {
	String MEM_ID;
	String MEM_PW;
	String MEM_NAME;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	Date MEM_BIRTH;
	String MEM_PH;
	String MEM_ADDR;
	String MEM_EMAIL;
	String GENDER;
	public String getMEM_ID() {
		return MEM_ID;
	}
	public void setMEM_ID(String mEM_ID) {
		MEM_ID = mEM_ID;
	}
	public String getMEM_PW() {
		return MEM_PW;
	}
	public void setMEM_PW(String mEM_PW) {
		MEM_PW = mEM_PW;
	}
	public String getMEM_NAME() {
		return MEM_NAME;
	}
	public void setMEM_NAME(String mEM_NAME) {
		MEM_NAME = mEM_NAME;
	}
	public Date getMEM_BIRTH() {
		return MEM_BIRTH;
	}
	public void setMEM_BIRTH(Date mEM_BIRTH) {
		MEM_BIRTH = mEM_BIRTH;
	}
	public String getMEM_PH() {
		return MEM_PH;
	}
	public void setMEM_PH(String mEM_PH) {
		MEM_PH = mEM_PH;
	}
	public String getMEM_ADDR() {
		return MEM_ADDR;
	}
	public void setMEM_ADDR(String mEM_ADDR) {
		MEM_ADDR = mEM_ADDR;
	}
	public String getMEM_EMAIL() {
		return MEM_EMAIL;
	}
	public void setMEM_EMAIL(String mEM_EMAIL) {
		MEM_EMAIL = mEM_EMAIL;
	}
	public String getGENDER() {
		return GENDER;
	}
	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}
	
	
	
}
