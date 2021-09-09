package practice2.model.vo;

public class GalaxyNote9 extends SmartPhone {
	
	public GalaxyNote9() {
		
	}
	
	public void makeacall() {
		System.out.println("전화 걸기 :번호를 누르고 통화버튼을 누름");
	}
	public void takeacall() {
		System.out.println("전화받기 : 수신 버튼을 누름");
	}
	public void picture() {
		System.out.println("촬영 방식 : 1200만 듀얼카메라");
	}
	public void charge() {
		System.out.println("충전방식 : 고속 충전 , 고속 무선충전");
	}
	public void touch() {
		System.out.println("터치방식 : 정전식, 와콤펜 지원");
	}
	public void printMaker() {
		System.out.println("메이커 : 삼성");
	}

	
}
