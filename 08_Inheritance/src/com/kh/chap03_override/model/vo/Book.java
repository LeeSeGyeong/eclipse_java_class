package com.kh.chap03_override.model.vo;

public class Book /* extends Object */ {
			
	
	private String title;
	private String author;
	private int price;
	
	//기본생성자 
	public Book() {
		
	}
	//매개변수 생성자 
	public Book(String title,String author,int price) {
		this.title=title;
		this.author=author;
		this.price=price;
	}
	//getter / setter 메소드
	
	public void setTitle(String title) {
		this.title=title;
	}
	public String getTitle() {
		return title;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public String getAuthor() {
		return author;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	
	/*
	 * * 오버라이딩 
	 * - 자식클래스가 상속받고있는 부모클래스의 메소드를 재정의(재작성)하는 것 
	 * - 부모가 제공하는 메소드를 자식이 일부 고쳐서 사용하겠다는 의미 
	 *   자식객체를 통해 실행시 자식메소드가 우선권을 가짐 
	 *   
	 *   * 오버라이딩 성립조건 
	 *   - 부모메소드명 동일 
	 *   - 매개변수 갯수,자료형,순서가 동일해야함 (매개변수 명은 상관없음)
	 *   - 부모메소드의 반환형 동일해야함 (jdk 버전 업 되면서 부모메소드의 반환형이 자식 자료형들로는 가능 )
	 *   ex ) 부모메소드의 접근제한자가 protected일 경우 오버라이딩하는 메소드의 접근제한자는 protected , public 
	 *  
	 *  => 규약의 개념이 들어가있다 
	 *  
	 *  @Override, 어노테이션 
	 *  -생략가능함 , 크게상관없음 (명시하지않아도 오더라이딩 된 상태)
	 *  -어노테이션 붙이는 이유 
	 *  >> 부모메소드 명이나 매개변수가 수정될 경우 => 찾아보기 쉽다 
	 *     자식메소드 기술시 오타가 있을 경우 => 찾아보기 쉽다 
	 *     
	 *  >> 단지 이 메소드 오버라이딩 한 메소드에 알리고 싶어서 
	 *  
	 *  
	 */
	
	@Override
	public String toString() { //Object클래스의 toString 메소드 오버라이딩 
		return title + author + price ;
	}
}
