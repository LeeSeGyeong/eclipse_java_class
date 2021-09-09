package com.kh.chap02.loop;
import java.util.Scanner;

public class A_For {

	
	/* 
	 * <반복문>
	 * 
	 * 프로그램 흐름을 제어하는 제어문 중 하나 
	 * 어떤 실행코드를 반복적으로 수행시켜줌
	 * 
	 * 크게 두 종류로 나뉨 (for문 / while문(do-while문))
	 * 
	 * * for문(초기식;조건식;증감식[증감연산자  ++ --같은 ] /;;두개의 세미콜론 필요. ;가 구분해주는 역할을 함) { // 반복 횟수를 지정하기 위해 제시하는 것들
	 *  	초기식 ->조건식 ->증감식 -> 조건식 ->증감식
	 * 			반복적으로 실행시키고자하는 구문;
	 * }
	 * 
	 * - 초기식 : 반복문이 수행될 때 "처음에 단 한번만 실행되는 구문"
	 * 			(보통 반복문 안에서 사용될 변수를 선언 및 초기화하는 구문)
	 * 
	 * - 조건식 : "반복문이 수행될 조건" / 조건이 true면 실행하고,또 돌아가서 true면 실행...실행..반복하다가 조건식이 false가 되면 멈춘다
	 * 			조건식이 true일 경우 해당 구문을 실행
	 * 			조건식이 false가 되는 순간 반복을 멈추고 빠져나옴 
	 * 			(보통 초기식에 제시된 변수를 가지고 조건식을 작성함)
	 * 
	 * - 증감식 : 반복문을 제어하는 변수 값을 증감 시키는 구문
	 * 			(보통 초기식에 제시된 변수를 가지고 증감연산자(++,--)를 사용함)
	 * 
	 * 		*for문을 만나는 순간
	 * 		초기식 --> 조건식 검사 --> true일 경우 실행구문 실행 --> 증감식
	 * 			 --> 조건식 검사 --> true일 경우 실행구문 실행 --> 증감식
	 * ------------------------------이 내용이 반복 .. 
	 * 			 --> 조건식 검사 --> false일경우 실행구문 실행x ==> 반복문 빠져나옴	
	 * 
	 *  	*알아둘 것 
	 *  	for문안에 초기식 , 조건식 , 증감식 각각 생략가능하긴함 (단, ;은 반드시 필수로 적어야한다!)
	 *  	(조건식 생략가능하다. 하면 true를 전제로 실행되므로 무한 반복이 됨)
	 */
	
	
	//for문은 노트로 적어가면서 공부해보기!
		public void method1() {
			
			/*
			//"안녕하세요를 5번 반복해서 출력하기 						
			System.out.println("안녕하세요");
			System.out.println("안녕하세요");
			System.out.println("안녕하세요");
			System.out.println("안녕하세요");
			System.out.println("안녕하세요");
			*/
			
			for(int i=1;i<=5;i++){//i값이 1에서부터 5까지 매번 1씩 중가하는 동안 반복 수행(1,2,3,4,5=>5회)
				System.out.println("안녕하세요");
			}		
			/*for(int i=0;i<5;i++) {//i값이 0에서부터 4까지 매번 1씩 중가하는 동안 반복 수행(0,1,2,3,4=>5회
				System.out.println("반갑습니다");
			}
			for(int i=11;i<16;i++) {//i값이 11에서부터 15까지 매번 1씩 중가하는 동안 반복 수행(11,12,13,14,15=>5회
				System.out.println("저리가세요");
			}
			for(int i=1;i<=9;i+=2){//i값이 1에서부터 9까지매번 2씩증가하는동안 반복수행//1,3,5,7,9 => 5회
				System.out.println("Hello");				
			}*/
			
		
			//System.out.println(i); 못찾는다 포문 안에서만 i라는 변수가 실행되기 때문 
			
			}

			public void method2() {
				//1부터 5까지출력
				/*System.out.println(1);	
				System.out.println(2);	
				System.out.println(3);	
				System.out.println(4);	
				System.out.println(5);	*/
				/*
				for(int i=1;i<6;i++) {//i값이 1에서부터 5까지 1씩증가시키는 동안 반복 수행(1,2,3,4,5)
					System.out.println(i);
				}*/
				//1
				//2
				//3
				//4
				//5
				
				//만약 1 2 3 4 5 형식으로 출력하고싶다면?
				for(int i = 1;i<6;i++) {
					System.out.print(i +" ");
					}
			}

			public void method3() { // 5 4 3 2 1 //i값이 5에서부터 
			for(int i=5;i>=1;i--) {
				System.out.print(i +" ");
			
		}
			}
			public void method4() {
				//1~10사이의 홀수만을 출력 // 1 3 5 7 9
		/*	for(int i = 1;i<11;i+=2) { // i값이 1에서부터 10까지 2씩증가되는 동안 반복 수행(1,3,5,7,9)
				System.out.print(i +" ");
				}
				*/
			for(int i=1;i<=10;i++) {//i의 값이 1에서부터 10까지 매번 1이 증가하는동안 반복수행(10회)
				if(i%2==1) {
				System.out.print(i +" ");
				}
			}
					}
			public void method5() {
				//1 2 3 4 ....8 9 10
				
				for(int i = 0;i<=9;i++) {//i값이 0에서	부터 9까지 매번1씩 증가되는 반복(10회)
					System.out.print(i+1 +" ");		
				}
			}
		
			public void method6() { 
				//1~10까지의 총합계 
				//방법1. inu sum = 1+2+3+...+8+9+10;
				
				//방법2. 				
				/* int sum = 0;
				 * sum += 1;
				 * sum += 2;
				 * sum += 3;
				 * ......
				 * sum += 9;
				 * sum +=10;
				 * 
				 * 규칙을 찾자! sum변수에 누적해서 합산하는거 반복적으로 진행됨 
				 * 단, 누적해서 더하고자하는 값이 1에서부터 10까지 1씩 증가되는걸 파악할 수 있음!! 
				 */
				
				int sum = 0 ;
				
				for(int i=1;i<=10;i++) {
					sum += i;						
				}
				System.out.println("1에서부터 10까지의 총 합계 : "+ sum);
			}
			
			public void method7() { 
			//1에서부터 사용자가 입력한 수까지의 총 합계
				
				Scanner sc = new Scanner(System.in);
				
				
				while(true) {
				System.out.print("1이상의 정수 : " );
				int num = sc.nextInt();
				
				if(num>1) {//잘 입력했을 경우 => 1에서부터 사용자가 입력한 수까지의 총합계 출력 후 반복문 빠져나가기
					
					int sum = 0;
					
					for(int i =1;i<=num;i++) {//i값이 1에서부터 num까지 매번 1씩 증가되는동안 반복 수행 
						sum+=i;
					}
					//1에서부터 xx까지의 총 합계 : xxx
					System.out.println("1에서부터" + num + "까지의 총 합계 : " + sum);
					break;
					
				} else {//잘못 입력했을 경우 => 오류 구문 출력 다시 입력받을 수 있게 유도 
					System.out.println("잘못 입력했습니다. 다시입력해주세요.");
				}
				
				/* int sum = 0;
				 * sum += 1;
				 * sum += 2;
				 * ..
				 * sum += num;
				 * 
				 * 누적해서 더해주고자 하는 값이 1에서부터 num까지 1씩증가
				 * 
				 * 
				 */
				
				}
			}
			
			 public void method8() {
				 //1에서부터 어떤 랜덤값(1에서 10사이의 랜덤값)까지의 총 합계 
				 
				 /*
				  *  java.lang.Math 클래스에서 제공하는 random() 메소드를 호출해서 매번 다른 랜덤값을 얻어낼 수 있음!!
				  * 별도의 생성 없이! Math.random()으로 랜덤값 얻을 수 있음 
				  * 
				  * Math.random() 호출시 ==> 0.0 ~ 0.99999999 사이의 랜덤값 발생 즉, 1미만의 범위의 실수 랜덤값임
				  * 					  (0.0 <=    < 1.0)
				  */					
				 
				 //int random = Math.random(); // double형이라서 안됨 
				 //				0.0 <= <1.0 => 0.0 ~ 0.999999
				 
				 //int random = Math.random() * 10;
				 //				0.0 <=  <10.0 => 0.0 ~ 9.99999999
				 
				 //int random = Math.random() * 10 + 1;
				 //				1.0<=   <11.0 => 1.0 ~ 10.99999999
				 
				 int random = (int)(Math.random()*10 + 1);
				 //			  1 <= 	< 11		=>1 ~ 10까지의 랜덤값(int형으로 변환해서 실수값은 모두 삭제됨)
				 
				 System.out.println("1~10사이의 랜덤값 : "+ random);
				 
				 int sum = 0;
				 for(int i = 1 ; i <= random ; i++) {
					 sum += i;
				 }
				 
				 System.out.println("1에서부터" + random + "까지의 총합계 : " + sum);
				 
			 }
			 
			 public void method9() {
				 
				 String str = "Hello";
				 
				 // 각 인덱스별 문자 뽑아서 출력
				 
				 /*
				  * H 		=> str.charAt(0)출력
				  * e 		=> str.charAt(1)출력
				  * l 		=> str.charAt(2)출력
				  * l 		=> str.charAt(3)출력
				  * o 		=> str.charAt(4)출력
				  * 
				  * 
				  * 0번 인덱스에서부터 4번 인덱스(마지막인덱스)까지 매번 1씩 증가하면서 반복 수행 
				  */
				 
				 for(int i = 0;i <= 4 ;i ++) { // i값이 0에서부터 4까지 매번 1씩증가하면서 반복수행 
					 System.out.println(str.charAt(i));
				 }
			 }
			 
			 public void method10() {
				 //사용자한테 문자열 입력받아서(str변수에 대입)
				  Scanner sc = new Scanner(System.in);
				  
				  System.out.print("문자열 입력 : ");
				  String str = sc.nextLine();
				  
				 //각 인덱스 별 문자를 뽑아서 출력
				 //apple 길이 : 5글자
				 //01234
				 
				 //strawberry 길이 : 10 글자
				 //0123456789
				 
				 //kiwi 길이 : 4글자
				 //0123
				 
				 //아! 마지막 인덱스는 항상 (문자열의 길이 -1) 이구나!!
				 //추출하고자 하는 인덱스값 0 ~ ( 문자열의길이 -1) 까지 매번 1씩 증가 
				  
				  System.out.println("문자열의 길이 : " + str.length());
				  
				  for(int i = 0; i<str.length();i++ ) {
					  System.out.println(str.charAt(i));
				  }
			 }
			
			public void method11() {
				//2단 출력하기 
				/*
				 * 2 x 1 =2
				 * 2 x 2 =4
				 * 2 x 3 = 6
				 * ...
				 * 2 x 8 = 16
				 * 2 x 9 = 18
				 */
				
				for(int su=1;su<=9;su++) {
					//System.out.println("2 x " + su + " = " + 2 * su);
					System.out.printf("%d x %d = %d\n",2,su,2*su);
				}
				
			}
			
			public void method12() {
				
				//사용자가 입력한 단을 출력하기 
				Scanner sc = new Scanner(System.in);
				
				System.out.print("단 수(2~9)를 입력 : ");
				int dan = sc.nextInt();
				
				if(dan>=2 && dan<=9) { //잘 입력했을 경우 => 해당 단을 출력해주기 
						for(int su=1;su<=9;su++) {
							System.out.printf("%d x %d = %d\n", dan,su,dan*su);
						}
				} else { // 잘못입력했을 경우 => "잘못입력했음"출력
					System.out.println("2~9사이의 숫자를 입력하세요. 잘못입력하셨습니다.");
				}
				
			}
			
			public void method13() {
				//2부터 9까지의 랜덤 단을 출력하기 
				int dan = (int)(Math.random()*8+2);
					//			0.0<=	<1.0
					//			0.0<=	<8.0
					//			2.0<=	<10.0
					//			2  <=	<10		=> 2 ~ 9
				
				System.out.println("==="+dan+"단 ===");
				for(int su=1;su<=9;su++) {
					System.out.printf("%d x %d = %d\n", dan , su , dan*su);
				}
			}
			
			//date : 2021.8.10
			
			//중첩 for문 
			
			public void method14() {
				
				//1 ~ 5 연이어서 출력하는것 
				///1 2 3 4 5
				///1 2 3 4 5
				///1 2 3 4 5 를 총 3번 출력하고싶다면?
				
				
				for(int j=1;j<=3;j++) {
				for (int i=1;i<=5;i++) {
					System.out.print(i+" ");
				}
				System.out.println();
				}
			}
			
		public void mehtod15() {
				//****
				//****
				//****
				//****
			
					//행은 1~4까지 반복 			=> 바깥쪽 for문 
					//매 행 고정일때 열은 1~4까지 반복 => 안쪽 for문 
				for(int j=1;j<=4;j++) {
					for(int i = 1;i<=4;i++) {
					System.out.print('*');
					} System.out.println();
				}
					
		}
			
			
		public void mehtod16() {
			
			//1*** => i==j 1행 1열일때 
			//*2** => i==j 2행 2열일때 
			//**3* => i==j 3행 3열일때 
			//***4 => i==j 4행 4열일때 
			//즉, 행과 열이 일치할 때 숫자를 출력 
			
			for(int j=1;j<=4;j++){
				for(int i = 1;i<=4;i++) {
					if(i==j) {
						System.out.print(i);
					}else {
						System.out.print("*");
					}
			}
				System.out.println();
					}
		}
			
		
		public void method17() {
			
			//2단부터 9단까지 출력 
			
				//int dan = 6 ;
				
			
			for(int dan=2;dan<=9;dan++) {
					System.out.println("==="+dan+"단 ===");
					
					for(int su=1;su<=9;su++) {
						
						System.out.printf("%d x %d = %d\n",dan,su,dan*su);			
					}
					System.out.println();
			}
		}
		
		public void method18() {
			
			for(;;) { //조건식 자리 생략시 기본적으로 true => 무한반복문 
				System.out.println("안녕");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

			
			
			
			
			
			
			
			

	

