package com.kh.chap02_inherit.model.vo;

public class Vehicle { //부모클래스 
	
	private String name;
	private double mileage;
	private String kind;
	
	
	public Vehicle() {
		
	}
	
	public Vehicle(String name,double mileage,String kind) {
		this.name = name;
		this.mileage=mileage;
		this.kind=kind;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setMileage(double mileage) {
		this.mileage=mileage;
	}
	public double getMileage() {
		return mileage;
	}
	public void setKind(String kind) {
		this.kind=kind;
	}
	public String getKind() {
		return kind;
	}
	
	public String information() {
		return "name : "+name+" mileage : "+mileage+" kind : "+kind;	
	}
	
	public void howToMove() {
		System.out.println("움직인다.");
	}

}
