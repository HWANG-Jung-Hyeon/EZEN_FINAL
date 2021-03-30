package model;

public class RentDTO {
	String rentGoodsNo;
	String rentGoodsClass;
	String rentGoodsName;
	String rentGoodsDetail;
	String rentGoodsImg;
	String rentGoodsQty;
	String rentGoodsPrice;
	
	StartEndPageDTO startEndPageDTO;
	
	public RentDTO () {}
	public RentDTO(String rentGoodsNo, String rentGoodsClass, String rentGoodsName, String rentGoodsDetail,
			String rentGoodsImg, String rentGoodsQty, String rentGoodsPrice) {
		this.rentGoodsNo = rentGoodsNo;
		this.rentGoodsClass = rentGoodsClass;
		this.rentGoodsName = rentGoodsName;
		this.rentGoodsDetail = rentGoodsDetail;
		this.rentGoodsImg = rentGoodsImg;
		this.rentGoodsQty = rentGoodsQty;
		this.rentGoodsPrice = rentGoodsPrice;
		System.out.println("sjbvsdxvh");
	}



	public String getRentGoodsNo() {
		return rentGoodsNo;
	}
	public void setRentGoodsNo(String rentGoodsNo) {
		this.rentGoodsNo = rentGoodsNo;
	}
	public String getRentGoodsClass() {
		return rentGoodsClass;
	}
	public void setRentGoodsClass(String rentGoodsClass) {
		this.rentGoodsClass = rentGoodsClass;
	}
	public String getRentGoodsName() {
		return rentGoodsName;
	}
	public void setRentGoodsName(String rentGoodsName) {
		this.rentGoodsName = rentGoodsName;
	}
	public String getRentGoodsDetail() {
		return rentGoodsDetail;
	}
	public void setRentGoodsDetail(String rentGoodsDetail) {
		this.rentGoodsDetail = rentGoodsDetail;
	}
	public String getRentGoodsImg() {
		return rentGoodsImg;
	}
	public void setRentGoodsImg(String rentGoodsImg) {
		this.rentGoodsImg = rentGoodsImg;
	}
	public String getRentGoodsQty() {
		return rentGoodsQty;
	}
	public void setRentGoodsQty(String rentGoodsQty) {
		this.rentGoodsQty = rentGoodsQty;
	}
	public String getRentGoodsPrice() {
		return rentGoodsPrice;
	}
	public void setRentGoodsPrice(String rentGoodsPrice) {
		this.rentGoodsPrice = rentGoodsPrice;
	}
}
