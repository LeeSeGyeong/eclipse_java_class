package com.kh.chap02_encapsulation.run;

import com.kh.chap02_encapsulation.model.vo.Student;

public class EncapsulationRun {
	
		
		/*
		 *  7. ĸ��ȭ �������� �����ؼ� �Ϻ��� Ŭ������ ���¸� ���߰Բ� !! 
		 *  
		 *  * ĸ��ȭ : �߻�ȭ�� ���� ���ǵ� �Ӽ���� ��ɵ��� �ϳ��� ���� �����ϴ� ����� �ϳ��� 
		 *  		  Ŭ���������� ���� �߿��� ������"������ ���� ����"�� ��Ģ���� 
		 *  		  �ܺηκ��� " �������� ���� ������ ����" 
		 *  		  ��ſ� �����͸� ���������γ��� ó��(���� ����, ���� �����شٰų�)�� �޼ҵ�� Ŭ���� ���ο� �ۼ��ؼ� �����ϴ� ���
		 *  
		 *  1) �������� : private 
		 *     ���� ������ ���� ���� private��� ���� ������ ��� 
		 *     
		 *  2) setter/getter �޼ҵ�
		 *     private �ϴ� ���� �ʵ忡 ���� �Ұ���
		 *     setter�޼ҵ� : �ش� �ʵ忡 ���Խ�Ű�����ϴ� �� ���޹޾� �ش� �ʵ忡 ���Խ����ִ� 
		 *     getter�޼ҵ� : �ش� �ʵ忡 ��䰪�� ��ȯ���ִ� �޼ҵ�  
		 */
	public static void main(String[] args) {
	
		Student hong = new Student();
		
		/*
		hong.name ="ȫ�浿";
		hong.age = 20;
		hong.height=162.3;
		hong.korScore=100;
		hong.mathScore=90;
		*/
		
		hong.setName("ȫ�浿");
		hong.setAge(20);
		hong.setHeight(162.3);
		hong.setKorScore(100);
		hong.setMathScore(90);
		
		System.out.println(hong.getName());
		System.out.println(hong.getAge());
		System.out.println(hong.getHeight());
		System.out.println(hong.getKorScore());
		System.out.println(hong.getMathScore());
		
		//���������ζ� private�� ������ �� �ִ� �޼ҵ尡 �ʿ���
	
		hong.setAge(21);
		
	
	}
}
