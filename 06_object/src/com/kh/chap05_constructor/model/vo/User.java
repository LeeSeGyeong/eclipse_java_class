package com.kh.chap05_constructor.model.vo;

public class User {

	
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	/*
	 * ������ constructor
	 * 
	 * public Ŭ������([�Ű�����,�Ű�����,...]){
	 * 
	 * }
	 * 
	 * �����ڸ� �ۼ��ϴ� ���� 
	 * 1. ��ü�� �����ϱ� ���� ���� 
	 * 2. ��ü ������ ���ÿ� �Ű������� ���޹��� ������ �ʵ忡 �ٷ� �ʱ�ȭ�� ����
	 * 
	 * * ������ �ۼ��� ���ǻ���
	 *	1. �ݵ�� �����ڸ�� Ŭ�������� �����ؾ��Ѵ�.
	 *	2. ��ȯ���� �������� ����(���� ��ȯ���� ���ԵǸ� �޼ҵ�� �ν��ع���)
	 *	3. �Ű����� �����ڸ� ��������� �ۼ��ϰ� �Ǹ� �⺻�����ڸ� JVM�� �ڵ����� ��������� ����
	 *	      ��, ����ƴ����� �⺻�����ڴ� �׻� �ۼ��ϴ� ������ ������!! 
	 * 
	 */
	
	public User() {
		// �⺻������(�谳���� ���� ������)
		// ���� ��ü �������� �������� �� �� ��� 
		//System.out.println("�̰� ����ǳ�?");
		//�⺻�����ڸ� �������� ��� => JVM�� �ڵ����� �⺻�����ڸ� �������⶧���� 
		//�׻� ��ü ���� ���� ! 
	}
	
	//�Ű����� ������ 
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
		 * ���Ͱ��� �ߺ��Ǵ� ������ �ʱ�ȭ�ϴ� ������ �����ڰ� �̹� ������ ��� 
		 * this() ������ Ȱ�� ���� 
		 * => ���� Ŭ���� ���� �����ڿ��� �Ǵٸ� ������ ȣ���ϰ��� �� �� ���� 
		 *  ** ���ǻ��� : �ݵ�� ù�ٿ� �ۼ��ؾߵ�!
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
