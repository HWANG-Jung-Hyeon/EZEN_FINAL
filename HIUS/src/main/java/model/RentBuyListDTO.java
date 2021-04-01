package model;

import java.util.List;

public class RentBuyListDTO {
	RentPayDTO rentPayDTO;
	List<RentOrderBuyDTO> Lists;
	public RentPayDTO getRentPayDTO() {
		return rentPayDTO;
	}
	public void setRentPayDTO(RentPayDTO rentPayDTO) {
		this.rentPayDTO = rentPayDTO;
	}
	public List<RentOrderBuyDTO> getLists() {
		return Lists;
	}
	public void setLists(List<RentOrderBuyDTO> lists) {
		Lists = lists;
	}
}