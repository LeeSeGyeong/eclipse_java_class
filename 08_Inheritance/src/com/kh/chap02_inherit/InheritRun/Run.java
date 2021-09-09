package com.kh.chap02_inherit.InheritRun;

import java.util.ArrayList;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;
import com.kh.chap02_inherit.model.vo.Vehicle;

public class Run {
	 public static void main(String[] args) {
		 
		
		 
		 
		 Car c = new Car("�����ٰ�",3.0,"�Ļ�Ʈ",4);
		 
		 Ship s = new Ship("����ȣ",4.0,"�ѱ���",2);
		 
		 Airplane a = new Airplane("�����װ�",8.0,"A380",10,3);
		 
		 
		 System.out.println(c.information());
		 System.out.println(s.information());
		 System.out.println(a.information());
		 
		 
		 	c.howToMove();
			s.howToMove();
			a.howToMove();
			
			
			
			System.out.println("================ArrayList==============");
			
			 ArrayList<Vehicle> list = new ArrayList<Vehicle>();
			 
			 list.add(new Car("�����ٰ�",3.0,"�Ļ�Ʈ",4));
			 list.add(new Ship("����ȣ",4.0,"�ѱ���",2));
			 list.add(new Airplane("�����װ�",8.0,"A380",10,3));
			
			
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i).information()); //�������ε� 
			}
			
			System.out.println("================ArrayList==============");
			/*
			 * * ����� ���� 
			 * - ���� ���� ���� �ڵ�� ���ο� Ŭ���� �ۼ� ����
			 * - �ڵ带 �������� �����ϱ� ������ �ڵ��� �߰��� ���濡 ���� (���α׷��� ���꼺�� ���������� ũ�� �⿩)
			 * 
			 * * ����� Ư¡ 
			 * - Ŭ�������� ��ӿ� �־�� ���߻���� �Ұ�(���ϻ�Ӹ� ���� ��, �θ�� �ϳ���)
			 * - �θ�Ŭ������ ���ǵǾ��ִ� protected�ʵ�� �ڽ�Ŭ�������� ���� ���� ���� 
			 * - �ڽİ�ü�� �θ�Ŭ������ �ִ� �޼ҵ带 ��ġ ����ó�� ȣ�� ���� 
			 *   + �θ�Ŭ������ �ִ� �޼ҵ尡 ���� �ȵ�� �ڽ�Ŭ���� �������̵� ���� (���Ը���� ������)
			 * - ��õǾ����� ������ ��� Ŭ����(�ڹٿ��� �����ϴ� Ŭ����, ���� ����� Ŭ����)�� Object Ŭ������ �ļ��̴�!!
			 *   => ��, ObjectŬ������ �ִ� �޼ҵ带 ������� ȣ�� ����
			 *   => �Ӹ� �ƴ϶� �������̵��� ���ؼ� �����ǵ� ������!!!!
			 * 
			 */
			
			System.out.println(c.hashCode());
			System.out.println(c.equals(s));
			System.out.println(c/*.toString()*/);
			System.out.println(c.toString());
	 }
}
