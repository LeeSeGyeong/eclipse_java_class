package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Product;

public class ProductRun {
		public static void main(String[] args) {
	
	// ù��° ��� : �⺻�����ڷ� ������ setter�̿��ؼ� �� �ʱ�ȭ 
	/*
	Product p = new Product();
	p.setpName("������");
	p.setPrice(100000);
	p.setBrand("�Ｚ");
	*/
	
	//�Ű����� �����ڷ� ������ ���ÿ� �� �ʱ�ȭ
	Product p = new Product("������",1200000,"�Ｚ");
	
	/*
	Product p1 = new Product();
	p1.setpName("������ SE2");
	p1.setPrice(1300000);
	p1.setBrand("����");
	*/
	
	Product p1 = new Product("������",1300000,"������");
	
	//pName : xx , price : xx, brand : xx
	//System.out.println("pName : "+p.getpName()+", price : " + p.getPrice()+", brand : " + p.getBrand());
	System.out.println(p.information());
	
	//System.out.println("pName : "+p1.getpName()+", price : " + p1.getPrice()+", brand : " + p1.getBrand());
	System.out.println(p1.information());
		}
}
