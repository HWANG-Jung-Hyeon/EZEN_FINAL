package command;

public class RentBuyInfoCommand {
	String resName;
	String phoneNum;
	String cardCo;
	String cardNum;
	String rentPay;
	String rentOrderNo;
	
	public String getRentOrderNo() {
		return rentOrderNo;
	}
	public void setRentOrderNo(String rentOrderNo) {
		this.rentOrderNo = rentOrderNo;
	}
	public String getResName() {
		return resName;
	}
	public void setResName(String resName) {
		this.resName = resName;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getCardCo() {
		return cardCo;
	}
	public void setCardCo(String cardCo) {
		this.cardCo = cardCo;
	}
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public String getRentPay() {
		return rentPay;
	}
	public void setRentPay(String rentPay) {
		this.rentPay = rentPay;
	}
}
