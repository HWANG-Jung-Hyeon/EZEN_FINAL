package model;

public class ShopOrderListDTO {
	String shopgoodName;
	String shopgoodsPrice;
	String shopgoodsImage;
	String orderPay;
	String shopgoodsQty;
	String orderNo;

	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getShopgoodName() {
		return shopgoodName;
	}
	public void setShopgoodName(String shopgoodName) {
		this.shopgoodName = shopgoodName;
	}
	public String getShopgoodsPrice() {
		return shopgoodsPrice;
	}
	public void setShopgoodsPrice(String shopgoodsPrice) {
		this.shopgoodsPrice = shopgoodsPrice;
	}
	public String getShopgoodsImage() {
		return shopgoodsImage;
	}
	public void setShopgoodsImage(String shopgoodsImage) {
		this.shopgoodsImage = shopgoodsImage;
	}
	public String getOrderPay() {
		return orderPay;
	}
	public void setOrderPay(String orderPay) {
		this.orderPay = orderPay;
	}
	public String getShopgoodsQty() {
		return shopgoodsQty;
	}
	public void setShopgoodsQty(String shopgoodsQty) {
		this.shopgoodsQty = shopgoodsQty;
	}
	
}
