package com.kh.chap02_abstractAndinterface.part02_basic.model.vo;

public interface Basic {
	 
	//�߻�Ŭ����(abstract class) : �Ϲ��ʵ� + �Ϲݸ޼ҵ� + [+�߻�޼ҵ�]
	//�������̽�(interface) : (only �ΰ��� ���� ) ����ʵ� + �߻�޼ҵ� 
	
	//private int a; (X) 
	//public void test(){  (X)
	//}  �Ϲݸ޼ҵ�
	//�������̽������� ����� �߻�޼ҵ常 �����ؿ�
	
	//public static final int NUM1 = 10; 
	//final ����� ������(������ �ʾƿ�)�̹Ƿ� static�� �����ǰ� ������ ���ÿ� ���� ��������Ѵ�.
	//�׷��� interface������ ����� �߻�޼ҵ常 �����ִٸ�?
	//�׷� �������̽������� ����� �� �ٿ����� 
	
	// 1) ��� 
	
	/*public static final*/ int NUM1 = 10;
	int NUM2 = 10; // only interface������ �ٿ��� �� �� ���� 
	
	//2) �߻�޼ҵ� 
	
	/*public abstract*/ void eat();
	/*public abstract*/ void sleep();
	
	
	// interface������ ������ ��� Ȥ�� �߻�޼ҵ�ۿ� �����ϱ� ���� ���൵ �ȴ� 
	
}
