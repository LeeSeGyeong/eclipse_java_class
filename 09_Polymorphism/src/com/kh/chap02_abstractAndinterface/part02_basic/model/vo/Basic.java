package com.kh.chap02_abstractAndinterface.part02_basic.model.vo;

public interface Basic {
	 
	//추상클래스(abstract class) : 일반필드 + 일반메소드 + [+추상메소드]
	//인터페이스(interface) : (only 두개만 가능 ) 상수필드 + 추상메소드 
	
	//private int a; (X) 
	//public void test(){  (X)
	//}  일반메소드
	//인터페이스에서는 상수나 추상메소드만 가능해요
	
	//public static final int NUM1 = 10; 
	//final 상수는 고정값(변하지 않아요)이므로 static에 생성되고 생성과 동시에 값을 정해줘야한다.
	//그런데 interface에서는 상수랑 추상메소드만 쓸수있다며?
	//그럼 인터페이스에서만 상수는 좀 줄여쓰자 
	
	// 1) 상수 
	
	/*public static final*/ int NUM1 = 10;
	int NUM2 = 10; // only interface에서만 줄여서 쓸 수 있음 
	
	//2) 추상메소드 
	
	/*public abstract*/ void eat();
	/*public abstract*/ void sleep();
	
	
	// interface에서는 무조건 상수 혹은 추상메소드밖에 없으니까 생략 해줘도 된다 
	
}
