package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {

		//System.out.println(u.information());
		//각 필드에 jvm의 초기값들이 담겨있음 ! 
		
		User u = new User();
		// public User () 
		/*
		User u2 = new User();
		u2.setUserId("user02");
		u2.setUserPwd("pass02");
		u2.setUserName("꼬야람");
		*/
		/*
		User u2 = new User("user02","pass02","꼬야람");
		System.out.println(u2.information());
		System.out.println("==== userName 수정 ==== ");
		u2.setUserName("꼬야람꼬");
		System.out.println(u2.information());
		
		System.out.println("==== next user ==== ");
		
		u.setUserId("Love mango");
		u.setUserPwd("mango");
		u.setUserName("이망고");
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
		
		//매개변수 5개짜리 생성자로 객체 생성 후 정보 출력 
		
		User u3 = new User("user03","pass03","포미",3,'여');
		System.out.println(u3.information());
		
	}

}
