package model;

import java.sql.Timestamp;

public class MemberDTO {
	String memId;
	String memPw;
	String memName;
	Timestamp memBirth;
	String memPh;
	String memAddr;
	String memEmail;
	String gender;
	Timestamp memReg;
	
	StartEndPageDTO startEndPageDTO;
	
	public MemberDTO() {}
	
	public MemberDTO(String memId, String memPw, String memName, Timestamp memBirth, String memPh, String memAddr, String memEmail,
			String gender, Timestamp memReg) {
		super();
		this.memId = memId;
		this.memPw = memPw;
		this.memName = memName;
		this.memBirth = memBirth;
		this.memPh = memPh;
		this.memAddr = memAddr;
		this.memEmail = memEmail;
		this.gender = gender;
		this.memReg = memReg;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMemPw() {
		return memPw;
	}
	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public Timestamp getMemBirth() {
		return memBirth;
	}
	public void setMemBirth(Timestamp memBirth) {
		this.memBirth = memBirth;
	}
	public String getMemPh() {
		return memPh;
	}
	public void setMemPh(String memPh) {
		this.memPh = memPh;
	}
	public String getMemAddr() {
		return memAddr;
	}
	public void setMemAddr(String memAddr) {
		this.memAddr = memAddr;
	}
	public String getMemEmail() {
		return memEmail;
	}
	public void setMemEmail(String memEmail) {
		this.memEmail = memEmail;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Timestamp getMemReg() {
		return memReg;
	}
	public void setMemReg(Timestamp memReg) {
		this.memReg = memReg;
	}

	public StartEndPageDTO getStartEndPageDTO() {
		return startEndPageDTO;
	}

	public void setStartEndPageDTO(StartEndPageDTO startEndPageDTO) {
		this.startEndPageDTO = startEndPageDTO;
	}
	
	
}
