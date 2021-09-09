package com.kh.chap02_abstractAndinterface.part02_basic.BasicRun;

import com.kh.chap02_abstractAndinterface.part02_basic.model.vo.Baby;
import com.kh.chap02_abstractAndinterface.part02_basic.model.vo.Basic;
import com.kh.chap02_abstractAndinterface.part02_basic.model.vo.Mother;
import com.kh.chap02_abstractAndinterface.part02_basic.model.vo.Person;

public class BasicRun {
	public static void main(String[] args) {
		
		//�߻�Ŭ������ Person ���۷��� ������ ���� , ��ü������ �Ұ��� 
		
		/*
		//�� Person,Mother��  �Ű������� ���ǵǾ������Ƿ� �Ű����� ���� �ٷ� ����(�ʱ�ȭ)���ָ� �ȴ�.
		//1) ���� ���� 
		Person mom = new Mother("�����",50,70,"���");
		Person baby = new Baby("���Ʊ�",3.5,70);
		
		// 2)���
		System.out.println(mom);
		System.out.println(baby);
		
		// 3) ��԰� , ���� ������ �Է��ϱ� (��°��� ����,���� ��ȭ��)
		//������ ���� �԰�, ���̵� ���� �Դ´� 
		//��µǴ� ���� ���� , �ǰ����� �������� ��ȭ�� ���� 
		
		mom.eat(); //������+10 , �ǰ��� -10
		baby.eat();//������ +3 , �ǰ��� +1
		
		mom.sleep(); // �ǰ��� +20
		baby.sleep();// �ǰ��� +3
		
		
		System.out.println("====== ������ ======");
		System.out.println(mom);
		System.out.println(baby);
		
		//���� ��ȭ�Ǿ��� (�� �Դ°�, ���ڴ� �� ���� �Ϸ�)
		*/
		
		
		//Basic b = new Basic(); //��ü���� X , ���۷��� ���� O
		
		Basic mom = new Mother("�����",50,70,"���");
		Basic baby= new Baby("���Ʊ�",3.5,70);
		// �ڽİ�ü���� ��ӹް� ������ , Heap �������� �θ�ü�� ���� ������ �ǰ�,�� ���� �ڽİ�ü�� �����ȴ�.
		
		System.out.println(mom);
		System.out.println(baby);
		
		mom.eat();
		baby.eat();
		
		mom.sleep();
		baby.sleep();
		
		System.out.println(mom);
		System.out.println(baby);
		
		
		/* *��� ǥ����
		 * 	
		 * Ŭ�������� Ŭ���� ��ӹ��� ��      : Ŭ���� extends Ŭ���� (���ϻ�Ӹ� ����)  					:ȭ��ǥ '�Ǽ�'���� ǥ��
		 * Ŭ�������� �������̽� ������ ��   : Ŭ���� implements �������̽� , �������̽�2..(���߻�� ����) 	: ȭ��ǥ'����'
		 * �������̽����� �������̽��� ��� : �������̽� extends �������̽�1,�������̽�2..(���߻�� ����) 	: ȭ��ǥ'�Ǽ�'
		 * 
		 * ���� ��(Ŭ����-Ŭ����,��-��) ���� ��ӹ����� extends(�Ǽ�) , �ٸ� ��(Ŭ���� - �������̽�)���� ��ӹ����� implements(����)
		 * 
		 * 
		 *          |          �߻�Ŭ����                 |          �������̽�
		 * ===================================================================
		 * ��Ӱ���     |          ���ϻ��                     |           ���߻��
		 * -------------------------------------------------------------------
		 * Ű����        |         extends           |         implements
		 * -------------------------------------------------------------------
		 * �߻�޼ҵ�  |      �߻�޼ҵ� 0�� �̻�              |       ��� �޼ҵ尡 �߻�޼ҵ�
		 * ǥ����/����|  ��������� abstract ���          |  ���������� abstract (��������)
		 * -------------------------------------------------------------------
		 * �Ϲݸ޼ҵ忩�� |          O             |            X
		 * -------------------------------------------------------------------
		 *  �ʵ�        |      �Ϲ��ʵ� ���� �� ����           | ����ʵ常 ���� �� ���� (���������� public static final)
		 *  
		 *  
		 * 
		 * extends �Ϲ�Ŭ����   -->  extends �߻�Ŭ����   -->  implements �������̽� 
		 * --------------------------------------------------------------->
		 *                   �������� �� £���� (�Ծ��� �� ����)
		 * 
		 * 
		 */
	}
}
