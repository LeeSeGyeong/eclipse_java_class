package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProdectTest {

	public static void main(String[] args) {
		// ��ü ���� 
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
	
		
		//setter �޼ҵ� ���� 
		p1.setProductId("ssgnote9");
		p1.setProductName("�����ó�Ʈ9"); 
		p1.setProductArea("��⵵ ����");
		p1.setPrice(960000);
		p1.setTax(10.0);
		
		p2.setProductId("lgxnote5");
		p2.setProductName("LG����Ʈ��5"); 
		p2.setProductArea("��⵵ ����");
		p2.setPrice(780000);
		p2.setTax(0.7);
		
		p3.setProductId("ktsnote3");
		p3.setProductName("KT����Ʈ��3"); 
		p3.setProductArea("����� ����");
		p3.setPrice(250000);
		p3.setTax(0.3);
		
		
		//�޼ҵ� ��� 
		System.out.println(p1.information());
		System.out.println(p2.information());
		System.out.println(p3.information());
		System.out.println("====================================");
	
	
		
		//setter ������ �޼ҵ� ���� 
		p1.setProductId("ssgnote9");
		p1.setProductName("�����ó�Ʈ9"); 
		p1.setProductArea("��⵵ ����");
		p1.setPrice(1200000);
		p1.setTax(0.05);
		
		p2.setProductId("lgxnote5");
		p2.setProductName("LG����Ʈ��5"); 
		p2.setProductArea("��⵵ ����");
		p2.setPrice(1200000);
		p2.setTax(0.05);
		
		p3.setProductId("ktsnote3");
		p3.setProductName("KT����Ʈ��3"); 
		p3.setProductArea("����� ����");
		p3.setPrice(1200000);
		p3.setTax(0.05);
		
		
		//�޼ҵ� ��� 
		System.out.println(p1.information());
		System.out.println(p2.information());
		System.out.println(p3.information());
		System.out.println("====================================");
	
		System.out.println(p1.result());
		System.out.println(p2.result());
		System.out.println(p3.result());
	}
	
		
		
		
	}
