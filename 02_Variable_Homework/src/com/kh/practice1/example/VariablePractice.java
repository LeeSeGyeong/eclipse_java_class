package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice { 
		 
		public void method1() {
			
			
				Scanner a1 = new Scanner(System.in);
				
				System.out.print("�̸��� �Է��ϼ��� : ");
				String name = a1.nextLine();
				
				System.out.print("���̸� �Է��ϼ��� : ") ;
			int age = a1.nextInt();
		 
			a1.nextLine();
			System.out.print("������ �Է��ϼ��� (��/��) : ");
			String gender = a1.nextLine();
			
			System.out.print("Ű�� �Է��ϼ���(cm) : ");			
			double height = a1.nextDouble();			
			a1.nextLine();
 
			System.out.print("Ű " + height + "cm ��  " + age + "�� " + gender + "�� "
			+ name +"�� �ݰ����ϴ�^^");
				
				
		}
		
				public void method2() {
					
					Scanner a2 = new Scanner(System.in);
					
					System.out.print("ù ��° ������ �Է��ϼ��� : ");
					int i2 = a2.nextInt();
					a2.nextLine();
					
					System.out.print("�� ��° ������ �Է��ϼ��� : ");
					int i3 = a2.nextInt();
					a2.nextLine();
					
					System.out.println("���ϱ� ��� : " + (i2 + i3) );
					System.out.println("���� ��� : " + (i2 - i3) );
					System.out.println("���ϱ� ��� : " + (i2 * i3) );
					System.out.println("������ �� ��� : " + (i2 % i3) );
					
				}
				
				public void method3() {
					
					Scanner a3 = new Scanner(System.in);
					
					System.out.print("���� : " );
					int i3 = a3.nextInt();
					a3.nextLine();
					
					System.out.print("���� : ");
					int i4 = a3.nextInt();
					a3.nextLine();
					
					System.out.println("���� : " + (i3*i4)+"\n" + "\n" +"�ѷ� : " + (i3+i4)*2 );
					
					
				}
				
				/* ��¥ �ϳ��� �𸣰����� 
				 * public void method4 () {
					
					Scanner sc4 = new Scanner(System.in);
					
					System.out.print("���ڿ��� �Է��ϼ���(����) : "); sc4.nextLine();	
					System.out.printf("%d,%c","ù ��° ���� : ",sc4.nextLine().charAt(0));
					
					
					 
					System.out.println("�� ��° ���� : ");
					System.out.println("�� ��° ���� : ");
					
					char a2 = sc4.nextLine().charAt(1);
					char a3 = sc4.nextLine().charAt(2);
					
						sc4.nextLine();					
							System.out.println("ù ��° ���� : ");
									
					sc4.nextLine();}
				 */
		
				
				}


