package com.kh.array;
import java.util.Scanner;
public class A_Array {
	
	//���� : �ϳ��� ������ �ϳ��� ���� ���� �� ����
	//�迭 : �ϳ��� ������ �������� ���� ���� �� �ִ� ���� 
	//		"���� �ڷ��� ��"���θ� ���� �� ����
	//		��Ȯ�� �̾߱����ڸ� �迭�� �� �ε��� �ڸ��� ���� ���� ���(�ε����� 0���� ����!!)
	
	public void method1() {
		/*�迭�� �� ������ 

		//������� �͸��� �̿��ϰ� �Ǹ� => �뷮�� �����͵��� �����ϰ��� �Ҷ� 
		//������ ������ �ϳ���...������ ����� ���� �����ؾ��Ѵ�....���� 
		// int num1 = 0,1,2,3,4; �̷����� �������
		
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
		//����ϰ��� �Ҷ��� => ������ ����ؾߵ�(�ݺ��� Ȱ�� �Ұ�)
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		//�� �հ踦 ���Ҷ�����....�ϳ���..�ϳ���..
		int sum = num1 + num2 + num3 + num4 + num5; 
		*/
		
		/* ���� > �Ҵ� 
		 * 1.�迭 ���� ǥ����(�������� ������ ������ �迭�� ����ڴ�!!)
		 * 	�ڷ��� �迭��[];
		 * 	�ڷ���[] �迭��;
		 */
		// int a; // ��������
		// �迭���� ��� 1) int arr[];
		// �迭���� ��� 2) int[] arr; 
		
		
		/* 
		 * 2. �迭�Ҵ� (�� �迭�� ��� ���� �����Ұ��� ũ�⸦ �����ϴ� ����, (3ĭ,5ĭ...��, �� ������ŭ�� ���� �������) 
		 * 	    �迭�� = new �ڷ���[�迭�� ũ��];
		 */
		//arr = new int[5];
		
		//*** ����� �Ҵ� ���ÿ� ����?
		// �迭 ����� ���ÿ� �Ҵ� (�迭 ����� ���ÿ� ũ�� ����)
		
		int[] arr = new int[5]; //index 0|1|2|3|4 <- 5 /���⿡ �� �迭���� �Է� 
		
		/*
		 * 3. �� ����
		 * �迭��[�ε���] = ��;
		 */
		/*
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		*/
		
		// �迭 ���� : �ݺ��� Ȱ�� ����!!
		for(int i=0;i<5;i++) {
			arr[i] = i ;
		}
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);*/
		
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
			System.out.println(arr); //���� arr�̶�� �ڽ����� "**�ּҰ�"�̶�°� ������� => �̻��� ���� ��µǹ���
			
	}
	
	//date 2021.8.13
	public void method2() {
		int i = 10; 
		
		int[] iArr = new int[5]; 
		System.out.println(iArr); 
		
		double [] dArr = new double[3]; 
		System.out.println(dArr); 
		
		
		/*
		 * ���� ���ͷ� ���� ��ٷ� ���� �� �ִ� ������ �Ϲݸ����� �̾߱��ϰ� 
		 * �ּҰ��� ����ִ� ������ ���� ���� (���۷�������)
		 * 
		 * 
		 * �⺻�ڷ���(boolean,char,byte,int,long,short,float,double)
		 * =>���� ���ͷ� ���� �ٷ� ��� ���� => �׳� �Ϲ� ���� 
		 * 
		 * �� �� �ڷ��� (int[] , char[] , double[], short[],..,String[],Scanner)
		 * => �ּҰ��� ��� ���� => ��������(���۷��� ����) 
		 * 
		 */
		
	}
	
	public void method3() {
		int[] iArr = new int[3]; // 0~2�� �ε��� 
		double[] dArr = new double[4]; //0~3 �ε��� 
		
		//�迭�� �����ϰ� ũ������(�Ҵ�)������ �� ����
		//�׷� ������ �ε����� �ʱ�ȭ�� �Ǿ�������?
		
		//iArr���
		for(int i=0;i<3;i++) {
			System.out.println(iArr[i]);
		}
		
		//dArr���
		for(int i =0;i<4;i++) {
			System.out.println(dArr[i]);
		}
		//���� �� �ε����� �ʱ�ȭ�� ���� �ʾƵ� ������ �������!! ��??
		//Heap�̶�� ������ ���� ������� ������ �� ����!! �׷��� jvm�� �⺻���� 0���ζ� ä���ش�.
		//=> ���� ������ ����� �� �� JVM�� �⺻�����ζ� �ʱ�ȭ(����)�� ��������
		
	}
	
	public void method4() {
		int[] arr = new int[10];
		/*
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		*/
		
		//i�� �ε��� ��ȣ
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(arr); // �迭�� �ڷ���+@+�ּҰ��� 16���� ����
		System.out.println(arr.hashCode()); // �ּҰ��� 10���� ����
		System.out.println("�迭�� ���� : "+ arr.length); //�迭�� ���� 
	}
	
	
	public void method5() {
		
		int result=0;
		//�迭�� ������ ������Ű�����Ѵٸ�? ==> ������� ������� 
		int[] arr = null; //�ƹ��͵� �������� �ʰڴ�! 
		//�ּҰ��� ��� ������ �⺻���� null��! 
		
		System.out.println(arr);
		
		//null������ �޼ҵ带 ȣ���Ѵٰų� Ư����򰡿� �����ϰ��� �Ѵٸ� 
		//�׽� ������ �߻�!! NullPointerException		
		//System.out.println(arr.hashCode());
		//System.out.println(arr.length);
		//System.out.println(arr[0]);
	}
	
	public void method6() {
		int[] arr = new int[5];
		
		/*
		 * arr[0] = 2; 0+2
		 * arr[1] = 4; 1+3
		 * arr[2] = 6; 2+4
		 * arr[3] = 8; 3+5
		 * arr[4] = 10; 4+6
		 */
		
		/*
		for(int i=0;i<arr.length;i++) {
			
			arr[i]= 2(1*i);
			
		System.out.println(arr[i]);}
	
	*/	
		int value = 2;
		for(int i=0;i<arr.length;i++) {
			
			arr[i] = value;
			value += 2;
		
		}
		
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
			System.out.println("arr�� 10���� �ؽ��ڵ� �� : "+ arr.hashCode());
			System.out.println("arr�� ���� : " + arr.length);
		
			/*
			 * ArrayIndexOutOfBoundsException : �迭�� �������� �ε��� ���ý� �߻� (�������� ��� �ε��� ���÷� �����߻�)
			arr[5] = 12;
			arr[6] = 14;
			*/
			
			// * �迭�� ���� ū ���� 
			// - �ѹ� ������ �迭�� ũ��� ���� �Ұ� 
			// => �迭�� ũ�⸦ �����ϰ��� �Ѵٸ� �ٽ� �����ߵ� 
			
			arr = new int[7]; //���� �迭 ���� �����Ѵ�. �ʱⰪ 0 ���� ä���� 
			System.out.println("���� ���� arr�� 10���� �ؽ��ڵ� �� : "+ arr.hashCode());
			System.out.println("���� ���� arr�� ���� : " + arr.length);	
			// �ּҰ��� ����� !! => ���ο� ���� �����ϰ� ����!! 
			
			/*
			 * ������ ������ ���� �迭�� Heap������ �յն��ٴ�(��𿡵� �����Ǿ����� �����Ƿ� �ʿ���� ������ == �����ִ°� ����)
			 * => �����ð��� ������ "�������÷���(GC)"�� �˾Ƽ� ������!!
			 * => �ڹٿ����� "�ڵ��޸� ����"�� ���شٴ� Ư¡!! == �����ڰ� �ڵ��ۼ����� �Ű澵�� ���� 
			 */
	
			
			
			//�迭�� ������ ������Ű���� �Ѵٸ�?? ==> ������� ������ �� ! 
			arr = null; // �ƹ��͵� �������� �ʰڴ�!! �׷� ������ �ִ� �ּҿ� stack�� �ִ� �ּ��� ������ ����� , arr �ּҴ� null �� �ȴ�
			//�׸��� Heap�� �ִ� int[7]�� ���߿� ���� �� ���̴�.
			System.out.println(arr);
			
			//null.xxxx() ==> NullPointerException �߻� 
	}
	
			public void method7() {
				//�迭 ����,�Ҵ�,�ʱ�ȭ �� ���ÿ��ϱ� 				
				int[] arr1 = new int[] {1,2,3,4}; //ǥ����1
				int[] arr2 = {1, 2, 3, 4}; // ǥ���� 2
				
				System.out.println(arr1 == arr2); // false
				//������ ������ ����ִ� �ּҰ��� ���ϱ� ������ 
				
			}
	
	 public void method8() {
		 
		 //1. ũ�� 10¥���� ���� �迭 ���� �� �迭�� arr
		 	int[] arr = new int[10];
		 	
		 //2. �ݺ����� Ȱ���ؼ� index 0�������� ������ ���� ���������� �����ϸ鼭 ���� ���� 
		 //	    �Ź� 1~100 ���̿��� �߻��Ǵ� ������ 
		 	for(int i=0;i<arr.length;i++) {
		 		arr[i] =(int)(Math.random() * 100 + 1); //random���� ������ int�� ��������ȯ������� 
		 	}
		 	
		 //3. �ݺ����� Ȱ���ؼ� �ش� �迭�� 0�� �ε��� ~ ������ �ε������� ����ִ� �� ���
		 //	    arr[x] : xx
		 
		 	for(int i=0;i<arr.length;i++) {
		 		// System.out.printf("arr[%d] : %d\n" ,i, arr[i]);
		 		System.out.println("arr[" + i +"] : " + arr[i]);
		 	}
		 	
		 	
	 }
	
	public void method9() {
		//** �� �𸣰��� ������ �����ϱ� 
		
		// 1. ���ڿ� �迭 ����ڿ��� �迭�� ���̸� �Է¹��� �� 
		//	    �ش� �� ũ�⸸ŭ�� ���ڿ� �迭 ����	
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�迭�� ���� : ");
		int size = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[size];  
		
		// 2. �ݺ����� ����ؼ� �Ź� ����ڿ��� ���ϸ��� �Է¹޾� �� ���� �� �ε��� �ڸ��� ����(0�� ~ ������ �ε���)
		for(int i=0;i<arr.length;i++) {
			System.out.print("�����ϴ� ���ϸ� �Է� : ");
			arr[i] = sc.nextLine();
		}  
		//3. �ݺ����� Ȱ���ؼ� 0~�������ε������� ��� ���� ���  
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
	}
	
	public void method10() {
		
		// ����ڿ��� ���ڿ� �ϳ� �Է¹��� ��
		// ������ �ε����� �ִ� ���ڵ��� char�迭�� �Űܴ��
		
		//1. ����ڿ��� ���ڿ� �Է¹ޱ� 
			Scanner sc = new Scanner(System.in);
			System.out.print("���ڿ� �Է� : ");
			String str = sc.nextLine();
			
			System.out.print("ã�����ϴ� ���� : ");
			char ch = sc.nextLine().charAt(0);
			
		//2. char �迭 �����صα� (�̶� �迭�� ũ�� == ���ڿ��� ���̸�ŭ )
			//���ڿ� ���� : ���ڿ�.length()
			char[] arr = new char[str.length()];
			
			
		
		//3.�ݺ��� Ȱ���ؼ� �ش� ���ڿ����� �� �ε����� ���ڸ� char�迭�� �� �ε��� ���� 
		/*
		 * arr[0] = str.charAt(0);
		 * arr[1] = str.charAt(1);
		 * ....
		 * arr[������] = str.charAt(������);
		 */
			
			for(int i=0;i<arr.length;i++) {
				arr[i] = str.charAt(i);
			}
		//4.�ݺ��� Ȱ���ؼ� �ش� �迭�� 0~�������ε��� ���� ��� �� ��� 
			int count = 0; // ��ġ�ϴ� ���ڰ� ������ ��� �Ź� 1�� ���� 
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
				
				if(ch == arr[i]) {
					count++;
				}
				
			} System.out.println("ã���� ���� ���� : " + count);
	}
	
	public void method11() {
		
		//1. ����ڿ��� �迭�� ���� �Է¹��� �� �ش� ũ�⸸ŭ�� �����迭 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭�� ���� �Է� : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		//2. �ݺ��� Ȱ���ؼ� 0~�������ε������� �Ź� 1~100������ ������ �߻����� ���� 
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100+1);
		}
		
		//3. �ݺ��� Ȱ���ؼ� 0~�������ε������� ��� ���� ��°� ���ÿ� 
		//	  �ش� �� �ε����� ��� ���� ¦���� ������ �� �հ踦 ���Ѵ�.  
		int sum = 0;
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);				
				if(arr[i]%2 == 0) {
					sum += arr[i];
				}
			}
		
		//4. ������ ������ ¦������ ���� ��� 
			System.out.println("¦������ �� �հ� : " + sum);
	}
	
		public void remind() {
			/* �������� ������ ���α׷����� ���� ��� 
			int age1 = 15;
			int age2 = 23;
			int age3 = 50;
			int age4 = 34;
			int age5 = 25;
			
			//System.out.println(agei); // agei��� �������� ã���־ �ȵ� 
			//System.out.println(age+i) // age��� �������� ã���־ �ȵ� 
			
			*/
			
			//�迭������ ���α׷��� 
			int[] ages = new int[5];
			
			ages[0]=15;
			ages[1]=23;
			ages[2]=50;
			ages[3]=34;
			ages[4]=25;
			
			int sum=0;
			for(int i=0;i<ages.length;i++) {
				System.out.println(ages[i]);
				sum += ages[i];
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
