package com.kh.chap02_abstractAndinterface.part02_basic.model.vo;

//interface�� ��ӹ޴� ����, �����Ѵٰ� �Ѵ�. (���� �ṉ̀��ѵ� �ٸ��� ����)
//���� MotherŬ���� �Ŀ����� Person�� �ʿ��ϰ� �������̽� ��ӵ� �޾ƾ��ϴ� 
//Person �ڿ� / implements(�����Ѵ�) + �������̽� ��/ �� �����ָ� ���(����)�Ϸ�! 

public class Mother extends Person implements Basic{ 
//Ŭ���� �� ���߻��(X) , �������̽��� ���߰��� �޸���(O)


	//field ����
	private String babyBirth;  //������ ź�� : ��� | �Ծ� | ���� �߿� �ϳ�
	
	//�⺻������ 
	public Mother() {
		
	}
	
	//�Ű����� ������ 
	public Mother(String name, double weight, int health, String babyBirth) {
		super(name,weight,health);
		this.babyBirth=babyBirth;
	}
	
	public void setBabyBirth(String babyBirth) {
		this.babyBirth=babyBirth;
	}
	
	public String getBabyBirth() {
		return babyBirth;
	}
	
	@Override
	public String toString() {
		return "Mother [" + super.toString() + ", babyBirth : "+ babyBirth+ "]";
	}
	
	@Override
	public void eat() {
		
		//������� �����Ը� 10 ������Ű�����Ѵ� 
		//��� �޼ҵ�(super)�� �ִ� setWeight���� �����ϸ� ������ �� �����ϱ� set���� �ҷ��´�.
		//�׷��� ������ �����Դ� ��� �˾ƿ�����? getWeight�� ��ȯ�� == ���� �����Կ� �������� �� 
		//�׷��� get�޼ҵ带 set�޼ҵ� �ȿ� �ҷ����� ���� �����԰��� �ҷ��� �� �ְ� , �ű⿡ +10�� ���ָ� �ȴ�. 
		super.setWeight(super.getWeight()+10);
		
		//������� �索������ �ǰ��� -10���ְ��� �Ѵ� 
		//����������� ���� (�����Ҽ��ִ� set���� ������ ���� �ǰ� (������ ��µ� ��ȯ���� get��) �� -10�� ���ָ� �� 
		super.setHealth(super.getHealth()-10);
	}
	
	@Override
	public void sleep() {
		
		//���ڸ� �ǰ����� +20 ���������ֱ� 
		//���� ��İ� ����
		super.setHealth(super.getHealth()+20);
		
	}
	

}
