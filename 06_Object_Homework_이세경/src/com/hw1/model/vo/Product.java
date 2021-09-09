package com.hw1.model.vo;

public class Product {

		private String productId; //상품아이디ㄴ
		private String productName; // 상품명
		private String productArea; //생산지
		private int price;
		private double tax;
		
		//기본 생성자 
			public Product() {
				
			}
		
			public Product(String productId, String productName, String productArea, int price, double tax) {
				this.productId = productId;
				this.productName = productName;
				this.productArea = productArea;
				this.price = price;
				this.tax = tax;
			}
		//세터메소드
			public void setProductId(String productId) {
				this.productId = productId;
			}
			public void setProductName(String productName) {
				this.productName = productName;
			}
			public void setProductArea(String productArea) {
				this.productArea = productArea;
			}
			public void setPrice(int price) {
				this.price = price;
			}
			public void setTax(double tax) {
				this.tax = tax;
			}
		
		//게터메소드
			
			public String getProductId() {
				return productId;
			}
			public String getProductName() {
				return productName;
			}
			public String getProductArea() {
				return productArea;
			}
			public int getPrice() {
				return price;
			}
			public double getTax() {
				return tax;
			}
			
			public String information() {
				return  productId + productName +  productArea 
				+ price +  tax ;
			}
			
			public String result() {
				return "상품명 = " + productName + " \n부가세 포함 가격 = " + (price + price*0.05 +"원");
			}
			
			
			
			
			
			
}
	

