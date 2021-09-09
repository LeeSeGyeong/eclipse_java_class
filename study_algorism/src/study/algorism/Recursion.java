package study.algorism;

import java.util.Scanner;

public class Recursion {
	
		
			//	Recursion (귀납함수) : 자기자신을 호출하는 함수 
			// 
			//	public void func() {
			//		func();
			//		func();
					
			//		.....
			//		}
			//				자기 자신이 다시
			//				자기 자신을 반복적으로 호출한다.
		
	
			// 1) recursion의 기본 개념 : 자기자신을 반복적으로 호출하는 예시를 살펴보자
		
		public static void func1() { //func라는 이름의 함수가 
			System.out.println("Hello..");
			func1(); //자기자신인 func()를 다시 호출하는 것 
			
			//그런데 아무것도 안하면 반복되고있는지 모르니까 출력문을 출력하고,
			//다음 자기자신(func())를 호출하도록하는 것이다.
		
			// * 실행 순서 
			// 1. 메인 메소드에서 func()를 호출하면 (Run class에서 실행해주고있음)
			// 2. Hello가 출력 되고 
			// 3. func()가 호출되므로 다시 void func()가 실행됨 
			// 4. 그렇게 되면 다시 Hello가 출력되고
			// 5. 그다음 문장인 func() -> void func() 실행 -> Hello -> func....
			// 6. 끝나지 않고 무한반복이 진행된다.
		
		
			//결과 : 무한반복이 진행된다.

			} // func
	
			//2) recursion은 항상 무한루프에 빠질까?
			
		public static void func2(int k) { //1. 매개변수로 어떤 정수 k 가 주어지고
			// run클래스에서 n=4를 대입해서 실행시킴
			// int n = 4; -> func(n);
			// func(4); 이렇게!
		
			if(k<=0){ 	 // 2. 매개변수 k가 만약 0이하라면
			return ; // 3. 자기자신을 호출(recursion)하지 않고 종료한다. 
			} else { //4. 그 외의 경우, 양수인 경우에만 자기자신을 호출할건데  (else문 즉, k<=0이 아닌경우니까)
			System.out.println("Hello..");
			func2(k-1); 
			//5. k값을 그대로 넘겨주는 것이 아니라 k-1의 값을 매개변수로 넘겨주는 형태로 출력해볼 것이다 
			//6. 그러면 값은 4번이 출력된다. 
			//7. recursion이 항상 무한루프에 빠지는것은 아님
			
			// 결과 : recursion이 4번 출력되고 종료된다. (return)
				}
			} //func2의 종료
	
	
			// 3) 무한루프에 빠지지않도록 도와주는 2가지 조건! 
		public static void func3(int k) {
				if (k <= 0) {
			return; //1. Base case : 적어도 하나의 recursion에 빠지지 않는 경우가 존재해야 한다.
					// return; 으로 자기자신을 복제하지 않고 종료해줌. 이를 Base Case라고 한다.
			} else {
			System.out.println("Hello..");
			func3(k - 1); 
			// 하지만 return; = Basecase만 있다고 무한루프를 막을 수 있을까? (X)
			// 만약, else 뒤의 식이 func(k + 1) 이라면 k의 수가 계속 늘어나 무한루프가 반복된다.
			// 그러면 반복을 하다가 하다가.....
			// 어찌됐던  base case로 수렴하도록 식이 작성되야한다.
					
			//정리 ) 아래의 두가지 조건을 충족시키면 무한루프에 빠지지 않는다. 
			//1. Base case란? :적어도 하나의 식이 recursion에 빠지지 않는 경우로 존재해야 한다. return; 으로 자기자신을 복제하지 않고 종료해줌. 이를 Base Case라고 한다.
			//2. recursive case란? : recursion을 반복하다보면 결국 base case를 수렴해야한다.
			
				}
			}//func3의 종료 
	
		public static int func4(int n) {
			
			//int result = rs.func4(4); 
			//System.out.println(result);
			//Run클래스에서 n=4를 대입하고 결과값을 출력
			
			if(n<=0) { 
				return 0;
			} else {
				return n+func4(n-1);
			}
			
			// func(n)의 결과는 1 ~ n 까지의 합이 출력된다.
			
			// 1. 우선 n = 4 이니 대입해봅시다.
			// 2. 4 > 0이므로   ----------------> return 4 + func(3)이 되겠죠?
			// 3. func(3)을 찾고자 값을 대입해 보니	   return 3 + func(2) 
			// 4. func(2)를 찾고자 값을 대입해 봄 	   return 2 + func(1)
			// 5. func(1)을 찾고자 값을 대입해 봄  	   return 1 + func(0) 
			// 6. func(0)은 return 0 이므로 종료된다 
			
			//7. 그렇다면 func(0) = 0
			//8. func(1) = 1 , func(2) = 2 + 1 , func(3) = 1+2+3 , func(4) = 1+2+3+4
			//9. 즉, 위의 식에서 각 func(n)값은 1~n 까지의 합을 출력하게 된다 
			
			}//func4의 종료 
		
		public static int func5(int n) { // 미션 : 0 ~ n 까지의 합을 구하는 것이다 
			if(n==0) {
				return 0; //n이 0이면 합은 0이다 
			}else { //n이 0보다 크다면
				return n + func5(n-1);
			}  // 0~n까지의 합은  0에서 n-1까지의 합 + n을 더한 것이다  
		}
	
		
		
			// 정리 
			// 위의 식들(순환함수 = recursion)은 수학적 귀납법과 논리가 일치한다
			
			// 0! = 1 
			// n! = n x (n-1)!
		
		
		//factorial
		public static int factorial(int n) {
			
			if(n==0) {
				return 1;
			} else {
				return n*factorial(n-1);
			}
			
			}
		
		
		//x의 n제곱근
		public static double power(double x, int n) {
			if(n==0) {
				return 1;
			}else {
				return x*power(x,n-1);
			}
			}
		
		
		//피보나치 수열 
		public int fibonacci(int n) {
			if(n<2) {
				return n;
			} else {
				return fibonacci(n-1)+fibonacci(n-2);
			}
		}
		
		
		
		//최대공약수 
		
		public static int gcd(int m , int n) {
			if(m<n) {
				int tmp = m; m=n; n=tmp;		//swap m and n
			}
			if(m%n == 0) {
				return n;
			} else {
				return gcd(n,m%n);
			}
				
		}
		
		
		// 2) Recursion 2강 
		
		//2.1) recursion으로 문자열의 길이 알아보기 
		public static int length(String str) {
			
			if(str.equals("")) { //길이가 0인 문자열과 동일하다면
				return 0;
			}else {
				return 1+length(str.substring(1)); //문자열 자르기 1번인덱스 이후의 값만 출력
			}
		}
		
		//2.2) recursion으로 문자열 출력하기 
		
		
		public static void printChar(String str) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("문자열을 입력하세요 : ");
			str = sc.nextLine();
			
			if(str.length()==0) {
				return ;
			} else {
				System.out.print(str.charAt(0));
				System.out.print(str.substring(1));
			}
		}
		
		//2.3) 문자열을 뒤집어서 프린트해보기 
		
		public static void printCharreverse(String str) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("문자열을 입력하세요 : ");
			str = sc.nextLine();

			
			if(str.length()==0) {
				return;
			} else {
				printCharreverse(str.substring(1)); //먼저 1번 이후 문자열을 뒤집어 프린트 후 
				System.out.println(str.charAt(0)); //마지막 첫글자를 프린트 하면됨
			}
		}
		
		// 2.4) 2진수로 변환하여 출력 
		
		public void printInBinary(int n) {
			
			if(n<2) { 
				System.out.println(n);
			}else {
				printInBinary(n/2);
				System.out.println(n%2);
			}
		}
		
		//2.5) recursion으로 배열의 합 구하기
		
		public static int sum(int n, int[] data) {
			if(n<=0) {
				return 0;
			} else {
				return sum(n-1, data) + data[n-1];
			} //data n-2까지의 합 + 마지막데이터 
		}
		
		//모든 순환함수는 반복문으로 변경가능 
		//그 역으로, 모든 반복문은 recursion으로 표현 가능함 
		//순환함수는 복잡한 알고리즘을 단순하고 알기쉽게 표현하는것을 가능하게함
		//하지만, recursion은 함수 호출에 따른 오버해드가 있음(매개변수 전달, 액티베이션 프레임 생성 등)
		//경우에 따라서 recursion을 쓰지않으면 지저분해질 수있는 코드를 깔끔하게 정리해준다는 장점이 있어서 사용한다. 
		
		
		
		
		// 3) recursion 3강 
		// 암시적 표현 => 명시적으로 표현하기 
		
		// 복습 ) recursion 무한반복을 피하는 법 
		// 1. 적어도 하나의 base case (순환되지 않고 종료되는 case)가 있어야함 
		// 2. 모든 case는 결국 base case로 수렴해야함 
		
			//3.1)  순차탐색 ==> 암묵적 표현식 
			//	 	시작구간이 0이지만, 암묵적(암시적)으로만 표현되어있음
		
			int search(int[] data, int n, int target) {
			
			for(int i=0;i<n;i++) {
				if(data[i] == target) {
					return i;
				} 
				
			} return -1;
		}
		
			//3.1)	순차탐색2 ==> 구간을 명시적으로 표현한 식 
			//		전의 식은 암묵적으로 begin이 0이었지만, 이 식은 int begin ~ int end 명시적으로 지정함
			
			int search(int[] data, int begin , int end, int target) {
			
				if(begin>end) { //검색할 데이터가 0개라는 의미 (begin == end면 데이터가 1개)
					return -1;
				} else if(target == data[begin]) {
					return begin; //맨 처음에 target이 있다면 바로 return
				} else {
					return search(data, begin+1 , end , target); //다시 자기자신을 호출(recursion)
					//(else if문이 false)만약 처음에 없다면, 
					//그 처음값을 제외한 나머지 식에서 target을 찾는 코드 
				}
			}
		
		
			// (명시적) 거꾸로 target찾는 식
		
			int endsearch(int[] data, int begin, int end , int target ) {
				if(begin>end) {
					return -1;
				} else if(target == data[end]) { //target이 있는지 끝을 먼저 확인
					return end;
				} else { //없다면 end를 제외한 나머지에서 식 확인 
					return search(data, begin, end-1, target);
				}
			}
			
			
			// 3.2) recursion으로 최대값 찾기 
			
			int findMax(int[] data, int begin, int end) {
				if(begin == end) {
					return data[begin];
				} else {
					return Math.max(data[begin], findMax(data,begin+1,end));
				}	// begin제외한 값들 중에서 max값을 찾기 
			}
		
		
			// 3.3) 이진검색
			//		파일을 크기 순으로 정렬된 배열들 
		
			public static int binarySearch(String[] items, String target, int begin, int end) {
				if(begin>end) {
				return -1;
				} else {
					int middle = (begin + end)/2;
					int compResult = target.compareTo(items[middle]);
					//내가 찾는값(target) 과 중간값 비교 
					
					if(compResult == 0) { //찾는값 == 중간값
						return middle;
					} else if (compResult<0) { // 찾는값이 작으면 음수 ( target < middle )
						return binarySearch(items, target, begin, middle-1);
					} else { // 찾는값이 양수 (target > middle)
						return binarySearch(items, target, middle+1, end);
					} 
					
					//만약 begin을 0, end을 n-1으로 정의했다면 
					//if문 안의 식을 recurtion식으로 표현할 수 없게되므로 
					//명시적으로 식을 표현해주는 것이 중요하다. 
				}
			}
			
		
		
		
		
		
		
} //class 