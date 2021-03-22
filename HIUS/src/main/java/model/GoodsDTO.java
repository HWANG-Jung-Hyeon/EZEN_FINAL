package model;

public class GoodsDTO {
	String goodsNo;
	String goodsClass;
	String goodsName;
	String goodsSet;
	String goodsDetail;
	String goodsImg;
	Integer goodsQty;
	Integer goodsPrice;
	
	StartEndPageDTO startEndPageDTO;
	
	public GoodsDTO() {}
	public GoodsDTO(String goodsNo, String goodsClass, String goodsName, String goodsSet, String goodsDetail,
			String goodsImg, Integer goodsQty, Integer goodsPrice) {
		super();
		this.goodsNo = goodsNo;
		this.goodsClass = goodsClass;
		this.goodsName = goodsName;
		this.goodsSet = goodsSet;
		this.goodsDetail = goodsDetail;
		this.goodsImg = goodsImg;
		this.goodsQty = goodsQty;
		this.goodsPrice = goodsPrice;
	}
	public StartEndPageDTO getStartEndPageDTO() {
		return startEndPageDTO;
	}
	public void setStartEndPageDTO(StartEndPageDTO startEndPageDTO) {
		this.startEndPageDTO = startEndPageDTO;
	}
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
	public String getGoodsImg() {
		return goodsImg;
	}
	public void setGoodsImg(String goodsImg) {
		this.goodsImg = goodsImg;
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
}
