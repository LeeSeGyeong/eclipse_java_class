package com.kh.practice.example;
import java.util.Scanner;
public class ArrayPractice {

		public void method1() {
			
			int[] arr = new int[10];
			
			for(int i=0;i<10;i++) {
				arr[i] = i+1;
			}
			for(int i=0;i<10;i++) {
				System.out.print(arr[i]+" ");
			}
		}
		
		
		public void method2() {
			
			int[] arr = new int[10];
			
			for(int i=0;i<10;i++) {
				arr[i] = i+1;
			}
			for(int i=9;i>=0;i--) {
				System.out.print(arr[i]+" ");
			}
		}
		
		public void method3() {
			Scanner sc = new Scanner(System.in);
			System.out.print("���� ���� : " );
			int size = sc.nextInt();
			
			int[] arr = new int[size];
			
			for(int i=0;i<size;i++) {
				arr[i]=i+1;
			} 
			for(int i=0;i<size;i++) {
				System.out.print(arr[i]+ " ");
			}
			
		}
		
		public void method4() {

			// 1. ���̰� 5�� String �迭 ����
			String[] arr = new String[5];
			
			// 2. �� �ε����� �� �ʱ�ȭ
			arr[0] = "���";
			arr[1] = "��";
			arr[2] = "����";
			arr[3] = "������";
			arr[4] = "����";
			
			// ���� 1�� 2�� ������ ���ÿ� ���� �� ���� �ִ�. �Ʒ��� ����
			//String[] arr = {"���", "��", "����", "������", "����"};
			
			// 3. �迭 �ε����� Ȱ���ؼ� �� ���
			System.out.println(arr[1]);
			
		}
		
		
		public void method5() {
			//�ε��� ��ȣ �������ϰ���
			Scanner sc = new Scanner(System.in);
			
			System.out.print("���ڿ� �Է� : ");
			String str = sc.nextLine();
			
			System.out.print("ã���� �ϴ� ���� : ");
			char ch = sc.nextLine().charAt(0);
			
			char[] arr = new char[str.length()];
			
			for(int i=0;i<str.length();i++) {
				System.out.println(arr[i]);
				arr[i] = str.charAt(i);
				}

			int count = 0;
			for(int i=0;i<arr.length;i++) {
				if(ch == arr[i]) {
					count++;
				}
			} 
			System.out.println(ch + " �� ���� : " + count);
			
		}
		
		
		
		public void method6() {
			
			String[] week = {"��","ȭ","��","��","��","��","��"};
			
			Scanner sc = new Scanner(System.in);
			System.out.print("0 ~ 6 ������ �����Է� : ");
			int num = sc.nextInt();
			
			if( num>=0 && num <=6) {
				System.out.println(week[num]+"����");
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			
		}
		public void method7() {
			
			// 1. ����ڿ��� ���� �Է¹ް� �� ����ŭ�� �迭 ���� �� �Ҵ�
			Scanner sc = new Scanner(System.in);
			
			System.out.print("���� : ");
			int num = sc.nextInt();
			int[] arr = new int[num];
			
			// 2. �� �迭�� ũ�⸸ŭ ����ڰ� ���� ���� �Է��Ͽ� ������ �ε����� ���� �ʱ�ȭ
			for(int i=0; i<arr.length; i++) {
				System.out.print("�迭 " + i + "��° �ε����� ���� �� : ");
				arr[i] = sc.nextInt();
			}
			
			// 3. ��ü �� ���� �� �� �� ���
			int sum = 0;
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i] + " ");
				sum += arr[i];
			}
			
			System.out.println("\n�� �� : " + sum);
			
		}
		
		public void method8() {
			
			Scanner sc = new Scanner(System.in);
			
			
			
			while(true) {
				
				//1. ����ڿ��� 3�̻��� Ȧ������ �Է¹ޱ� 
				System.out.print("���� : ");	
				int num = sc.nextInt();
				
				//2. ���ǹ��� ���ؼ� �� �Է��ߴ��� ���ߴ��� �Ǻ� 
				if(num >=3 && num % 2 ==1) { //�� �Է����� ��� => �迭 �� ���� �� ��� �� �ݺ����� ������������
					
					//3_1.�迭 ����(����ڰ� �Է��� ũ�⸸ŭ�� �迭)
					int[] arr = new int[num];
					
					//3_2. �迭�� �� �ε����� �� ��� 
					//		ex) 5�Է½� => {1,2,3,2,1}
					//		7�Է½� => {1,2,3,4,3,2,1}
					//		9�Է½� => {1,2,3,4,
					//								�迭�� ���� /2�ε������� ���� �����ĺ��� ���� 
					
					int value =1;
					for(int i=0;i<arr.length;i++) {
						arr[i]= value;
						
						if(i<arr.length/2) {
						value++;}
						else {
						value--;
						}
					}
					
					//3_3. �迭�� �� �ε����� ��� �� ��� 
					for(int i=0;i<arr.length;i++) {
						System.out.print(arr[i]+", ");
					
					}
					break;
					
				} else { // �߸��Է�������� =>"�ٽ��Է��ϼ���" ����� �ݺ��� �ٽ� ����
					System.out.println("�ٽ� �Է��ϼ���.");
				}
			}
				
			}
				
		public void method9() {
			
			//����ڰ� �Է��� ���� �迭�� �ִ��� �˻��Ͽ�
			//��� �Ķ��̵� �ݹ� 
			
			Scanner sc = new Scanner(System.in);
			System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
			
			String name = sc.nextLine();
			
			String[] arr = {"�Ķ��̵�","���","�ݹ�"};
			
			
			if(name.equals("�Ķ��̵�")) {
				System.out.println("�Ķ��̵�ġŲ ��� ����");
			} else if(name.equals("���")) {
				System.out.println("���ġŲ ��� ����");
			} else if(name.equals("�ݹ�")) {
				System.out.println("�ݹ�ġŲ ��� ����");
			} else {
				System.out.println(name + "ġŲ�� ���� �޴��Դϴ�.");
			}
		}
			


		public void method10() {
		
			
		
		
		}
		
		public void method11() {
			
		/*
		����ڿ��� �ֹε�Ϲ�ȣ�� �Է� �ް� �ش� ���ڿ��� �� ���ڵ��� char[] �� �Ű� ���� ���� �迭 ����
		�� �� ��, ���� �迭�� �״�� ������ ä�� ���纻 �迭�� ���� �� ���� �ڸ� ���ĺ��ʹ� ��*���� ���� ��
		�ϴ��� ���ó�� ����غ�����.
		ex.			
		�ֹε�Ϲ�ȣ(-����) : 123456-1234567
		123456-1*****
		*/
			
			
		}
		
		
		
		

}
