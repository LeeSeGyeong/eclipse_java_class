package com.kh.chap01_beforeVSafter.before.model.vo;

public class Desktop {
		private String brand;
		private String pCode;
		private String pName;
		private int price;
		private boolean allInOne;
		
		public Desktop() {
			
		}
		
		public Desktop(String brand,String pCode,String pName,int price,boolean allInOne) {
			this.brand=brand;
			this.pCode=pCode;
			this.pName=pName;
			this.price=price;
			this.allInOne=allInOne;
		}
		
		public void setBrand(String brand) {
			this.brand=brand;
		}
		public String getBrand() {
			return brand;
		}
		public void setpCode(String pCode) {
			this.pCode = pCode;
		}
		public String getpCode() {
			return pCode;
		}
		public void setpName(String pName) {
			this.pName=pName;
		}
		public String getpName() {
			return pName;
		}
		public void setPrice(int price) {
			this.price=price;
		}
		public int getPrice() {
			return price;
		}
		public void setAllInOne(boolean allInOne) {
			this.allInOne=allInOne;
		}
		public boolean isAllInOne() { //boolean자료형 필드의 getter메소드는 isXXX으로 이름을 지어야함
			return allInOne;
		}
		
		public String information() {
			return "brand : " + brand+" pCode : " + pCode+ " pName : " + pName+ "price : " + price + " allinone : " +allInOne
					;
		}
		
		
}
