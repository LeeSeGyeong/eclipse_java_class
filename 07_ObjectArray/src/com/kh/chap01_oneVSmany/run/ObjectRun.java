package com.kh.chap01_oneVSmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVSmany.model.vo.Book;

public class ObjectRun {
	public static void main(String[] args) {
		
		//복습시간
		
		
		
		//방법1. 기본생성자로 생성 후 setter메소드를 이용해서 값 초기화 
		/*
		 * Book b1 = new Book(); //control누르고 마우스 대면 뭐가 호출되는지 알려줌 
		b1.setTitle("C언어");
		b1.setAuthor("세경");
		b1.setPrice(100000);
		b1.setPublisher("망고출판사");
		*/
		
		//2. 매개변수 생성자를 통해서 아싸리 생성과 동시에 값 초기화
		//Book bk = new Book("자바의 정석","이세경",10000,"망고네 하우스");
		
		//[응용] 사용자에게 입력받은 값으로 객체 생성 후 초기화 
		
		Scanner sc = new Scanner(System.in);
		
		/* 스캐너로 출력받기 
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		System.out.print("저자 : ");
		String author = sc.nextLine();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.print("출판사 : ");
		String publisher = sc.nextLine();
	
		
		Book bk = new Book(title,author,price,publisher);
		
		System.out.println(bk.information());
		*/
		
		//세 개의 Book객체를 관리해야한다면?
		
		Book bk1 = null;
		Book bk2 = null;
		Book bk3 = null;
		
		//세 도서에 대한 정보를 반복적으로 사용자에게 입력받기 => 입력받은 후 각 객체 생성과 동시에 초기화 
		//반복문을 활용하면 조금더 쉽겠군! 
		
		for(int i =0;i<3;i++) {
			
			System.out.println((i+1) + "번째 도서의 정보를 입력합니다.");
			System.out.print("도서명 : ");
			String title = sc.nextLine();
			System.out.print("저자 : ");
			String author = sc.nextLine();
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			
			if(i == 0) {
			bk1 = new Book(title,author,price,publisher);
			} else if (i == 1) {
			bk2 = new Book(title,author,price,publisher);
			} else {
			bk3 = new Book(title,author,price,publisher);
			}
		
			
	}
		//객체 생성 끝 
		
		//전체 도서정보들 조회하기 
		
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		//도서 제목으로 검색하는 서비스 
		
		System.out.print("검색할 책 제목 : ");
		String search = sc.nextLine();
		
		if(bk1.getTitle().equals(search)) {
			System.out.println(bk1.information());
		}else if(bk2.getTitle().equals(search)) {
			System.out.println(bk2.information());
		}else {
			System.out.println(bk3.information());
		}
	}
	
	
	 
	 
	}

