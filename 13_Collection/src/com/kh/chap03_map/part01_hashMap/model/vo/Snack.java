package com.kh.chap03_map.part01_hashMap.model.vo;

public class Snack {

	//과자명은 따로 입력하지 않을것임 (map에서 입력할 예정이므로)
	private String flavor;
	private int calory;
	
	//기본생성자,매개변수 생성자, getter/setter , toString
	
	public Snack() {
		
	}

	public Snack(String flavor, int calory) {
		super();
		this.flavor = flavor;
		this.calory = calory;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getCalory() {
		return calory;
	}

	public void setCalory(int calory) {
		this.calory = calory;
	}

	@Override
	public String toString() {
		return "Snack [flavor=" + flavor + ", calory=" + calory + "]";
	}
	
	
}
