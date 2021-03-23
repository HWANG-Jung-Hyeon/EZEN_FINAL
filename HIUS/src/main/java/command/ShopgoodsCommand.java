package command;

import org.springframework.web.multipart.MultipartFile;

public class ShopgoodsCommand {
	String shopgoodsNo;
	String shopgoodsClass;
	String shopgoodsName;
	String shopgoodsSet;
	String shopgoodsDetail;
	MultipartFile [] shopgoodsImage;
	String shopgoodsQty;
	String shopgoodsPrice;
	
	
	public MultipartFile[] getShopgoodsImage() {
		return shopgoodsImage;
	}
	public void setShopgoodsImage(MultipartFile[] shopgoodsImage) {
		this.shopgoodsImage = shopgoodsImage;
	}
	public String getShopgoodsNo() {
		return shopgoodsNo;
	}
	public void setShopgoodsNo(String shopgoodsNo) {
		this.shopgoodsNo = shopgoodsNo;
	}
	public String getShopgoodsClass() {
		return shopgoodsClass;
	}
	public void setShopgoodsClass(String shopgoodsClass) {
		this.shopgoodsClass = shopgoodsClass;
	}
	public String getShopgoodsName() {
		return shopgoodsName;
	}
	public void setShopgoodsName(String shopgoodsName) {
		this.shopgoodsName = shopgoodsName;
	}
	public String getShopgoodsSet() {
		return shopgoodsSet;
	}
	public void setShopgoodsSet(String shopgoodsSet) {
		this.shopgoodsSet = shopgoodsSet;
	}
	public String getShopgoodsDetail() {
		return shopgoodsDetail;
	}
	public void setShopgoodsDetail(String shopgoodsDetail) {
		this.shopgoodsDetail = shopgoodsDetail;
	}
	
	public String getShopgoodsQty() {
		return shopgoodsQty;
	}
	public void setShopgoodsQty(String shopgoodsQty) {
		this.shopgoodsQty = shopgoodsQty;
	}
	public String getShopgoodsPrice() {
		return shopgoodsPrice;
	}
	public void setShopgoodsPrice(String shopgoodsPrice) {
		this.shopgoodsPrice = shopgoodsPrice;
	}
	
	
}
