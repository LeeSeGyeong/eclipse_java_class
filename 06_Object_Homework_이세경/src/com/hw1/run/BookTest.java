package com.hw1.run;
import com.hw1.model.vo.*;
public class BookTest {
		 public static void main(String[] args) {
			 
		
			 Book[] books = new Book[2];
			 
			 books[0] = new Book();
			 books[1] = new Book("�ڹ��� ����",20000,0.2,"����");
			 
			 for(int i=0;i < books.length;i++) {
			 System.out.println(books[i].information());
			 }
			 System.out.println("===============================");
			 
			 books[0] = new Book("C���",30000,0.1,"ȫ�浿");
			 System.out.println(books[0].information());
			 System.out.println("===============================");
			
			 // ���ε� ����
			 
			 // (int)(books[].getPrice() - (books[].getPrice() * books[].getDiscountRate())
			 
			 System.out.println("������ = " + books[0].getTitle());
			 System.out.println("���ε� ���� = " + ((int)(books[0].getPrice() - (books[0].getPrice() * books[0].getDiscountRate())))+"��");
			 System.out.println("������ = " + books[1].getTitle());
			 System.out.println("���ε� ���� = " + ((int)(books[1].getPrice() - (books[1].getPrice() * books[1].getDiscountRate())))+"��");
		
		 
		 }
}
