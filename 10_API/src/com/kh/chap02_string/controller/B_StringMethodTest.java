package com.kh.chap02_string.controller;

public class B_StringMethodTest {

	
	public void method() {
		
		// (1) 문자 추출 
		String str1 = "Hello World";
		
		// 메소드명(매개변수) : 반환형 
		
		// 1. 문자열.charAt(int index) : char (문자 1개 , ex. 'A' , '물' )
		//	    문자열에서 전달받은 index위치의 문자만을 추출해서 리턴 
		
		char ch = str1.charAt(8);
		System.out.println("ch : " + ch);
		
		
	
		// (2) 문자열.concat(String str) : String
		//	  '문자열'과 전달된 '또 다른 문자열'을 하나로 합쳐서 새로운 문자열로 return
		
		String str2 = str1.concat(" !!!"); 	   // a) 즉, Hello World(str1) + !!! 를 합치는 식이다.
		System.out.println("str2 : "+str2);	   //		  문자열(str1)    +  또다른 문자열(!!!)
		
		String str3 = str1 + " !!!";		   // b) 문자열을 덧셈으로 합칠 수도 있음 
		System.out.println("str3 : " + str3);
		
		System.out.println("str2와 str3가 일치합니까? : " + (str2 == str3)); //false
		// str2와 str3의 문자열은 일치하지만 , 실제 담겨있는 주소값이 다르다.
		
		
		// (3) 문자열.equals(Object obj) : boolean  //Object는 모든 자료형의 부모?니까 모든값을 받기 가능
		//	      문자열과 전달된 또다른 문자열을 가지고 주소값 비교가 아닌 '실제 문자열 값'을 가지고 동등비교해줌 
		
		System.out.println("str2와 str3이 일치합니까? : " + str2.equals(str3)); //true
		
		
		// (4) 문자열.contains(CharSequence s) : boolean 
		System.out.println("str1에 Hello라는 문자열이 포함되어 있습니까? : " + str1.contains("Hello"));
		System.out.println("str1에 Bye라는 문자열이 포함되어 있습니까? : " + str1.contains("Bye"));
		
		// (5) 문자열.length : int 
		
		System.out.println("str1의 길이 : "+ str1.length());
		
		// (6) 문자열.substring(int beginIndex) : String => 문자열의 biginIndex위치에서부터 끝까지 문자열울 추출해서 리턴
		//	      문자열.substring(int beginIndex , int endIndex) : String
		//					==> 문자열의 beginIndex위치에서 부터 endIndex-1 위치까지의 문자열을 추출해서 리턴 
		
		System.out.println(str1.substring(6));
		System.out.println(str1.substring(0,5)); //begin <= substring < end
		
		
		// (7) 문자열.replace(char oldChar, char newChar) : String 
		//	      문자열에서의 oldChar문자들을 newChar로 바꾼 새 문자열 리턴
		
		String str4 = str1.replace('l','c');
		System.out.println("str4 : " + str4 ); // l의 값을 c로변환된(replace) 새 문자열을 return 
		System.out.println("str1이 변경됏나? : "+str1); //replace후에 str1의 값은 변경되진않음 
		
		
		// (8) 문자열.toUpperCase() : String => 문자열을 다 '대문자'로 병경한 새 문자열 리턴 
		//	      문자열.toLowerCase() : String => 문자열을 다 '소문자'로 변경한 새 문자열 리턴
		
		String str5 = str1.toUpperCase();//모두 대문자 
		System.out.println("str5 : " + str5); 
		System.out.println("Lower : " + str1.toLowerCase()); //모두 소문자 
		
		
		/*
		 * System.out.println("계속 입력하시겠습니까? (y/n) : ");
		 * char ch = sc.nextInt().toUpperCase().charAt(0); // 대문자에 해당하는 값만 담긴다(toUpperCase) //'N' 'Y'
		 * 
		 * 			// 메소드 연이어서 호출 == 메소드 체이닝 
		 * 
		 * 	if(ch == 'N'){ // 입력된 문자를 대문자로 바꿔주니까 
		 * 		//프로그램 종료 
		 * 	}
		 * 		
		 * 		
		 */
		
		
		
		// (9) 문자열.trim() : String 
		//	      문자열의 '앞 뒤'공백을 제거하고 새문자열을 리턴
		
		String str6 = "   JAV  A   "; //중간의 공백은 사라지지 않음 
		System.out.println(str6.trim());
		
		
		// (10) 문자열.toCharArray() : char[] 반환 
		//							   각 배열의 index에 문자를 하나 하나 대입해주는 공식 
		
		char[] arr = str1.toCharArray();
		System.out.println(arr[0]);
		
	
		// (11) string.valueOf(char[] data) : String으로 반환 
		//									  (10)번에서 각 대입했던 문자들을 합쳐주는 메소드 
		
		System.out.println(String.valueOf(arr));
		//합쳐진 값이 출력된다. 
		
		
		
	}//method
}//class
