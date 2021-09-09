package com.kh.chap03.branch;

public class B_Continue {

		/*
		 * continue;	:  �ݺ��� �ȿ� ����Ǵ� ���� 
		 * 				   continue;���� ����� �� ���� �������� ������� �ʰ� ��ٷ� ���� �����ִ� �ݺ��� ���� �ö�
		 */
	
	
		public void method1(){

			// 1���� 10������ Ȧ�� ���
			// 1 3 5 7 9
			/* for (int i = 1; i <= 10; i++) { // i�� ���� 1�������� 10�� �ɶ����� 1�������ϸ� �ݺ�(10ȸ�ݺ�)
				if (i % 2 == 1) {
					System.out.print(i + " ");
				}
			}
*/
			
			for (int i=1;i<=10;i++) {
				if(i % 2 ==0) {
					continue; //�ݺ��� ���� ���� �������� ������� �ʰ� �ݺ��� ���� �ö�(������)
				}
				System.out.print(i+" ");
			}
		} 
		
		public void method2() {
			// 1���� 100������ �� �հ�
			// ��, 6�� ������� ���� ��������

			int sum = 0;
			for (int i = 1; i <= 100; i++) {
				if (i % 6 == 0) {
					continue;
				}
				sum += i;
			}
			System.out.println("��� : " + sum);
		}
		
		//control+shift+f ������ �ڵ� �ٹ迭 
		public void method3() {
			//2~9�ܱ��� ��� 
			//��, 3�� ������� ���� ��� 
			
			//2�� => �������� �� 1~9
			//3�� => �������� �� 1~9
			//4�� => �������� �� 1~9
			//...
			//9�� => �������� �� 1~9
			
			//�ٱ��� 		���� 
			
			for (int dan=2;dan<=9;dan++) {
				System.out.println("===="+dan+"�� ====\n");
			for(int su=1;su<=9;su++) {
				if(dan % 3 == 0) {
					continue;
				}
				System.out.printf("%d x %d = %d\n",dan,su,(dan*su));
			}
			System.out.println();
		}
	}
}

