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
	public int hashCode() { //��� �ʵ��� ��� ���� ��ġ�ϸ� ������ hashCode�� ��ȯ�ϵ��� 
		String str = name + age +score ; //"����43100" //"�踻��2440"//"����43100"
		//�켱 �ԷµǴ� ���ڿ����� �ϳ��� ���ڿ��� ��µǵ��� ��������
		return str.hashCode();
		//���ڿ��� hashCode�� ��ȯ�ϵ�������! (��·�� ���ڿ��� ���� �񱳵ǵ��� override �Ǿ������ϱ�!)
	}
	
	//Student��ü.equals(Student ��ü) �̷������� ȣ�� �ɰ��� 
	@Override
	public boolean equals(Object obj) { //���簴ü�� ���޹��� ��ü�� �ʵ尪�� ��ġ�ϸ� true, ��ġ���������� false��ȯ 
		
		//this(���簴ü) 	vs  obj(���޹��� ��ü)
		//StudentŸ��		  ObjectŸ��
		
		//�켱 ���޹��� ��ü�� ���� �����ϱ� ���ؼ�, Object�ʵ带 Student type�� ��������ȯ ���ش�
		Student other = (Student)obj;
		
		//this(����ü)	vs  other(���޹��� ��ü)
		//this.name	�� other.name�� ��ġ�ϴ��� (���ڿ� �� == .equals()�̿�)
		//this.age	�� other.age�� ��ġ�ϴ��� (int �� ==������)
		//this.score �� other.score�� ��ġ�ϴ���(int��)
		
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
		
		if (this == obj)  //���簴ü�� �񱳴��ü�� �ּҰ��� ��ġ�� ���(���� ���� ������ ���� == �ʵ尪�� ��ġ�Ұ���) �� �ʵ� �ϳ��ϳ� �����ʿ���� �׳� true��ȯ 
			return true;  //�ּҰ��� �ٸ��� ���� ���ǹ����� �̵�
		if (obj == null)  //�񱳴���� null�ϰ��(������ ��ü�� ���� ���) , ���� ��ġ�� ���� false��ȯ
			return false; 
		if (/*this.*/getClass() != obj.getClass()) // �� ��ü�� Ŭ����Ÿ�԰� �񱳴��ü�� Ŭ����Ÿ���� �ٸ���� ���� ��ġ������ false��ȯ
			return false;
		//�� ��ü�� �ּҰ��� �ٸ���, �񱳴��ü�� null�� �ƴϰ�(�������� ��ü�� �񱳴���̿;��ϴϱ�), �� ��ü�� Ŭ���� Ÿ���� ��ġ�ϴ� ���
		//���� ���������� �� �ʵ尪�� ������ �񱳸� ������ �� �ִ�! 
		
		Student other = (Student) obj;
		if (age != other.age) //�� ��ü�� age �ʵ�� ���޹��� ��ü�� age�ʵ尡 �ٸ���� false��ȯ 
			return false;
		if (name == null) { //�� ��ü�� name�ʵ尡 null�ϰ��
			if (other.name != null) //���޹��� ��ü�� name�ʵ尡 null�� �ƴҰ�� false��ȯ 
				return false;
		} else if (!name.equals(other.name)) //�� ��ü�� name�ʵ尡 null�� �ƴϰ�, �� ���ڿ��� ���޹��� ��ü�� name�ʵ� ���ڿ��� ��ġ���� ������� 
			return false; //false��ȯ 
		if (score != other.score) //�� ��ü�� score�ʵ�� ���޹��� ��ü�� score�ʵ尡 �ٸ���� 
			return false; // false��ȯ 
		
		return true; //�ƴ϶�� true��ȯ
	}
	
	
	}

