package com.kh.chap02_abstractAndinterface.part02_basic.model.vo;

//interface를 상속받는 것을, 구현한다고 한다. (같은 의미긴한데 다르게 말함)
//밑의 Mother클래스 식에서는 Person도 필요하고 인터페이스 상속도 받아야하니 
//Person 뒤에 / implements(구현한다) + 인터페이스 명/ 을 적어주면 상속(구현)완료! 

public class Mother extends Person implements Basic{ 
//클래스 간 다중상속(X) , 인터페이스는 다중가능 콤마로(O)


	//field 생성
	private String babyBirth;  //아이의 탄생 : 출산 | 입양 | 없음 중에 하나
	
	//기본생성자 
	public Mother() {
		
	}
	
	//매개변수 생성자 
	public Mother(String name, double weight, int health, String babyBirth) {
		super(name,weight,health);
		this.babyBirth=babyBirth;
	}
	
	public void setBabyBirth(String babyBirth) {
		this.babyBirth=babyBirth;
	}
	
	public String getBabyBirth() {
		return babyBirth;
	}
	
	@Override
	public String toString() {
		return "Mother [" + super.toString() + ", babyBirth : "+ babyBirth+ "]";
	}
	
	@Override
	public void eat() {
		
		//밥먹으면 몸무게를 10 증가시키고자한다 
		//상속 메소드(super)에 있는 setWeight값에 대입하면 수정할 수 있으니까 set값을 불러온다.
		//그런데 기존의 몸무게는 어떻게 알아오나요? getWeight가 반환값 == 기존 몸무게와 같아지는 것 
		//그러면 get메소드를 set메소드 안에 불러오면 기존 몸무게값을 불러올 수 있고 , 거기에 +10을 해주면 된다. 
		super.setWeight(super.getWeight()+10);
		
		//밥먹으면 당뇨때문에 건강을 -10해주고자 한다 
		//같은방식으로 진행 (수정할수있는 set값을 가져와 기존 건강 (기존에 출력된 반환값인 get값) 에 -10을 해주면 됨 
		super.setHealth(super.getHealth()-10);
	}
	
	@Override
	public void sleep() {
		
		//잠자면 건강도를 +20 증가시켜주기 
		//위의 방식과 동일
		super.setHealth(super.getHealth()+20);
		
	}
	

}
