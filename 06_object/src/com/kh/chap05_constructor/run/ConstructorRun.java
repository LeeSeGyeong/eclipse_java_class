package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {

		//System.out.println(u.information());
		//�� �ʵ忡 jvm�� �ʱⰪ���� ������� ! 
		
		User u = new User();
		// public User () 
		/*
		User u2 = new User();
		u2.setUserId("user02");
		u2.setUserPwd("pass02");
		u2.setUserName("���߶�");
		*/
		/*
		User u2 = new User("user02","pass02","���߶�");
		System.out.println(u2.information());
		System.out.println("==== userName ���� ==== ");
		u2.setUserName("���߶���");
		System.out.println(u2.information());
		
		System.out.println("==== next user ==== ");
		
		u.setUserId("Love mango");
		u.setUserPwd("mango");
		u.setUserName("�̸���");
		u.setAge(4);
		u.setGender('m');
		*/
		
		/*
		System.out.println("UserId : " + u.getUserId());
		System.out.println("UserPwd : " +u.getUserPwd());
		System.out.println("UserName : " +u.getUserName());
		System.out.println("age : " +u.getAge());
		System.out.println("gender : " +u.getGender());
		*/
		
		//System.out.println(u.information());
		
		//�Ű����� 5��¥�� �����ڷ� ��ü ���� �� ���� ��� 
		
		User u3 = new User("user03","pass03","����",3,'��');
		System.out.println(u3.information());
		
	}

}
