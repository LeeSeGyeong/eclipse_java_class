package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException { //�ݵ�� ����ó���� ��! ������ϴ� �͵� 
	
		
		/*
		 * CheckedException�� �ݵ�� ����ó���� ������Ѵ�
		 * => ������ �Ұ����� ������ ������ �߻��ϱ� ������ �̸� ����ó�������� ����������
		 * => ���ǹ��� �̸� ������ �� ���� (������ �ȵǱ� ������)
		 * 
		 * �� ������ �� ���� ���ܰ� ���ܳ���?  
		 * �ܺ� �Ű�ü�� ������� �Ͼ �� �߻��� (IOException)
		 * 
		 */

	
	public void method1 () throws IOException {
		method2(); //2)�� throws�� ���Ѱ��� 
				   // ��� �ذ�����? ���⼭ try-catch������ �ۼ��ϰų� 
				   // �ƴ� �ٽ� throws���� �̿��ؼ� �� ���ѱ�� ��� 
		}
	
	public void method2() throws IOException{ // 2)�� throws�� 
		
		//Scanner�� ���� Ű����� ���� �Է¹��� �� �ִ� ��ü (��, ��� ���� ���ڿ��� �о����)
		//���۴� ���ܱ���ó�� �ʼ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�ƹ��ų� �Է����ּ��� : ");
		
		//String str = br.readLine(); //IOException�� ���� ����ó�� �ڵ鸵 ���� �̸� �ۼ��ؾ���
		//�׷��� try-catch������ �ʼ������� ��������� 
		
		//1. try-catch�� 
		//try{} : ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ带 �ۼ� 
		//catch(�߻��� ����Ŭ���� + �Ű�����){} : try���� ������ ���ܰ� �߻����� ��� ��� ó���Ұ����� ���� ���� �ۼ� 
		
		/*try {
			String str = br.readLine();
			System.out.println(str);
		} catch(IOException e) { //���� �߻����� �𸣴� ����� ����(������) �̸� �ۼ��� �ִ� �� 
			System.out.println("���ܰ� �߻��߽��ϴ�.");
		}*/
		
		
	
		//2. throws ��� ( �ణ ��å����, ���ѱ�� ���  ������� ���� )
		// ���� : method() + throws + �߻��ɿ���Ŭ���� {
		// ���� ���ڸ����� ó������ �ʰ� , ���� �� �޼ҵ带 ȣ���ϴ� ������ ����ó���� ���ѱ�ڴ�(�����ϰڴ�.)
		
		String str = br.readLine(); //readLine()�޼ҵ忡�� throws IOException�ϰ�����(���ѱ������)
		System.out.println(str);
		
		 //�� ���θ޼ҵ忡�� ���ѱ� ���� �ְ� 
		 //���θ޼ҵ尡 �� ���ѱ�� JVM�� �˾Ƽ� ó���Ѵ�(���? ��)
		 //�׷��� ���ѱ�� ���ѱ�°� �������� ����! �����ϴٴ°͸� �˾Ƶα� 
		
	}
	
	
	/*
	 * ���� 
	 * 
	 * 								���� Ŭ����		���ܹ߻�����		����ó�� 
	 * UnCheckedException		RuntimeException	 ��Ÿ�ӿ���		 ����(�����ڰ� �ɹ��ɷ� : if������ �̸� �����ϰų� , ����ó�����ų�)
	 * CheckedException			RuntimeException	 �����Ͽ���(������)	 �ʼ�(���ǹ� �ȵ�! ������ ����ó����������)
	 * 
	 */
	
}
