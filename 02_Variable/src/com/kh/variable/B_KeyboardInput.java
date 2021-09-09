package com.kh.variable;


// ����ڰ� Ű����� �Է��� ���� �޾Ƶ��̴� Scanner �ǽ�
import java.util.Scanner;

public class B_KeyboardInput {

	public void inputTest1() {
		
		/*
		 *  Ű����� ���� �Է��ϴ� ��� 
		 *  Scanner�� ����Ѵ� 
		 *  (��, java.util.Scanner Ŭ������ �̿��ϴ� ���̴�)
		 *  Scanner Ŭ���� ������ �޼ҵ带 ȣ���Ͽ� �Է¹޴� ��. 
		 */
		
		//��ĳ�� Ŭ������ ��ü ���� 
		Scanner sc = new Scanner(System.in);
		//System.on�� �Է¹��� ���� ����Ʈ ������ �޾Ƶ��̰ڴٴ� �ǹ� 
		//��� �ÿ��� System.out �̶�� ������ ����� ! 
		
		System.out.print("�ƹ��ų� �Է��غ����� : ");
		String amuguna = sc.nextLine();
		
		System.out.println("�Է¹��� ���� : " + amuguna);
		
		
		
	}
	
	public void inputTest2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �̸��� �����Դϱ� : ");
		
		// ����ڰ� �Է��� ���� ���ڿ��� �޾ƿ��� �޼ҵ� (next(), nextLine())
		//String name = sc.next(); //sc�� �ִ� ���ڸ� ������ ���°Ŵϱ� sc.���δ�. 
		//Ű���忡�� ��������'��'�ϴ� �޼ҵ�  ���������� 
		//�׷��ٸ� �̰Ÿ� ���ڿ��� ���� ���̰� �Ϸ��� ���ڿ� Ŭ������ �޸� �� String name�� �ڽ��� ����� ����. 
		//next() : ����ڰ� �Է��� �� �߿� ������ ������� ���� ���������� ���� �о�� 
		//		   (���� ����������� ��� �̷� ���배�� ��� ������ ���� �� �ֱ⶧���� ����� ���� �������� ���� �ִ�)
		//
		
		String name = sc.nextLine();
		
		// nextLine() : ����ڰ� �Է��� �� ��� �� �о�� (������������ ��簪)
		
		System.out.print("����� ���̴� ����Դϱ� : ");		
		int age = sc.nextInt(); //����ڰ� �Է��� ���� ������ �о���̴� �޼ҵ� 
		
		System.out.print("����� Ű�� ���Դϱ� (�Ҽ��� ù° �ڸ�����) : ");
		double height = sc.nextDouble(); // ����ڰ� �Է��� ���� �Ǽ��� �о���̴� �޼ҵ� 
		
		// xxx���� xx���̸�, Ű�� xxx.xcm�Դϴ�. 
		System.out.println(name	+ "���� " + age+"���̸�, Ű��" + height+"cm�Դϴ�.");
		
	}
		//Ű����� ���� �Է¹��� �� ���� �߻��Ǵ� ������ �˾ƺ��� 
	
		public void inputTest3() {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			//sc.nextLint() : ���ۿ��� '����' ���������� ��� ���� ������ �� 
			//				  '����'�� ����ִ� ������ �Ѵ�
			
			System.out.print("���� : ");
			int age = sc.nextInt();
			//sc.nextLine() ���� ��� �޼ҵ� : �ش� ���� �о�� �Ŀ� ���ۿ� �������� 
			// ���ۿ� �����ִ� ���͸� ����ִ� �ڵ� �߰� 
			sc. nextLine();
			//��� : sc.nextxxx()�޼ҵ� �ڿ� sc.next.Line() �޼ҵ尡 ���� �ɰ�� 
			//���ۿ� �����ִ� '����'�� ����ִ� �����̴�. �ʼ�! 
			
			System.out.print("�ּ� : ");
			String address = sc.nextLine();
						
			System.out.print("Ű : ");
			double height = sc.nextDouble();
			
			//xxx���� xx���̸�, ��� ���� xxxxxx�̰�, Ű�� xxx.xcm �Դϴ�.
			
			System.out.println(name+"���� " + age + "���̸�, ��� ���� " + address + "�̰�, Ű�� " + height+ "cm�Դϴ�.");
			System.out.printf("%s���� %d���̸�, ��� ���� %s�̰�, Ű�� %.1f�Դϴ�.", name , age , address , height);
	
		
		}
		
		public void inputTest4() {
			Scanner sc = new Scanner(System.in);
		
			// ���ڿ� �Է¹��� �� => sc.nextLine()
			// �������� �Է¹��� �� => sc.nextInt()
			//�Ǽ����� �Է¹��� �� => sc.nextDouble()
			
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			
			System.out.print("����(M/F) : ");
			//char gender = sc.nextChar(); nextChar�Ͱ��� �޼ҵ�� �������� �ʴ´�!
			//index�� 0���� �����Ѵ�. 012... ��ó�� ���� �ܾ� 0���� 1,2,3 ������ ����. 
			char gender = sc.nextLine().charAt(0);
			
			//���ڿ� "Male"���� 0��° �ε��� 'M'���� �̰� �ʹٸ�? 
			//nextLine()������ ��(.)����� charAt�� ȣ���� Ư���ε����� �ܾ �̾Ƴ���.
			//���ڿ�.charAt(�ε���) : �ش� ���ڿ��κ��� �ش� �ε����� ���ڸ� �������ִ� �޼ҵ�
			// ** �ε��� : ���� ���� ����. ��,1���ͽ��۾ƴ� !!!!!0���� �����̴�!!!!!!!!!
			
			System.out.print("���� : ");
			int age = sc.nextInt();
			
			System.out.print("Ű : ");
			double height = sc.nextDouble();
			
			/*
			 * xxx���� ��������
			 * ���� : x
			 * ���� : xx
			 * Ű : xxx.x
			 * 
			 * 
			 */
			
			// System.out.println(name + "���� ��������\n ���� : "+ gender + "\n ���� : "+ age +"\n Ű : " +height);
			
			
			System.out.println(name+"���� ��������");
			System.out.println("���� : " + gender);
			System.out.println("���� : " + age);
			System.out.println("Ű : "+ height);
			
		
		}
		// ** charAt()�޼ҵ� ����
		
		public void charAtTest() {
			String str = "Hello";
				char ch = str.charAt(0);
			
				System.out.println(ch);		//������ Ȱ���� ���
			
				System.out.println(str.charAt(4)); //����� ���ÿ� ��� 
			//charAt() �ε��� �ٷ� ��µ� ����
			//���ڼ� -1�� �ε��� ��ȣ�� 
				
				// System.out.println(str.charAt(10)); String index out of range: 10
				
		}
		/*
		 *  ** ���� **
		 *
		 *  1. �ܼ�â(�����)�� ����ϱ� ���� : System.out.print[ln]() �޼ҵ� �̿� //[]���ȣ�� ���������̶�� �ǹ� 
		 *  2. �ܼ�â(Ű����)�� �Է¹ޱ� ���� : Scanner �̿��ؼ� ( nextLing(),nextInt(),nextDouble()...)
		 *  
		 *  	>���ǻ��� ***
		 *  	1) sc.nextxxx() �޼ҵ� �ڿ� sc.nextLine()�޼ҵ尡 �;ߵ� ��� 
		 *  		sc.nextLine() �޼ҵ带 �ѹ� �� ���༭ ���ۿ� �����ִ� '����'�� ���ִ� ���� �ʼ�!! 
		 *  	2) '����' ���� �Է¹޾ƾߵ� ��� 
		 *  		sc.nextLine() �޼ҵ�� �켱 ���ڿ��� �Է¹ް� �� �ڿ� .charAt(�ε���)�޼ҵ带 ���ؼ� �����ϳ� ����
		 *  
		 */
}
