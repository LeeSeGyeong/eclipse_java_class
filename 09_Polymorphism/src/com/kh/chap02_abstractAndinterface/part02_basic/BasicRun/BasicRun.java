package com.kh.chap02_abstractAndinterface.part02_basic.BasicRun;

import com.kh.chap02_abstractAndinterface.part02_basic.model.vo.Baby;
import com.kh.chap02_abstractAndinterface.part02_basic.model.vo.Basic;
import com.kh.chap02_abstractAndinterface.part02_basic.model.vo.Mother;
import com.kh.chap02_abstractAndinterface.part02_basic.model.vo.Person;

public class BasicRun {
	public static void main(String[] args) {
		
		//추상클래스인 Person 레퍼런스 변수는 가능 , 객체생성은 불가능 
		
		/*
		//각 Person,Mother에  매개변수가 정의되어있으므로 매개변수 값을 바로 대입(초기화)해주면 된다.
		//1) 값의 대입 
		Person mom = new Mother("김엄마",50,70,"출산");
		Person baby = new Baby("강아기",3.5,70);
		
		// 2)출력
		System.out.println(mom);
		System.out.println(baby);
		
		// 3) 밥먹고 , 잠을 잤음을 입력하기 (출력값은 없음,값의 변화만)
		//엄마도 밥을 먹고, 아이도 밥을 먹는다 
		//출력되는 값은 없고 , 건강도와 몸무게의 변화만 있음 
		
		mom.eat(); //몸무게+10 , 건강도 -10
		baby.eat();//몸무게 +3 , 건강도 +1
		
		mom.sleep(); // 건강도 +20
		baby.sleep();// 건강도 +3
		
		
		System.out.println("====== 다음날 ======");
		System.out.println(mom);
		System.out.println(baby);
		
		//값이 변화되었음 (밥 먹는것, 잠자는 것 구현 완료)
		*/
		
		
		//Basic b = new Basic(); //객체생성 X , 레퍼런스 생성 O
		
		Basic mom = new Mother("김엄마",50,70,"출산");
		Basic baby= new Baby("강아기",3.5,70);
		// 자식객체들이 상속받고 있으면 , Heap 공간에는 부모객체가 먼저 생성이 되고,그 다음 자식객체가 생성된다.
		
		System.out.println(mom);
		System.out.println(baby);
		
		mom.eat();
		baby.eat();
		
		mom.sleep();
		baby.sleep();
		
		System.out.println(mom);
		System.out.println(baby);
		
		
		/* *상속 표현법
		 * 	
		 * 클래스에서 클래스 상속받을 때      : 클래스 extends 클래스 (단일상속만 가능)  					:화살표 '실선'으로 표시
		 * 클래스에서 인터페이스 구현할 때   : 클래스 implements 인터페이스 , 인터페이스2..(다중상속 가능) 	: 화살표'점선'
		 * 인터페이스에서 인터페이스를 상속 : 인터페이스 extends 인터페이스1,인터페이스2..(다중상속 가능) 	: 화살표'실선'
		 * 
		 * 같은 것(클래스-클래스,인-인) 끼리 상속받으면 extends(실선) , 다른 것(클래스 - 인터페이스)끼리 상속받으면 implements(점선)
		 * 
		 * 
		 *          |          추상클래스                 |          인터페이스
		 * ===================================================================
		 * 상속갯수     |          단일상속                     |           다중상속
		 * -------------------------------------------------------------------
		 * 키워드        |         extends           |         implements
		 * -------------------------------------------------------------------
		 * 추상메소드  |      추상메소드 0개 이상              |       모든 메소드가 추상메소드
		 * 표현법/갯수|  명시적으로 abstract 기술          |  묵시적으로 abstract (생략가능)
		 * -------------------------------------------------------------------
		 * 일반메소드여부 |          O             |            X
		 * -------------------------------------------------------------------
		 *  필드        |      일반필드 가질 수 있음           | 상수필드만 가질 수 있음 (묵시적으로 public static final)
		 *  
		 *  
		 * 
		 * extends 일반클래스   -->  extends 추상클래스   -->  implements 인터페이스 
		 * --------------------------------------------------------------->
		 *                   강제성이 더 짙어짐 (규약이 더 쎄짐)
		 * 
		 * 
		 */
	}
}
