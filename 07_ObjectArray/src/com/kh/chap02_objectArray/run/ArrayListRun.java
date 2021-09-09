package com.kh.chap02_objectArray.run;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ArrayListRun {

	public static void main(String[] args) {
		
		
		
		ArrayList<Phone> list = new ArrayList<Phone>();
		
		list.add(new Phone());
		list.add(new Phone("아이폰","사과",1300000,"11pro"));
		list.add(new  Phone("은하수","샘송",1200000,"s20"));
		
		/*
		list.get(0).setName("벨벳폰");
		list.get(0).setBrand("엘쥐")
		list.get(0).setPrice(1200000);
		
		*/
		
		//set 수정문
		list.set(0, new Phone("벨벳폰","엘쥐",1200000,"1"));
		
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
		//기존 메소드에 sub를 모두 추가 
		
		for(Phone ph : list) {
		System.out.println(ph.information());
		}
		
		System.out.println("======= 0 index =======");
		Phone p = list.get(0);
		System.out.println(p.information());
		
		System.out.println("======= 특정 type =======");
		System.out.println(list.get(1).getName());
		
		int total =0;
		
		for(int j=0;j<list.size();j++) {
			System.out.println(list.get(j).information());
			total += list.get(j).getPrice();
		}
		
	 System.out.println("총 가격 : "+ total +"원");	
	 System.out.println("평균가 : "+ total/list.size() +"원");
	
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.print("구매하고자하는 휴대폰 : ");
	 String buy = sc.nextLine();
	 /*
	 for(int i=0;i<list.size();i++) {
		 if(list.get(i).getName().equals(buy)) {
			 System.out.println("당신이 구매하고자하는 휴대폰의 가격은"+ list.get(i).getPrice()+"원 입니다 ^^");
		 }
			 }
		 */
	 for(Phone ph:list) {
		 if(ph.getName().equals(buy)) {
			 System.out.println("그 휴대폰의 가격은 "+ph.getPrice()+"원 입니다 ^*^");
		 }
	 }
	 
	}
	
	
	}
	
 