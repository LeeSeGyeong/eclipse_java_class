package com.kh.chap02_abstractAndinterface.part01_easy.model.vo;

public abstract class Sports {
	
	private int people;
	
	public Sports() {}
	
	public Sports(int People) {
		this.people=people;
	}
	
	public int getPeople() {
		return people;
	}
	
	public void setPeople(int people) {
		this.people=people;
	}
	
	public String toString() {
		return " people : " + people;
	}
	
	
	//�߻�޼ҵ� (�̿ϼ��� �޼ҵ�,�Ӹ��� �ְ� ������ ����) ����� // abstract��� ���� �־��ֱ�
	//abstract = �̿ϼ� 
	
	public abstract void rule();
	
}
