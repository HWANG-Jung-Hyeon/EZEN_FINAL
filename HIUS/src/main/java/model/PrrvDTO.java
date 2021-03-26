package model;

import java.sql.Timestamp;

public class PrrvDTO {
	String prrvNo;
	String memId;
	String prNo;
	String memName;
	String memPh;
	Timestamp prrvDate;
	Timestamp prrvTime;
	StartEndPageDTO startEndPageDTO;
	
	public PrrvDTO() {}
	
	public PrrvDTO(String prrvNo, String memId, String memName, String memPh, 
			Timestamp prrvDate, Timestamp prrvTime) {
		super();
		this.prrvNo = prrvNo;
		this.memId = memId;
		this.memName = memName;
		this.memPh = memPh;
		this.prrvDate = prrvDate;
		this.prrvTime = prrvTime;
	}
	
	public StartEndPageDTO getStartEndPageDTO() {
		return startEndPageDTO;
	}

	public void setStartEndPageDTO(StartEndPageDTO startEndPageDTO) {
		this.startEndPageDTO = startEndPageDTO;
	}

	public String getPrrvNo() {
		return prrvNo;
	}
	public void setPrrvNo(String prrvNo) {
		this.prrvNo = prrvNo;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getPrNo() {
		return prNo;
	}
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public String getMemPh() {
		return memPh;
	}
	public void setMemPh(String memPh) {
		this.memPh = memPh;
	}
	public Timestamp getPrrvDate() {
		return prrvDate;
	}
	public void setPrrvDate(Timestamp prrvDate) {
		this.prrvDate = prrvDate;
	}
	public Timestamp getPrrvTime() {
		return prrvTime;
	}
	public void setPrrvTime(Timestamp prrvTime) {
		this.prrvTime = prrvTime;
	}
	
	
	
}
