package com.kh.chap04_date.run;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRun {

	public static void main(String[] args) {

		
		/*
		 * *java.util.Date
		 */
		
		// 1) 기본생성자를 통해 생성 : (시스템 상)현재 날짜와 시간을 담고있음
		Date date1 = new Date();
		System.out.println(date1);
		
		
		// 2) 내가 원하는 날짜(2021년 7월 27일)로 셋팅하고싶다면?
		
		// # 1. 매개변수 생성자를 통해서 생성하는 방법 
		Date date2 = new Date(2021-1900,7-1,27); //내부적으로 년+1900,월+1 이 진행되므로 임의로 더하고 빼준다.
		System.out.println(date2);
		
		// # 2. 기본생성자로 생성한 후 setter메소드로 값 변경 
		
		//위의 식 date1을 활용 
		date1.setYear(2021-1900);
		date1.setMonth(7-1);
		date1.setDate(27);
		
		System.out.println(date1.toString()); //toString으로 형식이 정해져있음
		
		
		//(+) 내가 원하는 출력 형식으로 바꿀래 !
		//2021년 07월 27일 02시 56분 37초 이렇게
		
		//java.text.SimpleDateFormat 클래스 (수정할 수 있는 값들을 모아놓은 곳)
		
		// a) simple 객체 생성해주기 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초"); 
		//월은 M(대문자) 분은 m(소문자)
		
		String formatDate = sdf.format(date1); //수정된 포맷 문자열을 돌려돌려 적용시켜줌 
		System.out.println(formatDate); 
		
	}

}
