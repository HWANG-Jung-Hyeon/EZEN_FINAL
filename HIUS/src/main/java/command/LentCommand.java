package command;

import org.springframework.web.multipart.MultipartFile;

public class LentCommand {
	String rentGoodsNo;
	String rentGoodsName;
	String rentGoodsDetail;
	MultipartFile [] rentGoodsImg;
	String rentGoodsQty;
	String rentGoodsPrice;
	public String getRentGoodsNo() {
		return rentGoodsNo;
	}
	public void setRentGoodsNo(String rentGoodsNo) {
		this.rentGoodsNo = rentGoodsNo;
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

	public MultipartFile[] getRentGoodsImg() {
		return rentGoodsImg;
	}
	public void setRentGoodsImg(MultipartFile[] rentGoodsImg) {
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
