package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;

public class ElectronicShop2{
// 다형성 개념을 적용했을 때!!

	//부모타입 배열로 객체 다루기 
	private Electronic[] es = new Electronic[3];
	private int count = 0;
	
	public void insert(Electronic any) {
		es[count++] = any;
	}
	
	public Electronic select(int index) {
		return es[index];
	}
}