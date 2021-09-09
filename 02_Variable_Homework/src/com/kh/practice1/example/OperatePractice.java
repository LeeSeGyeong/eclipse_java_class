package com.kh.practice1.example;

import java.util.Scanner;

public class OperatePractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		
		System.out.println(num + "은 " + (num >= 0 ? "양수다." : "양수가 아니다."));
	}
	
		public void practice2() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수값 입력 : ");
			int num = sc.nextInt();
			
			String result = (num > 0 ? "양수이다" : (num < 0 ? "음수이다" : "0이다"));
			System.out.println(result);
			
			
		}
		
		public void practice3()	{
			
			Scanner  sc = new Scanner(System.in);
			System.out.print("정수값 입력 : ");
			int num = sc.nextInt();
			
			String result = (num % 2 == 0 ? "짝수다" : "홀수다");
			System.out.println(result);
			
						
		}
		
		public void practice4() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("인원 수 : ");
			int people = sc.nextInt();
			
			System.out.print("사탕 개수 : ");
			int candy = sc.nextInt();
			sc.nextLine();
			
			System.out.print("\n");
			System.out.println( "1인당 사탕 갯수 : " + (candy / people));
			System.out.println("남는 사탕 갯수 : " + (candy % people));
		
		}
		
		public void practice5()	{
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("학년(숫자만) : ");
			int grade = sc.nextInt();
			
			
			System.out.print("반 : ");
			int classNum = sc.nextInt();
			
			System.out.print("번호 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			System.out.print("성별(M/F) : ");
			//내 틀린 답 int gender = sc.nextInt();
			char gender = sc.nextLine().charAt(0);
		
			 
			
			System.out.print("성적(소숫점 아래 둘째 자리까지) : " );
			double score = sc.nextDouble();
			
			String student = (gender == 'M'|| gender == 'm') ? "남학생" : "여학생" ;
			
			
			// x학년 x반 x번 xxx xxx의 성적은 xx.xx이다.
			
			System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다." ,grade,classNum,num,name,student,score);
			
			

		}

		public void practice6() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			String result = (age <= 13) ? "어린이" : (age <= 19 ? "청소년":"성인");
			System.out.println(result);
			//System.out.println( age <= 13 ? "어린이" :/*여기부턴 이미 age> 13이 전제조건이 된다. 앞에서 : 아니라면~ 이니까 */ 
				//(age > 13 && age <= 19) ? "청소년" : "성인");
			
		}
		
		public void practice7() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("국어 : ");
				int kor = sc.nextInt();
			System.out.print("영어 : ");
				int eng = sc.nextInt();
			System.out.print("수학 : ");
				int math = sc.nextInt();
				
			//합계
				int sum = kor+eng+math ;			
			//평균
				double avg = (sum/3.0);
				
			System.out.println("합계 : " + sum);	
			System.out.println("평균 : " + avg);
			
			System.out.println(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60 ? "합격" : "불합격");
				
			
		}
		
		public void practice8() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("주민번호를 입력하세요(-포함) : ");
			//char gender = sc.nextLine.charAt(7);
			//더 짧게 만들고 싶다면? 이런 방법을 사용해보세요 :)
			
			
			//String num1 = sc.nextLine();
			//char a = num1.charAt(7); 
			//얘는 숫자가아니라 '문자'이기 때문에 
			//값을 입력할땐 '1' '2' '3' '4' 로 홑따옴표로 감싸준다
			
			//String result = ( (a == '1' || a == '3') ? "남자" : "여자"); //문자이기 때문에 a의 값에 '1'로 감싸준다! 
			//System.out.println(result);
			
			
			
			
			
		}
		
		
}
