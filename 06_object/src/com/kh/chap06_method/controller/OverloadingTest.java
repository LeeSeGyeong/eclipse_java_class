package com.kh.chap06_method.controller;

public class OverloadingTest {

	//�����ε� : �� Ŭ���� ���� ���� �޼ҵ� ������ ������ �� �ִ� �� 
	
	
	public void test() {
		// �� �̸��̶�� �����ϱ� 
	}
	
	/*
	public void test() {
		
	}*/
	public void test(int a) {
		 // �Ű������� ��ġ�� �ʰų� ������ �ٲ�� 
		 // �̸��� �� �� �ִ�.(�����Ӹ� �Ŵ��� , ����Ӹ� ���� , �����Ӹ� ���� ......)
	}
	public void test(int a,String s) {
		
	}
	public void test(String s,int a) {

	}
	public void test(int a,int b) {
		
	}
}
