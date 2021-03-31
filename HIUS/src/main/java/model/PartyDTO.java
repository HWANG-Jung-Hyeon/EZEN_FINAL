package model;

import java.sql.Timestamp;

public class PartyDTO {
	String prNo;
	String prPl;
	String prImg;
	String prContent;
	String prPrice;
	String prMax;
	String prMintime;
	String prOp;
	String prPh;
	
	StartEndPageDTO startEndPageDTO;
	
	public PartyDTO () {}
	public PartyDTO(String prNo, String prPl, String prImg, String prContent, String prPrice,
	String prMax, String prMintime, String prOp, String prPh) {
		this.prNo = prNo;
		this.prPl = prPl;
		this.prImg = prImg;
		this.prContent = prContent;
		this.prPrice = prPrice;
		this.prMax = prMax;
		this.prMintime = prMintime;
		this.prOp = prOp;
		this.prPh = prPh;
	
}
	
	
	public StartEndPageDTO getStartEndPageDTO() {
		return startEndPageDTO;
	}
	public void setStartEndPageDTO(StartEndPageDTO startEndPageDTO) {
		this.startEndPageDTO = startEndPageDTO;
	}
	public String getPrNo() {
		return prNo;
	}
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}
	public String getPrPl() {
		return prPl;
	}
	public void setPrPl(String prPl) {
		this.prPl = prPl;
	}
	public String getPrImg() {
		return prImg;
	}
	public void setPrImg(String prImg) {
		this.prImg = prImg;
	}
	public String getPrContent() {
		return prContent;
	}
	public void setPrContent(String prContent) {
		this.prContent = prContent;
	}
	public String getPrPrice() {
		return prPrice;
	}
	public void setPrPrice(String prPrice) {
		this.prPrice = prPrice;
	}
	public String getPrMax() {
		return prMax;
	}
	public void setPrMax(String prMax) {
		this.prMax = prMax;
	}
	public String getPrMintime() {
		return prMintime;
	}
	public void setPrMintime(String prMintime) {
		this.prMintime = prMintime;
	}
	public String getPrOp() {
		return prOp;
	}
	public void setPrOp(String prOp) {
		this.prOp = prOp;
	}
	public String getPrPh() {
		return prPh;
	}
	public void setPrPh(String prPh) {
		this.prPh = prPh;
	}
}