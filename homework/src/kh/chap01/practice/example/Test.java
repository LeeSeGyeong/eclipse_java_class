package kh.chap01.practice.example;

import java.util.Scanner;

public class Test {

	public void count() {
		
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("���ڿ��� �Է� : ");
			String str = sc.nextLine();
			if (str.equals("exit")) {
				break;
			} else {
				System.out.println(str.length() + "�����Դϴ�.");
			}
		}
		System.out.println("���α׷���  �����մϴ�.");
	}
	
	
	
	public void methodTest() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		System.out.print("����2 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�����ȣ(+,-,*,/,%)�� �Է��Ͻÿ� : ");
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
			System.out.println("�����ȣ�� �߸��Է��ϼ̽��ϴ�.");
		}
		System.out.println("������ : " + result);
		
		
		
		
	}
	
	
	
	
	
}
