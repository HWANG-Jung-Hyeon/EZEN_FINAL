package command;

import org.springframework.web.multipart.MultipartFile;

public class GoodsCommand {
	String goodsNo;
	String goodsClass;
	String goodsName;
	String goodsSet;
	String goodsDetail;
	MultipartFile [] goodsImg;
	Integer goodsQty;
	Integer goodsPrice;
	
	public String getGoodsNo() {
		return goodsNo;
	}
	public void setGoodsNo(String goodsNo) {
		this.goodsNo = goodsNo;
	}
	public String getGoodsClass() {
		return goodsClass;
	}
	public void setGoodsClass(String goodsClass) {
		this.goodsClass = goodsClass;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsSet() {
		return goodsSet;
	}
	public void setGoodsSet(String goodsSet) {
		this.goodsSet = goodsSet;
	}
	public String getGoodsDetail() {
		return goodsDetail;
	}
	public void setGoodsDetail(String goodsDetail) {
		this.goodsDetail = goodsDetail;
	}
	public Integer getGoodsQty() {
		return goodsQty;
	}
	public void setGoodsQty(Integer goodsQty) {
		this.goodsQty = goodsQty;
	}
	public Integer getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(Integer goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public MultipartFile[] getGoodsImg() {
		return goodsImg;
	}
	public void setGoodsImg(MultipartFile[] goodsImg) {
		this.goodsImg = goodsImg;
	}
}
