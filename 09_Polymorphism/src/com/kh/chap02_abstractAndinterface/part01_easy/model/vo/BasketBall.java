package com.kh.chap02_abstractAndinterface.part01_easy.model.vo;

public class BasketBall extends Sports {
	
	// �߻�޼ҵ尡 �����ϴ� �߻�Ŭ������ ��ӹ޴� ����
	// �θ�Ŭ������ �ִ� �߻�޼ҵ带 '������' �������̵� �ؾߵ� ( abstract = �̿ϼ� �̴ϱ� �ϼ�������� )
	
	@Override
	public void rule() {
		System.out.println("���� �׻� �����θ� �ľߵȴ�.");
	}

}
