package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;

public class ElectronicShop2{
// ������ ������ �������� ��!!

	//�θ�Ÿ�� �迭�� ��ü �ٷ�� 
	private Electronic[] es = new Electronic[3];
	private int count = 0;
	
	public void insert(Electronic any) {
		es[count++] = any;
	}
	
	public Electronic select(int index) {
		return es[index];
	}
}