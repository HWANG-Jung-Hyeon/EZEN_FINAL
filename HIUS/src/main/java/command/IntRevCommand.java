package command;

import org.springframework.web.multipart.MultipartFile;

public class IntRevCommand {
	String reviewNo;
	String goodsNo;
	Integer ReviewScore;
	MultipartFile [] reviewImg;
	String reviewDetail;
	String memId;
	
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
		return ReviewScore;
	}
	public void setReviewScore(Integer reviewScore) {
		ReviewScore = reviewScore;
	}
	public MultipartFile[] getReviewImg() {
		return reviewImg;
	}
	public void setReviewImg(MultipartFile[] reviewImg) {
		this.reviewImg = reviewImg;
	}
	public String getReviewDetail() {
		return reviewDetail;
	}
	public void setReviewDetail(String reviewDetail) {
		this.reviewDetail = reviewDetail;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
}
