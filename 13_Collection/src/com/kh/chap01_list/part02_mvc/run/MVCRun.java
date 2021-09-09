package com.kh.chap01_list.part02_mvc.run;

import com.kh.chap01_list.part02_mvc.view.MusicMenu;

public class MVCRun {

	public static void main(String[] args) {

		
		/*
		 * *MVC패턴 : 각 클래스마다 역할(데이터,화면,요청처리)을 부여해서 작업! 
		 *  		=> 유지보수 용이하다! 
		 *  
		 *  - M(Model) : 데이터를 담당하는 역할(데이터들을 담기위한 클래스, 비즈니스 로직을 처리하기위한 클래스, 데이터가 보관되어있는 보관함과 연결해서 입출력하는 클래스)
		 *  - V(View)  : 화면을 담당하는 역할 즉, 사용자에게 보여지는 시각적인요소(출력문(print) (view에서만 쓸거임 무조건!), 입력문(Scanner) (화면을 통해 입출력))
		 *  - C(Controller) : 사용자가 요청한 내용을 처리한 후 그 결과를 돌려주는 역할(출력문같은 거 안쓸거임! == 못쓴다고 생각하기)
		 * 
		 *   */
		
		
	MusicMenu mm = new MusicMenu();
	
	mm.mainMenu();
	
	
	
	
	
	
	}
	
	
	
	
}
