package com.kh.variable;


// 사용자가 키보드로 입력한 값을 받아들이는 Scanner 실습
import java.util.Scanner;

public class B_KeyboardInput {

	public void inputTest1() {
		
		/*
		 *  키보드로 값을 입력하는 방법 
		 *  Scanner를 사용한다 
		 *  (즉, java.util.Scanner 클래스를 이용하는 것이다)
		 *  Scanner 클래스 내부의 메소드를 호출하여 입력받는 것. 
		 */
		
		//스캐너 클래스의 객체 생성 
		Scanner sc = new Scanner(System.in);
		//System.on은 입력받은 값을 바이트 단위로 받아들이겠다는 의미 
		//출력 시에는 System.out 이라는 구문을 썼었다 ! 
		
		System.out.print("아무거나 입력해보세요 : ");
		String amuguna = sc.nextLine();
		
		System.out.println("입력받은 내용 : " + amuguna);
		
		
		
	}
	
	public void inputTest2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름은 무엇입니까 : ");
		
		// 사용자가 입력한 값을 문자열로 받아오는 메소드 (next(), nextLine())
		//String name = sc.next(); //sc에 있는 문자를 가지고 오는거니까 sc.붙인다. 
		//키보드에서 가져오기'만'하는 메소드  보이진않음 
		//그렇다면 이거를 문자열로 눈에 보이게 하려면 문자열 클래스를 메모리 상 String name의 박스를 만들어 보관. 
		//next() : 사용자가 입력한 값 중에 공백이 있을경우 공백 이전까지의 값만 읽어옴 
		//		   (따라서 거주지라던가 등등 이런 내용같은 경우 공백이 있을 수 있기때문에 제대로 값을 못가져올 수도 있다)
		//
		
		String name = sc.nextLine();
		
		// nextLine() : 사용자가 입력한 값 모두 다 읽어옴 (엔터전까지의 모든값)
		
		System.out.print("당신의 나이는 몇살입니까 : ");		
		int age = sc.nextInt(); //사용자가 입력한 값을 정수로 읽어들이는 메소드 
		
		System.out.print("당신의 키는 몇입니까 (소수점 첫째 자리까지) : ");
		double height = sc.nextDouble(); // 사용자가 입력한 값을 실수로 읽어들이는 메소드 
		
		// xxx님은 xx살이며, 키는 xxx.xcm입니다. 
		System.out.println(name	+ "님은 " + age+"살이며, 키는" + height+"cm입니다.");
		
	}
		//키보드로 값을 입력받을 때 종종 발생되는 문제를 알아보자 
	
		public void inputTest3() {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("이름 : ");
			String name = sc.nextLine();
			//sc.nextLint() : 버퍼에서 '엔터' 이전까지의 모든 값을 가져온 후 
			//				  '엔터'를 비워주는 역할을 한다
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			//sc.nextLine() 외의 모든 메소드 : 해당 값만 읽어온 후에 버퍼에 남아있음 
			// 버퍼에 남아있는 엔터를 비워주는 코드 추가 
			sc. nextLine();
			//결론 : sc.nextxxx()메소드 뒤에 sc.next.Line() 메소드가 오게 될경우 
			//버퍼에 남아있는 '엔터'를 비워주는 과정이다. 필수! 
			
			System.out.print("주소 : ");
			String address = sc.nextLine();
						
			System.out.print("키 : ");
			double height = sc.nextDouble();
			
			//xxx님은 xx살이며, 사는 곳은 xxxxxx이고, 키는 xxx.xcm 입니다.
			
			System.out.println(name+"님은 " + age + "살이며, 사는 곳은 " + address + "이고, 키는 " + height+ "cm입니다.");
			System.out.printf("%s님은 %d살이며, 사는 곳은 %s이고, 키는 %.1f입니다.", name , age , address , height);
	
		
		}
		
		public void inputTest4() {
			Scanner sc = new Scanner(System.in);
		
			// 문자열 입력받을 때 => sc.nextLine()
			// 정수값을 입력받을 때 => sc.nextInt()
			//실수값을 입력받을 때 => sc.nextDouble()
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("성별(M/F) : ");
			//char gender = sc.nextChar(); nextChar와같은 메소드는 존재하지 않는다!
			//index는 0부터 시작한다. 012... 맨처음 오는 단어 0부터 1,2,3 순서로 센다. 
			char gender = sc.nextLine().charAt(0);
			
			//문자열 "Male"에서 0번째 인덱스 'M'만을 뽑고 싶다면? 
			//nextLine()다음에 점(.)을찍고 charAt를 호출해 특정인덱스의 단어를 뽑아낸다.
			//문자열.charAt(인덱스) : 해당 문자열로부터 해당 인덱스의 문자를 추출해주는 메소드
			// ** 인덱스 : 순번 같은 존재. 단,1부터시작아님 !!!!!0부터 시작이다!!!!!!!!!
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			System.out.print("키 : ");
			double height = sc.nextDouble();
			
			/*
			 * xxx님의 개인정보
			 * 성별 : x
			 * 나이 : xx
			 * 키 : xxx.x
			 * 
			 * 
			 */
			
			// System.out.println(name + "님의 개인정보\n 성별 : "+ gender + "\n 나이 : "+ age +"\n 키 : " +height);
			
			
			System.out.println(name+"님의 개인정보");
			System.out.println("성별 : " + gender);
			System.out.println("나이 : " + age);
			System.out.println("키 : "+ height);
			
		
		}
		// ** charAt()메소드 연습
		
		public void charAtTest() {
			String str = "Hello";
				char ch = str.charAt(0);
			
				System.out.println(ch);		//변수를 활용한 출력
			
				System.out.println(str.charAt(4)); //추출과 동시에 출력 
			//charAt() 인덱스 바로 출력도 가능
			//글자수 -1이 인덱스 번호다 
				
				// System.out.println(str.charAt(10)); String index out of range: 10
				
		}
		/*
		 *  ** 정리 **
		 *
		 *  1. 콘솔창(모니터)에 출력하기 위해 : System.out.print[ln]() 메소드 이용 //[]대괄호는 생략가능이라는 의미 
		 *  2. 콘솔창(키보드)에 입력받기 위해 : Scanner 이용해서 ( nextLing(),nextInt(),nextDouble()...)
		 *  
		 *  	>주의사항 ***
		 *  	1) sc.nextxxx() 메소드 뒤에 sc.nextLine()메소드가 와야될 경우 
		 *  		sc.nextLine() 메소드를 한번 더 써줘서 버퍼에 남아있는 '엔터'를 빼주는 과정 필수!! 
		 *  	2) '문자' 값을 입력받아야될 경우 
		 *  		sc.nextLine() 메소드로 우선 문자열을 입력받고 그 뒤에 .charAt(인덱스)메소드를 통해서 문자하나 추출
		 *  
		 */
}
