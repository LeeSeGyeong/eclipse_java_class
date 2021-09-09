package com.kh.chap06_method.controller;

public class OverloadingTest {

	//오버로딩 : 한 클래스 내에 같은 메소드 명으로 정의할 수 있는 것 
	
	
	public void test() {
		// 내 이름이라고 생각하기 
	}
	
	/*
	public void test() {
		
	}*/
	public void test(int a) {
		 // 매개변수가 겹치지 않거나 순서가 바뀌면 
		 // 이름을 쓸 수 있다.(빨간머리 신누리 , 노란머리 누리 , 검은머리 누리 ......)
	}
	public void test(int a,String s) {
		
	}
	public void test(String s,int a) {

	}
	public void test(int a,int b) {
		
	}
}
