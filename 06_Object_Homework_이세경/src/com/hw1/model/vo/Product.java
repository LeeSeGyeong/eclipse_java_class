package com.hw1.model.vo;

public class Product {

		private String productId; //��ǰ���̵�
		private String productName; // ��ǰ��
		private String productArea; //������
		private int price;
		private double tax;
		
		//�⺻ ������ 
			public Product() {
				
			}
		
			public Product(String productId, String productName, String productArea, int price, double tax) {
				this.productId = productId;
				this.productName = productName;
				this.productArea = productArea;
				this.price = price;
				this.tax = tax;
			}
		//���͸޼ҵ�
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
		
		//���͸޼ҵ�
			
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
				return "��ǰ�� = " + productName + " \n�ΰ��� ���� ���� = " + (price + price*0.05 +"��");
			}
			
			
			
			
			
			
}
	

