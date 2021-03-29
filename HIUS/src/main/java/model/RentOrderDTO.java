package model;

public class RentOrderDTO {
	String rentOrderNo;
	Integer rentPay;
	String rentDate;
	String rentRcvName;
	String rentAddr;
	String memId;
	public String getRentOrderNo() {
		return rentOrderNo;
	}
	public void setRentOrderNo(String rentOrderNo) {
		this.rentOrderNo = rentOrderNo;
	}
	public Integer getRentPay() {
		return rentPay;
	}
	public void setRentPay(Integer rentPay) {
		this.rentPay = rentPay;
	}
	public String getRentDate() {
		return rentDate;
	}
	public void setRentDate(String rentDate) {
		this.rentDate = rentDate;
	}
	public String getRentRcvName() {
		return rentRcvName;
	}
	public void setRentRcvName(String rentRcvName) {
		this.rentRcvName = rentRcvName;
	}
	public String getRentAddr() {
		return rentAddr;
	}
	public void setRentAddr(String rentAddr) {
		this.rentAddr = rentAddr;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
}
