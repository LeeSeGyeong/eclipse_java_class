package com.kh.chap03_wrapper.run;

public class wrapperRun {
	
	public static void main(String args[]) {
		
		
		/*
		 * * wrapper Ŭ���� : �ڷ����� �ƴ϶� Ŭ������!
		 *   => �⺻ �ڷ����� ��ü�� ������ �� �ִ� Ŭ������ ����Ŭ����(wrapper Ŭ����)�̴�.
		 *
		 *
		 *	    �⺻�ڷ��� 		<-->   wrapper class
		 *		boolean				Boolean
		 *		char				Character 	(* Ư���� class��)
		 *		byte				Byte
		 *		short				Short
		 *		int					Integer		(* Ư���ϰ� ���־� )
		 *		long				Long
		 *		float				Float
		 *		double				Double 		(* ��Ȯ�� �ڷ� ��������)
		 *
		 *		
		 *		=> ��������?
		 *		1) �⺻�ڷ����� ��ü�� ����ؾ��� ��
		 *		2) �޼ҵ� ȣ���ؾ��� �� 
		 *		3) �żҵ��� �Ű������� �⺻�ڷ����� �ƴ� ��üŸ�Ը��� �䱸�� �� 
		 *		4) �������� �����Ű�� ���� �� 
		 *		
		 */
		
			//Boxing : �⺻�ڷ��� => wrapperŬ���� �ڷ��� 
			int num1 = 10;
			int num2 = 15;
			
			//System.out.println(num1.equals(num2)); 
			//�⺻�ڷ������δ� equals�޼ҵ� �� X �޼ҵ尡 �ƴϴϱ�
			
			// 1. ��ü ���� ������ ���� ��� 
			Integer i1 = new Integer(num1);  // num1 = i1
			Integer i2 = new Integer(num2);	 // num2 = i2
			
			
			// 1 - 1) ����غ��� �ּҰ����(X) , ���ڰ��� ��µȴ�(overriding �Ǿ�����)
			System.out.println(i1);
			System.out.println(i2);
			
			System.out.println(i1 == i2); //false
			
			// ��üȭ ��Ű�� �޼ҵ� ȣ�� ���� 
			
			System.out.println(i1.equals(i2)); 		//��üȭ ������ �ȵƴ� equals�񱳰� �����ϰ� �� 
			System.out.println(i1.compareTo(i2));	// i1�� i2 �� ���� ���ϴ� ���� 
			// ������ ũ�� 1 / �ڰ� ũ�� -1 / ������ 0
			
			
			// 2. ��ü�������� �ʰ� ��ٷ� �����ϴ� ��� (AutoBoxing)
			Integer i3 = num1; //���� ����ȯ �����������, ���������� �ڵ�����ȯ �� 
			System.out.println(i3);
		
			
			//3. Ư�����̽�
			
			// 2�� �����ϳ� 2���� ���� �Ǵ°� �ƴϾ�?
			// 2���� �ȵǰ� 1������ ����ϴ� ��찡 ���ܼ�..
			// �� , ��ü������ ���ؼ� �ݵ�� ��ȯ�ؾ��ϴ� ��� ! -> ���ڿ��� IntegerŸ������ 
			
			//Integer i4 = "123"; error
			Integer i4 = new Integer("123"); // ���ڿ� "123"�� -> ���� 123���� �ٲ��� 
			System.out.println(i4);
			
			
			
			
			//UnBoxing : WrapperŬ���� �ڷ����� -> �⺻�ڷ������� �ٲ��ֱ� 
			
			// ��� 1 : �ش� wrapperŬ�������� �����ϴ� xxxValue() �޼ҵ带 ���ؼ� �⺻�ڷ������� ���氡���ϴ�
			int num3 = i3.intValue(); // i3 => num3 �� ���� 
			int num4 = i4.intValue(); // i4 => num4 �� ����
			
			// ��� 2 : �޼ҵ� ������� �ʰ� �ٷ� �����ϴ� ���(AutoUnBoxing)
			int num5 = i1;
			
			
			System.out.println("===========================");
			
			
			// String�� �⺻�ڷ������� �����ؾ��ϴ� ��찡 ���ֻ���� ������ wrapperŬ������ ����Ѵ� ! 
			// EX) ȸ�������� �ϴ� ��쿡 , ���̸� ���ڷ� �Է������� �ᱹ�� ���ڿ��� �޾����� ��ȯ�Ǳ� ������ ��ȯ����� �Ѵ�.
			
			//*** �ſ�ſ�ſ�ſ�ſ� �߿��� ���������������־��� *** 
			// 1) String <--> �⺻�ڷ���  (wrapper��.parsxxx())
			
			String str1 = "10";
			String str2 = "15.3";
			
			// String  <-->  �⺻�ڷ���  
			// "10"  		(int��) 10
			//"15.3"		(double��) 15.3
			
			// wrapperŬ������.parseXXX() : ����ϸ� �⺻�ڷ���(int,double..)���� ��ȯ���� 
			
			int i = Integer.parseInt(str1); 		//���������� ��ȯ��
			double d = Double.parseDouble(str2);	//�Ǽ������� ��ȯ�� 
			
			System.out.println(i+d); //��ȯ �Ϸ� ! �������� ������ ����ȴ�.
			
			
			// 2) �⺻�ڷ����� String���� ��ȯ (��ġ �ʾ�)
			
			String strI = String.valueOf(i);
			String strD = String.valueOf(d);
			
			
			
			
		
	}
}
