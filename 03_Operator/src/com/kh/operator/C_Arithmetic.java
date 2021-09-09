package com.kh.operator;

public class C_Arithmetic {
	
	/*
	 *  * 산술연산자 ( 이항연산자 == 두개의 값을 가지고 연산 )
	 *  + - * / %
	 * 
	 * * /  % > + -
	 *    
	 */
 
			public void method1() {
				
				int num1 = 10;
				int num2 = 3;
				
				System.out.println("num1 + num2 : "+ (num1 + num2));
				System.out.println("num1 - num2 : "+ (num1 - num2));
				//괄호가 없다면 문자열+num1연산때에는 num1이 문자열이 됨 그리고 그다음 num2도 
				//문자열이 되니까 num1 - num2 만을 먼저연산하기 위해 두개를 괄호로 묶어준다.
				
				System.out.println("num1 * num2 : "+ (num1 * num2));
				//이 연산은 곱셈이 우선순위가 있기 때문에 안묶어도 된다. 단, 가독성을 위해 묶어줌
				
				System.out.println("num1 / num2 : "+ (num1 / num2));
				//나누기 했을 때의 몫
				//int나누기 int이므로 결과값도 int 몫인 정수값 3까지만 나온다
				System.out.println("num1 % num2 : "+ (num1 % num2));
				//나누기했을때의 나머지 
				
				//값 % 2 == 0 라는건 짝수란 소리 
				//값 % 2 == 1 라는건 홀수란 소리
				
				//값 % 5 == 0 라는건 5의배수란 소리 
				//값 % 3 == 0라는건 3의 배수란 소리 
				
			}
			
			public void quiz() {
				
				int a = 5;
				int b = 10;
				
				int c = (++a) + b; // a=6, b=10, c=16
				int d = c / a; // a=6, b=10, c=16, d=2
				int e = c % a; // a=6, b=10, c=16, d=2, e=4
				
				int f = e++; // a=6, b=10, c=16, d=2, e=4(5), f=4
				
				int g = (--b) + (d--); // a=6, b=9, c=16, d=2(1), e=5, f=4, g=11
				int h = 2; // a=6, b=9, c=16, d=1, e=5, f=4, g=11, h=2
				
				// a=6(7), b=9, c=15, f=4, g=11(10), d=1, e=6, h=2
				int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);
				//		  6   + 9 / ( 15 / 4) * ( 11 - 1) % ( 6  + 2)
				//		  6   + 9 /     3     *     10    %     8
				//		  6   +    3          *     10    %     8
				//		  6   +              30           %     8
				//        6   +                          6
				//		  12
				
				System.out.println("a : " + a);	// 7
				System.out.println("b : " + b);	// 9
				System.out.println("c : " + c);	// 15
				System.out.println("d : " + d); // 1
				System.out.println("e : " + e); // 6
				System.out.println("f : " + f); // 4
				System.out.println("g : " + g); // 10
				System.out.println("h : " + h); // 2
				System.out.println("i : " + i); // 12
				
				//선생님 후처리연산에서 a--같은 항은 다음항에 줄어들잖아요..! 
				//그런데 a-- + b같은식에는  아무런 영향이 없는건가용?
				
			}
}
