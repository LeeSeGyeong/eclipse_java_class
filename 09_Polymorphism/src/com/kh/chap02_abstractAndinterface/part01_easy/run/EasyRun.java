package com.kh.chap02_abstractAndinterface.part01_easy.run;

import com.kh.chap02_abstractAndinterface.part01_easy.model.vo.BasketBall;
import com.kh.chap02_abstractAndinterface.part01_easy.model.vo.FootBall;
import com.kh.chap02_abstractAndinterface.part01_easy.model.vo.Sports;

public class EasyRun { 
	
	public static void main(String[] args) {
		
		//(1) �̿ϼ� Ŭ���� = ��ü�����Ұ�
		//	    �߻�Ŭ����(abstract) = ��ü�����Ұ� 
		// 	  Sports s = new Sports(); // ��ü �����Ұ� 
		
		//(2) Sports s; // ���۷����� ��� ����  
		
		Sports s = new BasketBall(); //������ ���� ( �θ�type���� �ڽ�type��ü �ޱ� O) 
		//�迭�� �����Ͱ� , ��ü�� �Ӽ�(property)���̹Ƿ� ���� �ٸ���.
		
		
		//FootBall, BasketBall �ΰ��� ��ü�� ������ (�迭�� ũ�� 2) �ϳ��ϳ� ���������� 
		//���ϰ� �迭 ����  (��ӵ� Sports[]Ÿ���� �迭�� ª�� ����� ��) 
		Sports[] arr = new Sports[2];
		
		//�ε����� ���� ���� 
		arr[0] = new BasketBall(); // Sports[]�� Sports�� ��ӵ� BasketBall��ü�� ������� 
		arr[1] = new FootBall();   // Sports[] �ϳ��� �ΰ��� Ŭ�������� ���� �ҷ��� �� �ִ�. ( ����� ����Ͽ��� ������ )
		
		
		//(���) �� ���� �� rule���� �ҷ��´� 
		//���⼭ '�������ε�'�� ����� 
		
		//1)
		
		for(int i =0;i <arr.length; i++) {
			arr[i].rule();
		}
		
		//2) (�ٸ� ǥ����) for each������ ����� ���� �ִ�.
		
		for(Sports a:arr) { // Sports a = arr[0] , Sports a = arr[1]
			a.rule();
		}
		
		//���� ���ε�? ���� ��(������ ����)���� Parent�� rule������ ��� (������ �߻�޼ҵ��ΰ� �������?)
		//SportsŬ������ ����� Ŭ������(BasketBall,FootBall)�� �ϼ����� ���� �߻�޼ҵ带 ��������Ƿ�
		//�ϼ���Ű�� ���� (�ǹ�������)�������̵��� �ؾ��� 
		//�׷��� �Ǹ� �������̵� �� �ڽĹ����� �������ε����� ã������ ��µȴ�(�� class�� �°� ������ @Override) .
		
		//"�������ε�"
		//������ ���� : �������ε� , ���� ���۷��� �ڷ����� Ŭ������ �ִ� �޼ҵ带 ����Ŵ
		//��Ÿ�� ���� : �������ε� , ���� �ڽ�Ŭ������ �������̵��� �޼ҵ带 ã�� ����� 
		
		
		/*
		 * * �߻�޼ҵ� 
		 * - �̿ϼ��� '�޼ҵ�' / ����(body == ( {�� �� ȣ} )) �� ���� �޼ҵ� 
		 * 
		 * * �߻�Ŭ���� 
		 * - �̿ϼ��� 'Ŭ����'
		 * - �Ϲ��ʵ� + �Ϲݸ޼ҵ� [ +�߻�޼ҵ� ] 
		 * - ��ü ������� ( ���۷��� �����δ� ���� ����) 
		 * Sports s = new Sports 	 (X) ��ü �ȵ� 
		 * Sports s = new Desktop(); (O) ���۷��� ���� OK
		 * 
		 * 	 => �߻�޼ҵ带 ���� Ŭ������ '�ݵ��' �߻�Ŭ������ �����ؾߵ�
		 *   => �߻�޼ҵ� ������ (Ŭ������ abstract ����)
		 *   
		 *   
		 *   *�߻�޼ҵ尡 ��� �߻�Ŭ������ ���� �� ���� 
		 *    �߻�Ŭ������ ����ϴ� ����
		 *    
		 *    �˷��ַ��� ) �� Ŭ������ ���� �ϼ����� �ʾҾ��� �˷��ַ��� (�̿ϼ� ���¸� �˷��ֱ� ����)
		 *    ���α׷� �� ) ��ü������ �ٸ������� ���ϰ��Ϸ���
		 *    
		 *    *�߻�޼ҵ尡 �����ϴ� �߻�Ŭ������ ��������
		 *    
		 *     �θ�޼ҵ忡 �߻�޼ҵ尡 �����ϱ� (�߻�޼ҵ尡 �ִ�? �׷� Ŭ�������� �ٷ� �����(abstract)��������ϹǷ� �߻�Ŭ������ �����)
		 *     �ڽ�Ŭ�������� �������̵��ؼ� ������ ������ �޼ҵ带 �����Եȴ�. 
		 *     
		 *     => ��,������ ������ �޼ҵ�� �ٸ� ��°��� ���������� ��((���� �޼ҵ���� ������)�� �ڽ�Ŭ������ �����ų ������ �ٸ�����)
		 *     => �޼ҵ� ���ϼ� Ȯ������ ( �ڽ�Ŭ�����ϱ� �����ϱ� ���ݾ�)
		 *     => ǥ��ȭ�� Ʋ�� �����ϴ� ���� 
		 *     
		 *     
		 *     ���� �˾ƺ� ���� : interface
		 *     
		 *     ���� �� �ִ� ������ ũ�� 
		 *     �Ϲݸ޼ҵ� > �߻�޼ҵ� > �������̽� 
		 *     
		 *     �������̽� : �Ϲ��ʵ� (X) �Ϲݸ޼ҵ� (X) 
		 *     			*�߻�Ŭ����(O) ���(O) �ΰ��� ���� 
		 *     
		 */
		
		
		
		
}
}