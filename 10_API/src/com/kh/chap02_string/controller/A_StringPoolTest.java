package com.kh.chap02_string.controller;

public class A_StringPoolTest {

	public void method1() {
		
		//1) 생성자를 통한 문자열 생성 (객체생성하듯이 문자열 대입가능)
		String str1 = new String("hello");
		String str2 = new String("hello");
		//1-1) 출력 
		// Question ) 그런데 객체는 주소값일텐데 str1 ,str2의 주소값 Box가 출력되지 않을까?
		System.out.println(str1);
		System.out.println(str2);
		// answer) String클래스에 toString메소드가 이미 오버라이딩 되어있기 때문에 문자열이 바로 출력된다!
		//		      실제 담긴 문자열이 반환되도록
		
		
		//2) 동등비교 
		//두 문자열은 같으니까 문자열을 비교하면, true가 나와야한다
		System.out.println(str1 == str2); //false (주소값 비교라서)
		System.out.println(str1.equals(str2)); //true 
		//String클래스에 equals메소드가 이미 오버라이딩 되어있음 ( 주소값 비교 X , 실제로 담긴 문자열 값 O)
		
		
		
		//3) 주소값을 10진수로 출력해주는 값 출력해보기 
		//( 두개의 주소값은 다르니까 다른값이 나오겠지 ? )
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode()); 
		// 실제로 둘의 주소값은 다르다. 그런데..같은 값이 출력됨...왜일까....?
		//String클래스에 hashCode메소드 이미 오버라이딩 되어있음 ! (실제담긴 값이 실행되도록 재정의 되어있음)
		
		
		//위의 세 사례 모두 object클래스에서 상속받는 toString의해서 재정의 되어있다! 
		
		
		//Question) 진짜 주소값을 알고싶어! 
		//answer ) 그렇다면 System.identityHashCode(내가 궁금해 했던 레퍼런스)를 이용하면 됩니다 
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2)); // 진짜 주소값 출력됨 
		
		
	}
	
		public void method2() {
		
			String str = new String("Hello"); // Heap에 객체 생성 후 -> Hello 할당
			
			//2. 문자열을 리터럴값으로 생성
			String str1 = "hello"; // Heap이라는 영역 안에 StringPool(상수풀)이라는 영역이있다.
			String str2 = "hello"; // 리터럴 값으로 값을 정의하면 , StringPool에 객체생성 -> 주소값이 부여된다
			
			// String Pool의 특징 : StringPool에는 동일한 문자열을 가질 수 없다.
			// 그러므로 , str2는 기존에 있는 리터럴값의 str1과 같은 문자열을 참조한다.
			
			String str3 = "hi";
			
			//String str3 = "hi" -> String str3 = "bye"로 바꾸고싶어요 
			
			//	** String 클래스 == 불변클래스(변하지 않는 클래스)
			//	진짜 변하지 않는지 확인해보자 
			//  정확히 말하면, 변경은 가능하지만 바로 수정되는 개념이 아님 ! 
			
			System.out.println(System.identityHashCode(str3)); //진짜 주소값을 확인하기 
			
			//기존의 str3가 참조하던 값("hi"가 담긴 객체)은 더이상 참조하지 않고 , 
			//새로 "bye"를 담을 객체가 생성되고 -> str3가 "bye"의 주소값(새로운 곳)을 참조한다. 
			str3 = "bye";
			System.out.println(System.identityHashCode(str3)); //주소값이 변경되었다.
			
			str3="hello";
			//기존에 생성되어있는 "hello"를 str3도 참조한다면?
			//이미 있는걸 str3도 참조한다면 , str1,str2,str3은 모두 같은 주소값을 참조하게 된다!
			
			System.out.println(str1);
			System.out.println(str2);
			
			System.out.println(str1.hashCode());
			System.out.println(str2.hashCode());
			
			System.out.println(str1 == str2); //true (문자열 기준으로 주소값이 일치함)
			
			//진짜 주소도 일치할까?
			//진짜 주소값 알아내는 identity hashcode로 알아보기 
			
			System.out.println(System.identityHashCode(str1)); 
			System.out.println(System.identityHashCode(str2)); //둘 다 주소값이 일치한다 
			System.out.println(System.identityHashCode(str));  // 얘(str)는 str1,str2와 주소값이 다르다 
			
			
			
			
			
	}
}
