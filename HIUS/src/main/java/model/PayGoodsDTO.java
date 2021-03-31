package model;

import java.util.List;

public class PayGoodsDTO {
	ShopPayDTO shopPayDTO;
	List<GoodsDTO> goodsList;
	public ShopPayDTO getShopPayDTO() {
		return shopPayDTO;
	}
	public void setShopPayDTO(ShopPayDTO shopPayDTO) {
		this.shopPayDTO = shopPayDTO;
	}
	public List<GoodsDTO> getGoodsList() {
		return goodsList;
	}
	public void setGoodsList(List<GoodsDTO> goodsList) {
		this.goodsList = goodsList;
	}
}
