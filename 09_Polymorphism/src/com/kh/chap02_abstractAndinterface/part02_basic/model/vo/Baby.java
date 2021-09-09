package com.kh.chap02_abstractAndinterface.part02_basic.model.vo;

public class Baby extends Person implements Basic{
	
	
	//�⺻������ 
	public Baby() {
		
	}
	
	//�Ű����� ������ 
	public Baby(String name,double weight,int health) {
		super(name,weight,health);
	}
	
	//toString�޼ҵ�
	
	public String toString() {
		return "Baby [ " + super.toString() +"]";
	}

	
	//��Դ� �� , ���ڴ� �� �����ؾ��� -> �ٵ� ���� �޼ҵ�� ǥ���ϰ� �;��
	//�׷�, �����ϰ��� �ϴ� �޼ҵ带 �θ�޼ҵ忡 �߻�޼ҵ�� ���Ӱ� ����� �ְ�
	//�� ���θ��� �޼ҵ带 �ڽ�Ŭ������ �����ϸ� 
	//�������̵��Ǹ鼭 �Ʊ⿡�� ��Դ°�, �������� ��Դ°� ���� �����޼ҵ������ �ٸ����� ��µȴ�.
	
	@Override
	public void eat() {
		//������� ������ 3���� //MotherŬ�������� �� �� �� ������ ���
		super.setWeight(super.getWeight()+3);
		
		//������� �ǰ��� 1���� 
		super.setHealth(super.getHealth()+1);
	}

	@Override
	public void sleep() {
		// ���ڸ� �ǰ��� 3���� 
		super.setHealth(super.getHealth()+3);
	}
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
}
