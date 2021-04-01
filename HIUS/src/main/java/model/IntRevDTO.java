package model;

public class IntRevDTO {
	String reviewNo;
	String goodsNo;
	Integer reviewScore;
	String goodsImg;
	String goodsDetail;
	String memId;
	
	StartEndPageDTO startEndPageDTO;

	public IntRevDTO() {}
	public IntRevDTO(String reviewNo, String goodsNo, Integer reviewScore, String goodsImg, String goodsDetail,
			String memId) {
		super();
		this.reviewNo = reviewNo;
		this.goodsNo = goodsNo;
		this.reviewScore = reviewScore;
		this.goodsImg = goodsImg;
		this.goodsDetail = goodsDetail;
		this.memId = memId;
	}
	public String getReviewNo() {
		return reviewNo;
	}

	public void setReviewNo(String reviewNo) {
		this.reviewNo = reviewNo;
	}

	public String getGoodsNo() {
		return goodsNo;
	}

	public void setGoodsNo(String goodsNo) {
		this.goodsNo = goodsNo;
	}

	public Integer getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(Integer reviewScore) {
		this.reviewScore = reviewScore;
	}

	public String getGoodsImg() {
		return goodsImg;
	}

	public void setGoodsImg(String goodsImg) {
		this.goodsImg = goodsImg;
	}

	public String getGoodsDetail() {
		return goodsDetail;
	}

	public void setGoodsDetail(String goodsDetail) {
		this.goodsDetail = goodsDetail;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public StartEndPageDTO getStartEndPageDTO() {
		return startEndPageDTO;
	}

	public void setStartEndPageDTO(StartEndPageDTO startEndPageDTO) {
		this.startEndPageDTO = startEndPageDTO;
	}
}
