package com.kh.variable;

public class C_Printf { 
	//8월2일 수업내용 
	public void PrintfTest() {
		
		//System.out.printf("출력하고자하는형식(format)",출력하고자하는 값,갑1,값2,...); 여기서 f는 format
		//출력하고자하는 값들을 뒤에 콤마로 나열할 수 있다.
		//출력하고자하는 값들이 제시한 형식에 맞춰서 출력'만'진행 (줄바꿈안됨 ! print형식처럼)
		
		/*
		 * (1) 포맷안에서 쓰일 수 있는 키워드
		 * %d : 정수 
		 * %c : 문자 
		 * %s : 문자열(문자도 가능)
		 * %f : 실수 
		 * 
		 */
		
		int iNum1 = 10;
		int iNum2 = 20;
		
		
		System.out.println(iNum1 + " " + iNum2+"%");
		System.out.printf("%d %d%%",iNum1, iNum2);
		//(tip!) %를 printf문에서 나타내려면 %%두번써주면 된다 
		System.out.println( );
	
		
		//(2) %d에서 %5d 다섯칸의 공간 확보 후 오른쪽정렬(음수면 왼쪽정렬)	
		System.out.printf("%-5d\n",iNum1); 	
		System.out.printf("%-5d\n",250);
		System.out.printf("%-5d\n",3000);
		System.out.printf("%-5d\n",16);
		
		double dNum1 = 1.23456789;
		double dNum2 = 4.53;
		
		System.out.printf("%f\t %f\n",dNum1,dNum2); //무조건 소수점 아래 6째자리까지 보여줌 
		System.out.printf("%.2f %.1f\n",dNum1,dNum2); //%f.2d 처럼 내가 원하는 소수점까지 설정할 수 있다.

		// \t tab
		
		char ch = 'a';
		String str = "Hello";
		
		System.out.printf("%c %10s %s\n",ch,str,ch);
		System.out.printf("%C %S", ch,str); //대문자로도 출력가능 
		
	}

}
