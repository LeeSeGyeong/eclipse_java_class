package kh.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice { 
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("1.입력\n2.수정\n3.조회\n4.삭제\n9.종료\n메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt();
		
		
		String result = " ";
		
		switch(menu) {
		
		case 1 : 
			result = "입력"; break;
		case 2 : 
			result = "수정"; break;
		case 3 : 
			result = "조회"; break; 
		case 4 : 
			result = "삭제"; break; 
		case 9 : 
			result = "종료"; 
			System.out.println("프로그램이 종료됩니다."); return;
		}
		
		System.out.println(result+" 메뉴입니다.");
		
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 :");
		int num = sc.nextInt();
		
		if(num>0) {
			if(num%2 == 0) {
				System.out.println("짝수다.");
			} else {
				System.out.println("홀수다.");
			}
		} else {
				System.out.println("양수만 입력해주세요.");
		}
	}
	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
			int kor = sc.nextInt();
		System.out.print("수학 점수 : ");
			int meth = sc.nextInt();
		System.out.print("영어 점수 : ");
			int eng = sc.nextInt();
			
			int avg = ((kor + meth + eng)/3);
			int sum = (kor+meth+eng);
			
			if(kor >= 40 && meth >= 40 && eng >= 40 && avg >= 60) {
				System.out.println("국어 : " + kor);
				System.out.println("수학 : " + meth);
				System.out.println("영어 : " + eng);
				System.out.println("합계 : "+sum);
				System.out.println("평균 : "+avg);
				System.out.println("축하합니다, 합격입니다!");
			} else {System.out.println("불합격 입니다.");
						}
	
	}
	
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1과 12사이의 정수입력 : ");
			int num1 = sc.nextInt();
			
			String result;
			
			switch(num1) {
			case 1 :
			case 2 :
			case 12 : System.out.print(num1+"월은 겨울입니다."); break;
			case 3 :
			case 4 :
			case 5 : System.out.print(num1+"월은 봄입니다"); break;
			case 6 :
			case 7 :
			case 8 : System.out.print(num1+"월은 여름입니다."); break;
			case 9 :
			case 10 :
			case 11 : System.out.print(num1+"월은 가을입니다."); break;
			
			default : System.out.print(num1 + "월은 잘못 입력된 달입니다."); 
			}
			
			
			
	}
	
	public void practice5() {
		//1. 임의로 아이디와 비밀번호 지정해두기 
		//String userid = "boram";
		//String userpwd ="1234";
		//사용자에게 아이디와 비밀번호 입력받기 
		
		//3.사용자에게 입력받은 아이디와 비밀번호 가지고 조건검사후 결과를 출력
		
			//Scanner sc = new Scanner(System.in);
		
			/*System.out.print("아이디 : ");
			String inputid = sc.nextLine();
			
			System.out.print("비밀번호 : ");
			int password = sc.nextInt();
			
			if (inputid.equals("boram")) {
				if(userpwd.equals("1234")) {
					System.out.print("로그인 성공! 추카추카푸 "); 
				} else {System.out.print("비밀번호가 틀렸습니다. ");	
					} 
				} else {
				System.out.print("아이디가 틀렸습니다.");	
			}*/
			
				
			//1. 임의로 아이디와 비밀번호 지정해두기 
			String userid = "boram";
			String userpwd ="1234";
			//사용자에게 아이디와 비밀번호 입력받기 
			
				String userId = "boram";
				int userPwd = 1234;
				
				Scanner sc = new Scanner(System.in);
				
				System.out.print("아이디 : ");
				String inputid = sc.nextLine();
				System.out.print("비밀번호 : ");
				int inputpwd = sc.nextInt();
				//3.사용자에게 입력받은 아이디와 비밀번호 가지고 조건검사후 결과를 출력		
				if(userId.equals(inputid) && userPwd == inputpwd) { //아이디도 일치하고 비번호 일치할 경우
					System.out.println("로그인 성공");
				}else if(userId.equals(inputid)) { //아이디는 일치하지만 비번이 틀렸을 경우
					System.out.println("비밀번호가 틀렸습니다.");
				}else if(userPwd == inputpwd) {
					System.out.println("아이디가 틀렸습니다.");
				} else { System.out.println("둘다 틀렸습니다.");
				}
				
				}
			
			
	
	
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String lv = sc.nextLine();
		
		switch(lv) {
		
		case "관리자" : System.out.print("회원관리 , 게시글 관리"); break;
		case "회원" : System.out.print("게시글 작성, 댓글작성"); break;
		case "비회원" : System.out.print("게시글 조회"); 
		break;
		
		default : System.out.print("잘못 입력했습니다."); 
		}
		
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("키(cm) : ");
		double height = sc.nextDouble();
	
		System.out.print("몸무게(kg) : ");
		double kg = sc.nextDouble();
		sc.nextLine();
		
		double bmi = kg/(height * height) ;
		System.out.println("BMI 지수 : " + bmi);
		
		if(bmi<18.5) {
			System.out.println("저체중");
		} else if (bmi <23) {
			System.out.println("정상체중");
		} else if (bmi < 25){
			System.out.println("과체중");
		} else {
			System.out.println("고도비만");
		}
		
	}
	
	
	public void practice8() {
		//1.사용자에게 양수 두개와 연산기호 입력받기
		Scanner sc = new Scanner(System.in);

		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char ch = sc.nextLine().charAt(0);
		
		/* 1. if-else if문 이용해서 ==============================================
		if (num1 > 0 && num2 > 0 && ch == '+') {
			System.out.printf("%d %s %d = %d", num1, ch, num2, (num1 + num2));
			
		} else if (num1 > 0 && num2 > 0 && ch == '-') {
			System.out.printf("%d %s %d = %d", num1, ch, num2, (num1 - num2));
			
		} else if (num1 > 0 && num2 > 0 && ch == '*') {
			System.out.printf("%d %s %d = %d", num1, ch, num2, (num1 * num2));
			
		} else if (num1 > 0 && num2 > 0 && ch == '/') {
			System.out.printf("%d %s %d = %d", num1, ch, num2, (num1 / num2));
			
		} else if (num1 > 0 && num2 > 0 && ch == '%') {
			System.out.printf("%d %s %d = %d", num1, ch, num2, (num1 % num2));
			
		} else {
			System.out.println("잘못입력하셨습니다. 프로그램을 종료합니다.");
		}
		=====================================================================*/
		
		
		
		
		/* 2. 위의 내용의 업그레이드 (중첩 if문 방법 : 공통된 조건을 먼저 검사하고 시작한다!)===
		
		if(num1 > 0 && num2 > 0) { // 1_1) 두개의 정수 모두 양수일 경우
			
			// 2) 연산기호를 가지고 비교
			if(ch == '+') {
				
			}else if(ch == '-') {
				
			}else if(ch == '*') {
				
			}else if(ch == '/') {
				
			}else if(ch == '%') {
				
			}else { // 두개의 정수값 모두 양수긴 하지만 연산기호를 잘못 입력했을 경우
				
			}
		}else {  // 1_2) 양수가 아닌 값을 입력했을 경우
			
		}
		
		================================================================*/
		
		
		
		// 3. 위의 내용에서 더 업그레이드 =======================================
		if(num1 > 0 && num2 > 0) {
			
			int result=0; // 연산기호에 맞춰서 산술 연산한 결과를 담아줄 변수 셋팅!
			
			// 연산기호를 가지고 동등비교하는 걸 switch문으로 바꾼내용
			switch(ch) {
			case '+': result = num1 + num2; break;
			case '-': result = num1 - num2; break;
			case '*': result = num1 * num2; break;
			case '/': result = num1 / num2; break;
			case '%': result = num1 % num2; break;
			default: System.out.println("연산자를 잘못 입력하셨습니다. 프로그램을 종료합니다."); return; // 메소드 빠져나갈수있도록
			}

			// 출력문은 여기에 단 한번만 기술할꺼임
			System.out.printf("%d %c %d = %d", num1, ch, num2, result);
			
		}else {
			System.out.println("양수가 아닌 값을 입력하셨습니다. 프로그램을 종료합니다."); 
		}
	}
	
		public void method9() {
			
			
		}
}

