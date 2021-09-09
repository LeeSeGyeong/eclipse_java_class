package com.kh.chap05_constructor.model.vo;

public class User {

	
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	/*
	 * 생성자 constructor
	 * 
	 * public 클래스명([매개변수,매개변수,...]){
	 * 
	 * }
	 * 
	 * 생성자를 작성하는 목적 
	 * 1. 객체를 생성하기 위한 목적 
	 * 2. 객체 생성과 동시에 매개변수로 전달받은 값들을 필드에 바로 초기화할 목적
	 * 
	 * * 생성자 작성시 주의사항
	 *	1. 반드시 생성자명과 클래스명이 동일해야한다.
	 *	2. 반환형이 존재하지 않음(만일 반환형을 쓰게되면 메소드로 인식해버림)
	 *	3. 매개변수 생성자를 명시적으로 작성하게 되면 기본생성자를 JVM이 자동으로 만들어주지 않음
	 *	      즉, 어찌됐던간에 기본생성자는 항상 작성하는 습관을 들이자!! 
	 * 
	 */
	
	public User() {
		// 기본생성자(배개변수 없는 생성자)
		// 단지 객체 생성만을 목적으로 할 때 사용 
		//System.out.println("이게 실행되나?");
		//기본생성자를 생략했을 경우 => JVM이 자동으로 기본생성자를 만들어줬기때문에 
		//항상 객체 생성 가능 ! 
	}
	
	//매개변수 생성자 
	public User(String userId,String userPwd,String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	
	public User(String userId,String userPwd,String userName, int age, char gender) {
		/*
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		*/	
		this(userId,userPwd,userName);		
		/*
		 * 위와같이 중복되는 동일한 초기화하는 내용의 생성자가 이미 존재할 경우 
		 * this() 생성자 활용 가능 
		 * => 같은 클래스 내에 생성자에서 또다른 생성자 호출하고자 할 때 사용됨 
		 *  ** 유의사항 : 반드시 첫줄에 작성해야됨!
		 */		
		this.age = age;
		this.gender = gender;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	
	public String getUserId() {
		return userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	
	public String information() {
		return "userId : " + userId + "\nuserPwd : " + userPwd + "\nuserName : "+ userName + 
				"\nage : "+ age + "\ngender : " + gender;
	}
}
