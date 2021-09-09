package com.kh.chap03_class.model.vo;

public class Product {
	
	//클래스 선언구문에 작성가능한 접근제한자(public , default)
	//default는 접근제한자를 안썼을 때임  
	//public으로하면 같은패키지든 다른패키지든 해당 이클래스 사용가능
	//default로하면 같은패키지 안에서만 사용 가능 / 다른 패키지에서는 이클래스 사용불가
	
	/*
	 * *필드 (field)
	 * 
	 * 필드 == 멤버변수 == 인스턴스 변수 
	 * 
	 * <표현법>
	 * 
	 * 접근제한자[예약어] (private,default...) 자료형 변수명(필드명)
	 */
	private String pName;
	private int price;
	private String brand;
	
	/*
	 * 
	 *  * 생성자 
	 *  - 객체를 생성하기위한 일종의 메소드 
	 *  
	 *  <표현법>
	 *  접근제한자 클래스명(매개변수, 매개변수, ..){
	 *  
	 *  }
	 *  
	 */
	
	public Product() {
	
	}
	public Product(String pName,int price,String brand) {
			this.pName = pName;
			this.price = price;
			this.brand = brand;	
	}
	
	
	
	/*
	 * 메소드 
	 * -기능을 처리하는 담당 
	 * 
	 * <표현법>
	 * 접근제한자[예약어]  반환형 메소드명([매개변수,매개변수...]){
	 * 		//기능구현
	 * }
	 */
	
	//setter메소드 
	
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	
	//모든 필드값들 다 합친 한 문자열을 반환해주는 메소드 
	
	public String information() {
		return "pName :" + pName +", price : "+price +", brand : " + brand;
	}

}
