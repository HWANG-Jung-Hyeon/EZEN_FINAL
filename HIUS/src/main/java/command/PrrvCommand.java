package command;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class PrrvCommand {
	String prrvNo;
	String memId;
	String prNo;
	String memName;
	String memPh;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	Date prrvDate;
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
	public Date getPrrvDate() {
		return prrvDate;
	}
	public void setPrrvDate(Date prrvDate) {
		this.prrvDate = prrvDate;
	}

	
}
