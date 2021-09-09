package kh.chap01.practice.example;

import java.util.Scanner;

public class Test {

	public void count() {
		
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("문자열을 입력 : ");
			String str = sc.nextLine();
			if (str.equals("exit")) {
				break;
			} else {
				System.out.println(str.length() + "글자입니다.");
			}
		}
		System.out.println("프로그램을  종료합니다.");
	}
	
	
	
	public void methodTest() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("연산기호(+,-,*,/,%)를 입력하시오 : ");
		char ch = sc.nextLine().charAt(0);
		
		int result=0;
		
		if(ch=='+') {
			result = num1 + num2; 
		} else if (ch=='-') {
			result = num1 - num2;
		} else if (ch=='*') {
			result = num1 * num2;
		} else if (ch=='/') {
			result = num1 / num2;
		} else if (ch=='%') {
			result = num1 % num2;
		} else { 
			System.out.println("연산기호를 잘못입력하셨습니다.");
		}
		System.out.println("연산결과 : " + result);
		
		
		
		
	}
	
	
	
	
	
}
