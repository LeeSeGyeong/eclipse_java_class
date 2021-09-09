package com.kh.chap06_method.run;

import java.util.Scanner;
import com.kh.chap06_method.controller.StaticMethod;
import com.kh.chap06_method.controller.NonStaticMethod;
import com.kh.chap06_method.controller.OverloadingTest;

public class MethodRun {
	//===== Nonstaticmathod ======
	
	public static void main(String[] args) {
		// ---- NonStaticMethod ----
		
		/*NonStaticMethod test = new NonStaticMethod();
		
		//1.매개변수 없고 반환값도 없는 메소드 호출
		test.method1();
		
		
		//2.매개변수 없고 반환값은 있는 메소드 호출 
		//String str = test.method2();
		//System.out.println(str);
		System.out.println(test.method2());
		
		//3.매개변수 있고 반환값은 없는 메소드 호출
		test.method3(10,20);
		
		//4. 매개변수도 있고 반환값도 있는 메소드 호출
		
		//char ch = test.method4("pineapple", 3 );
		//System.out.println(ch);
		
		//System.out.println(test.method4("pineapple",3));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		
		if(num>0 && num < str.length()) {
		System.out.println("결과 : " + test.method4(str, num));
		} else {
			System.out.println("부적절한 정수를 입력했습니다.");
		}
	
*/
	// ===== StaticMethod =====
	
	StaticMethod.method1();
	System.out.println(StaticMethod.method2());
	StaticMethod.method3("이세경");
//	System.out.println(StaticMethod.method4("apple,"kiwi"));"
	
			
			//----- OverloadingTest -----
			OverloadingTest ot = new OverloadingTest();
			ot.test();
			ot.test(20);
			ot.test(10,"ㅎㅎㅎ");
			ot.test("ㅎㅎㅎ",10);
			ot.test(50,60);
	}
}

