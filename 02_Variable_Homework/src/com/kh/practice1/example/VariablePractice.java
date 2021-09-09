package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice { 
		 
		public void method1() {
			
			
				Scanner a1 = new Scanner(System.in);
				
				System.out.print("이름을 입력하세요 : ");
				String name = a1.nextLine();
				
				System.out.print("나이를 입력하세요 : ") ;
			int age = a1.nextInt();
		 
			a1.nextLine();
			System.out.print("성별을 입력하세요 (남/여) : ");
			String gender = a1.nextLine();
			
			System.out.print("키를 입력하세요(cm) : ");			
			double height = a1.nextDouble();			
			a1.nextLine();
 
			System.out.print("키 " + height + "cm 인  " + age + "살 " + gender + "자 "
			+ name +"님 반갑습니다^^");
				
				
		}
		
				public void method2() {
					
					Scanner a2 = new Scanner(System.in);
					
					System.out.print("첫 번째 정수를 입력하세요 : ");
					int i2 = a2.nextInt();
					a2.nextLine();
					
					System.out.print("두 번째 정수를 입력하세요 : ");
					int i3 = a2.nextInt();
					a2.nextLine();
					
					System.out.println("더하기 결과 : " + (i2 + i3) );
					System.out.println("빼기 결과 : " + (i2 - i3) );
					System.out.println("곱하기 결과 : " + (i2 * i3) );
					System.out.println("나누기 몫 결과 : " + (i2 % i3) );
					
				}
				
				public void method3() {
					
					Scanner a3 = new Scanner(System.in);
					
					System.out.print("가로 : " );
					int i3 = a3.nextInt();
					a3.nextLine();
					
					System.out.print("세로 : ");
					int i4 = a3.nextInt();
					a3.nextLine();
					
					System.out.println("면적 : " + (i3*i4)+"\n" + "\n" +"둘레 : " + (i3+i4)*2 );
					
					
				}
				
				/* 진짜 하나도 모르겠음요 
				 * public void method4 () {
					
					Scanner sc4 = new Scanner(System.in);
					
					System.out.print("문자열을 입력하세요(영어) : "); sc4.nextLine();	
					System.out.printf("%d,%c","첫 번째 문자 : ",sc4.nextLine().charAt(0));
					
					
					 
					System.out.println("두 번째 문자 : ");
					System.out.println("세 번째 문자 : ");
					
					char a2 = sc4.nextLine().charAt(1);
					char a3 = sc4.nextLine().charAt(2);
					
						sc4.nextLine();					
							System.out.println("첫 번째 문자 : ");
									
					sc4.nextLine();}
				 */
		
				
				}


