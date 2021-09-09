package kh.chap02.practice;

import java.util.Scanner;

public class LoopPractice {

	private Object num1strnum2;

	public void practice1() {
		
		
		// 한개의 숫자를 입력받고  1부터 그 숫자까지의 숫자들을 모두 출력 
		//단 입력한 수는 1보다 크거나 같아야하고 1미만일 경우 다시입력하라는 출력문 출력 
		
		Scanner sc = new Scanner(System.in);

		System.out.print("1이상의 숫자를 입력하세요 : ");
		// 1 2 3 4
		int num = sc.nextInt();
		int i = 0;
		
		if(num>=1) {
			for (i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}
		} else {
			System.out.println("잘못입력하셨습니다.");
		}

	}
		
		
		public void practice2() {
			
			Scanner sc = new Scanner(System.in);

			while (true) {
				System.out.print("1이상의 숫자를 입력하세요 : ");
				// 1 2 3 4
				int num = sc.nextInt();

				int i = 0;

				if (num >= 1) {
					for (i = 1; i <= num; i++) {
						System.out.print(i + " ");
					} break;		
				} else {
					System.out.println("잘못입력하셨습니다.");
				}

			} System.out.println("\n프로그램을 종료합니다.");

		}  
	
	
		
		
		public void practice3() {

			Scanner sc = new Scanner(System.in);
			

			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			int i = 0;
			for(i=num;i>=1;i--) {
				System.out.print(i+" ");
		}
			
	}
		
		
		public void practice4() {
			
			Scanner sc = new Scanner(System.in);
			
			while (true) {
				
				System.out.print("1이상의 숫자를 입력하세요 : ");
				int num = sc.nextInt();
				
				if (num >= 1) {
					int i = 0;
					
					for (i = num; i >= 1; i--) {
						System.out.print(i + " ");
					} 
					break;
				
				} else {
					System.out.println("잘못입력하셔습니다. 다시 입력해주세요."); 
					}
			
			}
			}


			public void practice5() {
				// 1부터 입력받은 수까지의 정수들의 합을 출력하세요.
				Scanner sc = new Scanner(System.in);

				System.out.print("정수 하나를 입력하세요 : ");
				int num = sc.nextInt();

				int Sum = 0;
				int i = 0;

				for (i = 1; i <= num; i++) {

					Sum += i;
					if (i < num) {
						System.out.print(i + " + ");
					} else {
						System.out.print(i + " = ");
						System.out.println(Sum);
					}
				}
			}


		public void practice6() {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("첫번째 숫자 : ");
			int num1 = sc.nextInt();
	
			System.out.print("두번째 숫자 : ");
			int num2 = sc.nextInt();
		
			if(num1>=1 && num2>=1) { //두수 모두 잘 입력했을 경우 => 작은숫자에서부터 큰 숫자에서까지 매번 1씩증가하는 값출력				
				/*
				//1) 두수를 가지고 최소값, 최대값을 알아내야됨! 
			
				int min =0; //두 수 중에 작은 값을 기록하기위한 변수
				int max =0; //두 수 중에 큰 값을 기록하기 위한 변수 

					if(num1>num2) {
						min=num2;
						max=num1;
					} else {
						min=num1;
						max=num2;
					}*/
				
				
				int min = Math.min(num1, num2);
				int max = Math.max(num1, num2);
				
				//2) 최소값에서부터 최대값까지 매번 1씩증가하는 값을 출력 
				
					for(int i =min;i<=max;i++) {
						System.out.print(i + " ");
					}
			} else { System.out.println("1이상의 숫자를 입력해주세요");} 
			//잘못입력했을 경우 =>"1이상의 숫자를 입력해주세요" 출력 
	
		}
		
		
		public void practice7() {
			
			Scanner sc = new Scanner(System.in);
			
			while(true) {
			System.out.print("첫번째 숫자 : ");
			int a = sc.nextInt();
			System.out.println();
			System.out.print("두번째 숫자 : ");
			int b = sc.nextInt();
		
			int i = 0;
				
			if(a >= 1 && b >= 1 && a > b){
					for (i = b; a >= b; b++) {
						System.out.print(b + " ");
					} break;
				} else if (a >= 1 && b >= 1 && a < b) {
					for (i = a; a <= b; a++) {
						System.out.print(a + " ");
					} break;
				} else if (a == b) {
					System.out.println(a); break;
				} else if (a <  1  || b < 1) {
					System.out.println("1이상의 숫자만을 입력해주세요.");
				} 
			}

		
		}
		
		
		public void practice8() {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자 : " );
			int num = sc.nextInt();
			
			System.out.println("====" + num + "단 ====");
			int su = 0;
			
			for(su =1;su <=9;su++) {
				System.out.printf("%d * %d = %d\n", num,su,num*su);	
			}
			
		}
		
		
		public void practice9() {
			
			Scanner sc = new Scanner(System.in);
			
			
				
			System.out.print("숫자(2~9) : ");
			int dan = sc.nextInt();

			if (dan >= 2 && dan <= 9) {
				int su = 0;
				int j = 0;

				for (j = dan; dan <= 9; dan++) {
					for (su = 1; su <= 9; su++) {
						System.out.printf("%d * %d = %d\n", dan, su, (dan * su));
					} 
					System.out.println();
			}
		} else {
			System.out.println("2~9사이의 숫자만 입력해주세요.");
		}
		}
		
		public void practice10() {

			Scanner sc = new Scanner(System.in);
			
			while(true) {
				
			System.out.print("숫자(2~9) : ");
			int dan = sc.nextInt();

			if (dan >= 2 && dan <= 9) {
				int su = 0;
				int j = 0;

				for (j = dan; dan <= 9; dan++) {
					for (su = 1; su <= 9; su++) {
						System.out.printf("%d * %d = %d", dan, su, dan * su);
						System.out.println();
					} break;
				} 
			} else {
				System.out.println("2~9사이의 숫자만 입력해주세요.");
			}
		}
	}
		
		public void method11() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("시작 숫자 : ");
			int start = sc.nextInt();
			System.out.print("공차 : ");
			int num = sc.nextInt();
			
			/* 나의 오답...
			int i = 0;
			int j = 0;
			
			for(j=0;j<=9;j++) {
				for(i=str;str<=str+a*j;) {
					System.out.print(str+a*j+" ");
				break;}
			} */
			
			for(int i = 1 ; i<=10;i++) {
				System.out.println(start + " ");
				start += num;
				
				//start값에서부터 매번 num씩 증가되는 값을 출력(10번만!)
			}
			
		}
		
		public void practice12() {
			
			Scanner sc = new Scanner(System.in);
			/*
			 * 무한반복 {
			 * 
			 * 		1. 연산자 입력받기			 
			 * 			>>정수 입력받기 전에 사용자가 입력한 연산자가 "exit"인경우 => 
			 * 			"프로그램을 종료합니다." 출력후 반복문 종료			 
			 * 		2. 정수 두개 입력받기 
			 * 			>>연산자가 / 거나 %일때 두번째 정수값이 0일경우 => "0으로 나눌수 없습니다 
			 * 			다시 입력해주세요" 출력후 반복문 다시 시작 
			 * 		3.연산기호에 따라 해당 연산 결과를 출력 
			 * 			연산기호를 잘못입력했을 경우 => "없는 연산자입니다. 다시입력해주세요."
			 */
			
			//1.연산자 입력받기 
			while(true) {
			System.out.print("연산자(+ - / * %)입력 : ");
			//>>정수 입력받기 전에 사용자가 입력한 연산자가 "exit"인경우 => "프로그램을 종료합니다."
			String str = sc.nextLine();//"+","-","*","%","/" , "exit"
			if(str.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} 
			
			//2. 정수 두개 입력받기 
			System.out.print("정수 1 :");
			int num1 = sc.nextInt();
			
			System.out.print("정수 2 :");
			int num2 = sc.nextInt();
			sc.nextLine(); //무한반복되므로 버퍼에 int때문에 생긴  엔터를 정리해줘야한다 / 안면 연산자 , 정수 같이 나와버리는 오류 
			
			//>>연산자가 / 거나 %일때 두번째 정수값이 0일경우 => "0으로 나눌수 없습니다 
			// 			다시 입력해주세요" 출력후 반복문 다시 시작 
			
			if((str.equals("/") || str.equals("%")) && num2 == 0) {//우선순위가 다를때에는 묶어서
				System.out.println("0으로 나눌 수 없습니다. 다시입력해주세요\n");
				continue;
			}
			//3. 연산기호에 따라 해당 연산결과 출력
			int result = 0;
			
			switch(str) {
			case "+" : result = num1 + num2;break; //break;는 실행할 것만 실행하고 구문 빠져나옴 
			case "-" : result = num1 - num2;break;
			case "*" : result = num1 * num2;break;
			case "/" : result = num1 / num2;break;
			case "%" : result = num1 % num2;break;
			default  : System.out.println("없는 연산자입니다. 다시입력해주세요.\n"); continue;
			} System.out.printf("%d %s %d = %d\n\n" , num1,str,num2,result);
				
		
	
			}	
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		


