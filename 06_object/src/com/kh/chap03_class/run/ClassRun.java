package com.kh.chap03_class.run;
import com.kh.chap03_class.model.vo.Person;

public class ClassRun {

	public static void main(String[] args) {
		
		Person mango = new Person();
		
		System.out.println("id : " + mango.getId());
		System.out.println("pwd : " +mango.getPwd());
		//�����Ŀ� �ʵ忡 ��䰪�� ��ٷ� �˾ƺ��� jvm�ʱ�ȭ���� ���������� 
		
		mango.setId("ILoveMango");
		mango.setPwd("1234");
		mango.setName("����");
		mango.setAge(4);
		mango.setGender('M');
		mango.setPhone("010-1234-1234");
		mango.setEmail("mango1117@naver.com");
		
		System.out.println("id : " + mango.getId());
		System.out.println("pwd : " +mango.getPwd());
		//�����Ŀ� �ʵ忡 ��䰪�� ��ٷ� �˾ƺ��� jvm�ʱ�ȭ���� ���������� 
		System.out.println("�̸� : " +mango.getName());
		System.out.println("���� : " +mango.getAge());
		System.out.println("���� : " +mango.getGender());
		System.out.println("��ȣ : " +mango.getPhone());
		System.out.println("email : " +mango.getEmail());
	} 
		
	
	}
	
