package command;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

public class PartyAdminCommand {
	String prrvNo;
	String memId;
	String prNo;
	String memName;
	String memPh;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	Date prrvDate;
	String prrvStartTime;
	String prrvEndTime;
	MultipartFile [] prImg;
	String prPl;
	
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
	public MultipartFile[] getPrImg() {
		return prImg;
	}
	public void setPrImg(MultipartFile[] prImg) {
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
	public Date getPrrvDate() {
		return prrvDate;
	}
	public void setPrrvDate(Date prrvDate) {
		this.prrvDate = prrvDate;
	}

	
}
