package com.kh.chap01_oneVSmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVSmany.model.vo.Book;

public class ObjectArrayRun {
	 	public static void main(String[] args) { //control + d ���� ����� 
	 			
	 		//��ü �迭
	 		Scanner sc = new Scanner(System.in);
	 		Book[] books = new Book[3];
	 		//�� 0,1,2������ ���� 
	 		//books[0] = new Book("" ," " , " ");
	 		//books[1] = ();
	 		//books[2] = ();
	 		
	 		for(int i=0;i<books.length;i++) {
	 		
	 			System.out.println((i+1) + "��° ������ ������ �Է��մϴ�.");
				System.out.print("������ : ");
				String title = sc.nextLine();
				System.out.print("���� : ");
				String author = sc.nextLine();
				System.out.print("���� : ");
				int price = sc.nextInt();
				sc.nextLine();
				System.out.print("���ǻ� : ");
				String publisher = sc.nextLine();
				
				//������ �ε����� �������� ��ü ���� 
				books[i] = new Book(title,author,price,publisher);
	 		}
	 		
	 		//��ü ���� ������ ��ȸ�ϱ� 
	 		
	 		for(int i=0;i<3;i++) {
	 		System.out.println(books[i].information());
	 		}
	 		
	 		//������������ �˻� ���� 
	 		
	 		System.out.println("�˻��� å ����");
	 		String search = sc.nextLine();
	 		
	 		for(int i=0;i<3;i++) {
	 			if(books[i].getTitle().equals(search)) {
	 				System.out.println(books[i].information());
	 			}
	 		}
	 		
	 		
	 		
	 		
	 		
	 	}
}
