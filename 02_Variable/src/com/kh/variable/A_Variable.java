package com.kh.variable;

public class A_Variable {

	// 시급과 근무시간과 근무일수를 곱해서 월급을 계산해서 출력하는 메소드
	public void printVariable() {
		
		System.out.println("==== 변수 사용 전 ====");
		
		System.out.println("시급 : 9450원");
		System.out.println("근무시간 : 6시간 ");
		System.out.println("근무일수 : 8일");
		
		//월급 = 시급 x 근무시간 x 근무일수 
		//김갑생  : 00000원 형식으로 출력하고싶다 
		
		System.out.println("김갑생 :" + (9450 * 6 * 8) + "원");
		System.out.println("권다현 :" + (9450 * 6 * 8) + "원");
		System.out.println("권수연 :" + (9450 * 6 * 8) + "원");
		System.out.println("권윤지 :" + (9450 * 6 * 8) + "원");
		System.out.println("권하나 :" + (9450 * 6 * 8) + "원");
		
		// 변수 사용 후 
		System.out.println("==== 변수 사용 후 ====");
		
		int pay = 9450; // 자바에서 = 기호는 동등하다는 뜻이 아니라 8500이라는 값을 pay상자에 넣겠다 대입하겠다는 의미 
		int time = 6;
		int day = 8;
		
		System.out.println("김가연:"+(pay * time * day) + "원");
		System.out.println("김란:"+(pay * time * day) + "원");
		System.out.println("김민지:"+(pay * time * day) + "원");
		System.out.println("김비안:"+(pay * time * day) + "원");
		System.out.println("김예은:"+(pay * time * day) + "원");
		
		/* 
		 * 변수를 사용하는 이유 
		 * 1. 변수는 우선적으로 값에 의미를 부여할 목적으로 쓴다. (가독성이 높아진다.)
		 * 2. 단 한번 값을 기록하고 필요할 때마다 가져다 쓰는 목적으로 쓴다. ( 재사용성이 높아진다.)
		 * 3. 유지보수를 보다 쉽게할 수 있다. 변수의 숫자만 바꾸면 되니까 하나하나 바꾸는것보다 편리함 
		 */
		
		
	}
			
		// 변수의 선언 = 박스를 만들겠다 
		public void declareVariable() {
			
		/* 
		 * 변수의 선언
		 * 값을 기록하기 위한 변수를 메모리 공간에 확보, 할당한다. => 즉, 값을 보관하기 위한 상자를 만들겠다. 
		 * 
		 * [표현법] 자료형 변수이름;
		 * 
		 * 자료형 : 변수의 크기 및 모양을 지정해주는 부분 
		 * 변수이름: 변수의 이름을 붙여주는 부분 (의미부여!) 
		 * 
		 * 변수 선언 시 주의할 점 
		 * 1. 변수이름은 소문자로 시작한다. / 단, 낙타봉 표기법을 지킬것  / 예약어는 불가  
		 * 2. 같은 영역 안({})에서는 이름 중복(동일한 변수명)이 불가능하다. => 즉, 중복선언이 불가능하다 
		 * 3. 해당 영역 안({}) 에서 선언된 변수는 그 영역 안에서만 사용가능 
		 *  => 다른 메소드에서는 사용이 불가능하다. 
		 *  
		 *
		 * 
		 */
			
		// ---- 자료형에 대한 개념 ----
		// 1. 논리형 (논리값 = true / false)
		boolean isTrue; 
		boolean isFalse = true; //1byte , 변수 선언과 동시에 값을 대입(=) , 초기화 
		System.out.println("isFalse에 새로운 값을 대입 전 : " + isFalse ) ; 
		isTrue = 1+3>1; //
		
		
	 // 단순대입 
		
		/*2.숫자형 
		 2_1. 정수형(소숫점X) */ 
		byte bNum; // 1byte (-128 ~ 127)
		bNum = -128; 
		
		 
		short sNum = 1000 ; // 2byte 
		
		int iNum = 10000; // 4byte , 정수형의 대표(기본)자료형 
		
		long lNum = 100000; //8byte 
		 
		// 아래로 내려올수록 크기가 커진다. 바이트 정도만 알아놓기 (숫자 범위까지 외울건 X)
		 
		 // 2_2.실수형 (소숫점O)
		 
		float fNum = 0.0f; // 4byte => 소숫점 7자리까지 표현가능 
						   // float는 double과 구분위해 값 뒤에 f를 붙여줘야 에러가 사라진다 
		
		double dNum = 0.0; // 8byte => 소숫점 15자리까지 표현가능 , 실수형의 대표(기본)자료형 
		//실수형의 기본형태
		
		//3. 문자형 
		//3_1. 문자 
		
		char ch = 'a'; // 2byte , 홑따옴표를 쓴다 
		char kim ;
		kim = '김';
		
		//3_2.문자열 
		String str; // 참조형 
		str = "abc";
		
		//값이 잘 담겼는지 확인해보자! 
		
		System.out.println(isTrue);
		System.out.println("isFalse에 새로운 값을 넣은 후 : " + isFalse);
		System.out.println(bNum);
			//System.out.println(-128);
		
			//변수이름 : 값의 형태로 출력하고싶다!
		System.out.println("sNum : " + sNum);
		System.out.println("iNum : " + iNum);
		System.out.println("lNum : " + lNum);
		System.out.println("fNum : " + fNum);
		System.out.println("dNum : " + dNum);
		System.out.println("ch : " + ch);
		System.out.println("char : " + kim);
		System.out.println("str : " + str);

		
		//상수의 선언! 
		// [표현법] final 자료형 상수이름;
		
		final int AGE; //상수명은 모두 대문자로 적는다 ! 
		AGE = 10; //초기화 
		
		System.out.println("AGE : " + AGE);
		
		
		// final 선언 이후 AGE = 11; 을 입력하면 오류가 생긴다. 이미  final로 상수가 되었기 때문이다.
		
		// 대표적인 상수의 예 : 3.14 ( 파이,원주율 )
		System.out.println("파이 : " + Math.PI);
		
		
		// 번외 (가독성을 위해 언더바('_') 사용이 가능하다) 
		int etc = 999_999_999; 
		System.out.println("etc : " + etc );
		
		
		//숫자가 커서 하나하나 일십..백천...존나 귀찮다........
		//그러니 언더바를 통해 가독성을 높여준다
		
		//* 변수명명 규칙 
		int number;
		
		//1. 같은 영역내에 중복된 이름 안됨! 
		//int number;
		//단 대소문자는 다른 명명으로 규정됨 
		
		int numBer; 
		
		//2. 예약어 (이미 자바에서 사용되고 있는 키워드) 사용x
		
		/* 
		 * int true;
		 * int abstract;
		 * int class;
		 * int static;
		 * int public;
		 * 
		 */
		
		// 3) 숫자 사용가능 하나 (단, 숫자로 시작하는 건 안됨) 
		int number1;
		int num1ber;
		//int 1number;
		
		// 4) 특수문자 사용가능 하나 (단, _,$ 외의 특수문자는 사용불가능하다)
		int number_1;
		int _number;
		int number$1;
		//int number!1;
		//int number#1;
		
		
		//권장사항 ! (오류는 안나지만 지켜줬으면 하는 것/개발자간의 매너)
		// 1) 낙타표기법 (두번째 단어부터는 첫글자를 대문자로 작성해 가독성을 높여준다)
		String username; //관례상 틀림
		String userName; //관례상 맞는표현 (O)
		String userNameTest; //매 단어마다 대문자로! 
		
		// 2) 한글사용이 가능하지만, 무조건 영문으로!
		int 나이; //왜냐면 한글을 사용하지 않는 환경에서 오류를 발생 시킬 수 있음
		int userAge;
		
		
		
		}
		
		/*
		 *  ** 정리 ** 
		 *  - 값(리터럴) : 프로그램상에 필요한 명시적인 값 
		 *  			 또는 사용자가 마우스 또는 키보드로 입력한 값
		 *  
		 *  - 변수 : 값을 저장하기 위한 공간 ( 메모리에 값을 기록하기 위한 공간) 
		 *   
		 */
	
}
