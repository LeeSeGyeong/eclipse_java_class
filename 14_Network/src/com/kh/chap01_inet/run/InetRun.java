package com.kh.chap01_inet.run;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetRun {

	public static void main(String[] args) {

		
		/*
		 * * ��Ʈ��ũ(Network) : �������� ��ǻ�͵��� ����Ǿ��ִ� ��Ÿ� ���� �� 
		 * 					   => �̷� ��Ʈ��ũ�� ���� ���� �� ������ ��ȯ ���� ! 
		 * 
		 * * IP �ּ� : ��Ʈ��ũ �� �� ��ǻ�͵��� �ĺ����� �� �ִ� ��ȣ( ��ǻ���� �ֹι�ȣ == ���� ��ġ�� ���� == ������ ��ȣ)
		 * 
		 * * ������ Ŭ���̾�Ʈ 
		 * > ���� : ��(Ŭ���̾�Ʈ)���� ���񽺸� �������ִ� ���α׷�(Ŭ���̾�Ʈ�� ��û�� ó���ؼ� �������ִ�)
		 * 
		 * > Ŭ���̾�Ʈ : ������ ��û�ϴ� ��ǻ�� ( ���񽺸� ���� �޴� �� )
		 * 
		 * 
		 *  - ������ ��û�ϱ� ���ؼ��� , ��û�ϰ����ϴ� ������ IP�ּ� , ��Ʈ��ȣ�� �˾ƾߵ� !
		 */
		
		
		// 1) InetAddress : ��Ʈ��ũ����(ip�ּҰ���)�� Ȯ���� �� �ִ� Ŭ���� 
		
		try { // getLocalHost : �� PC(����ȣ��Ʈ)�� ���� ������ ��ȯ
			InetAddress localhost = InetAddress.getLocalHost(); //LocalHost == ���� ��ǻ�� 
			
			
			// ���� : �� pc�� + / �� IP�ּ�  
			System.out.println(localhost); 
			System.out.println("======= �� PC�� & �ּ� ���  =======");
			
			System.out.println("�� PC�� : "+ localhost.getHostName()); 		//ȣ��Ʈ�� �̸� ��ȯ 
			System.out.println("�� IP�ּ� : "+ localhost.getHostAddress()); 	//ȣ��Ʈ�� ip�ּ� ��ȯ 
			
			System.out.println("\n======= ������ ������ ȣ��Ʈ ���� ��ȯ  =======");
			
			//���� �˰��ִ� �������� ���ؼ� �� �������õ� ����(ip..) ��� 
			InetAddress googleHost = InetAddress.getByName("www.google.com");
			
			System.out.println("���� ������ : "+googleHost.getHostName());
			System.out.println("���� IP�ּ� : "+ googleHost.getHostAddress());
			
			
			//�������� ���ؼ� �� ���� ���õ� �͵��� �迭�� ���� �� ���� 
			
			InetAddress[] naverHost = InetAddress.getAllByName("www.naver.com");
			System.out.println("\n====== ������ �ּҸ� ���� �迭�� ������ �ޱ� ======");
			System.out.println("���̹� ȣ��Ʈ ���� : "+ naverHost.length);
			//���� 2 
			
			for(InetAddress n: naverHost) {
				System.out.println("naver ������ : "+n.getHostName());
				System.out.println("naver IP �ּ� : "+ n.getHostAddress());
			}
			 
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} 
		
		/*
		 * * ���� �������� ������ ������ 
		 * 	  Ŭ���̾�Ʈ�� �� ������ ��û���� �� ���� => ������ ���ƿ�!
		 * 
		 *  - ��û�� ���信 ���ؼ� ���α׷��� ���ư�!("���"�Ѵ� ǥ��)
		 *  - ������ ��Ź�� : HTTP �������� ��� 
		 *  
		 *  
		 *  * �ڹٸ��� ������ ������ Ŭ���̾�Ʈ �� ������ ����غ���! (�� ���� �� ������!)
		 *    �� �� �����͸� ������ϰ��� �Ѵٸ�, ������ Ŭ���̾�Ʈ���� ��Ʈ��(�������)�� �ʿ���! 
		 *    ���� ���ϵ� �ʿ�� �ϴµ� �����̶�,
		 *    
		 *   * ���� : ���μ��� �� ����� ����ϴ� ��, ��Ʈ���� �����ϱ� ���� ��
		 *     	   (�����͵��� ����� ���� �� == ����)�� �ʿ���
		 *     
		 *   * �������α׷��� (TCP��� / UDP ���)
		 *   
		 *   -TCP��� : ������ ���ۼӵ��� ����, ��� �����Ͱ� ��Ȯ�ϰ� ���������� ���ް��� (�ŷڼ��� �䱸�Ǵ� ���α׷� : http, email, webhard.. �����Ǹ� �ȵǴϱ�)
		 *   -UDP��� : ������ ���ۼӵ��� ����! �ŷڼ� ���� ������ ���޵� �� ����!(�����͸� �����ӵ��� �����ϰ��� �ϴ� ���α׷� : �ǽð������󼭺�) 
		 */
		
	}

}
