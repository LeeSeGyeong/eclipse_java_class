package study.algorism;

import java.util.Scanner;

public class Recursion {
	
		
			//	Recursion (�ͳ��Լ�) : �ڱ��ڽ��� ȣ���ϴ� �Լ� 
			// 
			//	public void func() {
			//		func();
			//		func();
					
			//		.....
			//		}
			//				�ڱ� �ڽ��� �ٽ�
			//				�ڱ� �ڽ��� �ݺ������� ȣ���Ѵ�.
		
	
			// 1) recursion�� �⺻ ���� : �ڱ��ڽ��� �ݺ������� ȣ���ϴ� ���ø� ���캸��
		
		public static void func1() { //func��� �̸��� �Լ��� 
			System.out.println("Hello..");
			func1(); //�ڱ��ڽ��� func()�� �ٽ� ȣ���ϴ� �� 
			
			//�׷��� �ƹ��͵� ���ϸ� �ݺ��ǰ��ִ��� �𸣴ϱ� ��¹��� ����ϰ�,
			//���� �ڱ��ڽ�(func())�� ȣ���ϵ����ϴ� ���̴�.
		
			// * ���� ���� 
			// 1. ���� �޼ҵ忡�� func()�� ȣ���ϸ� (Run class���� �������ְ�����)
			// 2. Hello�� ��� �ǰ� 
			// 3. func()�� ȣ��ǹǷ� �ٽ� void func()�� ����� 
			// 4. �׷��� �Ǹ� �ٽ� Hello�� ��µǰ�
			// 5. �״��� ������ func() -> void func() ���� -> Hello -> func....
			// 6. ������ �ʰ� ���ѹݺ��� ����ȴ�.
		
		
			//��� : ���ѹݺ��� ����ȴ�.

			} // func
	
			//2) recursion�� �׻� ���ѷ����� ������?
			
		public static void func2(int k) { //1. �Ű������� � ���� k �� �־�����
			// runŬ�������� n=4�� �����ؼ� �����Ŵ
			// int n = 4; -> func(n);
			// func(4); �̷���!
		
			if(k<=0){ 	 // 2. �Ű����� k�� ���� 0���϶��
			return ; // 3. �ڱ��ڽ��� ȣ��(recursion)���� �ʰ� �����Ѵ�. 
			} else { //4. �� ���� ���, ����� ��쿡�� �ڱ��ڽ��� ȣ���Ұǵ�  (else�� ��, k<=0�� �ƴѰ��ϱ�)
			System.out.println("Hello..");
			func2(k-1); 
			//5. k���� �״�� �Ѱ��ִ� ���� �ƴ϶� k-1�� ���� �Ű������� �Ѱ��ִ� ���·� ����غ� ���̴� 
			//6. �׷��� ���� 4���� ��µȴ�. 
			//7. recursion�� �׻� ���ѷ����� �����°��� �ƴ�
			
			// ��� : recursion�� 4�� ��µǰ� ����ȴ�. (return)
				}
			} //func2�� ����
	
	
			// 3) ���ѷ����� �������ʵ��� �����ִ� 2���� ����! 
		public static void func3(int k) {
				if (k <= 0) {
			return; //1. Base case : ��� �ϳ��� recursion�� ������ �ʴ� ��찡 �����ؾ� �Ѵ�.
					// return; ���� �ڱ��ڽ��� �������� �ʰ� ��������. �̸� Base Case��� �Ѵ�.
			} else {
			System.out.println("Hello..");
			func3(k - 1); 
			// ������ return; = Basecase�� �ִٰ� ���ѷ����� ���� �� ������? (X)
			// ����, else ���� ���� func(k + 1) �̶�� k�� ���� ��� �þ ���ѷ����� �ݺ��ȴ�.
			// �׷��� �ݺ��� �ϴٰ� �ϴٰ�.....
			// ����ƴ�  base case�� �����ϵ��� ���� �ۼ��Ǿ��Ѵ�.
					
			//���� ) �Ʒ��� �ΰ��� ������ ������Ű�� ���ѷ����� ������ �ʴ´�. 
			//1. Base case��? :��� �ϳ��� ���� recursion�� ������ �ʴ� ���� �����ؾ� �Ѵ�. return; ���� �ڱ��ڽ��� �������� �ʰ� ��������. �̸� Base Case��� �Ѵ�.
			//2. recursive case��? : recursion�� �ݺ��ϴٺ��� �ᱹ base case�� �����ؾ��Ѵ�.
			
				}
			}//func3�� ���� 
	
		public static int func4(int n) {
			
			//int result = rs.func4(4); 
			//System.out.println(result);
			//RunŬ�������� n=4�� �����ϰ� ������� ���
			
			if(n<=0) { 
				return 0;
			} else {
				return n+func4(n-1);
			}
			
			// func(n)�� ����� 1 ~ n ������ ���� ��µȴ�.
			
			// 1. �켱 n = 4 �̴� �����غ��ô�.
			// 2. 4 > 0�̹Ƿ�   ----------------> return 4 + func(3)�� �ǰ���?
			// 3. func(3)�� ã���� ���� ������ ����	   return 3 + func(2) 
			// 4. func(2)�� ã���� ���� ������ �� 	   return 2 + func(1)
			// 5. func(1)�� ã���� ���� ������ ��  	   return 1 + func(0) 
			// 6. func(0)�� return 0 �̹Ƿ� ����ȴ� 
			
			//7. �׷��ٸ� func(0) = 0
			//8. func(1) = 1 , func(2) = 2 + 1 , func(3) = 1+2+3 , func(4) = 1+2+3+4
			//9. ��, ���� �Ŀ��� �� func(n)���� 1~n ������ ���� ����ϰ� �ȴ� 
			
			}//func4�� ���� 
		
		public static int func5(int n) { // �̼� : 0 ~ n ������ ���� ���ϴ� ���̴� 
			if(n==0) {
				return 0; //n�� 0�̸� ���� 0�̴� 
			}else { //n�� 0���� ũ�ٸ�
				return n + func5(n-1);
			}  // 0~n������ ����  0���� n-1������ �� + n�� ���� ���̴�  
		}
	
		
		
			// ���� 
			// ���� �ĵ�(��ȯ�Լ� = recursion)�� ������ �ͳ����� ���� ��ġ�Ѵ�
			
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
		
		
		//x�� n������
		public static double power(double x, int n) {
			if(n==0) {
				return 1;
			}else {
				return x*power(x,n-1);
			}
			}
		
		
		//�Ǻ���ġ ���� 
		public int fibonacci(int n) {
			if(n<2) {
				return n;
			} else {
				return fibonacci(n-1)+fibonacci(n-2);
			}
		}
		
		
		
		//�ִ����� 
		
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
		
		
		// 2) Recursion 2�� 
		
		//2.1) recursion���� ���ڿ��� ���� �˾ƺ��� 
		public static int length(String str) {
			
			if(str.equals("")) { //���̰� 0�� ���ڿ��� �����ϴٸ�
				return 0;
			}else {
				return 1+length(str.substring(1)); //���ڿ� �ڸ��� 1���ε��� ������ ���� ���
			}
		}
		
		//2.2) recursion���� ���ڿ� ����ϱ� 
		
		
		public static void printChar(String str) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("���ڿ��� �Է��ϼ��� : ");
			str = sc.nextLine();
			
			if(str.length()==0) {
				return ;
			} else {
				System.out.print(str.charAt(0));
				System.out.print(str.substring(1));
			}
		}
		
		//2.3) ���ڿ��� ����� ����Ʈ�غ��� 
		
		public static void printCharreverse(String str) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("���ڿ��� �Է��ϼ��� : ");
			str = sc.nextLine();

			
			if(str.length()==0) {
				return;
			} else {
				printCharreverse(str.substring(1)); //���� 1�� ���� ���ڿ��� ������ ����Ʈ �� 
				System.out.println(str.charAt(0)); //������ ù���ڸ� ����Ʈ �ϸ��
			}
		}
		
		// 2.4) 2������ ��ȯ�Ͽ� ��� 
		
		public void printInBinary(int n) {
			
			if(n<2) { 
				System.out.println(n);
			}else {
				printInBinary(n/2);
				System.out.println(n%2);
			}
		}
		
		//2.5) recursion���� �迭�� �� ���ϱ�
		
		public static int sum(int n, int[] data) {
			if(n<=0) {
				return 0;
			} else {
				return sum(n-1, data) + data[n-1];
			} //data n-2������ �� + ������������ 
		}
		
		//��� ��ȯ�Լ��� �ݺ������� ���氡�� 
		//�� ������, ��� �ݺ����� recursion���� ǥ�� ������ 
		//��ȯ�Լ��� ������ �˰����� �ܼ��ϰ� �˱⽱�� ǥ���ϴ°��� �����ϰ���
		//������, recursion�� �Լ� ȣ�⿡ ���� �����ص尡 ����(�Ű����� ����, ��Ƽ���̼� ������ ���� ��)
		//��쿡 ���� recursion�� ���������� ���������� ���ִ� �ڵ带 ����ϰ� �������شٴ� ������ �־ ����Ѵ�. 
		
		
		
		
		// 3) recursion 3�� 
		// �Ͻ��� ǥ�� => ��������� ǥ���ϱ� 
		
		// ���� ) recursion ���ѹݺ��� ���ϴ� �� 
		// 1. ��� �ϳ��� base case (��ȯ���� �ʰ� ����Ǵ� case)�� �־���� 
		// 2. ��� case�� �ᱹ base case�� �����ؾ��� 
		
			//3.1)  ����Ž�� ==> �Ϲ��� ǥ���� 
			//	 	���۱����� 0������, �Ϲ���(�Ͻ���)���θ� ǥ���Ǿ�����
		
			int search(int[] data, int n, int target) {
			
			for(int i=0;i<n;i++) {
				if(data[i] == target) {
					return i;
				} 
				
			} return -1;
		}
		
			//3.1)	����Ž��2 ==> ������ ��������� ǥ���� �� 
			//		���� ���� �Ϲ������� begin�� 0�̾�����, �� ���� int begin ~ int end ��������� ������
			
			int search(int[] data, int begin , int end, int target) {
			
				if(begin>end) { //�˻��� �����Ͱ� 0����� �ǹ� (begin == end�� �����Ͱ� 1��)
					return -1;
				} else if(target == data[begin]) {
					return begin; //�� ó���� target�� �ִٸ� �ٷ� return
				} else {
					return search(data, begin+1 , end , target); //�ٽ� �ڱ��ڽ��� ȣ��(recursion)
					//(else if���� false)���� ó���� ���ٸ�, 
					//�� ó������ ������ ������ �Ŀ��� target�� ã�� �ڵ� 
				}
			}
		
		
			// (�����) �Ųٷ� targetã�� ��
		
			int endsearch(int[] data, int begin, int end , int target ) {
				if(begin>end) {
					return -1;
				} else if(target == data[end]) { //target�� �ִ��� ���� ���� Ȯ��
					return end;
				} else { //���ٸ� end�� ������ ���������� �� Ȯ�� 
					return search(data, begin, end-1, target);
				}
			}
			
			
			// 3.2) recursion���� �ִ밪 ã�� 
			
			int findMax(int[] data, int begin, int end) {
				if(begin == end) {
					return data[begin];
				} else {
					return Math.max(data[begin], findMax(data,begin+1,end));
				}	// begin������ ���� �߿��� max���� ã�� 
			}
		
		
			// 3.3) �����˻�
			//		������ ũ�� ������ ���ĵ� �迭�� 
		
			public static int binarySearch(String[] items, String target, int begin, int end) {
				if(begin>end) {
				return -1;
				} else {
					int middle = (begin + end)/2;
					int compResult = target.compareTo(items[middle]);
					//���� ã�°�(target) �� �߰��� �� 
					
					if(compResult == 0) { //ã�°� == �߰���
						return middle;
					} else if (compResult<0) { // ã�°��� ������ ���� ( target < middle )
						return binarySearch(items, target, begin, middle-1);
					} else { // ã�°��� ��� (target > middle)
						return binarySearch(items, target, middle+1, end);
					} 
					
					//���� begin�� 0, end�� n-1���� �����ߴٸ� 
					//if�� ���� ���� recurtion������ ǥ���� �� ���ԵǹǷ� 
					//��������� ���� ǥ�����ִ� ���� �߿��ϴ�. 
				}
			}
			
		
		
		
		
		
		
} //class 