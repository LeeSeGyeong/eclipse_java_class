package com.kh.chap02_objectArray.model.vo;

public class Phone {

	//이름, 브랜드명, 가격, 시리즈
	
	private String name;
	private String brand;
	private int price;
	private String series;
	
	//기본생성자 
	public Phone() {
		
	}
	//매개변수 생성자(모든 필드 다 초기화)
	public Phone(String name, String brand, int price,String series) {
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.series = series;
	}
	
	//각 필드에 대한 setter메소드
	public void setName(String name) {
		this.name=name;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setSeries(String series) {
		this.series=series;
	}
	//각 필드에 대한 getter메소드
	
	public String getName() {
		return name;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public String series() {
		return series;
	}
	//모든 필드의 값을 출력하는 information 메소드
	
	public String information() {
	 return name+" "+brand+" "+price+" "+series;
	}
	
}
