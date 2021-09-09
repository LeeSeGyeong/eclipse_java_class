package com.kh.chap02_set.part01_hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

public class SetRun {
	
	//Object�� equals() => �� ��ü�� "�ּҰ�"�� ���ؼ� ��ġ�ϸ� true , ��ġ���������� false ��ȯ
	//Object�� hashCode() => �ش簴ü�� "�ּҰ�"�� ���� 10���� ���·� ���� ��ȯ 
	
	public static void main(String[] args) {
		
		// *** 1) ���ڿ� ��ü�� ��ƺ��� 
		HashSet<String> hs1 = new HashSet<String>();
		//�ټ��� ��ü�� ������ �� �ִ� �÷��� 
		//generic���� X�� == Object�� default 
		//generic������ == Element == <E> == ����� String
		
		//�߰� ���� ! 
		// Collection �� �ΰ��� ���� List �� Set 
		// List�� ��ӹ޴� �ڽ�Ŭ���� ArrayList 
		// Set�� ��ӹ޴� �ڽ�Ŭ���� HashSet (���� , �������� �޼ҵ���� �������ִ� ��)
		
		//Q. ���⼭ ���� : �� List�� Set�̶� ������ add�޼ҵ带 �̿��ϳ���?
		//A. �� : ���� ��� Collection�̶�� ����и� �����ϰ��ֱ� ������, �ű⼭ �������̵� �� ���� �̿��ϱ⶧���̴�.
		
		hs1.add("�ݰ����ϴ�."); 
		//���� Student�Ű������� ���� ���� , ���׸��������� �ʾƼ� Object��ü �ƹ��ų� ���� �� �־ ���ڿ����� ��ƺ��� ��  
		
		
		//String ��ü �����ؼ� ���� ��ƺ� 
		hs1.add(new String("�ݰ����ϴ�."));
		hs1.add(new String("������"));
		hs1.add(new String("�ȳ��ϼ���!"));
		hs1.add(new String("������"));
		
		// ���� �� ��ü�� �ּҰ��� �ٸ�����, ���ڿ��� �� == ���� ��䰪���� �񱳸� �� (�Ʒ� �ΰ��� �������)
		// String�� equals() �������̵� �Ǿ����� => "���� ��� ���ڿ�"�� ������ ���ؼ� ��ġ�ϸ� true/ ��ġ���������� false��ȯ 
		// String�� hashCode() �������̵� �Ǿ����� => "������� ���ڿ�"�� ������ 10������ ���·� ���� ��ȯ 
		
		System.out.println(hs1); 
		// 1) Set�迭�� Ư¡ : ��������� ���� �ȵ� ! (������ �������� )
		// 2) Set�迭�� Ư¡ : �ߺ��� ������(���� ��ü) ���� �Ұ���
		// 3) set�迭�� Ư¡ : ��������� �����Ƿ� index number�� �������� ���� 
		
		
		// *** 2) Student ��ü ��� 
		HashSet<Student> hs2 = new HashSet<Student>();
		//Element == <E> == <Student>��ü�� ��� �� �ִ�.
		
		hs2.add(new Student("����",43,100)); //�� �ּҰ��� �޶�� , �Ź� ���� ��涧���� hashCode,equals �񱳰� �����
		hs2.add(new Student("�踻��",26,40));
		hs2.add(new Student("ȫ�浿",24,20));
		hs2.add(new Student("����",43,100)); 
		
		System.out.println(hs2); 
		
		//����������, 
		// 1-1) ������� ���� �ȵ� 
		
		// 2-Problem)  �׷��� Student��ü���� �ߺ��� data�� ���Ű� �ȵ���!! ���̷���?
		// 2-A)  ���ϰ�ü�� �Ǵ��� �ȵǰ� �־ �������� ��µ� 
		// 2-A) ��, HashSet�̶�� ������ ��ü�� �߰��ɶ����� ���ϰ�ü���� �񱳸� �ϴµ�
		//		 (���� ��ü �� ����): �� ��ü�� hashCode��(�ּҰ� ���)Ȯ��, 
		// 		 				   equals�޼ҵ�� ��(�ּҰ� ���)�� true�� ��� ���ϰ�ü�� �з��ȴ�.
		// Problem )) �׷��� ���� ��ü���� �������� , �ּҰ����� ���ϱ⶧���� �ٸ������� �ν��ؼ� �ߺ��� ���� �Էµȴ�.
		
		// �ذ��� )) ���ϴ� �ĵ��� Overriding�������ָ� ���ϰ�ü�� �Ǵ��ϵ��� �� �� �ִ� (������) 
		//			 Student�� equals() �������̵� => "���� �� �ʵ忡 ��� ������"���� �� ��ġ�ϸ� true , ��ġ���������� false ��ȯ
		//			 Student�� hashCode() �������̵� => "���� �� �ʵ忡 ��� ������"���� �� ��ġ�ϸ� ������ 10���� ��ȯ 
		//			 StudentŬ������ ���� @Override ���������ַ� ������ 
		
		/*
		System.out.println(new Student("����",43,100).hashCode());
		System.out.println(new Student("����",43,100).hashCode()); 
		//hashCode�� Override�ϴ�(Student class��)�ּҰ��� �ٸ� �� ���� ������ ���� hashCode���� ����ϰԵ�!
		
		System.out.println(new Student("����",43,100).equals(new Student("����",43,100))); */
		
		
		//hs2.get(1); // �ε����� ������ �����Ƿ� get�޼ҵ� ��ü�� ���ǵǾ����� ����!(�� ��ü�� �̾ƿ� �� ����)
		
		//hashSet�� ��� ��� ��ü�鿡 ���������� ���� ���� 
		//1. for�� ��� ����!(��, for each�����θ� ����!)
		
		for(Student s:hs2) { //HashCode,Student��ü �Ұ���! , �켱 ObjectŸ������ �����ϱ� 
			//���׸� ���� �Ŀ��� Student�� ��ü �������� 
			System.out.println(s);
		}
		System.out.println("=============================");
		
		//2. ArrayList�� �Űܴ��, �� ArrayList �ݺ��� �������� ���� 
		//ArrayList�� ��� ù��° ��� 
		
		ArrayList<Student> list = new ArrayList<>();
		list.addAll(hs2); //set�迭�� collection�� ȣ�Ⱑ�� �÷����� �ڽİ�ü�ϱ�
		
		//2-1) ArrayList�� ��� �ι�° ��� : ArrayList ������ ���ÿ� ��°�� �߰��ϱ� 
		
		ArrayList<Student> list2 = new ArrayList<>(hs2); //������ ���ÿ� �Ű����� �����ڷ� ArrayList�� ��� 
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list2.get(i));
		}
		
		
		//3) Iterator �ݺ��ڸ� �̿��ؼ� ���������� ���� 
		
		Iterator<Student> it = hs2.iterator(); //hs2�� ����ִ� ��ü�� => Iterator(�ݺ���)�� �������� ���� ���̰Ե�
		
		while(it.hasNext()) {
			Student s = /*(Student)*/it.next(); //Object�� ����Ҷ� ��������ȯ�� ����������� , Student�� ���׸��������ָ� ��������ȯ ������ε� 
			System.out.println(s);
		}
		//StringTokenizer�� ����� ���� 
		//it.next(); //NoSuchElementException�߻�(���̻� ��µ� ��Ұ� ����) 
	}
}
