package com.kh.operator;

public class A_LogicalNegation { //���̸� : com.kh.operator.A_LogicalNegation

		public void method1() {
			/*
			 * �� ���� ������ (���� ������ == �ϳ��� ���� ������ ����)
			 *  ! 
			 *  ����(true/false)�� �ݴ�� �ٲ��ִ� ������
			 *  
			 *  ==> ��� ������ ������!!!
			 *  
			 */
			
			
			System.out.println("true�� ���� : " + !true);
			System.out.println("false�� ���� : " + !false);

			
			boolean b1 = true;
			System.out.println("b1�� ���� : " + !b1);
			
			boolean b2 = !b1; //false
			
			boolean b3 = !(5 > 3); // false
			
			System.out.println("b3 : " + b3);
			
			
		}
}
