package com.kh.chap03_override.model.vo;

public class Book /* extends Object */ {
			
	
	private String title;
	private String author;
	private int price;
	
	//�⺻������ 
	public Book() {
		
	}
	//�Ű����� ������ 
	public Book(String title,String author,int price) {
		this.title=title;
		this.author=author;
		this.price=price;
	}
	//getter / setter �޼ҵ�
	
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
	 * * �������̵� 
	 * - �ڽ�Ŭ������ ��ӹް��ִ� �θ�Ŭ������ �޼ҵ带 ������(���ۼ�)�ϴ� �� 
	 * - �θ� �����ϴ� �޼ҵ带 �ڽ��� �Ϻ� ���ļ� ����ϰڴٴ� �ǹ� 
	 *   �ڽİ�ü�� ���� ����� �ڽĸ޼ҵ尡 �켱���� ���� 
	 *   
	 *   * �������̵� �������� 
	 *   - �θ�޼ҵ�� ���� 
	 *   - �Ű����� ����,�ڷ���,������ �����ؾ��� (�Ű����� ���� �������)
	 *   - �θ�޼ҵ��� ��ȯ�� �����ؾ��� (jdk ���� �� �Ǹ鼭 �θ�޼ҵ��� ��ȯ���� �ڽ� �ڷ�����δ� ���� )
	 *   ex ) �θ�޼ҵ��� ���������ڰ� protected�� ��� �������̵��ϴ� �޼ҵ��� ���������ڴ� protected , public 
	 *  
	 *  => �Ծ��� ������ ���ִ� 
	 *  
	 *  @Override, ������̼� 
	 *  -���������� , ũ�Ի������ (��������ʾƵ� �������̵� �� ����)
	 *  -������̼� ���̴� ���� 
	 *  >> �θ�޼ҵ� ���̳� �Ű������� ������ ��� => ã�ƺ��� ���� 
	 *     �ڽĸ޼ҵ� ����� ��Ÿ�� ���� ��� => ã�ƺ��� ���� 
	 *     
	 *  >> ���� �� �޼ҵ� �������̵� �� �޼ҵ忡 �˸��� �; 
	 *  
	 *  
	 */
	
	@Override
	public String toString() { //ObjectŬ������ toString �޼ҵ� �������̵� 
		return title + author + price ;
	}
}
