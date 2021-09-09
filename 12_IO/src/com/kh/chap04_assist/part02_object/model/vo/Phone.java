package com.kh.chap04_assist.part02_object.model.vo;

import java.io.Serializable;

public class Phone implements Serializable { //직렬화 
	
	//객체 자체를 입출력하고자 한다면 반드시 직렬화(Serializable) 과정 필수 (interface이므로 implements기술)
	
	
	private String name;
	private int price;
	
	//기본생성자, 매개변수 생성자, getter/seter, toString
	
	public Phone() {
		
	}
	//단축키 
	
	
	// alt shift s > o(매개변수 생성창) > enter 매개변수 생성자 
	
	public Phone(String name, int price) { 
		//super();
		this.name = name;
		this.price = price;
	}

	// alt shift s > r (getter/ setter 생성창)  > (all select 누르고 싶다면 alt a) > alt r (generate)
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	// alt + shift + s ( toString 생성창 ) > enter 
	@Override
	public String toString() {
		return "Phone [name=" + name + ", price=" + price + "]";
	}
	
	
	
	

}
