package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	
		
		/*
		 * 기본적으로 프로그램의 진행은 순차적으로 진행
		 * 단, 이 순차적인 흐름을 바꾸고자할 때 제어문이라는 걸 이용해서 직접제어가능
		 * 
		 * 선택적으로 실행시키고자할때 => 조건문
		 * 반복적으로 실행시키고자할때 => 반복문 
		 * 그 외의 흐름 제어 => 분기문 
		 * 
		 * 
		 *  * 조건문 
		 *    "조건식"을 통해 참이냐 거짓이냐를 판단해서 참일경우 그에 해당하는 코드 실행
		 *    
		 *     조건식의 결과 true/false 여야됨!!
		 *     보통 조건식에서는 비교연산자(대소,동등),논리연산자(&&.,||)을 주로 사용 
		 *     
		 *     *조건문은 크게 if문과 switch문으로 나뉨 
		 *     
		 */
	
	
	public void method1() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			/*
			 *  * 단독 if문 
			 *  
			 *  if(조건식) {
			 *   .. 실행시키고자 하는 코드 ..    
			 *  }
			 *  
			 * ==> 조건식이 참(true)일 경우 => 중괄호 블럭 안의 코드 실행 
			 * ==> 조건식이 거짓(false)일 경우 => 중괄호 블럭 안의 코드를 무시하고 넘어감
			 *  
			 */
			//if(조건){조건이 참이면 {}안의 코드식이 실행됨
			//System.out.println("양수다.");
			//		} 
			
			if (num>0) {
				System.out.println("양수다.");
			}
			
			
			if(num <= 0) {
			System.out.println("양수가 아니다.");
			}
			
			
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		/*
		 *  * if-else문 
		 *  
		 *  if(true false가 나올만한 조건) { 
		 *  		..실행코드1..				//true면 이대로 끝
		 *  } else {
		 *  	.	..실행코드2..				//false면 여기에서 빠져나온다 
		 *  }
		 *  
		 *  
		 * 	조건식의 결과가 참(true)일 경우 실행코드 1 수행후 if-else문을 빠져나감 
		 * 	if-else자체를 하나의 세트로 생각한다면 if문의 참으로 셋트하나가 끝남 
		 * 	단, 결과가 거짓(false)일 경우 무조건 실행코드2 수행한다.
		 */
		
		if(num>0) {
			System.out.println("양수다.");
		} else {
			System.out.println("양수가 아니다.");
		}
		
		
	}
	


	public void method3() {
				
		// 정확성을 위해 , 여러개의 조건을 수행해야 하는 경우
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		/*
		 * 양수 음수 0 이 세가지 조건을 확인해보려한다 
		 * 이럴땐 , if - else if문 
		 * 
		 * 	같은 비교대상으로 여러개의 조건을 제시해야할 경우 
		 * 	
		 * 	if(조건식1) {
		 * 			실행코드1; 				--> 조건식이 true라면 여기에서 끝 
		 * } else if(조건식2) { 				--> 이전 식이 false면 실행코드2 실행 
		 * 			실행코드2;					--> 실행코드2가  false면  
		 * } else if(조건식3) {				--> 조건식3 실행
		 * 			실행코드3;	
		 * } [else {								--> 만약 위의 식이 다 false라면..?
		 * 										--> else문으로 필요한 조건문을 적어준다
		 * 			}]
		 * 
		 */
		
		if(num>0) {
			System.out.println("양수다.");				
			 } 	else if(num == 0) { 				 
		    System.out.println("0이다.");			   
			 } else /* if(num < 0)*/ {				 
			System.out.println("음수다.");	
			  }
		
	}
		public void method4() {
			
			// 13세 이하 : 어린이 
			// 13세 초과 19세 이하 : 청소년 
			// 19세 초과 : 성인 
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("나이(정수만) : ");
				int age = sc.nextInt();
				
			/*
			if(age <= 13) {
				System.out.println("어린이");
			} else if(age <= 19) {
				System.out.println("청소년");
			} else {
				System.out.println("성인");
			}
			*/
				
				String result;
				
				if(age <= 13) {
				  result = "어린이";
				} else if(age <= 19) {
				  result = "청소년";
				} else {
				  result = "성인";
				}
				
				System.out.println(result);
				
				
				}
		
		public void method5() {
				
				Scanner sc = new Scanner(System.in);
				
				System.out.print("이름 : ");
				String name = sc.nextLine();
				
				System.out.print("성별(M/F) : ");
				char gender = sc.nextLine().charAt(0);
				
				// xxx님은 xxx이다.
				
			
				/* if(gender == 'M' || gender == 'm') {
					System.out.println(name+ "님은 남학생이다.");	
				} else if (gender == 'F' || gender == 'f') {
					System.out.println(name+ "님은 여학생이다.");	
				} else {
					System.out.println(name+ "님의 성별을 알 수 없다.");					
				} */ 
				
				 String result=""; //변수를 미리 세팅해 둘때 반드시 초기화 해놓는 습관을 들이자! 
				 
				/* 초기화가 되어있지 않은 변수는 출력문을 통해 출력할 수 없다.

				 이때 result라는 변수가 19번째 줄에서 초기화를 하지 않고 단지 선언만 되어있었고,

				 만일 연산기호를 잘못 입력했을 경우 result라는 변수에는 아무런 값이 초기화가 되어있지 않은 상태로써 
				 출력이 될 수 없는 상태이기 때문에 발생되는 컴파일 에러이다.*/
				 
				 if(gender == 'M' || gender == 'm') { 
					 result = "남학생";
				 } else if (gender == 'F' || gender == 'f') {
					 result = "여학생";
				 } else {
					 System.out.println("성별을 잘못 입력하셨습니다.");
					  return; // ** 해당 이 메소드 자체를 빠져나가는 구문 ! (이 메소드를 호출했던 곳으로 return해서 빠져나감 ,다음에 호출할게 없으니 종료  ) ** 
				 }
				
				// xxx님은 xxx이다.
				 
				 System.out.println(name + "님은 " + result + "이다.");
				 
				 //result else블럭없이 적용한다면 , 오류가 난다. 
				 //else블럭은 무조건 하나가 실행된다는 의미로, 
				 //else가 없다면 앞의 두개가 false가 될수도 있으니까 
				 //result가 빈박스가 될수도 있기에 오류가 난다.
				 // ** 아님 , 변수를 꼭 초기화 시켜주자! 빈 내용도 괜찮으니까 	
				 
				 	
				//초기화가 안된 변수는 출력문을 통해 출력 불가!
				//위의 젠더를 잘못입력했을 경우 => result에는 아무런 값도 대입되지 않음! 
				//이런경우 문제가 생길거라는 걸 미리 알려주고 있는거임! 

				//해결 => result변수 미리 세팅시 초기화를 해두자!! 

						}
		
		public void method6() {
			
			Scanner sc = new Scanner(System.in);
			
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			/*
			if(name == "홍길동") {
				System.out.println("홍길동님 반갑습니다.");
			} else {
				System.out.println("홍길동님이 아니신가보네요. 안녕히가세요.");
			}
			*/ 
			
			/* 바이트 외워두기 몇바이트인지 시험에 나옴!! 
			 * 				1byte	  1	    2	,  4	, 8	,   4 ,  	8    ,  2
			 * ** 기본자료형 : boolean , byte, short, int,  long , float, double , char (8개)
			 * 	    참조자료형 : String(종특)
			 * 
			 *  기본자료형들끼리 동등비교할때는 == , !=  사용가능(정상적으로 비교됨)
			 *  단, 참조자료형은 동등 비교시 ==,!= 사용시 정상적으로 비교가 안됨 
			 *  		=> equals() 메소드를 이용해서 비교해야한다. 
			 *  			문자열 .equals(비교하고자하는 문자열)
			 *  				 ==비교와 같다.
			 *  
			 *  
			 */
			
			if(name.equals("홍길동")) {
				System.out.println("홍길동님 반갑습니다.");
			} else {
				System.out.println("홍길동님이 아니신가보네요. 안녕히가세요.");
			}
			
			
		}
		//조건문 중첩사용 
		
		public void method7() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수(양수) 입력: ");
			int num = sc.nextInt();
			
			if(num > 0) {//양수의 경우  //중괄호 안에 if를 더 한다는 건 밖에있는 if는 true라는 전제하에 실행됨
				
				if(num % 2 == 0) { //(양수이고)짝수일 경우 
					System.out.print("짝수다.");
				}else {//(양수이고)홀수인 경우 
					System.out.print("홀수다.");
				}
				
			} else {//양수가 아닐 경우 
				System.out.println("양수가 아닙니다. 잘못입력하셨습니다.");
			}
		}
					
				}
		
		
	

			
			
			
