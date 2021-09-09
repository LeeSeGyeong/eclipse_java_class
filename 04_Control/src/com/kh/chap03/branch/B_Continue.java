package com.kh.chap03.branch;

public class B_Continue {

		/*
		 * continue;	:  반복문 안에 기술되는 구문 
		 * 				   continue;구문 실행시 그 뒤의 구문들은 실행되지 않고 곧바로 현재 속해있는 반복문 위로 올라감
		 */
	
	
		public void method1(){

			// 1부터 10까지의 홀수 출력
			// 1 3 5 7 9
			/* for (int i = 1; i <= 10; i++) { // i의 값이 1에서부터 10이 될때까지 1씩증가하며 반복(10회반복)
				if (i % 2 == 1) {
					System.out.print(i + " ");
				}
			}
*/
			
			for (int i=1;i<=10;i++) {
				if(i % 2 ==0) {
					continue; //반복문 내의 뒤의 구문들은 실행되지 않고 반복문 위로 올라감(증감식)
				}
				System.out.print(i+" ");
			}
		} 
		
		public void method2() {
			// 1부터 100까지의 총 합계
			// 단, 6의 배수값은 빼고 덧셈연산

			int sum = 0;
			for (int i = 1; i <= 100; i++) {
				if (i % 6 == 0) {
					continue;
				}
				sum += i;
			}
			System.out.println("결과 : " + sum);
		}
		
		//control+shift+f 누르면 자동 줄배열 
		public void method3() {
			//2~9단까지 출력 
			//단, 3의 배수단은 빼고 출력 
			
			//2단 => 곱해지는 수 1~9
			//3단 => 곱해지는 수 1~9
			//4단 => 곱해지는 수 1~9
			//...
			//9단 => 곱해지는 수 1~9
			
			//바깥쪽 		안쪽 
			
			for (int dan=2;dan<=9;dan++) {
				System.out.println("===="+dan+"단 ====\n");
			for(int su=1;su<=9;su++) {
				if(dan % 3 == 0) {
					continue;
				}
				System.out.printf("%d x %d = %d\n",dan,su,(dan*su));
			}
			System.out.println();
		}
	}
}

