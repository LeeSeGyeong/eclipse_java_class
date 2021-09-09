package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	
		
		/*
		 * �⺻������ ���α׷��� ������ ���������� ����
		 * ��, �� �������� �帧�� �ٲٰ����� �� ����̶�� �� �̿��ؼ� ���������
		 * 
		 * ���������� �����Ű�����Ҷ� => ���ǹ�
		 * �ݺ������� �����Ű�����Ҷ� => �ݺ��� 
		 * �� ���� �帧 ���� => �б⹮ 
		 * 
		 * 
		 *  * ���ǹ� 
		 *    "���ǽ�"�� ���� ���̳� �����̳ĸ� �Ǵ��ؼ� ���ϰ�� �׿� �ش��ϴ� �ڵ� ����
		 *    
		 *     ���ǽ��� ��� true/false ���ߵ�!!
		 *     ���� ���ǽĿ����� �񱳿�����(���,����),��������(&&.,||)�� �ַ� ��� 
		 *     
		 *     *���ǹ��� ũ�� if���� switch������ ���� 
		 *     
		 */
	
	
	public void method1() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("���� : ");
			int num = sc.nextInt();
			
			/*
			 *  * �ܵ� if�� 
			 *  
			 *  if(���ǽ�) {
			 *   .. �����Ű���� �ϴ� �ڵ� ..    
			 *  }
			 *  
			 * ==> ���ǽ��� ��(true)�� ��� => �߰�ȣ �� ���� �ڵ� ���� 
			 * ==> ���ǽ��� ����(false)�� ��� => �߰�ȣ �� ���� �ڵ带 �����ϰ� �Ѿ
			 *  
			 */
			//if(����){������ ���̸� {}���� �ڵ���� �����
			//System.out.println("�����.");
			//		} 
			
			if (num>0) {
				System.out.println("�����.");
			}
			
			
			if(num <= 0) {
			System.out.println("����� �ƴϴ�.");
			}
			
			
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		/*
		 *  * if-else�� 
		 *  
		 *  if(true false�� ���ø��� ����) { 
		 *  		..�����ڵ�1..				//true�� �̴�� ��
		 *  } else {
		 *  	.	..�����ڵ�2..				//false�� ���⿡�� �������´� 
		 *  }
		 *  
		 *  
		 * 	���ǽ��� ����� ��(true)�� ��� �����ڵ� 1 ������ if-else���� �������� 
		 * 	if-else��ü�� �ϳ��� ��Ʈ�� �����Ѵٸ� if���� ������ ��Ʈ�ϳ��� ���� 
		 * 	��, ����� ����(false)�� ��� ������ �����ڵ�2 �����Ѵ�.
		 */
		
		if(num>0) {
			System.out.println("�����.");
		} else {
			System.out.println("����� �ƴϴ�.");
		}
		
		
	}
	


	public void method3() {
				
		// ��Ȯ���� ���� , �������� ������ �����ؾ� �ϴ� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		/*
		 * ��� ���� 0 �� ������ ������ Ȯ���غ����Ѵ� 
		 * �̷��� , if - else if�� 
		 * 
		 * 	���� �񱳴������ �������� ������ �����ؾ��� ��� 
		 * 	
		 * 	if(���ǽ�1) {
		 * 			�����ڵ�1; 				--> ���ǽ��� true��� ���⿡�� �� 
		 * } else if(���ǽ�2) { 				--> ���� ���� false�� �����ڵ�2 ���� 
		 * 			�����ڵ�2;					--> �����ڵ�2��  false��  
		 * } else if(���ǽ�3) {				--> ���ǽ�3 ����
		 * 			�����ڵ�3;	
		 * } [else {								--> ���� ���� ���� �� false���..?
		 * 										--> else������ �ʿ��� ���ǹ��� �����ش�
		 * 			}]
		 * 
		 */
		
		if(num>0) {
			System.out.println("�����.");				
			 } 	else if(num == 0) { 				 
		    System.out.println("0�̴�.");			   
			 } else /* if(num < 0)*/ {				 
			System.out.println("������.");	
			  }
		
	}
		public void method4() {
			
			// 13�� ���� : ��� 
			// 13�� �ʰ� 19�� ���� : û�ҳ� 
			// 19�� �ʰ� : ���� 
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("����(������) : ");
				int age = sc.nextInt();
				
			/*
			if(age <= 13) {
				System.out.println("���");
			} else if(age <= 19) {
				System.out.println("û�ҳ�");
			} else {
				System.out.println("����");
			}
			*/
				
				String result;
				
				if(age <= 13) {
				  result = "���";
				} else if(age <= 19) {
				  result = "û�ҳ�";
				} else {
				  result = "����";
				}
				
				System.out.println(result);
				
				
				}
		
		public void method5() {
				
				Scanner sc = new Scanner(System.in);
				
				System.out.print("�̸� : ");
				String name = sc.nextLine();
				
				System.out.print("����(M/F) : ");
				char gender = sc.nextLine().charAt(0);
				
				// xxx���� xxx�̴�.
				
			
				/* if(gender == 'M' || gender == 'm') {
					System.out.println(name+ "���� ���л��̴�.");	
				} else if (gender == 'F' || gender == 'f') {
					System.out.println(name+ "���� ���л��̴�.");	
				} else {
					System.out.println(name+ "���� ������ �� �� ����.");					
				} */ 
				
				 String result=""; //������ �̸� ������ �Ѷ� �ݵ�� �ʱ�ȭ �س��� ������ ������! 
				 
				/* �ʱ�ȭ�� �Ǿ����� ���� ������ ��¹��� ���� ����� �� ����.

				 �̶� result��� ������ 19��° �ٿ��� �ʱ�ȭ�� ���� �ʰ� ���� ���� �Ǿ��־���,

				 ���� �����ȣ�� �߸� �Է����� ��� result��� �������� �ƹ��� ���� �ʱ�ȭ�� �Ǿ����� ���� ���·ν� 
				 ����� �� �� ���� �����̱� ������ �߻��Ǵ� ������ �����̴�.*/
				 
				 if(gender == 'M' || gender == 'm') { 
					 result = "���л�";
				 } else if (gender == 'F' || gender == 'f') {
					 result = "���л�";
				 } else {
					 System.out.println("������ �߸� �Է��ϼ̽��ϴ�.");
					  return; // ** �ش� �� �޼ҵ� ��ü�� ���������� ���� ! (�� �޼ҵ带 ȣ���ߴ� ������ return�ؼ� �������� ,������ ȣ���Ұ� ������ ����  ) ** 
				 }
				
				// xxx���� xxx�̴�.
				 
				 System.out.println(name + "���� " + result + "�̴�.");
				 
				 //result else������ �����Ѵٸ� , ������ ����. 
				 //else���� ������ �ϳ��� ����ȴٴ� �ǹ̷�, 
				 //else�� ���ٸ� ���� �ΰ��� false�� �ɼ��� �����ϱ� 
				 //result�� ��ڽ��� �ɼ��� �ֱ⿡ ������ ����.
				 // ** �ƴ� , ������ �� �ʱ�ȭ ��������! �� ���뵵 �������ϱ� 	
				 
				 	
				//�ʱ�ȭ�� �ȵ� ������ ��¹��� ���� ��� �Ұ�!
				//���� ������ �߸��Է����� ��� => result���� �ƹ��� ���� ���Ե��� ����! 
				//�̷���� ������ ����Ŷ�� �� �̸� �˷��ְ� �ִ°���! 

				//�ذ� => result���� �̸� ���ý� �ʱ�ȭ�� �ص���!! 

						}
		
		public void method6() {
			
			Scanner sc = new Scanner(System.in);
			
			
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			/*
			if(name == "ȫ�浿") {
				System.out.println("ȫ�浿�� �ݰ����ϴ�.");
			} else {
				System.out.println("ȫ�浿���� �ƴϽŰ����׿�. �ȳ���������.");
			}
			*/ 
			
			/* ����Ʈ �ܿ��α� �����Ʈ���� ���迡 ����!! 
			 * 				1byte	  1	    2	,  4	, 8	,   4 ,  	8    ,  2
			 * ** �⺻�ڷ��� : boolean , byte, short, int,  long , float, double , char (8��)
			 * 	    �����ڷ��� : String(��Ư)
			 * 
			 *  �⺻�ڷ����鳢�� ������Ҷ��� == , !=  ��밡��(���������� �񱳵�)
			 *  ��, �����ڷ����� ���� �񱳽� ==,!= ���� ���������� �񱳰� �ȵ� 
			 *  		=> equals() �޼ҵ带 �̿��ؼ� ���ؾ��Ѵ�. 
			 *  			���ڿ� .equals(���ϰ����ϴ� ���ڿ�)
			 *  				 ==�񱳿� ����.
			 *  
			 *  
			 */
			
			if(name.equals("ȫ�浿")) {
				System.out.println("ȫ�浿�� �ݰ����ϴ�.");
			} else {
				System.out.println("ȫ�浿���� �ƴϽŰ����׿�. �ȳ���������.");
			}
			
			
		}
		//���ǹ� ��ø��� 
		
		public void method7() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("����(���) �Է�: ");
			int num = sc.nextInt();
			
			if(num > 0) {//����� ���  //�߰�ȣ �ȿ� if�� �� �Ѵٴ� �� �ۿ��ִ� if�� true��� �����Ͽ� �����
				
				if(num % 2 == 0) { //(����̰�)¦���� ��� 
					System.out.print("¦����.");
				}else {//(����̰�)Ȧ���� ��� 
					System.out.print("Ȧ����.");
				}
				
			} else {//����� �ƴ� ��� 
				System.out.println("����� �ƴմϴ�. �߸��Է��ϼ̽��ϴ�.");
			}
		}
					
				}
		
		
	

			
			
			
