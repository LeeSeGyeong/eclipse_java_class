package com.kh.chap01_list.part01_basic.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_basic.model.vo.Music;


public class GenericListRun {

	public static void main(String[] args) {
	//generic�� ����� ArrayList 
	//������ �ִ� ArrayList	
		
	
		
		ArrayList<Music> list = new ArrayList<Music>();
		//<Music>�̶�� ���� �迭�� �� �ֵ��� generic ���� => E == Music 
		//�迭 �հ� �ڿ� �Ȱ��� ���� ������ �迭�� �ۼ� 
		
		list.add(new Music("Good bye","��ȿ��"));
		list.add(new Music("�� ��","�����"));
		//list.add("��"); ������ Music��ü�� ���� �� ���� 
		
		System.out.println(list);
		
		list.add(1,new Music("������ ��� �뷡","���̽�"));
		//�̹��� ��ĭ �ڷιз�����, ���̽� �뷡�� 1�� index�� ���� 
		
		System.out.println(list);
		
		//set
		list.set(0, new Music("���� �޴�","��������"));
		System.out.println(list);
		//0�� index���� �����Ǿ� ��µ� 
		
		//subList 
		
		List<Music> sub = list.subList(0, 2); //0~1�� index ���� 
		//subList ���� �����Ҷ��� ���׸���������
		
		//addAll
		
		list.addAll(sub);
		
		System.out.println(list);
		
		Music m = list.get(0);
		System.out.println(m);
		
		
		System.out.println(list.get(1).getTitle());
		
		for(Music o : list) { 
			//ListRun �޼ҵ�� �ٸ��� generic ó���� Music��ü ����� ��������
			System.out.println(o);
		}
		
		/*
		 * 
		 *  * ���׸�<> �� ����ϴ� ���� 
		 *  
		 *  1. ��õ� Ÿ���� ��ü�� �����ϵ��� ������ �� �� ���� 
		 *  2. �÷��ǿ� ����� ��ü�� ������ ����� �� �Ź� ����ȯ�ϴ� ������ ���ֱ����� 
		 *  (����ȯ�ϱ� �����Ƽ�)
		 */
	}
}