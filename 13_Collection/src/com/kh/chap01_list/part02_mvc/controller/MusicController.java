package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part01_basic.model.vo.Music;

//controller : ������� ��û�� ó�����ִ� Ŭ����
//view�� ����� return 
public class MusicController {

	private ArrayList<Music> list = new ArrayList<>(); //���ǵ��� ������ (������ �������)
	{ //�ʱ�ȭ �� 
		list.add(new Music("Good Bye","��ȿ��"));
		list.add(new Music("���� �޴�","��������"));
		list.add(new Music("���� �޴�","������"));
	}
	
	
	//1. �� �߰� ��ûó�� 
	public void insertMusic(String title, String artist) {
		
		list.add(new Music(title,artist));
		
	}
	
	//2. ��ü �� ��ȸ ��ûó��
	public ArrayList<Music> selectMusic() { //���ް� x ��ȸ�� ������ �Ű����� �Ⱦ� 
		return list;
		//��¹� �Է¹��� ������ view���� ���Ŷ� 		
		//MusicMenu�� �޼ҵ带 �ٽ� return ���� �ű⿡�� ��µǵ��� 
	}
	
	
	//3. Ư�� �� ���� ��ûó�� 
	
	public int deleteMusic(String title) {
		
		int result = 0;
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
				result = 1; //���������� ���� �Ǿ����� 1����
				break;
			} else {
				
			}
		}
		
		//result = 0 (������ �� ��ã��) | 1 (���������� ���� �Ȱ��� )
		return result;
	}
	
	// 4. Ư�� �� �˻�
	//1. �⺻����
	public ArrayList<Music> searchMusic(String keyword) {
		
		ArrayList<Music> searchList = new ArrayList<>();
		//�˻��� Music��ü�� �������� ���� list 
		
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getTitle().contains(keyword)) { //keyword�� ����(contain)�Ǿ����� ��� 
				//System.out.println(list.get(i));
				searchList.add(list.get(i)); //�˻��� �͵��� �������� �ױ�
			}
		}
		
		//searchList => �� ������� �� ���� | �˻��� Music��ü���� ������� �� ���� 
		return searchList;
	}
	
	//2) ��ȭ���� 
	public ArrayList<Music> searchMusic(int menu,String keyword) {
		
		ArrayList<Music> searchList = new ArrayList<>(); //�˻������ ������ ����Ʈ ( ���� �� ������� )
		if(menu == 1) { //������� �˻�
			for(int i=0;i<list.size();i++) {
				if(list.get(i).getTitle().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
		} else { //���������� �˻�
			for(int i=0;i<list.size();i++) {
				if(list.get(i).getArtist().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
		}
		return searchList;
	}
	
	public int updateMusic(String title, String upArtist, String upTitle) {
		int result = 0;
		for(int i=0;i<list.size();i++) {
			Music m = list.get(i);
			if(m.getTitle().equals(title)) {
				m.setArtist(upArtist);
				m.setTitle(upTitle);
				result =1;
				break;
			}
		}
		
		//result = 0(������ ���� ��ã�� ��� ) | 1 (���������� ������)
		return result;
	}
	
	
	
	
	
	
	
	
	
}
