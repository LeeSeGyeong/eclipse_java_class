package com.kh.chap02_objectArray.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {
			
		int[] arr = new int[3];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		//for loop문
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		/*
		System.out.println(phones);
		System.out.println(phones[0]);
		phone[0].setName("아이폰"); // nullpointException 
		*/
			Phone[] phones = new Phone[3];
			/*
		phones[0]=new Phone();
		phones[1]=new Phone("아이폰","사과",1300000,"11pro");
		phones[2]=new Phone("은하수","샘송",1200000,"S20");
		*/
		phones[0].setName("벨벳폰");
		phones[0].setBrand("헬지");
		phones[0].setPrice(1000000);
		phones[0].setSeries("1");
		
		int total = 0;
		for(int i=0;i<phones.length;i++) {
			// System.out.println(phones[i].information());
			System.out.println(phones[i].getName()); //이름만 출력가능 
			total += phones[i].getPrice();	
		}
		System.out.println("총 가격 : " + total+"원");
		System.out.println("평균가 : " + total / phones.length + "원");
		
		//사용자에게ㅔ 구매하고자한하는 휴대폰명을 입력받아
		//해당 핸드폰을 찾은 후에 그 가격을 알려주도럭
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매하려는 핸드폰 : ");
		String buy = sc.nextLine();
		
		for(int i=0; i<phones.length ; i++) {
			if(phones[i].getName().equals(buy)) {
				System.out.println("당신이 구매하려는 휴대폰의 가격은 : "+phones[i].getPrice()+"원 입니다.");
			}
		}
	}
	
 }



