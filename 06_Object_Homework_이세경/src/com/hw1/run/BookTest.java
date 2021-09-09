package com.hw1.run;
import com.hw1.model.vo.*;
public class BookTest {
		 public static void main(String[] args) {
			 
		
			 Book[] books = new Book[2];
			 
			 books[0] = new Book();
			 books[1] = new Book("자바의 정석",20000,0.2,"윤상섭");
			 
			 for(int i=0;i < books.length;i++) {
			 System.out.println(books[i].information());
			 }
			 System.out.println("===============================");
			 
			 books[0] = new Book("C언어",30000,0.1,"홍길동");
			 System.out.println(books[0].information());
			 System.out.println("===============================");
			
			 // 할인된 가격
			 
			 // (int)(books[].getPrice() - (books[].getPrice() * books[].getDiscountRate())
			 
			 System.out.println("도서명 = " + books[0].getTitle());
			 System.out.println("할인된 가격 = " + ((int)(books[0].getPrice() - (books[0].getPrice() * books[0].getDiscountRate())))+"원");
			 System.out.println("도서명 = " + books[1].getTitle());
			 System.out.println("할인된 가격 = " + ((int)(books[1].getPrice() - (books[1].getPrice() * books[1].getDiscountRate())))+"원");
		
		 
		 }
}
