package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UnCheckedException { //�� ����ó���� �ؾ��ϴ� ���� �ƴ϶�� �ǹ̷� == UnCeckedException
	//�ٸ� ���ǹ����� ���� �����ϴϱ� 
	
	
	/*
	 * * RuntimeException 
	 *   ���α׷� ����� �߻��Ǵ� ���ܵ� (��κ� ���������� ���� Ư¡)
	 *   
	 *   RuntimeException�� �ļյ�
	 *   -IndexOutOfBoundsException : �������� �ε����� ������ ���ٽ� �߻��Ǵ� ���� 
	 *   -NullPointException  : ���������� null�� �ʱ�ȭ�� ��Ȳ���� ��ſ� �������� �� �߻��Ǵ� ���� 
	 *   -ArithmeticException : ������ ���꿡�� 0���� �������� �߻��Ǵ� ���� 
	 *   -ClassCastException  : ����� �� ���� ����ȯ�� ����� �� �߻��Ǵ� ����
	 *   -NegativeArraySizeException : �迭 �Ҵ�������� �迭�� ũ�Ⱑ ������ �� �߻��Ǵ� ���� 
	 *   
	 *   => RuntimeException�� ���õ� ���ܵ��� ����� ������ �����ϴ�.
	 *      ���ʿ� ���ܰ� �߻����� �ʰ� if������ ����ó�� �����ϴ� (if���� ����ó���� ���ִ°� �ƴ�, �׳� ���� ó��)
	 */
	
	
	
	 private Scanner sc = new Scanner(System.in);
	 
	 public void method1() {
		 //ArithmeticException : ������ ����� 0���� �������� �߻��Ǵ� ����(����)
		 
		 System.out.print("����1 : ");
		 int num1 = sc.nextInt();
		 System.out.print("����2 : ");
		 int num2 = sc.nextInt();
		 
		 // int result = num1 / num2 ;  // num2�� 0�� �Է��ϴ� ���ܰ� �߻��Ѵ�! ����ó���� ������� ������ ��������
		 
		 
		 // 1) if�� �������� ���ܹ߻��� �������ֱ� (if���� ���� ������..)
		 
		 //���ʿ� ���ܰ� �߻����� �ʵ��� if������ ���ǰ˻����ֱ�
		 //����ó�� : ���ܰ� �߻��ϸ� ó�����ִ� �� => if���� ���ܹ߻��ϱ� ���� �����ؼ� ó�����ذŴϱ� ����ó���� �ƴ�
		 /*
		 int result = 0;
		 if(num2 != 0) {
			 result = num1 / num2 ; //���� ó���� ����� , �ι�° ���� 0�� �Է��ϸ� ������� 0�� ��µ�
		 }
		 
		 
		 System.out.println("����� �˷��帮�ڽ��ϴ�.");
		 System.out.println("result : "+result); */
		 
		 
		 // 2) ����ó���������� ó���غ��� : try catch��
		 // ����ó�� : ���ܰ� ������ �߻����� �� ����Ǵ� ������ �̸� �ۼ��� ���� ��� 
		 
		 /* 
		  *  * try catch ��� (�ΰ��� �¶�) : ����ó�� ��� 
		  *  
		  *  try{
		  *  	���ܰ� �߻��� �� �ִ� ����; (���� ��� ������)
		  *  } catch(�߻��� ����Ŭ�������� + �Ű����� ������){ //���ܰ� �߻��Ǵ� ���� ����ִ�(catch) ��
		  *    	�ش� ���ܰ� �߻����� ��� ������ ����;
		  *  }
		  *  
		  */
		 
		 
		 try {
			 int result = num1/num2;
			 System.out.println("result : " + result);
		 } catch(ArithmeticException e) {
			 System.out.println("0���� ���� �� ���ŵ��?");
			 //e.printStackTrace(); //������ ������ ������ �� �� �����Ű�� ����
		 }
		 
		 System.out.println("���α׷��� �����մϴ�.");
	 }

	 
	 
	 // 2) ���� catch ���� 
	 public void method2() { 
		 //NegativeArraySizeException ���� ó���غ��� : �迭�� ���� ���� �� , �� ���̸� ������ ���ϸ� �߻��ϴ� ����
		 //ArrayIndexOutOfBoundsException ���� ó���غ���   : �������� �ε����� ������ ���ٽ� �߻��Ǵ� ���� 
		 
		 System.out.print("�迭�� ũ�� : ");
		 int size = sc.nextInt();
		/*
		 if(size>=101) { // (2) if�� ���ǽ����� ���ܸ� �̸� �������ִ� ����� �Ế�ô� 
			 			 // arr[ ]������� if���� ���� false�� ������ ���൵ �ȵǴϱ� ������ �߻����� �ʾƿ� 
			 
		 // (1) �켱 ���ܰ� ���ٰ� �����ϰ� ���� ����� ���ô� 
		 int[] arr = new int[size];
		 System.out.println("100�� �ε��� �� : " + arr[100]);
		 }
		 System.out.println("���α׷��� �����մϴ�.");*/
		 
		 
		 try {
			 int[] arr = new int[size];
			 System.out.println("100�� �ε��� �� : "+arr[100]);
		 } catch(NegativeArraySizeException e) {
			 System.out.println("�迭�� ũ��� ������ ������ �� �����ϴ�.");
		 }catch(ArrayIndexOutOfBoundsException e) { 
			 System.out.println("�������� �ε����� �����߽��ϴ�.");
		 } 
		 
		 //�Ѱ��� �̻��� catch������ �׳� �ٷ� �Ʒ��� �� �����ָ�ȴ�. 
		 //���� catch�� �ۼ����� 
		 
		 System.out.println("���α׷��� �����մϴ�.");
	 } 
	 
	 
	 // 3) �������� �̿��� Exception���� (ª�� ������) 
	 public void method3() {
		
		 /*
		 try {
			 System.out.print("�迭�� ũ�� : ");
			 int size = sc.nextInt();
			 int[] arr = new int[size];
			 System.out.println("100�� �ε��� �� : "+arr[100]);
		 } catch(NegativeArraySizeException e) {
			 System.out.println("�迭�� ũ��� ������ ������ �� �����ϴ�.");
		 }catch(ArrayIndexOutOfBoundsException e) { 
			 System.out.println("�������� �ε����� �����߽��ϴ�.");
		 } catch (InputMismatchException e){ //import�������
			 System.out.println("������ �Է��ؾ��մϴ�.");
		 }*/
		 
		 
		 
		 try { 
			 System.out.print("�迭�� ũ�� : ");
			 int size = sc.nextInt();
			 int[] arr = new int[size];
			 System.out.println("100�� �ε��� �� : "+arr[100]);
		 } catch(RuntimeException e) { //�������� �����ؼ� �θ�Ÿ�Կ���Ŭ���� �ۼ� ���� (RuntimeException�� �θ�Ŭ����)
			 						   //��, ��� �ڽ� ���� �߻��� �� �޾Ƽ� ó���� �� ���� (���� 3�ٺ��� �ϳ��� ��ġ�� ����)
			 System.out.println("���ܰ� �����..�ٵ� ����ܰ� �߻��ߴ��� �˷��ֱⰡ ��ƴٴ� ������ �ִ�!");
			 //���� ª���� �׷��� ���������� � ������ �ִ����� �˷��ֱ� ��ƴ�
			 //���������� �˷��ְ� �ʹٸ� ���� catch������ �̿��ϴ°� ������
			 
		 }
		 
		 System.out.println("���α׷��� �����մϴ�.");
	 }
	 	 
	 //4) ������ + catch�� ����ϱ� (Ư�� ���ܰ� �߻��� ���Ǳ����� �ְ�;�������)
	 	public void method4() {
	 		 try {
				 System.out.print("�迭�� ũ�� : ");
				 int size = sc.nextInt();
				 int[] arr = new int[size];
				 System.out.println("100�� �ε��� �� : "+arr[100]);
			 } catch(InputMismatchException e) {  
				 // runtime������ �������� ��� ���ܸ� �������� ������ֱ� ������ 
				 // Ư���� ���ܹ����� ������ְ� �ʹٸ�, Runtime����Ŭ���� ���� ���������.
				 // �ƴϸ� unreachable block ���� ��
				 System.out.println("�������� �Է����ּ���");
			 } catch(RuntimeException e) {
				 System.out.println("�ٵ� ����ܰ� �߻��ߴ��� �˷��ֱⰡ ��ƴٴ� ������ �ִ�!");
			 }
	 	}
	 	


	 	
	 	/*
	 	 *  *RuntimeException ���� �ֵ��� UnCheckedException (����ó�������� �ʼ��� �ƴ�)
	 	 *   
	 	 *   if�� : ���ʿ� ������ü�� �߻��Ǳ� ���� �ҽ��ڵ�� �ڵ鸵�ϴ� ���� (����ó�� ���� �ƴ�)
	 	 *   try - catch�� : ���ܰ� �߻����� ��� ó�����ִ� ������ �ۼ��صδ°� (����ó������)
	 	 *   
	 	 *   ���������� ��Ȳ�� if������ ���ǰ˻�� �ذ��ϴ°� ��������� ! 
	 	 *   �ε����ϰ� ���ǹ����� �ڵ鸵 �ȵǴ� ���� ����ó���������� �ۼ��� �� �� !  
	 	 * 
	 	 */







}
