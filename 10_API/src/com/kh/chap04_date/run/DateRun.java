package com.kh.chap04_date.run;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRun {

	public static void main(String[] args) {

		
		/*
		 * *java.util.Date
		 */
		
		// 1) �⺻�����ڸ� ���� ���� : (�ý��� ��)���� ��¥�� �ð��� �������
		Date date1 = new Date();
		System.out.println(date1);
		
		
		// 2) ���� ���ϴ� ��¥(2021�� 7�� 27��)�� �����ϰ�ʹٸ�?
		
		// # 1. �Ű����� �����ڸ� ���ؼ� �����ϴ� ��� 
		Date date2 = new Date(2021-1900,7-1,27); //���������� ��+1900,��+1 �� ����ǹǷ� ���Ƿ� ���ϰ� ���ش�.
		System.out.println(date2);
		
		// # 2. �⺻�����ڷ� ������ �� setter�޼ҵ�� �� ���� 
		
		//���� �� date1�� Ȱ�� 
		date1.setYear(2021-1900);
		date1.setMonth(7-1);
		date1.setDate(27);
		
		System.out.println(date1.toString()); //toString���� ������ ����������
		
		
		//(+) ���� ���ϴ� ��� �������� �ٲܷ� !
		//2021�� 07�� 27�� 02�� 56�� 37�� �̷���
		
		//java.text.SimpleDateFormat Ŭ���� (������ �� �ִ� ������ ��Ƴ��� ��)
		
		// a) simple ��ü �������ֱ� 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��"); 
		//���� M(�빮��) ���� m(�ҹ���)
		
		String formatDate = sdf.format(date1); //������ ���� ���ڿ��� �������� ��������� 
		System.out.println(formatDate); 
		
	}

}
