package model;

import java.sql.Timestamp;

public class PrrvDTO {
	String prrvNo;
	String memId;
	String prNo;
	String memName;
	String memPh;
	Timestamp prrvDate;
	String prrvStartTime;
	String prrvEndTime;
	String prImg;
	String prPl;
	
	StartEndPageDTO startEndPageDTO;
	
	public PrrvDTO() {}
	
	public PrrvDTO(String prrvNo, String memId, String memName, String memPh, 
			Timestamp prrvDate, String prrvStartTime, String prrvEndTime, String prImg, String prPl) {
		super();
		this.prrvNo = prrvNo;
		this.memId = memId;
		this.memName = memName;
		this.memPh = memPh;
		this.prrvDate = prrvDate;
		this.prrvEndTime = prrvEndTime;
		this.prrvStartTime = prrvStartTime;
		this.prImg = prImg;
		this.prPl = prPl;
	}
	
	public StartEndPageDTO getStartEndPageDTO() {
		return startEndPageDTO;
	}

	public void setStartEndPageDTO(StartEndPageDTO startEndPageDTO) {
		this.startEndPageDTO = startEndPageDTO;
	}

	public String getPrImg() {
		return prImg;
	}

	public void setPrImg(String prImg) {
		this.prImg = prImg;
	}

	public String getPrPl() {
		return prPl;
	}

	public void setPrPl(String prPl) {
		this.prPl = prPl;
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

	public String getPrrvStartTime() {
		return prrvStartTime;
	}

	public void setPrrvStartTime(String prrvStartTime) {
		this.prrvStartTime = prrvStartTime;
	}

	public String getPrrvEndTime() {
		return prrvEndTime;
	}

	public void setPrrvEndTime(String prrvEndTime) {
		this.prrvEndTime = prrvEndTime;
	}
	
	
}
