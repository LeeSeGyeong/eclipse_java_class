package com.kh.chap01_oneVSmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVSmany.model.vo.Book;

public class ObjectRun {
	public static void main(String[] args) {
		
		//�����ð�
		
		
		
		//���1. �⺻�����ڷ� ���� �� setter�޼ҵ带 �̿��ؼ� �� �ʱ�ȭ 
		/*
		 * Book b1 = new Book(); //control������ ���콺 ��� ���� ȣ��Ǵ��� �˷��� 
		b1.setTitle("C���");
		b1.setAuthor("����");
		b1.setPrice(100000);
		b1.setPublisher("�������ǻ�");
		*/
		
		//2. �Ű����� �����ڸ� ���ؼ� �ƽθ� ������ ���ÿ� �� �ʱ�ȭ
		//Book bk = new Book("�ڹ��� ����","�̼���",10000,"����� �Ͽ콺");
		
		//[����] ����ڿ��� �Է¹��� ������ ��ü ���� �� �ʱ�ȭ 
		
		Scanner sc = new Scanner(System.in);
		
		/* ��ĳ�ʷ� ��¹ޱ� 
		System.out.print("������ : ");
		String title = sc.nextLine();
		System.out.print("���� : ");
		String author = sc.nextLine();
		System.out.print("���� : ");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.print("���ǻ� : ");
		String publisher = sc.nextLine();
	
		
		Book bk = new Book(title,author,price,publisher);
		
		System.out.println(bk.information());
		*/
		
		//�� ���� Book��ü�� �����ؾ��Ѵٸ�?
		
		Book bk1 = null;
		Book bk2 = null;
		Book bk3 = null;
		
		//�� ������ ���� ������ �ݺ������� ����ڿ��� �Է¹ޱ� => �Է¹��� �� �� ��ü ������ ���ÿ� �ʱ�ȭ 
		//�ݺ����� Ȱ���ϸ� ���ݴ� ���ڱ�! 
		
		for(int i =0;i<3;i++) {
			
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
			
			if(i == 0) {
			bk1 = new Book(title,author,price,publisher);
			} else if (i == 1) {
			bk2 = new Book(title,author,price,publisher);
			} else {
			bk3 = new Book(title,author,price,publisher);
			}
		
			
	}
		//��ü ���� �� 
		
		//��ü ���������� ��ȸ�ϱ� 
		
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		//���� �������� �˻��ϴ� ���� 
		
		System.out.print("�˻��� å ���� : ");
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

