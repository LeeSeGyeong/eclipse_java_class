package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProdectTest {

	public static void main(String[] args) {
		// 객체 생성 
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
	
		
		//setter 메소드 대입 
		p1.setProductId("ssgnote9");
		p1.setProductName("갤럭시노트9"); 
		p1.setProductArea("경기도 수원");
		p1.setPrice(960000);
		p1.setTax(10.0);
		
		p2.setProductId("lgxnote5");
		p2.setProductName("LG스마트폰5"); 
		p2.setProductArea("경기도 평택");
		p2.setPrice(780000);
		p2.setTax(0.7);
		
		p3.setProductId("ktsnote3");
		p3.setProductName("KT스마트폰3"); 
		p3.setProductArea("서울시 강남");
		p3.setPrice(250000);
		p3.setTax(0.3);
		
		
		//메소드 출력 
		System.out.println(p1.information());
		System.out.println(p2.information());
		System.out.println(p3.information());
		System.out.println("====================================");
	
	
		
		//setter 수정값 메소드 대입 
		p1.setProductId("ssgnote9");
		p1.setProductName("갤럭시노트9"); 
		p1.setProductArea("경기도 수원");
		p1.setPrice(1200000);
		p1.setTax(0.05);
		
		p2.setProductId("lgxnote5");
		p2.setProductName("LG스마트폰5"); 
		p2.setProductArea("경기도 평택");
		p2.setPrice(1200000);
		p2.setTax(0.05);
		
		p3.setProductId("ktsnote3");
		p3.setProductName("KT스마트폰3"); 
		p3.setProductArea("서울시 강남");
		p3.setPrice(1200000);
		p3.setTax(0.05);
		
		
		//메소드 출력 
		System.out.println(p1.information());
		System.out.println(p2.information());
		System.out.println(p3.information());
		System.out.println("====================================");
	
		System.out.println(p1.result());
		System.out.println(p2.result());
		System.out.println(p3.result());
	}
	
		
		
		
	}
