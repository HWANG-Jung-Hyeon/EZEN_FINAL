package model;

public class ShopCartDTO {
	String orderNo;
	Integer orderPay;
	String rcvName;
	String rcvAddr;
	String memId;
	
	

	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public Integer getOrderPay() {
		return orderPay;
	}
	public void setOrderPay(Integer orderPay) {
		this.orderPay = orderPay;
	}
	public String getRcvName() {
		return rcvName;
	}
	public void setRcvName(String rcvName) {
		this.rcvName = rcvName;
	}
	public String getRcvAddr() {
		return rcvAddr;
	}
	public void setRcvAddr(String rcvAddr) {
		this.rcvAddr = rcvAddr;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	
	
	
}
