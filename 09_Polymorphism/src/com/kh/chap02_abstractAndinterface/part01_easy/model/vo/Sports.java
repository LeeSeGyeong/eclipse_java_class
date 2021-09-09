package com.kh.chap02_abstractAndinterface.part01_easy.model.vo;

public abstract class Sports {
	
	private int people;
	
	public Sports() {}
	
	public Sports(int People) {
		this.people=people;
	}
	
	public int getPeople() {
		return people;
	}
	
	public void setPeople(int people) {
		this.people=people;
	}
	
	public String toString() {
		return " people : " + people;
	}
	
	
	//추상메소드 (미완성된 메소드,머리만 있고 몸통은 없는) 만들기 // abstract라는 예약어를 넣어주기
	//abstract = 미완성 
	
	public abstract void rule();
	
}
