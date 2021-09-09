package com.kh.chap04_field.model.vo;

public class Run {
	

public static void main(String[] args) {
		
		// ----- FieldTest2 -----
		FieldTest2 f2 = new FieldTest2();
		
		// public : 어디서든 접근 가능
		System.out.println(f2.pub); 
		
		// protected : 같은패키지내에서 접근 가능, 다른패키지라면 상속구조에서만 접근가능
		System.out.println(f2.pro);
		
		// default : 오로지 같은 패키지내에서만 접근 가능
		System.out.println(f2.def);
		
		// private : only 해당 그 클래스에서만 접근 가능
		//System.out.println(f2.pri);

			}
				}