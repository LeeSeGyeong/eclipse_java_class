package com.kh.chap02_string.controller;

public class A_StringPoolTest {

	public void method1() {
		
		//1) �����ڸ� ���� ���ڿ� ���� (��ü�����ϵ��� ���ڿ� ���԰���)
		String str1 = new String("hello");
		String str2 = new String("hello");
		//1-1) ��� 
		// Question ) �׷��� ��ü�� �ּҰ����ٵ� str1 ,str2�� �ּҰ� Box�� ��µ��� ������?
		System.out.println(str1);
		System.out.println(str2);
		// answer) StringŬ������ toString�޼ҵ尡 �̹� �������̵� �Ǿ��ֱ� ������ ���ڿ��� �ٷ� ��µȴ�!
		//		      ���� ��� ���ڿ��� ��ȯ�ǵ���
		
		
		//2) ����� 
		//�� ���ڿ��� �����ϱ� ���ڿ��� ���ϸ�, true�� ���;��Ѵ�
		System.out.println(str1 == str2); //false (�ּҰ� �񱳶�)
		System.out.println(str1.equals(str2)); //true 
		//StringŬ������ equals�޼ҵ尡 �̹� �������̵� �Ǿ����� ( �ּҰ� �� X , ������ ��� ���ڿ� �� O)
		
		
		
		//3) �ּҰ��� 10������ ������ִ� �� ����غ��� 
		//( �ΰ��� �ּҰ��� �ٸ��ϱ� �ٸ����� �������� ? )
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode()); 
		// ������ ���� �ּҰ��� �ٸ���. �׷���..���� ���� ��µ�...���ϱ�....?
		//StringŬ������ hashCode�޼ҵ� �̹� �������̵� �Ǿ����� ! (������� ���� ����ǵ��� ������ �Ǿ�����)
		
		
		//���� �� ��� ��� objectŬ�������� ��ӹ޴� toString���ؼ� ������ �Ǿ��ִ�! 
		
		
		//Question) ��¥ �ּҰ��� �˰�;�! 
		//answer ) �׷��ٸ� System.identityHashCode(���� �ñ��� �ߴ� ���۷���)�� �̿��ϸ� �˴ϴ� 
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2)); // ��¥ �ּҰ� ��µ� 
		
		
	}
	
		public void method2() {
		
			String str = new String("Hello"); // Heap�� ��ü ���� �� -> Hello �Ҵ�
			
			//2. ���ڿ��� ���ͷ������� ����
			String str1 = "hello"; // Heap�̶�� ���� �ȿ� StringPool(���Ǯ)�̶�� �������ִ�.
			String str2 = "hello"; // ���ͷ� ������ ���� �����ϸ� , StringPool�� ��ü���� -> �ּҰ��� �ο��ȴ�
			
			// String Pool�� Ư¡ : StringPool���� ������ ���ڿ��� ���� �� ����.
			// �׷��Ƿ� , str2�� ������ �ִ� ���ͷ����� str1�� ���� ���ڿ��� �����Ѵ�.
			
			String str3 = "hi";
			
			//String str3 = "hi" -> String str3 = "bye"�� �ٲٰ�;�� 
			
			//	** String Ŭ���� == �Һ�Ŭ����(������ �ʴ� Ŭ����)
			//	��¥ ������ �ʴ��� Ȯ���غ��� 
			//  ��Ȯ�� ���ϸ�, ������ ���������� �ٷ� �����Ǵ� ������ �ƴ� ! 
			
			System.out.println(System.identityHashCode(str3)); //��¥ �ּҰ��� Ȯ���ϱ� 
			
			//������ str3�� �����ϴ� ��("hi"�� ��� ��ü)�� ���̻� �������� �ʰ� , 
			//���� "bye"�� ���� ��ü�� �����ǰ� -> str3�� "bye"�� �ּҰ�(���ο� ��)�� �����Ѵ�. 
			str3 = "bye";
			System.out.println(System.identityHashCode(str3)); //�ּҰ��� ����Ǿ���.
			
			str3="hello";
			//������ �����Ǿ��ִ� "hello"�� str3�� �����Ѵٸ�?
			//�̹� �ִ°� str3�� �����Ѵٸ� , str1,str2,str3�� ��� ���� �ּҰ��� �����ϰ� �ȴ�!
			
			System.out.println(str1);
			System.out.println(str2);
			
			System.out.println(str1.hashCode());
			System.out.println(str2.hashCode());
			
			System.out.println(str1 == str2); //true (���ڿ� �������� �ּҰ��� ��ġ��)
			
			//��¥ �ּҵ� ��ġ�ұ�?
			//��¥ �ּҰ� �˾Ƴ��� identity hashcode�� �˾ƺ��� 
			
			System.out.println(System.identityHashCode(str1)); 
			System.out.println(System.identityHashCode(str2)); //�� �� �ּҰ��� ��ġ�Ѵ� 
			System.out.println(System.identityHashCode(str));  // ��(str)�� str1,str2�� �ּҰ��� �ٸ��� 
			
			
			
			
			
	}
}
