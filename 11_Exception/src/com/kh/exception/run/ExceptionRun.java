package com.kh.exception.run;

import com.kh.exception.controller.A_UnCheckedException;
import com.kh.exception.controller.B_CheckedException;

public class ExceptionRun {

	public static void main(String[] args) {

		
		/*
		    <에러종류 4가지> 
		   
	    1) 시스템 에러 : (컴퓨터의 잘못) 컴퓨터의 오작동 혹은 JVM의 에러 -> 소스코드로 해결안됨 -> 심각한 에러 (자바 다시설치,컴퓨터 수리)
	    2) 컴파일 에러 : (개발자의 실수) 소스코드 문법상 오류가 있을 때 , 빨간 줄로 오류를 수정하라고 알려주는것 
	    3) 런타임 에러 : (Case by Case) 코드 상으로는 문제가 없는데 , 프로그램 실행중에 발생하는 에러
					  (사용자가 잘못입력했을 때 , 개발자가 예측가능한 경우를 제대로 처리 안해놨을 경우)
						  
		4) 논리 에러    : 문법적인 문제 없고 실행했을 때도 문제는 없지만 프로그램의 의도상 맞지 않는 것 
		      시스템 에러를 제외한 컴파일에러, 런타임 에러, 논리에러와 같은 비교적 덜 심각한 것들을 가지고 작업 
		      대부분 에러가 났어! 라고 말하지만, 사실 이런 것들을 "예외"라고 부른다. => Exception
		      
		   *** 이런 예외가 발생했을 경우에 대해서 처리하는 방법을 '예외처리'라고 함 
		   	   
		   	      만약, 예외처리를 안하고 그대로 진행한다면? (예외처리의 목적)
		   	      갑자기 비정상적으로 종료되기 때문이다. 정상적으로 프로그램실행을 위해서 예외처리로 해결해줘야한다.
		   	      
		   *** 예외처리 방법 (2가지)
		  	1) try ~ catch문을 이용한다. (try ~ with ~ resource)
		  	2) throws를 이용한다. ( 떠넘기기 == 위임하는 것 )
			
			
			
		 */
		
		A_UnCheckedException a = new A_UnCheckedException();
		//a.method1();
		//a.method2();
		//a.method3();
		
		B_CheckedException b = new B_CheckedException();
		//b.method1(); //또 메인메소드에게 떠넘길 수도 있고 
					 //메인메소드가 또 떠넘기면 JVM이 알아서 처리한다(어떻게? 모름)
					 //그래서 떠넘기고 떠넘기는건 권장하지 않음! 가능하다는것만 알아두기 
	}

}
