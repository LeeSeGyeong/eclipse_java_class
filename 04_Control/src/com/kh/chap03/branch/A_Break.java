package com.kh.chap03.branch;
import java.util.Scanner;

public class A_Break {

		/*
		 * break ; : �ݺ��� �ȿ� ���Ǵ� �б⹮ 
		 * 			 break;�� ����Ǵ� ���� ���� �����ִ� �ݺ����� ������ ��������  
		 * 
	 * * ���ǻ��� : switch�� ���� break;�� ���� switch������ ���������� ����  
		 */
	
	
		public void method1() {
			
			//������(1~100) �߻���Ű�� �� ������ ��� ( �� ������ �Ź� �ݺ� �Ұ���)
			//��, �߻��� �������� 3�� ����� ��� (3���� ������ �� �������� 0�� ���) �ݺ����� �������ò���
			
			while(true) { // ���ѹݺ� ��������
			
				
			int random =(int) (Math.random() * 100 + 1);
			
			System.out.println("������ : " + random);
			
			if(random%3==0) {
				break;
					} 
				System.out.println("������ : "+ random);
				}
			
			
			}

	
			
			//***** 8/13 test ��������! *****//
		
			public void method2() {
				
				//����ڿ��� ���ڿ� �Է¹޾� �ش� �� ���ڿ��� ���̸� ��� (�� ������ �Ź� �ݺ�)
				//��, ����ڰ� �Է��� ���ڿ��� "exit"�� ��� �ݺ����� ������������
				
				Scanner sc = new Scanner(System.in);
				
				while(true) {
				System.out.print("���ڿ��� �Է����ּ��� : ");
				String str = sc.nextLine();
				
				if(str.equals("exit")) { //�Է��� ���ڿ��� exit�� ��� => �ݺ��� ���������� 
						break;
				} else { //�װ� �ƴ� ��� ==> ���ڿ��� ���� ����ϱ� 
					System.out.println("���ڿ��� ���� : " + str.length());
				}
				}
				System.out.println("���α׷��� �����մϴ�.");
				
				
			}

			
			public void method3() {
				//����ڿ��� ��(2~9)�� �Է¹޾� �ش� ���� ��� 
				//Ȥ��, �� �̿��� �߸��� ���� �Է����� ��� �ٽ� ���� �Է¹޵��� ���� 

				Scanner sc = new Scanner(System.in);

				while (true) {

					System.out.print("��(2~9)�� �Է����ּ��� : ");
					int dan = sc.nextInt();

					if (dan >= 2 && dan <= 9) {// �� �Է����� ��� => �ش� ���� ��� �� �ݺ��� ����������

						for (int su = 1; su <= 9; su++) {
							System.out.printf("%d x %d = %d\n", dan, su, dan * su);
						}

						break;

					} else {// �߸��Է����� ��� => �߸��Է������� �˸��� ���� ���
						System.out.println("�߸��Է��߽��ϴ�. �ٽ� �Է����ּ���.");
					}
				}
			}
		}
				
			
			
			
			
			
			
			
			
			
			
			
			
			
			
