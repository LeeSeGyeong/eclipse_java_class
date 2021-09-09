package com.kh.chap02_objectArray.run;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ArrayListRun {

	public static void main(String[] args) {
		
		
		
		ArrayList<Phone> list = new ArrayList<Phone>();
		
		list.add(new Phone());
		list.add(new Phone("������","���",1300000,"11pro"));
		list.add(new  Phone("���ϼ�","����",1200000,"s20"));
		
		/*
		list.get(0).setName("������");
		list.get(0).setBrand("����")
		list.get(0).setPrice(1200000);
		
		*/
		
		//set ������
		list.set(0, new Phone("������","����",1200000,"1"));
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).information());
		}
		
		System.out.println("======== for-each =======");
		
		for(Phone ph : list) {
			System.out.println(ph.information());
		}
		
		//sub
		List<Phone> sub = list.subList(0, 2);
		
		//addAll
		//System.out.println("======= addAll =======");
		//list.addAll(sub);
		//���� �޼ҵ忡 sub�� ��� �߰� 
		
		for(Phone ph : list) {
		System.out.println(ph.information());
		}
		
		System.out.println("======= 0 index =======");
		Phone p = list.get(0);
		System.out.println(p.information());
		
		System.out.println("======= Ư�� type =======");
		System.out.println(list.get(1).getName());
		
		int total =0;
		
		for(int j=0;j<list.size();j++) {
			System.out.println(list.get(j).information());
			total += list.get(j).getPrice();
		}
		
	 System.out.println("�� ���� : "+ total +"��");	
	 System.out.println("��հ� : "+ total/list.size() +"��");
	
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.print("�����ϰ����ϴ� �޴��� : ");
	 String buy = sc.nextLine();
	 /*
	 for(int i=0;i<list.size();i++) {
		 if(list.get(i).getName().equals(buy)) {
			 System.out.println("����� �����ϰ����ϴ� �޴����� ������"+ list.get(i).getPrice()+"�� �Դϴ� ^^");
		 }
			 }
		 */
	 for(Phone ph:list) {
		 if(ph.getName().equals(buy)) {
			 System.out.println("�� �޴����� ������ "+ph.getPrice()+"�� �Դϴ� ^*^");
		 }
	 }
	 
	}
	
	
	}
	
 