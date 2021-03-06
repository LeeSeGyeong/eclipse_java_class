package com.kh.chap02_inherit.InheritRun;

import java.util.ArrayList;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;
import com.kh.chap02_inherit.model.vo.Vehicle;

public class Run {
	 public static void main(String[] args) {
		 
		
		 
		 
		 Car c = new Car("폭스바겐",3.0,"파사트",4);
		 
		 Ship s = new Ship("동동호",4.0,"한국배",2);
		 
		 Airplane a = new Airplane("대한항공",8.0,"A380",10,3);
		 
		 
		 System.out.println(c.information());
		 System.out.println(s.information());
		 System.out.println(a.information());
		 
		 
		 	c.howToMove();
			s.howToMove();
			a.howToMove();
			
			
			
			System.out.println("================ArrayList==============");
			
			 ArrayList<Vehicle> list = new ArrayList<Vehicle>();
			 
			 list.add(new Car("폭스바겐",3.0,"파사트",4));
			 list.add(new Ship("동동호",4.0,"한국배",2));
			 list.add(new Airplane("대한항공",8.0,"A380",10,3));
			
			
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i).information()); //동적바인딩 
			}
			
			System.out.println("================ArrayList==============");
			/*
			 * * 상속의 장점 
			 * - 보다 적은 양의 코드로 새로운 클래스 작성 가능
			 * - 코드를 공통적인 관리하기 때문에 코드의 추가나 변경에 용이 (프로그램의 생산성과 유지보수에 크게 기여)
			 * 
			 * * 상속의 특징 
			 * - 클래스간의 상속에 있어서는 다중상속이 불가(단일상속만 가능 즉, 부모는 하나다)
			 * - 부모클래스에 정의되어있는 protected필드는 자식클래스에서 직접 접근 가능 
			 * - 자식객체는 부모클래스에 있는 메소드를 마치 내것처럼 호출 가능 
			 *   + 부모클래스에 있는 메소드가 맘에 안들면 자식클래스 오버라이딩 가능 (내입맛대로 재정의)
			 * - 명시되어있진 않지만 모든 클래스(자바에서 제공하는 클래스, 직접 만드는 클래스)는 Object 클래스의 후손이다!!
			 *   => 즉, Object클래스에 있는 메소드를 마음대로 호출 가능
			 *   => 뿐만 아니라 오버라이딩을 통해서 재정의도 가능함!!!!
			 * 
			 */
			
			System.out.println(c.hashCode());
			System.out.println(c.equals(s));
			System.out.println(c/*.toString()*/);
			System.out.println(c.toString());
	 }
}
