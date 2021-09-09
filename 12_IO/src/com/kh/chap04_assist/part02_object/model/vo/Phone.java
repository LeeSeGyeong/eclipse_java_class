package com.kh.chap04_assist.part02_object.model.vo;

import java.io.Serializable;

public class Phone implements Serializable { //����ȭ 
	
	//��ü ��ü�� ������ϰ��� �Ѵٸ� �ݵ�� ����ȭ(Serializable) ���� �ʼ� (interface�̹Ƿ� implements���)
	
	
	private String name;
	private int price;
	
	//�⺻������, �Ű����� ������, getter/seter, toString
	
	public Phone() {
		
	}
	//����Ű 
	
	
	// alt shift s > o(�Ű����� ����â) > enter �Ű����� ������ 
	
	public Phone(String name, int price) { 
		//super();
		this.name = name;
		this.price = price;
	}

	// alt shift s > r (getter/ setter ����â)  > (all select ������ �ʹٸ� alt a) > alt r (generate)
	
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

	
	// alt + shift + s ( toString ����â ) > enter 
	@Override
	public String toString() {
		return "Phone [name=" + name + ", price=" + price + "]";
	}
	
	
	
	

}
