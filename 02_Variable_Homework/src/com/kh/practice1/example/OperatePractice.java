package com.kh.practice1.example;

import java.util.Scanner;

public class OperatePractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է� : ");
		int num = sc.nextInt();
		
		System.out.println(num + "�� " + (num >= 0 ? "�����." : "����� �ƴϴ�."));
	}
	
		public void practice2() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("������ �Է� : ");
			int num = sc.nextInt();
			
			String result = (num > 0 ? "����̴�" : (num < 0 ? "�����̴�" : "0�̴�"));
			System.out.println(result);
			
			
		}
		
		public void practice3()	{
			
			Scanner  sc = new Scanner(System.in);
			System.out.print("������ �Է� : ");
			int num = sc.nextInt();
			
			String result = (num % 2 == 0 ? "¦����" : "Ȧ����");
			System.out.println(result);
			
						
		}
		
		public void practice4() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("�ο� �� : ");
			int people = sc.nextInt();
			
			System.out.print("���� ���� : ");
			int candy = sc.nextInt();
			sc.nextLine();
			
			System.out.print("\n");
			System.out.println( "1�δ� ���� ���� : " + (candy / people));
			System.out.println("���� ���� ���� : " + (candy % people));
		
		}
		
		public void practice5()	{
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			
			System.out.print("�г�(���ڸ�) : ");
			int grade = sc.nextInt();
			
			
			System.out.print("�� : ");
			int classNum = sc.nextInt();
			
			System.out.print("��ȣ : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			System.out.print("����(M/F) : ");
			//�� Ʋ�� �� int gender = sc.nextInt();
			char gender = sc.nextLine().charAt(0);
		
			 
			
			System.out.print("����(�Ҽ��� �Ʒ� ��° �ڸ�����) : " );
			double score = sc.nextDouble();
			
			String student = (gender == 'M'|| gender == 'm') ? "���л�" : "���л�" ;
			
			
			// x�г� x�� x�� xxx xxx�� ������ xx.xx�̴�.
			
			System.out.printf("%d�г� %d�� %d�� %s %s�� ������ %.2f�̴�." ,grade,classNum,num,name,student,score);
			
			

		}

		public void practice6() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("���� : ");
			int age = sc.nextInt();
			
			String result = (age <= 13) ? "���" : (age <= 19 ? "û�ҳ�":"����");
			System.out.println(result);
			//System.out.println( age <= 13 ? "���" :/*������� �̹� age> 13�� ���������� �ȴ�. �տ��� : �ƴ϶��~ �̴ϱ� */ 
				//(age > 13 && age <= 19) ? "û�ҳ�" : "����");
			
		}
		
		public void practice7() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("���� : ");
				int kor = sc.nextInt();
			System.out.print("���� : ");
				int eng = sc.nextInt();
			System.out.print("���� : ");
				int math = sc.nextInt();
				
			//�հ�
				int sum = kor+eng+math ;			
			//���
				double avg = (sum/3.0);
				
			System.out.println("�հ� : " + sum);	
			System.out.println("��� : " + avg);
			
			System.out.println(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60 ? "�հ�" : "���հ�");
				
			
		}
		
		public void practice8() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("�ֹι�ȣ�� �Է��ϼ���(-����) : ");
			//char gender = sc.nextLine.charAt(7);
			//�� ª�� ����� �ʹٸ�? �̷� ����� ����غ����� :)
			
			
			//String num1 = sc.nextLine();
			//char a = num1.charAt(7); 
			//��� ���ڰ��ƴ϶� '����'�̱� ������ 
			//���� �Է��Ҷ� '1' '2' '3' '4' �� Ȭ����ǥ�� �����ش�
			
			//String result = ( (a == '1' || a == '3') ? "����" : "����"); //�����̱� ������ a�� ���� '1'�� �����ش�! 
			//System.out.println(result);
			
			
			
			
			
		}
		
		
}
