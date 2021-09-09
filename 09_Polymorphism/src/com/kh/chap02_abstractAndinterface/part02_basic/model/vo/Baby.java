package com.kh.chap02_abstractAndinterface.part02_basic.model.vo;

public class Baby extends Person implements Basic{
	
	
	//기본생성자 
	public Baby() {
		
	}
	
	//매개변수 생성자 
	public Baby(String name,double weight,int health) {
		super(name,weight,health);
	}
	
	//toString메소드
	
	public String toString() {
		return "Baby [ " + super.toString() +"]";
	}

	
	//밥먹는 것 , 잠자는 것 정의해야지 -> 근데 같은 메소드로 표현하고 싶어요
	//그럼, 정의하고자 하는 메소드를 부모메소드에 추상메소드로 새롭게 만들어 주고
	//그 새로만든 메소드를 자식클래스에 구현하면 
	//오버라이딩되면서 아기에게 밥먹는거, 엄마에게 밥먹는거 각각 같은메소드명으로 다른값이 출력된다.
	
	@Override
	public void eat() {
		//밥먹으면 몸무게 3증가 //Mother클래스에서 한 것 과 동일한 방식
		super.setWeight(super.getWeight()+3);
		
		//밥먹으면 건강도 1증가 
		super.setHealth(super.getHealth()+1);
	}

	@Override
	public void sleep() {
		// 잠자면 건강도 3증가 
		super.setHealth(super.getHealth()+3);
	}
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
}
