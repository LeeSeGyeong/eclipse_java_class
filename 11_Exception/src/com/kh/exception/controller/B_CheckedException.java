package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException { //반드시 예외처리를 꼭! 해줘야하는 것들 
	
		
		/*
		 * CheckedException은 반드시 예외처리를 해줘야한다
		 * => 예측이 불가능한 곳에서 문제가 발생하기 때문에 미리 예외처리구문을 만들어놔야함
		 * => 조건문을 미리 제시할 수 없다 (예상이 안되기 때문에)
		 * 
		 * 왜 예측할 수 없는 예외가 생겨날까?  
		 * 외부 매개체와 입출력이 일어날 때 발생됨 (IOException)
		 * 
		 */

	
	public void method1 () throws IOException {
		method2(); //2)의 throws가 떠넘겨짐 
				   // 어떻게 해결하지? 여기서 try-catch구문을 작성하거나 
				   // 아님 다시 throws문을 이용해서 또 떠넘기는 방식 
		}
	
	public void method2() throws IOException{ // 2)의 throws문 
		
		//Scanner와 같이 키보드로 값을 입력받을 수 있는 객체 (단, 모든 값을 문자열로 읽어들임)
		//버퍼는 예외구문처리 필수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("아무거나 입력해주세요 : ");
		
		//String str = br.readLine(); //IOException을 위한 예외처리 핸들링 구문 미리 작성해야함
		//그래서 try-catch구문을 필수적으로 적어줘야함 
		
		//1. try-catch문 
		//try{} : 예외가 발생할 가능성이 있는 코드를 작성 
		//catch(발생될 예외클래스 + 매개변수){} : try구문 내에서 예외가 발생했을 경우 어떻게 처리할건지에 대한 내용 작성 
		
		/*try {
			String str = br.readLine();
			System.out.println(str);
		} catch(IOException e) { //언제 발생할지 모르니 경고문을 보고(빨간줄) 미리 작성해 주는 것 
			System.out.println("예외가 발생했습니다.");
		}*/
		
		
	
		//2. throws 방식 ( 약간 무책임한, 떠넘기는 방식  권장되진 않음 )
		// 형식 : method() + throws + 발생될예외클래스 {
		// 지금 이자리에선 처리하지 않고 , 현재 이 메소드를 호출하는 곳으로 예외처리를 떠넘기겠다(위임하겠다.)
		
		String str = br.readLine(); //readLine()메소드에서 throws IOException하고있음(떠넘기고있음)
		System.out.println(str);
		
		 //또 메인메소드에게 떠넘길 수도 있고 
		 //메인메소드가 또 떠넘기면 JVM이 알아서 처리한다(어떻게? 모름)
		 //그래서 떠넘기고 떠넘기는건 권장하지 않음! 가능하다는것만 알아두기 
		
	}
	
	
	/*
	 * 정리 
	 * 
	 * 								예외 클래스		예외발생시점		예외처리 
	 * UnCheckedException		RuntimeException	 런타임에러		 세모(개발자가 케바케로 : if문으로 미리 예방하거나 , 예외처리쓰거나)
	 * CheckedException			RuntimeException	 컴파일에러(빨간줄)	 필수(조건문 안됨! 무조건 예외처리구문으로)
	 * 
	 */
	
}
