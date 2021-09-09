package com.kh.practice.example;
import java.util.Scanner;
public class ArrayPractice {

		public void method1() {
			
			int[] arr = new int[10];
			
			for(int i=0;i<10;i++) {
				arr[i] = i+1;
			}
			for(int i=0;i<10;i++) {
				System.out.print(arr[i]+" ");
			}
		}
		
		
		public void method2() {
			
			int[] arr = new int[10];
			
			for(int i=0;i<10;i++) {
				arr[i] = i+1;
			}
			for(int i=9;i>=0;i--) {
				System.out.print(arr[i]+" ");
			}
		}
		
		public void method3() {
			Scanner sc = new Scanner(System.in);
			System.out.print("양의 정수 : " );
			int size = sc.nextInt();
			
			int[] arr = new int[size];
			
			for(int i=0;i<size;i++) {
				arr[i]=i+1;
			} 
			for(int i=0;i<size;i++) {
				System.out.print(arr[i]+ " ");
			}
			
		}
		
		public void method4() {

			// 1. 길이가 5인 String 배열 선언
			String[] arr = new String[5];
			
			// 2. 각 인덱스별 값 초기화
			arr[0] = "사과";
			arr[1] = "귤";
			arr[2] = "포도";
			arr[3] = "복숭아";
			arr[4] = "참외";
			
			// 위의 1번 2번 과정을 동시에 진행 할 수도 있다. 아래와 같이
			//String[] arr = {"사과", "귤", "포도", "복숭아", "참외"};
			
			// 3. 배열 인덱스를 활용해서 귤 출력
			System.out.println(arr[1]);
			
		}
		
		
		public void method5() {
			//인덱스 번호 못추출하겠음
			Scanner sc = new Scanner(System.in);
			
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();
			
			System.out.print("찾고자 하는 문자 : ");
			char ch = sc.nextLine().charAt(0);
			
			char[] arr = new char[str.length()];
			
			for(int i=0;i<str.length();i++) {
				System.out.println(arr[i]);
				arr[i] = str.charAt(i);
				}

			int count = 0;
			for(int i=0;i<arr.length;i++) {
				if(ch == arr[i]) {
					count++;
				}
			} 
			System.out.println(ch + " 의 갯수 : " + count);
			
		}
		
		
		
		public void method6() {
			
			String[] week = {"월","화","수","목","금","토","일"};
			
			Scanner sc = new Scanner(System.in);
			System.out.print("0 ~ 6 사이의 숫자입력 : ");
			int num = sc.nextInt();
			
			if( num>=0 && num <=6) {
				System.out.println(week[num]+"요일");
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
		}
		public void method7() {
			
			// 1. 사용자에게 값을 입력받고 그 값만큼의 배열 선언 및 할당
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 : ");
			int num = sc.nextInt();
			int[] arr = new int[num];
			
			// 2. 그 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화
			for(int i=0; i<arr.length; i++) {
				System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
				arr[i] = sc.nextInt();
			}
			
			// 3. 전체 값 나열 및 총 합 출력
			int sum = 0;
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i] + " ");
				sum += arr[i];
			}
			
			System.out.println("\n총 합 : " + sum);
			
		}
		
		public void method8() {
			
			Scanner sc = new Scanner(System.in);
			
			
			
			while(true) {
				
				//1. 사용자에게 3이상의 홀수값을 입력받기 
				System.out.print("정수 : ");	
				int num = sc.nextInt();
				
				//2. 조건문을 통해서 잘 입력했는지 안했는지 판별 
				if(num >=3 && num % 2 ==1) { //잘 입력했을 경우 => 배열 값 담은 후 출력 후 반복문을 빠져나갈거임
					
					//3_1.배열 생성(사용자가 입력한 크기만큼의 배열)
					int[] arr = new int[num];
					
					//3_2. 배열의 각 인덱스에 값 담기 
					//		ex) 5입력시 => {1,2,3,2,1}
					//		7입력시 => {1,2,3,4,3,2,1}
					//		9입력시 => {1,2,3,4,
					//								배열의 길이 /2인덱스까지 증가 그이후부터 감소 
					
					int value =1;
					for(int i=0;i<arr.length;i++) {
						arr[i]= value;
						
						if(i<arr.length/2) {
						value++;}
						else {
						value--;
						}
					}
					
					//3_3. 배열의 각 인덱스에 담긴 값 출력 
					for(int i=0;i<arr.length;i++) {
						System.out.print(arr[i]+", ");
					
					}
					break;
					
				} else { // 잘못입력했을경우 =>"다시입력하세요" 출력후 반복문 다시 시작
					System.out.println("다시 입력하세요.");
				}
			}
				
			}
				
		public void method9() {
			
			//사용자가 입력한 값이 배열에 있는지 검색하여
			//양념 후라이드 반반 
			
			Scanner sc = new Scanner(System.in);
			System.out.print("치킨 이름을 입력하세요 : ");
			
			String name = sc.nextLine();
			
			String[] arr = {"후라이드","양념","반반"};
			
			
			if(name.equals("후라이드")) {
				System.out.println("후라이드치킨 배달 가능");
			} else if(name.equals("양념")) {
				System.out.println("양념치킨 배달 가능");
			} else if(name.equals("반반")) {
				System.out.println("반반치킨 배달 가능");
			} else {
				System.out.println(name + "치킨은 없는 메뉴입니다.");
			}
		}
			


		public void method10() {
		
			
		
		
		}
		
		public void method11() {
			
		/*
		사용자에게 주민등록번호를 입력 받고 해당 문자열의 각 문자들을 char[] 에 옮겨 담은 원본 배열 만들
		어 둔 후, 원본 배열은 그대로 유지한 채로 복사본 배열을 만들 때 성별 자리 이후부터는 ‘*’을 담은 후
		하단의 결과처럼 출력해보세요.
		ex.			
		주민등록번호(-포함) : 123456-1234567
		123456-1*****
		*/
			
			
		}
		
		
		
		

}
