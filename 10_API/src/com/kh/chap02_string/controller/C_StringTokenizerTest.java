package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {

	
	public void method() {
		
		String str = "Java,Oracle,,HTML,JDBC,CSS,Spring";
		// �ĸ�(,)�� ���������ؼ� ���ڵ��� �ɰ��ְ� �ʹ� -> � �����ڸ� �̿��ؾ��ұ�?
		
		// (1) �����ڸ� �������� , ���ڿ��� �и���Ű�� ��� 2���� 
		
		// ��� 1) �и��� ���ڿ����� String[] �迭�� �������� ����� �� �� 
		//		  String class�� �����ϴ� split �޼ҵ带 �̿��Ѵ�.
		//		   ���ڿ�.split(������) : String[] ��ȯ 
		
		String[] arr = str.split(",");  
		//�޸�(,)�� �������� java,Oracle.. �ϳ��� �ɰ��� ->������ String�迭[]�� ��µ�  
		
		System.out.println("�迭�� ���� : "+ arr.length);
		
		/* for Loop��
		for(int i=0;i<arr.length;i++) {
			System.out.println(i + "��° index : " + arr[i]);
		}
		*/
		
		//���� for�� 
		int num = 0; 
		
		for(String arr1 : arr) { // �迭�� ��� ���� �ϳ��� ������� 
			 System.out.println(num++ + "��° index : " + arr1);
		}
		
		// ���2 ) �ڹٿ����� ������ StringTokenizer����ϱ� (��� ���1(split)�� ���̾�����)
		// �и��� ���ڿ����� ���� ��ū���ν� �����ϰ��� �� �� (java.util.StringTokenizer Ŭ���� import���ֱ�)
		
		// StringTokenizer stn = new StringTokenizer(�и���Ű���� �ϴ� ���ڿ� , ������);
		StringTokenizer stn = new StringTokenizer(str , ",");
		//�и��� ���ڿ�(java,Oracle...)���� ��ū���� �и��Ǿ� �ִ�.
		
		// * �и��� ���ڿ��� ���� ����ϱ� 
		System.out.println("�и��� ���ڿ��� ���� : " + stn.countTokens()); 
		
		/* 1> �ϳ��ϳ� ��¹����� ����ϴ� ��� 
		System.out.println(stn.nextToken()); //ù ��ū �� ��� 
		System.out.println(stn.nextToken()); //�� ��°
		System.out.println(stn.nextToken()); //�� ��°
		System.out.println(stn.nextToken()); //�� ��° 
		System.out.println(stn.nextToken()); //�ټ� ��°
		System.out.println(stn.nextToken()); //���� ��°
		
		System.out.println(stn.countTokens()); //��ū ���� ��� ����Ͽ����Ƿ� ��ū���� 0�̴�.
		// ��ū�� ��ȸ��(�ֹ߼�)�̴�. ����ϸ� , ����ϸ鼭 ���� �̵��ϰ� ��ū������ �����.
		
		//System.out.println(stn.nextToken());
		// NoSuchElementException �߻� ( �� ��µǾ����Ƿ� , ���̻��� ��Ұ� ������ �˷��� )
		*/
		
		
		// 2> for�� ���� ��µǴٰ� ���� ����
		
		// for(int j=0; j<stn.countTokens();j++) { 
		//	System.out.println(stn.nextToken()); 
		// }
		
		// ���� 3���� ��µȴ� ���ϱ�? ���� �帧�� �ڼ��� ���� 
		// j = 0 j < 6 true  ���("java")  	j++ 
		// j = 1 j < 5 true  ���("oracle")  J++ (�ֳĸ� ���� �Ŀ��� �ϳ��� ��������ϱ� 1�� �پ�����)
		// j = 2 j < 4 true  ���("JDBC")   	J++
		// j = 3 j < 3 false -> �ݺ����� �������´� 
		
		//�� , ��ū���� ���� ��°� �Բ� 1�� �پ���. �׷��Ƿ� ���� �� 3���� ��µǴ� ���� ( ��µǴٰ� ���� )
		
		// 3> ���� ��� 
		
		// �ذ��� 1) ��ū������ Ư�� ������ �̸� �����س��� 
		
		//int count = stn.countTokens(); //count = 6
		
		//for(int j=0; j<count;j++) { 
		//		System.out.println(stn.nextToken()); 
		//	 }
		
		// �ذ��� 2) while������ ��ū ��� 
		
		while(/*�ݺ��� ����� ����*/stn.hasMoreTokens()) { //���ڿ�.hasMoreTokens() : ���� ��ū�� �����ֳ���? true ���
			System.out.println(stn.nextToken());
		}
		
		
		
		
	}
}
