package com.kh.chap01_list.part02_mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.part01_basic.model.vo.Music;
import com.kh.chap01_list.part02_mvc.controller.MusicController;

//view : 화면을 담당하는 클래스(출력문,입력문)
//Controller에 요청 메소드 호출
public class MusicMenu {

	private MusicController mc = new MusicController();
	private Scanner sc = new Scanner(System.in);
	
	//메인화면 : 프로그램 실행시 처음 보여지는 화면 
	public void mainMenu() {
		
		while(true) {
			
			System.out.println("\n=== welcome 별밤 ===");
			System.out.println("1. 새로운 곡 추가");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 특정 곡 삭제");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 수정");
			System.out.println("0. 프로그램 종료");
			
			System.out.print(">> 메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine(); // 버퍼값 비워주기 (뒤에 검색,조회 하면 int값때문에 인식이 안되니까)
			
			switch(menu) {
			
			case 1 : insertMusic(); break;
			case 2 : selectMusic(); break;
			case 3 : deleteMusic(); break;
			case 4 : searchMusic(); break;
			case 5 : updateMusic(); break;
			case 0 : System.out.println("프로그램을 종료합니다."); return; //호출했던 곳으로 메소드자체를 나감
			default : System.out.println("메뉴를 잘못 선택하셨습니다. 다시 선택해주세요");
			}
			
			
		}
		
	}
	
	
	
	
	
	/**
	 *  1. 새로운 곡 추가하는 서브화면 
	 */
	public void insertMusic() {
		System.out.println("\n=== 새로운 곡 추가 ===");
		
		System.out.print("제목 입력 : ");
		String title = sc.nextLine();
		
		System.out.print("가수명 : ");
		String artist = sc.nextLine();
		
		//곡 추가요청 보내기! (사용자가 입력한 곡명, 가수명 같이 넘기면서) 
		//즉, controller 메소드 호출
		
		mc.insertMusic(title,artist);
		System.out.println("곡 추가가 완료되었습니다 ^^");
	}
	
	
	/** 메소드 안에서 alt + shift + j 누르면 생성됨 
	 * 2. 전체 곡 조회용 서브화면 
	 */
	public void selectMusic() {
		System.out.println("\n=== 전체 곡 리스트 ===");
		
		//전체곡 조회요청 보내기(Controller 메소드 호출)
		ArrayList<Music> list = mc.selectMusic();
		
		if(list.isEmpty()) { //리스트가 비어있을 경우 
			System.out.println("현재 존재하는 곡은 없습니다");
		} else { // 뭐라도 담겨있을 경우
			for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
			}
		
	}
	
	
	/**
	 * 3. 특정 곡 삭제시켜주는 서브화면 
	 */
	public void deleteMusic() {
		System.out.println("\n=== 특정 곡 삭제 ===");
		
		System.out.print("삭제하려는 곡의 이름 :");
		String title = sc.nextLine();
		
		//삭제 요청 (controller 메소드 호출 )
		
		int result = mc.deleteMusic(title);
		//return된 값 result 변수로 만들어줌 
		
		if(result > 0) { // result = 1일 경우
			System.out.println("삭제 완료되었습니다.");
		} else { // result == 0 일경우
			System.out.println("삭제할 곡을 찾지 못했습니다.");
		}
		
	}
	
	/**
	 * 4. 특정 곡 검색해주는 서브화면 
	 */
	public void searchMusic() {
		
		System.out.println("\n=== 특정 곡 검색 ===");
		/*1. 간단버전
		System.out.print("검색할 곡 명(키워드도 가능) :");
		String keyword = sc.nextLine();
		
		// 검색요청
		ArrayList<Music> searchList = mc.searchMusic(keyword);
		*/
		
		//2. 심화버전 
		System.out.println("1) 제목으로 검색");
		System.out.println("2) 가수명으로 검색");
		
		System.out.print(">> menu선택 :");
		int menu = sc.nextInt();
		sc.nextLine();
		
		System.out.print("검색 키워드 : ");
		String keyword = sc.nextLine();
		
		ArrayList<Music> searchList = mc.searchMusic(menu,keyword);
		System.out.println("\n=== 검색결과 ===");
		
		if(searchList.isEmpty()) { //비어있을 경우 => 검색 결과가 없었을 것
			System.out.println("검색된 결과가 없습니다.");
		} else { //그게 아닐경우 => 검색된게 담겨있음 
			for(int i=0;i<searchList.size();i++) {
				System.out.println(searchList.get(i));
			}
		}
	}
	
	
	/**
	 * 5. 특정 곡 수정
	 */
	public void updateMusic() {
		System.out.println("\n === 특정 곡 수정 ===");
		System.out.print("수정하고자하는 곡명:");
		String title= sc.nextLine();
		
		System.out.print("수정 내용(가수) : ");
		String upArtist = sc.nextLine();
		
		System.out.print("수정 내용(곡명) : ");
		String upTitle = sc.nextLine();
		
		// 수정요청 보내기
		
		int result = mc.updateMusic(title,upArtist,upTitle);
		
		if(result > 0) {
			System.out.println("수정 완.");
		} else {
			System.out.println("수정 못함 ㅡㅡ");
		}
	}
	
	
	
	
	
	
}
