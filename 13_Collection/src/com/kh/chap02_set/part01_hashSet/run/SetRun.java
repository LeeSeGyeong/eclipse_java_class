package com.kh.chap02_set.part01_hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

public class SetRun {
	
	//Object의 equals() => 두 객체의 "주소값"을 비교해서 일치하면 true , 일치하지않으면 false 반환
	//Object의 hashCode() => 해당객체의 "주소값"을 갖고 10진수 형태로 만들어서 반환 
	
	public static void main(String[] args) {
		
		// *** 1) 문자열 객체로 담아보기 
		HashSet<String> hs1 = new HashSet<String>();
		//다수의 객체를 보관할 수 있는 컬렉션 
		//generic설정 X시 == Object가 default 
		//generic설정시 == Element == <E> == 현재는 String
		
		//중간 복습 ! 
		// Collection 의 두가지 종류 List 와 Set 
		// List의 상속받는 자식클래스 ArrayList 
		// Set을 상속받는 자식클래스 HashSet (각각 , 공통적인 메소드들을 가지고있는 것)
		
		//Q. 여기서 질문 : 왜 List랑 Set이랑 동일한 add메소드를 이용하나요?
		//A. 답 : 둘은 모두 Collection이라는 공통분모를 공유하고있기 때문에, 거기서 오버라이딩 된 값을 이용하기때문이다.
		
		hs1.add("반갑습니다."); 
		//아직 Student매개변수를 담지 않음 , 제네릭설정하지 않아서 Object객체 아무거나 담을 수 있어서 문자열부터 담아보는 중  
		
		
		//String 객체 생성해서 값을 담아봄 
		hs1.add(new String("반갑습니다."));
		hs1.add(new String("여러분"));
		hs1.add(new String("안녕하세요!"));
		hs1.add(new String("여러분"));
		
		// 물론 각 객체의 주소값은 다르지만, 문자열로 비교 == 실제 담긴값으로 비교를 함 (아래 두가지 방식으로)
		// String에 equals() 오버라이딩 되어있음 => "실제 담긴 문자열"을 가지고 비교해서 일치하면 true/ 일치하지않으면 false반환 
		// String에 hashCode() 오버라이딩 되어있음 => "실제담긴 문자열"을 가지고 10진수의 형태로 만들어서 반환 
		
		System.out.println(hs1); 
		// 1) Set계열의 특징 : 저장순서가 유지 안됨 ! (순서는 질서없음 )
		// 2) Set계열의 특징 : 중복된 데이터(동일 객체) 보관 불가능
		// 3) set계열의 특징 : 저장순서가 없으므로 index number도 존재하지 않음 
		
		
		// *** 2) Student 객체 담기 
		HashSet<Student> hs2 = new HashSet<Student>();
		//Element == <E> == <Student>객체만 담길 수 있다.
		
		hs2.add(new Student("공유",43,100)); //각 주소값은 달라욥 , 매번 값이 담길때마다 hashCode,equals 비교가 진행됨
		hs2.add(new Student("김말똥",26,40));
		hs2.add(new Student("홍길동",24,20));
		hs2.add(new Student("공유",43,100)); 
		
		System.out.println(hs2); 
		
		//마찬가지로, 
		// 1-1) 저장순서 유지 안됨 
		
		// 2-Problem)  그런데 Student객체에서 중복된 data가 제거가 안됐음!! 왜이럴까?
		// 2-A)  동일객체로 판단이 안되고 있어서 같은값이 출력됨 
		// 2-A) 즉, HashSet이라는 공간에 객체가 추가될때마다 동일객체인지 비교를 하는데
		//		 (동일 객체 비교 절차): 각 객체의 hashCode값(주소값 기반)확인, 
		// 		 				   equals메소드로 비교(주소값 기반)시 true일 경우 동일객체로 분류된다.
		// Problem )) 그래서 같은 객체값이 들어오더라도 , 주소값으로 비교하기때문에 다른값으로 인식해서 중복된 값이 입력된다.
		
		// 해결방법 )) 비교하는 식들을 Overriding진행해주면 동일객체로 판단하도록 할 수 있다 (재정의) 
		//			 Student에 equals() 오버라이딩 => "실제 각 필드에 담긴 데이터"들이 다 일치하면 true , 일치하지않으면 false 반환
		//			 Student에 hashCode() 오버라이딩 => "실제 각 필드에 담긴 데이터"들이 다 일치하면 동일한 10진수 반환 
		//			 Student클래스로 가서 @Override 재정의해주러 가야함 
		
		/*
		System.out.println(new Student("공유",43,100).hashCode());
		System.out.println(new Student("공유",43,100).hashCode()); 
		//hashCode를 Override하니(Student class에)주소값이 다른 두 값이 이제는 같은 hashCode값을 출력하게됨!
		
		System.out.println(new Student("공유",43,100).equals(new Student("공유",43,100))); */
		
		
		//hs2.get(1); // 인덱스의 개념이 없으므로 get메소드 자체가 정의되어있지 않음!(한 객체만 뽑아올 수 있음)
		
		//hashSet에 담긴 모든 객체들에 순차적으로 접근 가능 
		//1. for문 사용 가능!(단, for each문으로만 가능!)
		
		for(Student s:hs2) { //HashCode,Student객체 불가능! , 우선 Object타입으로 접근하기 
			//제네릭 설정 후에는 Student로 객체 설정해줌 
			System.out.println(s);
		}
		System.out.println("=============================");
		
		//2. ArrayList에 옮겨담고, 그 ArrayList 반복문 돌려가며 접근 
		//ArrayList에 담는 첫번째 방법 
		
		ArrayList<Student> list = new ArrayList<>();
		list.addAll(hs2); //set계열의 collection도 호출가능 컬렉션의 자식객체니까
		
		//2-1) ArrayList에 담는 두번째 방법 : ArrayList 생성과 동시에 통째로 추가하기 
		
		ArrayList<Student> list2 = new ArrayList<>(hs2); //생성과 동시에 매개변수 생성자로 ArrayList에 담기 
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list2.get(i));
		}
		
		
		//3) Iterator 반복자를 이용해서 순차적으로 접근 
		
		Iterator<Student> it = hs2.iterator(); //hs2에 담겨있는 객체들 => Iterator(반복자)에 차곡차곡 값이 쌓이게됨
		
		while(it.hasNext()) {
			Student s = /*(Student)*/it.next(); //Object로 출력할땐 강제형변환을 해줘야하지만 , Student로 제네릭설정해주면 강제형변환 안해줘두됨 
			System.out.println(s);
		}
		//StringTokenizer와 비슷한 개념 
		//it.next(); //NoSuchElementException발생(더이상 출력될 요소가 없음) 
	}
}
