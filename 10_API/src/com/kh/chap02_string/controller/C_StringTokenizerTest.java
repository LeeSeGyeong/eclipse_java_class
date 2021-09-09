package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {

	
	public void method() {
		
		String str = "Java,Oracle,,HTML,JDBC,CSS,Spring";
		// 컴마(,)를 기준으로해서 문자들을 쪼개주고 싶다 -> 어떤 구분자를 이용해야할까?
		
		// (1) 구분자를 기준으로 , 문자열을 분리시키는 방법 2가지 
		
		// 방법 1) 분리된 문자열들을 String[] 배열에 차곡차곡 담고자 할 때 
		//		  String class에 제공하는 split 메소드를 이용한다.
		//		   문자열.split(구분자) : String[] 반환 
		
		String[] arr = str.split(",");  
		//콤마(,)를 기준으로 java,Oracle.. 하나씩 쪼개줌 ->값들은 String배열[]로 출력됨  
		
		System.out.println("배열의 길이 : "+ arr.length);
		
		/* for Loop문
		for(int i=0;i<arr.length;i++) {
			System.out.println(i + "번째 index : " + arr[i]);
		}
		*/
		
		//향상된 for문 
		int num = 0; 
		
		for(String arr1 : arr) { // 배열의 모든 값을 하나씩 출력해줌 
			 System.out.println(num++ + "번째 index : " + arr1);
		}
		
		// 방법2 ) 자바에서만 가능한 StringTokenizer사용하기 (사실 방법1(split)을 많이쓰긴함)
		// 분리된 문자열들을 각각 토큰으로써 관리하고자 할 때 (java.util.StringTokenizer 클래스 import해주기)
		
		// StringTokenizer stn = new StringTokenizer(분리시키고자 하는 문자열 , 구분자);
		StringTokenizer stn = new StringTokenizer(str , ",");
		//분리된 문자열(java,Oracle...)들은 토큰으로 분리되어 있다.
		
		// * 분리된 문자열의 갯수 출력하기 
		System.out.println("분리된 문자열의 갯수 : " + stn.countTokens()); 
		
		/* 1> 하나하나 출력문으로 출력하는 방법 
		System.out.println(stn.nextToken()); //첫 토큰 값 출력 
		System.out.println(stn.nextToken()); //두 번째
		System.out.println(stn.nextToken()); //세 번째
		System.out.println(stn.nextToken()); //네 번째 
		System.out.println(stn.nextToken()); //다섯 번째
		System.out.println(stn.nextToken()); //여섯 번째
		
		System.out.println(stn.countTokens()); //토큰 값을 모두 출력하였으므로 토큰값은 0이다.
		// 토큰은 일회성(휘발성)이다. 출력하면 , 출력하면서 값이 이동하고 토큰값에서 사라짐.
		
		//System.out.println(stn.nextToken());
		// NoSuchElementException 발생 ( 다 출력되었으므로 , 더이상의 요소가 없음을 알려줌 )
		*/
		
		
		// 2> for문 값이 출력되다가 마는 이유
		
		// for(int j=0; j<stn.countTokens();j++) { 
		//	System.out.println(stn.nextToken()); 
		// }
		
		// 값이 3개만 출력된다 왜일까? 식의 흐름을 자세히 보자 
		// j = 0 j < 6 true  출력("java")  	j++ 
		// j = 1 j < 5 true  출력("oracle")  J++ (왜냐면 전의 식에서 하나를 출력했으니까 1씩 줄어들었음)
		// j = 2 j < 4 true  출력("JDBC")   	J++
		// j = 3 j < 3 false -> 반복문을 빠져나온다 
		
		//즉 , 토큰들의 값이 출력과 함께 1씩 줄어든다. 그러므로 값은 총 3개만 출력되는 에러 ( 출력되다가 만다 )
		
		// 3> 정상 출력 
		
		// 해결방법 1) 토큰갯수를 특정 변수에 미리 정의해놓기 
		
		//int count = stn.countTokens(); //count = 6
		
		//for(int j=0; j<count;j++) { 
		//		System.out.println(stn.nextToken()); 
		//	 }
		
		// 해결방법 2) while문으로 토큰 출력 
		
		while(/*반복이 수행될 조건*/stn.hasMoreTokens()) { //문자열.hasMoreTokens() : 뽑을 토큰이 남아있나요? true 출력
			System.out.println(stn.nextToken());
		}
		
		
		
		
	}
}
