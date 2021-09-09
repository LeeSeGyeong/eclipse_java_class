package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part01_basic.model.vo.Music;

//controller : 사용자의 요청을 처리해주는 클래스
//view에 결과를 return 
public class MusicController {

	private ArrayList<Music> list = new ArrayList<>(); //음악들의 보관함 (아직은 비어있음)
	{ //초기화 블럭 
		list.add(new Music("Good Bye","박효신"));
		list.add(new Music("술이 달다","에픽하이"));
		list.add(new Music("밥이 달다","강보람"));
	}
	
	
	//1. 곡 추가 요청처리 
	public void insertMusic(String title, String artist) {
		
		list.add(new Music(title,artist));
		
	}
	
	//2. 전체 곡 조회 요청처리
	public ArrayList<Music> selectMusic() { //전달값 x 조회기 때문에 매개변수 안씀 
		return list;
		//출력문 입력문은 무조건 view에만 쓸거라 		
		//MusicMenu로 메소드를 다시 return 해줌 거기에서 출력되도록 
	}
	
	
	//3. 특정 곡 삭제 요청처리 
	
	public int deleteMusic(String title) {
		
		int result = 0;
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
				result = 1; //성공적으로 삭제 되었을때 1대입
				break;
			} else {
				
			}
		}
		
		//result = 0 (삭제할 곡 못찾음) | 1 (성공적으로 삭제 된거임 )
		return result;
	}
	
	// 4. 특정 곡 검색
	//1. 기본버전
	public ArrayList<Music> searchMusic(String keyword) {
		
		ArrayList<Music> searchList = new ArrayList<>();
		//검색된 Music객체를 차곡차곡 담을 list 
		
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getTitle().contains(keyword)) { //keyword가 포함(contain)되어있을 경우 
				//System.out.println(list.get(i));
				searchList.add(list.get(i)); //검색된 것들을 차곡차곡 쌓기
			}
		}
		
		//searchList => 텅 비어있을 수 있음 | 검색된 Music객체들이 담겨있을 수 있음 
		return searchList;
	}
	
	//2) 심화버전 
	public ArrayList<Music> searchMusic(int menu,String keyword) {
		
		ArrayList<Music> searchList = new ArrayList<>(); //검색결과를 보관할 리스트 ( 현재 텅 비어있음 )
		if(menu == 1) { //곡명으로 검색
			for(int i=0;i<list.size();i++) {
				if(list.get(i).getTitle().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
		} else { //가스명으로 검색
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
		
		//result = 0(수정할 곡을 못찾을 경우 ) | 1 (성공적으로 수정됨)
		return result;
	}
	
	
	
	
	
	
	
	
	
}
