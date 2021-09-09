package com.kh.operator;

public class B_InDecrease {

		/*
		 *  *증감연산자 ( 단항 연산자)
		 *  
		 *  ++ : 변수에 담긴 값을 1 증가시켜주는 연산자 
		 *  	    ++ 변수, 변수++
		 *  
		 *  -- : 변수에 담긴 값을 1 감소시켜주는 연산자 
		 *  	 --변수(전위연산),변수--(후위연산)  /연산자가 앞,뒤 어디에 오느냐에 따라 실행순서가 달라진다
		 *  
		 *   (증감연산자)변수  : 전위연산 => "선증감" 후처리
		 *   변수(증감연산자) : 후위연산 => 선처리 "후증감"
		 *   
		 */
	
	
	 public void method1() {
		 
		 //전위연산테스트 
		 int num1 = 10;
		 System.out.println("전위 연산 적용 전 num1의 값 : " + num1 ); //num1 = 10 출력
		 System.out.println("1회 수행 후 결과 : " + ++num1);//num1 = 11 출력
		 System.out.println("2회 수행 후 결과 : " + ++num1);//num1 = 12 출력 
		 System.out.println("3회 수행 후 결과 : " + ++num1);//num1 = 13 출력
		 System.out.println("최종 num1의 값 : " + num1);
		 
		 
		 System.out.println("====================");
		 
		 //후위연산테스트
		 int num2 = 10;
		 System.out.println("후위 연산 적용 전 num2의 값 : " + num2); // num2 = 10 출력
		 System.out.println("1회 수행 후 결과 : " + num2++); // 10이 우선 '출력'이 된 후에 => num2가 1이 증가하는 순서, num2=11 됨 
		 System.out.println("2회 수행 후 결과 : " + num2++); //11출력 후 => num2 = 12로 증가
		 System.out.println("3회 수행 후 결과 : " + num2++); //12출력 후 => num2 = 13로 증가 
		 System.out.println("최종 num2의 값 : " + num2); // 최종 num2의 값
	 }
	 
	 public void method2() {
		 
		 int a = 10;
		 int b = ++a;
		 
		 System.out.printf("a : %d, b: %d\n",a,b);
		 
		 int c = 10;
		 int d = c++; // d가 10인이유는 1. 대입이 먼저 (c에 d를 대입하고) 2. 출력 된 다음 ++를 처리해준다
		 
		 System.out.printf("c : %d, d: %d\n",c,d);
		 
		 
		 System.out.println("==================");
		 
		 int num = 20;
		 System.out.println("현재 num : " + num); // num=20
		 System.out.println("++ num은? : " + ++num); //num = 21
		 System.out.println("num++는? : " + num++); //num = 21(22)
		 System.out.println("--num은? : " + --num); //num = 21
		 System.out.println("num-- : " + num--); // num = 21(20)
		 System.out.println("최종 num : " + num); // num = 20
	 }

	 	public void method3() {
	 		int num1 = 20;
	 		
	 		int result1 = ++num1 * 3; // num=21 result 63
	 		
	 		System.out.printf("num1 : %d , result1 : %d\n", num1,result1);
	 		
	 		int num2 = 20;
	 		int result2 = num2++ * 3 ; //result2 = 60 num2 = 21
	 		
	 		System.out.printf("num2 : %d , result2 : %d\n", num2,result2);
	 		
	 		
	 	}
	 	
	 	public void method4() {
	 		int a = 10;
	 		int b = 20;
	 		int c = 30;
	 		
	 		System.out.println(a++); //a=10(11) => 10출력되고,  11이 되어있을 거다 
	 		System.out.println((++a) + (b++));//a=12 b=20(연산 후 21예정) => 12+20 => 결과 : 32
	 		System.out.println((a++) + (--b) +(--c));//a=12(연산 후 13)+ b = 20 + c = 29  => 결과 61
	 		
	 		System.out.printf("a : %d , b : %d , c : %d", a , b , c);
	 		// a = 13 b = 20 c = 29가 된다 a는 후처리연산으로 연산한 후에 플러스 1이 되므로 
	 		
	 	}



}
