package com.kh.chap03_class.run;
import com.kh.chap03_class.model.vo.Person;

public class ClassRun {

	public static void main(String[] args) {
		
		Person mango = new Person();
		
		System.out.println("id : " + mango.getId());
		System.out.println("pwd : " +mango.getPwd());
		//생성후에 필드에 담긴값을 곧바로 알아보면 jvm초기화까지 진행해줬음 
		
		mango.setId("ILoveMango");
		mango.setPwd("1234");
		mango.setName("망고");
		mango.setAge(4);
		mango.setGender('M');
		mango.setPhone("010-1234-1234");
		mango.setEmail("mango1117@naver.com");
		
		System.out.println("id : " + mango.getId());
		System.out.println("pwd : " +mango.getPwd());
		//생성후에 필드에 담긴값을 곧바로 알아보면 jvm초기화까지 진행해줬음 
		System.out.println("이름 : " +mango.getName());
		System.out.println("나이 : " +mango.getAge());
		System.out.println("성별 : " +mango.getGender());
		System.out.println("번호 : " +mango.getPhone());
		System.out.println("email : " +mango.getEmail());
	} 
		
	
	}
	
