package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UnCheckedException { //꼭 예외처리를 해야하는 것은 아니라는 의미로 == UnCeckedException
	//다른 조건문으로 예방 가능하니까 
	
	
	/*
	 * * RuntimeException 
	 *   프로그램 실행시 발생되는 예외들 (대부분 예측가능한 것이 특징)
	 *   
	 *   RuntimeException의 후손들
	 *   -IndexOutOfBoundsException : 부적절한 인덱스를 가지고 접근시 발생되는 예외 
	 *   -NullPointException  : 참조변수가 null로 초기화된 상황에서 어떤거에 접근했을 때 발생되는 예외 
	 *   -ArithmeticException : 나누기 연산에서 0으로 나눠질때 발생되는 예외 
	 *   -ClassCastException  : 허용할 수 없는 형변환이 진행될 때 발생되는 예외
	 *   -NegativeArraySizeException : 배열 할당과정에서 배열의 크기가 음수일 때 발생되는 예외 
	 *   
	 *   => RuntimeException과 관련된 예외들은 충분히 예측이 가능하다.
	 *      애초에 예외가 발생하지 않게 if문으로 조건처리 가능하다 (if문은 예외처리를 해주는게 아님, 그냥 조건 처리)
	 */
	
	
	
	 private Scanner sc = new Scanner(System.in);
	 
	 public void method1() {
		 //ArithmeticException : 나누기 연산시 0으로 나눠질때 발생되는 예외(오류)
		 
		 System.out.print("정수1 : ");
		 int num1 = sc.nextInt();
		 System.out.print("정수2 : ");
		 int num2 = sc.nextInt();
		 
		 // int result = num1 / num2 ;  // num2에 0을 입력하니 예외가 발생한다! 예외처리를 안해줬기 때문에 실행종료
		 
		 
		 // 1) if문 조건으로 예외발생을 예방해주기 (if문이 가장 낫지만..)
		 
		 //애초에 예외가 발생하지 않도록 if문으로 조건검사해주기
		 //예외처리 : 예외가 발생하면 처리해주는 것 => if문은 예외발생하기 전에 예측해서 처리해준거니까 예외처리는 아님
		 /*
		 int result = 0;
		 if(num2 != 0) {
			 result = num1 / num2 ; //조건 처리를 해줬고 , 두번째 정수 0을 입력하면 결과값은 0이 출력됨
		 }
		 
		 
		 System.out.println("결과를 알려드리겠습니다.");
		 System.out.println("result : "+result); */
		 
		 
		 // 2) 예외처리구문으로 처리해보기 : try catch로
		 // 예외처리 : 예외가 실제로 발생했을 때 실행되는 내용을 미리 작성해 놓는 방법 
		 
		 /* 
		  *  * try catch 방법 (두개가 셋뚜) : 예외처리 방법 
		  *  
		  *  try{
		  *  	예외가 발생될 수 있는 구문; (예를 들면 나눗셈)
		  *  } catch(발생될 예외클래스적고 + 매개해줄 변수명){ //예외가 발생되는 순간 잡아주는(catch) 것
		  *    	해당 예외가 발생했을 경우 실행할 구문;
		  *  }
		  *  
		  */
		 
		 
		 try {
			 int result = num1/num2;
			 System.out.println("result : " + result);
		 } catch(ArithmeticException e) {
			 System.out.println("0으론 나눌 수 없거든요?");
			 //e.printStackTrace(); //오류난 내용을 보고자 할 때 실행시키는 구문
		 }
		 
		 System.out.println("프로그램을 종료합니다.");
	 }

	 
	 
	 // 2) 다중 catch 구문 
	 public void method2() { 
		 //NegativeArraySizeException 예외 처리해보기 : 배열의 길이 정할 때 , 그 길이를 음수로 정하면 발생하는 예외
		 //ArrayIndexOutOfBoundsException 예외 처리해보기   : 부적절한 인덱스를 가지고 접근시 발생되는 예외 
		 
		 System.out.print("배열의 크기 : ");
		 int size = sc.nextInt();
		/*
		 if(size>=101) { // (2) if문 조건식으로 예외를 미리 차단해주는 방법을 써봅시당 
			 			 // arr[ ]문장들은 if문이 만약 false면 구문이 실행도 안되니까 에러가 발생하지 않아요 
			 
		 // (1) 우선 예외가 없다고 가정하고 식을 만들어 봅시다 
		 int[] arr = new int[size];
		 System.out.println("100번 인덱스 값 : " + arr[100]);
		 }
		 System.out.println("프로그램을 종료합니다.");*/
		 
		 
		 try {
			 int[] arr = new int[size];
			 System.out.println("100번 인덱스 값 : "+arr[100]);
		 } catch(NegativeArraySizeException e) {
			 System.out.println("배열의 크기는 음수를 제시할 수 없습니다.");
		 }catch(ArrayIndexOutOfBoundsException e) { 
			 System.out.println("부적절한 인덱스로 접근했습니다.");
		 } 
		 
		 //한가지 이상의 catch구문은 그냥 바로 아래에 더 적어주면된다. 
		 //다중 catch블럭 작성가능 
		 
		 System.out.println("프로그램을 종료합니다.");
	 } 
	 
	 
	 // 3) 다형성을 이용한 Exception구문 (짧게 적고자) 
	 public void method3() {
		
		 /*
		 try {
			 System.out.print("배열의 크기 : ");
			 int size = sc.nextInt();
			 int[] arr = new int[size];
			 System.out.println("100번 인덱스 값 : "+arr[100]);
		 } catch(NegativeArraySizeException e) {
			 System.out.println("배열의 크기는 음수를 제시할 수 없습니다.");
		 }catch(ArrayIndexOutOfBoundsException e) { 
			 System.out.println("부적절한 인덱스로 접근했습니다.");
		 } catch (InputMismatchException e){ //import해줘야함
			 System.out.println("정수만 입력해야합니다.");
		 }*/
		 
		 
		 
		 try { 
			 System.out.print("배열의 크기 : ");
			 int size = sc.nextInt();
			 int[] arr = new int[size];
			 System.out.println("100번 인덱스 값 : "+arr[100]);
		 } catch(RuntimeException e) { //다형성을 적용해서 부모타입예외클래스 작성 가능 (RuntimeException이 부모클래스)
			 						   //즉, 모든 자식 예외 발생시 다 받아서 처리할 수 있음 (위의 3줄보다 하나로 퉁치기 가능)
			 System.out.println("예외가 생겼어..근데 어떤예외가 발생했는지 알려주기가 어렵다는 단점이 있다!");
			 //물론 짧긴해 그러나 세부적으로 어떤 오류가 있는지는 알려주기 어렵다
			 //세부적으로 알려주고 싶다면 다중 catch구문을 이용하는게 적절함
			 
		 }
		 
		 System.out.println("프로그램을 종료합니다.");
	 }
	 	 
	 //4) 다형성 + catch블럭 사용하기 (특정 예외가 발생시 주의구문을 주고싶어졌을때)
	 	public void method4() {
	 		 try {
				 System.out.print("배열의 크기 : ");
				 int size = sc.nextInt();
				 int[] arr = new int[size];
				 System.out.println("100번 인덱스 값 : "+arr[100]);
			 } catch(InputMismatchException e) {  
				 // runtime구문이 위에오면 모든 예외를 가져가서 출력해주기 때문에 
				 // 특정한 예외문구를 출력해주고 싶다면, Runtime예외클래스 위에 적어줘야함.
				 // 아니면 unreachable block 오류 뜸
				 System.out.println("정수만을 입력해주세요");
			 } catch(RuntimeException e) {
				 System.out.println("근데 어떤예외가 발생했는지 알려주기가 어렵다는 단점이 있다!");
			 }
	 	}
	 	


	 	
	 	/*
	 	 *  *RuntimeException 관련 애들은 UnCheckedException (예외처리구문이 필수는 아님)
	 	 *   
	 	 *   if문 : 애초에 예외자체가 발생되기 전에 소스코드로 핸들링하는 거임 (예외처리 구문 아님)
	 	 *   try - catch문 : 예외가 발생했을 경우 처리해주는 구문을 작성해두는거 (예외처리구문)
	 	 *   
	 	 *   예측가능한 상황은 if문으로 조건검사로 해결하는게 권장사항임 ! 
	 	 *   부득이하게 조건문으로 핸들링 안되는 구문 예외처리구문으로 작성해 둘 것 !  
	 	 * 
	 	 */







}
