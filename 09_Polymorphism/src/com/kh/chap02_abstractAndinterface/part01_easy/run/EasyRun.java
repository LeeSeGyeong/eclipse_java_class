package com.kh.chap02_abstractAndinterface.part01_easy.run;

import com.kh.chap02_abstractAndinterface.part01_easy.model.vo.BasketBall;
import com.kh.chap02_abstractAndinterface.part01_easy.model.vo.FootBall;
import com.kh.chap02_abstractAndinterface.part01_easy.model.vo.Sports;

public class EasyRun { 
	
	public static void main(String[] args) {
		
		//(1) 미완성 클래스 = 객체생성불가
		//	    추상클래스(abstract) = 객체생성불가 
		// 	  Sports s = new Sports(); // 객체 생성불가 
		
		//(2) Sports s; // 레퍼런스로 사용 가능  
		
		Sports s = new BasketBall(); //다형성 적용 ( 부모type으로 자식type객체 받기 O) 
		//배열은 데이터값 , 객체는 속성(property)값이므로 둘이 다르다.
		
		
		//FootBall, BasketBall 두개의 객체가 있으니 (배열의 크기 2) 하나하나 만들지말고 
		//편하게 배열 생성  (상속된 Sports[]타입의 배열로 짧게 만들면 됨) 
		Sports[] arr = new Sports[2];
		
		//인덱스에 값을 대입 
		arr[0] = new BasketBall(); // Sports[]로 Sports에 상속된 BasketBall객체를 만들어줌 
		arr[1] = new FootBall();   // Sports[] 하나로 두개의 클래스에서 값을 불러올 수 있다. ( 상속을 사용하였기 때문에 )
		
		
		//(출력) 그 다음 각 rule값을 불러온다 
		//여기서 '동적바인딩'이 실행됨 
		
		//1)
		
		for(int i =0;i <arr.length; i++) {
			arr[i].rule();
		}
		
		//2) (다른 표현법) for each문으로 출력할 수도 있다.
		
		for(Sports a:arr) { // Sports a = arr[0] , Sports a = arr[1]
			a.rule();
		}
		
		//동적 바인딩? 실행 전(컴파일 시점)에는 Parent의 rule문장이 출력 (하지만 추상메소드인걸 어떻게하죠?)
		//Sports클래스를 상속한 클래스들(BasketBall,FootBall)은 완성되지 않은 추상메소드를 상속했으므로
		//완성시키기 위한 (의무적으로)오버라이딩을 해야함 
		//그렇게 되면 오버라이딩 된 자식문장이 동적바인딩으로 찾아져서 출력된다(각 class에 맞게 수정된 @Override) .
		
		//"동적바인딩"
		//컴파일 시점 : 정적바인딩 , 현재 레퍼런스 자료평의 클래스에 있는 메소드를 가리킴
		//런타임 시점 : 동적바인딩 , 각각 자식클래스에 오버라이딩된 메소드를 찾아 실행됨 
		
		
		/*
		 * * 추상메소드 
		 * - 미완성된 '메소드' / 몸통(body == ( {중 괄 호} )) 가 없는 메소드 
		 * 
		 * * 추상클래스 
		 * - 미완성된 '클래스'
		 * - 일반필드 + 일반메소드 [ +추상메소드 ] 
		 * - 객체 못만든다 ( 레퍼런스 변수로는 선언 가능) 
		 * Sports s = new Sports 	 (X) 객체 안됨 
		 * Sports s = new Desktop(); (O) 레퍼런스 변수 OK
		 * 
		 * 	 => 추상메소드를 가진 클래스는 '반드시' 추상클래스를 명시해야됨
		 *   => 추상메소드 있으면 (클래스에 abstract 적어)
		 *   
		 *   
		 *   *추상메소드가 없어도 추상클래스로 만들 수 있음 
		 *    추상클래스만 사용하는 이유
		 *    
		 *    알려주려고 ) 이 클래스가 아직 완성되지 않았어라고 알려주려고 (미완성 상태를 알려주기 위해)
		 *    프로그램 상 ) 객체생성을 다른데에서 못하게하려고
		 *    
		 *    *추상메소드가 존재하는 추상클래스를 쓰는이유
		 *    
		 *     부모메소드에 추상메소드가 있으니까 (추상메소드가 있다? 그럼 클래스에도 바로 예약어(abstract)적어줘야하므로 추상클래스를 써야함)
		 *     자식클래스에는 오버라이딩해서 동일한 패턴의 메소드를 가지게된다. 
		 *     
		 *     => 즉,동일한 형태의 메소드로 다른 출력값을 가지고자할 때((같은 메소드명을 재정의)각 자식클래스의 실행시킬 내용은 다르지만)
		 *     => 메소드 통일성 확보목적 ( 자식클래스니까 구별하기 쉽잖아)
		 *     => 표준화된 틀을 제공하는 목적 
		 *     
		 *     
		 *     다음 알아볼 내용 : interface
		 *     
		 *     담을 수 있는 내용의 크기 
		 *     일반메소드 > 추상메소드 > 인터페이스 
		 *     
		 *     인터페이스 : 일반필드 (X) 일반메소드 (X) 
		 *     			*추상클래스(O) 상수(O) 두개만 가능 
		 *     
		 */
		
		
		
		
}
}
