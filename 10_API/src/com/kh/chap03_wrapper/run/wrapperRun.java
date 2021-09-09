package com.kh.chap03_wrapper.run;

public class wrapperRun {
	
	public static void main(String args[]) {
		
		
		/*
		 * * wrapper 클래스 : 자료형이 아니라 클래스임!
		 *   => 기본 자료형을 객체로 포장할 수 있는 클래스가 래퍼클래스(wrapper 클래스)이다.
		 *
		 *
		 *	    기본자료형 		<-->   wrapper class
		 *		boolean				Boolean
		 *		char				Character 	(* 특이한 class명)
		 *		byte				Byte
		 *		short				Short
		 *		int					Integer		(* 특이하고 자주씀 )
		 *		long				Long
		 *		float				Float
		 *		double				Double 		(* 정확한 자료 얻으려고)
		 *
		 *		
		 *		=> 언제쓸까?
		 *		1) 기본자료형을 객체로 취급해야할 때
		 *		2) 메소드 호출해야할 때 
		 *		3) 매소드의 매개변수로 기본자료형이 아닌 객체타입만이 요구될 때 
		 *		4) 다형성을 적용시키고 싶을 때 
		 *		
		 */
		
			//Boxing : 기본자료형 => wrapper클래스 자료형 
			int num1 = 10;
			int num2 = 15;
			
			//System.out.println(num1.equals(num2)); 
			//기본자료형으로는 equals메소드 비교 X 메소드가 아니니까
			
			// 1. 객체 생성 구문을 통한 방법 
			Integer i1 = new Integer(num1);  // num1 = i1
			Integer i2 = new Integer(num2);	 // num2 = i2
			
			
			// 1 - 1) 출력해보니 주소값출력(X) , 숫자값이 출력된다(overriding 되어있음)
			System.out.println(i1);
			System.out.println(i2);
			
			System.out.println(i1 == i2); //false
			
			// 객체화 시키면 메소드 호출 가능 
			
			System.out.println(i1.equals(i2)); 		//객체화 전에는 안됐던 equals비교가 가능하게 됨 
			System.out.println(i1.compareTo(i2));	// i1과 i2 두 값을 비교하는 구문 
			// 앞쪽이 크면 1 / 뒤가 크면 -1 / 같으면 0
			
			
			// 2. 객체생성하지 않고 곧바로 대입하는 방법 (AutoBoxing)
			Integer i3 = num1; //원래 형변환 해줘야하지만, 내부적으로 자동형변환 됨 
			System.out.println(i3);
		
			
			//3. 특이케이스
			
			// 2번 간단하네 2번만 쓰면 되는거 아니야?
			// 2번은 안되고 1번만을 써야하는 경우가 생겨서..
			// 즉 , 객체생성을 통해서 반드시 변환해야하는 경우 ! -> 문자열을 Integer타입으로 
			
			//Integer i4 = "123"; error
			Integer i4 = new Integer("123"); // 문자열 "123"을 -> 정수 123으로 바꿔줌 
			System.out.println(i4);
			
			
			
			
			//UnBoxing : Wrapper클래스 자료형을 -> 기본자료형으로 바꿔주기 
			
			// 방법 1 : 해당 wrapper클래스에서 제공하는 xxxValue() 메소드를 통해서 기본자료형으로 변경가능하다
			int num3 = i3.intValue(); // i3 => num3 로 변경 
			int num4 = i4.intValue(); // i4 => num4 로 변경
			
			// 방법 2 : 메소드 사용하지 않고 바로 대입하는 방법(AutoUnBoxing)
			int num5 = i1;
			
			
			System.out.println("===========================");
			
			
			// String을 기본자료형으로 변경해야하는 경우가 자주생기기 때문에 wrapper클래스를 사용한다 ! 
			// EX) 회원가입을 하는 경우에 , 나이를 숫자로 입력하지만 결국은 문자열로 받아져서 반환되기 때문에 변환해줘야 한다.
			
			//*** 매우매우매우매우매우 중요함 자주자주자주자주쓴다 *** 
			// 1) String <--> 기본자료형  (wrapper명.parsxxx())
			
			String str1 = "10";
			String str2 = "15.3";
			
			// String  <-->  기본자료형  
			// "10"  		(int형) 10
			//"15.3"		(double형) 15.3
			
			// wrapper클래스명.parseXXX() : 사용하면 기본자료형(int,double..)으로 변환해줌 
			
			int i = Integer.parseInt(str1); 		//정수형으로 변환됨
			double d = Double.parseDouble(str2);	//실수형으로 변환됨 
			
			System.out.println(i+d); //변환 완료 ! 수학적인 연산이 진행된다.
			
			
			// 2) 기본자료형을 String으로 변환 (흔치 않아)
			
			String strI = String.valueOf(i);
			String strD = String.valueOf(d);
			
			
			
			
		
	}
}
