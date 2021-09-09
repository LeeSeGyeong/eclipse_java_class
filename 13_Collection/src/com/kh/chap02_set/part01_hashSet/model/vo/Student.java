package com.kh.chap02_set.part01_hashSet.model.vo;

public class Student {

	private String name;
	private int age;
	private int score;
	
	
	public Student() {}


	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	/*
	@Override 
	public int hashCode() { //모든 필드의 담긴 값이 일치하면 동일한 hashCode로 반환하도록 
		String str = name + age +score ; //"공유43100" //"김말똥2440"//"공유43100"
		//우선 입력되는 문자열들을 하나의 문자열로 출력되도록 합쳐줬음
		return str.hashCode();
		//문자열의 hashCode를 반환하도록해줌! (어쨌든 문자열은 값만 비교되도록 override 되어있으니까!)
	}
	
	//Student객체.equals(Student 객체) 이런식으로 호출 될거임 
	@Override
	public boolean equals(Object obj) { //현재객체와 전달받은 객체의 필드값이 일치하면 true, 일치하지않으면 false반환 
		
		//this(현재객체) 	vs  obj(전달받은 객체)
		//Student타입		  Object타입
		
		//우선 전달받은 객체에 쉽게 접근하기 위해서, Object필드를 Student type로 강제형변환 해준다
		Student other = (Student)obj;
		
		//this(현객체)	vs  other(전달받은 객체)
		//this.name	랑 other.name이 일치하는지 (문자열 비교 == .equals()이용)
		//this.age	랑 other.age이 일치하는지 (int 비교 ==비교해줌)
		//this.score 랑 other.score이 일치하는지(int비교)
		
		if(this.name.equals(other.name) && this.age == other.age && this.score == other.score) {
			return true;
		}else {
			return false;
		}*/


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		
		//this vs obj 
		
		if (this == obj)  //현재객체와 비교대상객체의 주소값이 일치할 경우(같은 곳을 참조할 꺼임 == 필드값이 일치할거임) 각 필드 하나하나 비교할필요없이 그냥 true반환 
			return true;  //주소값이 다르면 다음 조건문으로 이동
		if (obj == null)  //비교대상이 null일경우(생성된 객체가 없는 경우) , 비교할 가치도 없이 false반환
			return false; 
		if (/*this.*/getClass() != obj.getClass()) // 현 객체의 클래스타입과 비교대상객체의 클래스타입이 다를경우 비교할 가치도없이 false반환
			return false;
		//각 객체의 주소값이 다르고, 비교대상객체가 null이 아니고(정상적인 객체로 비교대상이와야하니까), 두 객체의 클래스 타입이 일치하는 경우
		//이제 본격적으로 각 필드값을 가지고 비교를 진행할 수 있다! 
		
		Student other = (Student) obj;
		if (age != other.age) //한 객체의 age 필드와 전달받은 객체의 age필드가 다를경우 false반환 
			return false;
		if (name == null) { //한 객체의 name필드가 null일경우
			if (other.name != null) //전달받은 객체의 name필드가 null이 아닐경우 false반환 
				return false;
		} else if (!name.equals(other.name)) //현 객체의 name필드가 null이 아니고, 그 문자열과 전달받은 객체의 name필드 문자열이 일치하지 않을경우 
			return false; //false반환 
		if (score != other.score) //한 객체의 score필드와 전달받은 객체의 score필드가 다를경우 
			return false; // false반환 
		
		return true; //아니라면 true반환
	}
	
	
	}

