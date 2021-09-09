package com.hw1.model.vo;

public class Person {
		
	protected String name;
	private int age;
	private double height;
	private double weight;
	
	public Person() {
		
	}
	
	public Person( int age , double height, double weight) {
		
		this.age=age;
		this.height=height;
		this.weight=weight;
	
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String Getname() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	
	public void setWeight(double weight) {
		this.weight=weight;
	}
	public double getWeight() {
		return weight;
	}
	
	@Override
	public String toString() {
		return  "�̸� : " + name + " ���� : " + age + " Ű : "+ height + " ������ : "+ weight ;
	}
	
	
}
