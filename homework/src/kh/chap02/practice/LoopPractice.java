package kh.chap02.practice;

import java.util.Scanner;

public class LoopPractice {

	private Object num1strnum2;

	public void practice1() {
		
		
		// �Ѱ��� ���ڸ� �Է¹ް�  1���� �� ���ڱ����� ���ڵ��� ��� ��� 
		//�� �Է��� ���� 1���� ũ�ų� ���ƾ��ϰ� 1�̸��� ��� �ٽ��Է��϶�� ��¹� ��� 
		
		Scanner sc = new Scanner(System.in);

		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		// 1 2 3 4
		int num = sc.nextInt();
		int i = 0;
		
		if(num>=1) {
			for (i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}
		} else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}

	}
		
		
		public void practice2() {
			
			Scanner sc = new Scanner(System.in);

			while (true) {
				System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
				// 1 2 3 4
				int num = sc.nextInt();

				int i = 0;

				if (num >= 1) {
					for (i = 1; i <= num; i++) {
						System.out.print(i + " ");
					} break;		
				} else {
					System.out.println("�߸��Է��ϼ̽��ϴ�.");
				}

			} System.out.println("\n���α׷��� �����մϴ�.");

		}  
	
	
		
		
		public void practice3() {

			Scanner sc = new Scanner(System.in);
			

			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			int num = sc.nextInt();
			
			int i = 0;
			for(i=num;i>=1;i--) {
				System.out.print(i+" ");
		}
			
	}
		
		
		public void practice4() {
			
			Scanner sc = new Scanner(System.in);
			
			while (true) {
				
				System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
				int num = sc.nextInt();
				
				if (num >= 1) {
					int i = 0;
					
					for (i = num; i >= 1; i--) {
						System.out.print(i + " ");
					} 
					break;
				
				} else {
					System.out.println("�߸��Է��ϼŽ��ϴ�. �ٽ� �Է����ּ���."); 
					}
			
			}
			}


			public void practice5() {
				// 1���� �Է¹��� �������� �������� ���� ����ϼ���.
				Scanner sc = new Scanner(System.in);

				System.out.print("���� �ϳ��� �Է��ϼ��� : ");
				int num = sc.nextInt();

				int Sum = 0;
				int i = 0;

				for (i = 1; i <= num; i++) {

					Sum += i;
					if (i < num) {
						System.out.print(i + " + ");
					} else {
						System.out.print(i + " = ");
						System.out.println(Sum);
					}
				}
			}


		public void practice6() {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("ù��° ���� : ");
			int num1 = sc.nextInt();
	
			System.out.print("�ι�° ���� : ");
			int num2 = sc.nextInt();
		
			if(num1>=1 && num2>=1) { //�μ� ��� �� �Է����� ��� => �������ڿ������� ū ���ڿ������� �Ź� 1�������ϴ� �����				
				/*
				//1) �μ��� ������ �ּҰ�, �ִ밪�� �˾Ƴ��ߵ�! 
			
				int min =0; //�� �� �߿� ���� ���� ����ϱ����� ����
				int max =0; //�� �� �߿� ū ���� ����ϱ� ���� ���� 

					if(num1>num2) {
						min=num2;
						max=num1;
					} else {
						min=num1;
						max=num2;
					}*/
				
				
				int min = Math.min(num1, num2);
				int max = Math.max(num1, num2);
				
				//2) �ּҰ��������� �ִ밪���� �Ź� 1�������ϴ� ���� ��� 
				
					for(int i =min;i<=max;i++) {
						System.out.print(i + " ");
					}
			} else { System.out.println("1�̻��� ���ڸ� �Է����ּ���");} 
			//�߸��Է����� ��� =>"1�̻��� ���ڸ� �Է����ּ���" ��� 
	
		}
		
		
		public void practice7() {
			
			Scanner sc = new Scanner(System.in);
			
			while(true) {
			System.out.print("ù��° ���� : ");
			int a = sc.nextInt();
			System.out.println();
			System.out.print("�ι�° ���� : ");
			int b = sc.nextInt();
		
			int i = 0;
				
			if(a >= 1 && b >= 1 && a > b){
					for (i = b; a >= b; b++) {
						System.out.print(b + " ");
					} break;
				} else if (a >= 1 && b >= 1 && a < b) {
					for (i = a; a <= b; a++) {
						System.out.print(a + " ");
					} break;
				} else if (a == b) {
					System.out.println(a); break;
				} else if (a <  1  || b < 1) {
					System.out.println("1�̻��� ���ڸ��� �Է����ּ���.");
				} 
			}

		
		}
		
		
		public void practice8() {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("���� : " );
			int num = sc.nextInt();
			
			System.out.println("====" + num + "�� ====");
			int su = 0;
			
			for(su =1;su <=9;su++) {
				System.out.printf("%d * %d = %d\n", num,su,num*su);	
			}
			
		}
		
		
		public void practice9() {
			
			Scanner sc = new Scanner(System.in);
			
			
				
			System.out.print("����(2~9) : ");
			int dan = sc.nextInt();

			if (dan >= 2 && dan <= 9) {
				int su = 0;
				int j = 0;

				for (j = dan; dan <= 9; dan++) {
					for (su = 1; su <= 9; su++) {
						System.out.printf("%d * %d = %d\n", dan, su, (dan * su));
					} 
					System.out.println();
			}
		} else {
			System.out.println("2~9������ ���ڸ� �Է����ּ���.");
		}
		}
		
		public void practice10() {

			Scanner sc = new Scanner(System.in);
			
			while(true) {
				
			System.out.print("����(2~9) : ");
			int dan = sc.nextInt();

			if (dan >= 2 && dan <= 9) {
				int su = 0;
				int j = 0;

				for (j = dan; dan <= 9; dan++) {
					for (su = 1; su <= 9; su++) {
						System.out.printf("%d * %d = %d", dan, su, dan * su);
						System.out.println();
					} break;
				} 
			} else {
				System.out.println("2~9������ ���ڸ� �Է����ּ���.");
			}
		}
	}
		
		public void method11() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("���� ���� : ");
			int start = sc.nextInt();
			System.out.print("���� : ");
			int num = sc.nextInt();
			
			/* ���� ����...
			int i = 0;
			int j = 0;
			
			for(j=0;j<=9;j++) {
				for(i=str;str<=str+a*j;) {
					System.out.print(str+a*j+" ");
				break;}
			} */
			
			for(int i = 1 ; i<=10;i++) {
				System.out.println(start + " ");
				start += num;
				
				//start���������� �Ź� num�� �����Ǵ� ���� ���(10����!)
			}
			
		}
		
		public void practice12() {
			
			Scanner sc = new Scanner(System.in);
			/*
			 * ���ѹݺ� {
			 * 
			 * 		1. ������ �Է¹ޱ�			 
			 * 			>>���� �Է¹ޱ� ���� ����ڰ� �Է��� �����ڰ� "exit"�ΰ�� => 
			 * 			"���α׷��� �����մϴ�." ����� �ݺ��� ����			 
			 * 		2. ���� �ΰ� �Է¹ޱ� 
			 * 			>>�����ڰ� / �ų� %�϶� �ι�° �������� 0�ϰ�� => "0���� ������ �����ϴ� 
			 * 			�ٽ� �Է����ּ���" ����� �ݺ��� �ٽ� ���� 
			 * 		3.�����ȣ�� ���� �ش� ���� ����� ��� 
			 * 			�����ȣ�� �߸��Է����� ��� => "���� �������Դϴ�. �ٽ��Է����ּ���."
			 */
			
			//1.������ �Է¹ޱ� 
			while(true) {
			System.out.print("������(+ - / * %)�Է� : ");
			//>>���� �Է¹ޱ� ���� ����ڰ� �Է��� �����ڰ� "exit"�ΰ�� => "���α׷��� �����մϴ�."
			String str = sc.nextLine();//"+","-","*","%","/" , "exit"
			if(str.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} 
			
			//2. ���� �ΰ� �Է¹ޱ� 
			System.out.print("���� 1 :");
			int num1 = sc.nextInt();
			
			System.out.print("���� 2 :");
			int num2 = sc.nextInt();
			sc.nextLine(); //���ѹݺ��ǹǷ� ���ۿ� int������ ����  ���͸� ����������Ѵ� / �ȸ� ������ , ���� ���� ���͹����� ���� 
			
			//>>�����ڰ� / �ų� %�϶� �ι�° �������� 0�ϰ�� => "0���� ������ �����ϴ� 
			// 			�ٽ� �Է����ּ���" ����� �ݺ��� �ٽ� ���� 
			
			if((str.equals("/") || str.equals("%")) && num2 == 0) {//�켱������ �ٸ������� ���
				System.out.println("0���� ���� �� �����ϴ�. �ٽ��Է����ּ���\n");
				continue;
			}
			//3. �����ȣ�� ���� �ش� ������ ���
			int result = 0;
			
			switch(str) {
			case "+" : result = num1 + num2;break; //break;�� ������ �͸� �����ϰ� ���� �������� 
			case "-" : result = num1 - num2;break;
			case "*" : result = num1 * num2;break;
			case "/" : result = num1 / num2;break;
			case "%" : result = num1 % num2;break;
			default  : System.out.println("���� �������Դϴ�. �ٽ��Է����ּ���.\n"); continue;
			} System.out.printf("%d %s %d = %d\n\n" , num1,str,num2,result);
				
		
	
			}	
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		


