package controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

import model.vo.Book;

public class BookController {
	
	private Book[] list = new Book[5];
	{ // �ʱ�ȭ��
		list[0] = new Book("�ڹ��� ����", "���ӽ� ����", "����", new Date(2018-1900, 4-1, 15), 20000);
		list[1] = new Book("�����е� �����Ҳ�����", "������", "KH", new Date(2019-1900, 6-1, 15), 30000);
		list[2] = new Book("API�� ����", "������", "KH", new Date(2017-1900, 2-1, 13), 15000);
		list[3] = new Book("����� ���α׷���", "������", "���е���", new Date(2016-1900, 8-1, 30), 10000);
	}
	
	
	public BookController() {}
	
	// 1. ���� ��ü ��� ��� �޼ҵ�
	public void printAll() {
		
		// list�� ��� ��ü Book��ü�� ���� ����ϴ� ���� �ۼ��Ͻÿ�.
		for(int i=0;i<list.length;i++) {
			System.out.println(list[i]);
		}

		
	}
	
	
	
	// 2. ���� �߰� ��� �޼ҵ�
	public void insertBook(String newTitle, String newAuthor, String newPublisher, String newDate, String newPrice) {
		
		// 1. �Ű������� ���޹��� newPrice��  ==>      String --> int�� ��ȯ �۾�  (int price��� ������ �����ÿ�)
		int price = Integer.parseInt(newPrice);
		
		// --------------------------------------------------------
		// 2. �Ű������� ���޹��� newDate��   ==>        String --> Date�� ��ȯ �۾�  (Date date�� �����ÿ�)
		//	  '-'�� �����ڷ� StringTokenizer�� �̿��Ͽ� ���ڿ� �и� �� ���� ��,��,�� �� Date�� ����
			
		// �ڵ� �ۼ�
		Date date = new Date();
		StringTokenizer stn = new StringTokenizer(newDate,"-");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
		String date1 = sdf.format(date);
		
		// ------------------------------------------------------
		// 3. ������ ���޹��� ����� ������ ��ȯ�۾��� ���� price�� date���� 
		//	  BookŬ������ �Ű����� �����ڸ� ���� ����
		Book bk = new Book(newTitle, newAuthor, newPublisher, date, price);
		
		list[4] = bk;
	
	}
	
	
		// 3. ���� �Ⱓ�� ��� ��� �޼ҵ�
		public void printBookPublishDate() {
		// ���� �Է¹��� ���� (5��° ����)�� �Ⱓ�� ���
		// "xxxx�� xx�� xx�� �Ⱓ" �� ���� �������� ���
		// SimpleDateFormat�� �̿��Ͽ� ���
		
		// �ڵ� �ۼ�
		Date date1 = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy�� MM�� dd�� �Ⱓ");
		String datef1 = sdf1.format(date1);
	}
	
	
	// 4. ���� �˻� ��� �޼ҵ�
	public void searchBook(String searchTitle) {
		
		// ���� ����Ʈ�� ��ü������ ��ȸ�ϸ鼭 (for�� �̿�)
		// ���޹��� �˻����� ����(HINT : StringŬ������ contains�޼ҵ� Ȱ��)��!! ������ ��ü ���  
		
		for(int i=0;i<list.length;i++) {
		// System.out.println(.contains(searchTitle)); ��� �� �𸣰���! 
			
		}
		// �ڵ� �ۼ�
		
		
	}
	
	
	

}
