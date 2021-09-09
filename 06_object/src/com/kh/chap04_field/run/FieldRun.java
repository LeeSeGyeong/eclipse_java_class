package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest1;
import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;

public class FieldRun {
	
public static void main(String[] args) {
		
		// ----- FieldTest1 -----
		/*
		FieldTest1 f1 = new FieldTest1();
		f1.test(5);
		*/
		
		// ----- FieldTest2 -----
		/*
		FieldTest2 f2 = new FieldTest2();
		
		// public : 어디서든 접근 가능
		System.out.println(f2.pub); 
		
		// protected : 같은패키지내에서 접근 가능, 다른패키지라면 상속구조에서만 접근가능
		//System.out.println(f2.pro);
		
		// default : 오로지 같은 패키지내에서만 접근 가능
		//System.out.println(f2.def);
		
		// private : only 해당 그 클래스에서만 접근 가능
		//System.out.println(f2.pri);
		*/
		
		
		// ----- FieldTest3 -----
		System.out.println(FieldTest2.sta);
		System.out.println(FieldTest3.sta);
		
		FieldTest3.sta = "ㅋㅋㅋ";
		System.out.println(FieldTest3.sta);
		
		System.out.println(FieldTest3.STA_FIN);
		//FieldTest3.STA_FIN = "ㅎㅎㅎ"; // 변경불가
		
		System.out.println(Math.PI);
		//Math.PI = 2.53;
		
		System.out.println(Math.random());
		
	 }
}

