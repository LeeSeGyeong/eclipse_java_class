package com.kh.chap01.condition;
import java.util.Scanner;
public class B_Switch {

	
	/* 
	 * * switch���� if���� �����ϰ� ���ǹ��� !!
	 * 
	 *  �ٸ� if������ �������̶��?
	 *  > if���� ���ǽ��� �����Ӱ� �������(�����, ��Һ� , ������ ���...) 
	 *  switch���� '����񱳹ۿ�' ������� ����! �񱳴���ڿ� casd��1�� �Ȱ��ٸ�  �����ڵ� ����
	 *  > �����ұ����� �����ϰ� �ڵ����� ���������� ���� ( ���� break;���� �ۼ��ؾ���)
	 *  
	 *  switch(�������� ������� �����) { 
	 *  	case ��1 : �����ڵ�1; break; 
	 *  	case ��2 : �����ڵ�2; break;
	 *  	...
	 *  	[default : ���� ����� ��� ��ġ���� ������� ������ �ڵ�;] �������� 
	 *  
	 *  }
	 *  
	 */
	
		public void method1() {
			
			/*
			 * ������ �Է¹޾� 
			 * 1�ϰ��"�������Դϴ�."
			 * 2�ϰ��"�Ķ����Դϴ�."
			 * 3�ϰ��"�ʷϻ��Դϴ�."
			 * �߸��Է����� ��� " �߸��Է��Ͽ����ϴ�."
			 *
			 */
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("���� (1~3) :");
				int num = sc.nextInt();
			
				/* if���� ����� 
				if(num == 1) {
					System.out.println("�������Դϴ�.");
				} else if (num ==2 ) {
					System.out.println("�Ķ����Դϴ�.");
				} else if (num == 3) {
					System.out.println("�ʷϻ��Դϴ�.");
				} else {
					System.out.println("�߸��Է��Ͽ����ϴ�.");
				}
				*/ 
				
				
				switch(num) {
				case 1 :
					System.out.println("�������Դϴ�.");
					break;
				case 2 : 
					System.out.println("�Ķ����Դϴ�.");
					break;
				case 3 : 
					System.out.println("�ʷϻ��Դϴ�.");
					break;
				default: 
					System.out.println("�߸��Է��Ͽ����ϴ�.");
				} 
		}
				
		
				public void method2() {
					
				Scanner sc = new Scanner(System.in); 
				System.out.print("�����ϰ����ϴ� ����(���,�ٳ���,������) �Է� : ");
				String fruit = sc.nextLine();
				
				int price = 0;
				
				switch(fruit) {
				case "���" : price = 1000; break;
				case "�ٳ���" : price = 2000; break;
				case "������" : price = 3000; break;
				default : System.out.println("�߸��Է��Ͽ����ϴ�."); return;
				}
				
				
				//xx�� ������ xxxx�� �Դϴ�.
				System.out.println(fruit + "�� ������ "+ price + "�� �Դϴ�.");
				
				
					
				}
				
				public void method3() {
					//��޺� ���� 
					//1 : �������� , �۾������ , �б����
					//2 : �۾������ , �б����
					//3 : �б����
					
					Scanner sc = new Scanner(System.in);
					System.out.print("���(����) : ");
					int level = sc.nextInt();
					
					
					switch(level) {
					case 1 : System.out.println("�� �������� �־�");
					case 2 : System.out.println("�� �۾������ �־�");
					case 3 : System.out.println("�� �б���� �־�");										
					}
										
				}
				public void method4() {
					//���� �Է¹޾� �ش� ���� ������ ��¥�� ��� 
					Scanner sc = new Scanner(System.in);
					
					System.out.print("1�� ~ 12������ �� �ϳ��� �Է�(������) : ");
					int month = sc.nextInt();
					
					// 1, 3, 5, 7, 8 ,10 ,12		=> 31��
					// 4, 6, 9, 11					=> 30��
					// 2 							=> 28�� �Ǵ� 29�� 
					
					switch(month) {
					
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12: System.out.print("�Է��Ͻ� ���� 31�ϱ��� �Դϴ�."); break;
					case 4:
					case 6:
					case 9:
					case 11: System.out.print("�Է��Ͻ� ���� 30�ϱ��� �Դϴ�."); break;
					case 2 : System.out.print("�Է��Ͻ� ���� 28�� �Ǵ� 29�ϱ��� �Դϴ�."); break;
					default : System.out.print("�ݵ�� 1~12�������� �Է��ؾ��մϴ�."); break;
					}
					
				}
				
		}
	
	
	
	
	
	
	
	
	
	
	
	

