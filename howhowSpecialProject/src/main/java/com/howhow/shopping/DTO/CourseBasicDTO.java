package com.howhow.shopping.DTO;

public class CourseBasicDTO {
	
	private int courseID;
	private String courseName;
	private int price;
	private int discountPrice;
	private double rank;
	private int creatorid;
	private int categoryid;
	private double discount;
	private int coursestatus;
	private String cover;
	private String description;
	private String creatorName;
	
	public CourseBasicDTO() {
	}
	
	public CourseBasicDTO(int courseID, String courseName, int price, int discountPrice,
			double rank) {
		this.courseID = courseID;
		this.courseName = courseName;
		this.price = price;
		this.discountPrice = discountPrice;
		this.rank = rank;
	}
	
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscountPrice() {
		return discountPrice;
	}
	public void setDiscountPrice(int discountPrice) {
		this.discountPrice = discountPrice;
	}
	public double getRank() {
		return rank;
	}
	public void setRank(double rank) {
		this.rank = rank;
	}
	public int getCreatorid() {
		return creatorid;
	}
	public void setCreatorid(int creatorid) {
		this.creatorid = creatorid;
	}
	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public int getCoursestatus() {
		return coursestatus;
	}
	public void setCoursestatus(int coursestatus) {
		this.coursestatus = coursestatus;
	}
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreatorName() {
		return creatorName;
	}

	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}
	
	
	
}
