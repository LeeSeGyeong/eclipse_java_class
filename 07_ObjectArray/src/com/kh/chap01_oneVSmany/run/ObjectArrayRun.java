package com.kh.chap01_oneVSmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVSmany.model.vo.Book;

public class ObjectArrayRun {
	 	public static void main(String[] args) { //control + d 한줄 지우기 
	 			
	 		//객체 배열
	 		Scanner sc = new Scanner(System.in);
	 		Book[] books = new Book[3];
	 		//각 0,1,2번방이 존재 
	 		//books[0] = new Book("" ," " , " ");
	 		//books[1] = ();
	 		//books[2] = ();
	 		
	 		for(int i=0;i<books.length;i++) {
	 		
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
				
				//각각의 인덱스에 차곡차곡 객체 생성 
				books[i] = new Book(title,author,price,publisher);
	 		}
	 		
	 		//전체 도서 정보들 조회하기 
	 		
	 		for(int i=0;i<3;i++) {
	 		System.out.println(books[i].information());
	 		}
	 		
	 		//도서제목으로 검색 서비스 
	 		
	 		System.out.println("검색할 책 제목");
	 		String search = sc.nextLine();
	 		
	 		for(int i=0;i<3;i++) {
	 			if(books[i].getTitle().equals(search)) {
	 				System.out.println(books[i].information());
	 			}
	 		}
	 		
	 		
	 		
	 		
	 		
	 	}
}
