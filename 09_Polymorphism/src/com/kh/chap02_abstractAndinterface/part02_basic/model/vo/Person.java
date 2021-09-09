package com.kh.chap02_abstractAndinterface.part02_basic.model.vo;

public abstract class Person {
		
	 	private String name;
	 	private double weight;
	 	private int health;
	 	
	 	//기본생성자 
	 	
	 	public Person() {
	 		
	 	}
	 	
	 	//매개변수
	 	
	 	public Person(String name, double weight, int health){
	 		this.name=name;
	 		this.weight=weight;
	 		this.health=health;
	 	}
	 	
	 	//getter/setter
	 	
	 	public void setName(String name) {
	 		this.name=name;
	 	}
	 	public String getName() {
	 		return name;
	 	}
	 	public void setWeight(double weight) {
	 		this.weight=weight;
	 	}
	 	public double getWeight() {
	 		return weight;
	 	}
	 	public void setHealth(int health) {
	 		this.health=health;
	 	}
	 	public int getHealth() {
	 		return health;
	 	}
	 	
	 	
	 	//toString
	 	
	 	@Override
	 	public String toString() {
	 		return "name : " + name +", weight : "+weight+", health : " + health;
	 	}
	 	
	 	//자고 먹는것을 표현하기 위해 부모메소드에 새롭게 추상메소드를 만들었음
	 	//자식메소드에서 재정의할거라서 추상메소드로 표현하였음 
	 	//같은 메소드 명으로 오버라이드를 통해 , 각 자식클래스에서 재정의한 출력값이 나온다. 
	 	
	 	//public abstract void eat();
	 	//public abstract void sleep();
	 	//interface에 생성해주려고함 ! 
}
