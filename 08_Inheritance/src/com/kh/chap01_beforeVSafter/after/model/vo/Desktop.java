package com.kh.chap01_beforeVSafter.after.model.vo;

		// 		자식 	 ---------> 부모
		// 		후손	 ---------> 조상
		// 		하위 	 ---------> 상위
		//		this ---------> super
public class Desktop extends Product{

	private boolean allInOne;
	
	public Desktop() {
		
	}
	public Desktop(String brand,String pCode,String pName,int price,boolean allInOne) {
		
		// brand ~ price 네 개 의 값들은 부모클래스(Product)의 필드에 대입 
		//super. 으로 부모클래스에 접근 가능 (단,private으로는 접근할 수 없음)
		//해결방법1. 부모class에 있는 필드를 protected로 접근제한자를 수정해주기 
		
		/*
		super.brand=brand;
		super.pCode=pCode;
		super.pName=pName;
		super.price=price;
		*/ 
		
		//해결방법2. 부모클래스에 있는 setter메소드를 활용하기(public이기 때문에 접근가능)
		/*
		super.setBrand(brand);
		super.setpCode(pCode);
		super.setpName(pName);
		super.setPrice(price);
		*/
		
		//해결방법3. 부모생성자 호출하기 
		
		super(brand,pCode,pName,price);
		this.allInOne=allInOne;
	}
	public boolean isAllInOne() {
		return allInOne;
	}
	
	public void setAllinOne(boolean allInOne) {
		this.allInOne=allInOne;
	}
	
	//오버라이딩 : 부모클래스에 있는 메소드를 자식클래스에서 재정의하는 것
	public String information() {
		return super.information()+" allInOne : "+ allInOne;
	}
	
	
	
	
	
}
