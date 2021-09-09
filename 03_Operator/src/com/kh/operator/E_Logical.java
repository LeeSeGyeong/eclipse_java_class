package com.kh.operator;
import java.util.Scanner;
public class E_Logical {

	/*
	 * *��������(���࿬����)
	 * �ΰ��� ������ �������ִ� ������ 
	 * �������� ��������� ������!! 
	 * 
	 * ���� && ���� : ����, ������ �Ѵ� true�� ��� ������� true (and = &&)
	 * ����|| ����  : ����, ������ �� �� �ϳ���� true�ϰ�� ������� true ( || = or )
	 * 
	 * 
	 */
	
	public void method1() {
		//����ڰ� �Է��� �������� 1���� 100������ ������ Ȯ�� 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
		// boolean result = (1 <= num <= 100); �̷� ���� ������ �ΰ��� ��������� , and�����ڷ�
		
		boolean result = (num>=1) && (num<=100); //num�� ��� ���� 1�̻� "�̰�" "�׸���" num���� 100 ������ ���
		// && �ǹ� : ~�̰�, �׸��� , ~�ϸ鼭 
		
		System.out.println("����ڰ� �Է��� ���� 1�̻� 100�����Դϱ� : " + result);
		
		//&& : �� ���� ������ ��� true���� && ������ ������� ���������� true 
		// 	�� �߿� �ϳ��� false�� ���� ��� &&������ ������� false
	}
	
		public void method2() {
			//����ڰ� �Է��� ���ڰ��� ���� �빮������ Ȯ��  //�ƽ�Ű �ڵ�ǥ���� 65~90������ ���� �빮�ڿ��� 
			Scanner sc = new Scanner(System.in);
			
			System.out.print("���� �ϳ� �Է� : ");
			char ch = sc.nextLine().charAt(0);
			
			//boolean result = (65<= ch <=90);
			//ù��° ���
			//boolean result = (ch >= 65) && (ch<= 90);
			
			//�ι�° ���
			boolean result = (ch >= 'A') && (ch <='Z');
			
			System.out.println("����ڰ� �Է��� ���� �빮���Դϱ� :" + result);
			
		}
		
		public void method3() {
			
		//����ڿ��� ������ �Է¹��� �Ŀ� �������� Ȯ��
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("���� (M/F) : ");
		char gender = sc.nextLine().charAt(0);
			
		boolean result = (gender == 'F') || (gender == 'f');
		// ||�ǹ� : ~�̰ų�,�Ǵ�
		
		System.out.println("����ڰ� �����Դϱ� : " + result);
		
		// || : �� ���� ���� �� �ϳ��� true�� �ִٸ� || ������ ������� true 
		//		�� ���� ���� ��� false�� ��� || ������ ������� false 
		
		
		
		}
		
		public void method4() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("�����Ͻ÷��� y�� �Է����ּ��� : " );
			
			char ch = sc.nextLine().charAt(0);
			
			boolean result =(ch == 'y') || (ch == 'Y');
			
			System.out.println("����ڰ� �Է��� ���� y�Ǵ� Y�Դϱ� : " + result );
			
		}
		
		
		/*
		 * 
		 * && : �� ���� ������ ��� true���߸� ������� true��(AND == ~�̰� ,�׸���,~�̸鼭,�Ӹ��ƴ϶�)
		 * 
		 *  true && true  => true 
		 *  true && false => false
		 *  false && true => false
		 *  false && false => false
		 *  
		 *  ** && �����ڸ� �������� ���� ����� false�� ��� ���� ������ ���� �������� ����!! **
		 *  
		 *  || :( �Ǵ� , �̰ų� ) �ΰ��� ���� �� �ϳ��� true��� ������� true��
		 *  
		 *  true || true  => true 
		 *  true || false => true
		 *  false || true => true
		 *  false || false => false
		 *  
		 *  ** || �����ڸ� �������� ���� ����� true�� ��� ����  ������ ���� �������� ����!! ** 
		 *  java�� ���ʿ��� ������ ���� �ʴ´� 
		 *  
		 */
		
		//���� && ������ ���� ���� false��� ���� ������ �����ұ�?
		
		public void method5() {
			int num = 10;
			boolean result1 = (num>5) && (++num > 0 );
			
			System.out.println("result1 : " + result1);
			System.out.println("&& ���� ���� num : " + num );
			
			//���� ���� false��� ���� ������ �����ǹǷ� num�� ���� ++���� �ʴ´�.
			//�ٸ� , ���� ���� true��� ���� ������ ����Ǿ� num�� ���� +1�� �ȴ�. 
			
			int num2 = 10;
			boolean result2 = (num2 < 20) || (++num2 > 0);
			
			//boolean result2 = true || (++num2 > 0); // Dead code 
			
			System.out.println("result1 : " + result2);
			System.out.println("||���� ���� num2 : " + num2);
			
			//���� ���� true�̹Ƿ� ���� ++num2���� ������� �ʴ´�. 
			
			
		}
		
		
	
}
