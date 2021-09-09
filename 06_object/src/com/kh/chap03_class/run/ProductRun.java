package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Product;

public class ProductRun {
		public static void main(String[] args) {
	
	// 첫번째 방법 : 기본생성자로 생성후 setter이용해서 값 초기화 
	/*
	Product p = new Product();
	p.setpName("갤럭시");
	p.setPrice(100000);
	p.setBrand("삼성");
	*/
	
	//매개변수 생성자로 생성과 동시에 값 초기화
	Product p = new Product("갤럭시",1200000,"삼성");
	
	/*
	Product p1 = new Product();
	p1.setpName("아이폰 SE2");
	p1.setPrice(1300000);
	p1.setBrand("애플");
	*/
	
	Product p1 = new Product("아이폰",1300000,"아이폰");
	
	//pName : xx , price : xx, brand : xx
	//System.out.println("pName : "+p.getpName()+", price : " + p.getPrice()+", brand : " + p.getBrand());
	System.out.println(p.information());
	
	//System.out.println("pName : "+p1.getpName()+", price : " + p1.getPrice()+", brand : " + p1.getBrand());
	System.out.println(p1.information());
		}
}
