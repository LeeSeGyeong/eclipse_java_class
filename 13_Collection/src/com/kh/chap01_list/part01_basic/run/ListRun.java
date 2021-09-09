package com.kh.chap01_list.part01_basic.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_basic.model.vo.Music;

public class ListRun {

	
	/*
	 * 컬렉션이란? 
	 * 
	 * 자료구조 개념이 내장되어있는 클래스로 자바에서 제공하는 "자료구조"를 담당하는 "프레임워크"이다.
	 * 
	 * 자료구조 : 방대한 데이터를 보다 효율적으로 관리(조회,정렬,추가,수정,삭제) 할 수 있도록 도와주는 개념 
	 * 프레임 워크 : 이미 만들어져있는 틀(뼈대)
	 * 
	 * 
	 * *배열의 단점과 컬렉션의 장점 
	 * 
	 * > 배열의 단점 
	 * 1. 배열은 우선 크기를 지정해야함 ,그리고  한번 지정된 크기를 변경할 수 없음 
	 *    새로운 값을 더 추가하고자 한다면, 새로운 크기의 배열을 만들고 기존 것을 복사하는 코드를 직접 기술 
	 *    
	 * 2. 배열 중간 위치에 추가한다거나 삭제하는 경우 값을 매번 땡겨주는 복잡한 알고리즘을 직접 기술해야함.
	 * 
	 * 3. 한 공간에 한 타입의 데이터들만 저장 가능하다.
	 * 
	 * > 컬렉션의 장점 
	 * 1. 크기 지정해줄 필요 없음! (지정도 가능하긴함 , 만일 지정했다고해도 더 많은 데이터들이 들어오면 알아서 사이즈를 늘림)
	 *    크기의 제약이 없다. 
	 *    
	 * 2. 중간에 값을 추가한다거나 삭제하는 경우 값을 땡겨주는 작업(알고리즘)을 직접 기술할 필요가 없음 ! 
	 * 	    단지 메소드 호출만으로 알아서 내부적으로 진행될 것임 
	 * 
	 * 3. 한 공간에 여러타입의 데이터들 저장 가능하다.( 단, 객체만 저장 가능 )
	 * 	    한 타입만 담기도록 제한을 둘 수도 있음!! 
	 * 
	 * 
	 * * 방대한 데이터들을 단지 보관만 해두고 조회만 할 경우 배열을 많이 사용 
	 *   방대한 데이터들을 보관, 추가, 삭제 등등 이런 과정들이 빈번할 경우 컬렉션을 많이 사용 
	 *   
	 *   
	 *   				      list와 set의 부모인
	 *   						<Collection>			 |			얘는 Collection자식 아님 (달라!)
	 *   인터페이스들	  |		List계열 		|	 Set계열 		 |					  Map계열
	 * 	  ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ|ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ  
	 *   저장가능데이터	  |			   데이터만 담으면 됨			 |	Key값 + data(value=값) : 세트로 담기(데이터만 아님!)
	 *   ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ|ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	 *   값이 순서를 유지   |		 yes	 	|	X (보따리처럼)	 |						X (뒤죽박죽 담겨요)
	 *   하면서 담기는지? |	(index개념 있음) 	|	섞여서 담긴다       |
	 *   ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ|ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	 *   값이 순서를 유지   |		 yes	 	|		No		 |						No(중복값 허용X)
	 *    중복값 허용여부  |	 	 		 	|				 |				단, 데이터는 중복되도 key값이 중복안되면 허용됨
	 *   
	 * 
	 */
	
	public static void main(String[] args) {

		ArrayList list/*<Object>*/ = new ArrayList(3); //크기 지정 할수도 있고 , 안해도 됨 ~
		//크기를 지정하지않으면 기본 10으로 배열이 생성됨 
		//원래는 <Object == E == Element>
		
		System.out.println(list); //출력하면 안에 아무것도 없음!(비어있는 상태)
		
		// Object == E ---> Element : 리스트에 담길 데이터들(요소)
		
		//1. add(E e) : 리스트공간 끝에 전달된 데이터를 추가시켜주는 메소드 (add메소드 호출하면 추가해줄 수 있음)
		
		list.add(new Music("Good Bye","박효신")); 	//list[0] = new Music(~~)
		list.add(new Music("이 밤","양다일"));		 	//list[1] = new Music(~~)
		list.add(new Music("잊혀지다","정키"));	 	//list[2] = new Music(~~)
		list.add("끝");								//list[3] = 같은 자료형이 아닌, "문자열"도 입력가능하다.
		
		//지정된 크기보다 더 많이 넣어도 오류가 안남  : 장점 1) 크기의 제약이 없다.
		//다양한 타입의 데이터 담을 수 있음 		 : 장점 3) 여러 타입 보관 가능하다.
		
		System.out.println(list); //list의 특징 : 순서 유지하면서 담김 (0번 인덱스부터 차곡차곡)
		
		
		//2.add(int index , E e) : 직접 인덱스를 지정해서 해당 인덱스위치에 데이터를 추가시켜주는 메소드 
		list.add(1,new Music("진심이 담긴 노래","케이시")); 
		//list는 알아서 한칸씩 옆으로 옮겨주고, 뮤직 객체가 추가됨  
		
		//중간 위치에 데이터 추가 시 복잡한 알고리즘 구현하지 않는다. : 장점 2) 중간 값을 손쉽게 추가할 수 있다.
		System.out.println(list);
		
		
		//3. remove(int index) : 삭제메소드 / 인덱스 값을 넘기면서 호출만 해주면, 그 인덱스 값은 삭제되고 자동으로 재배열됨 
		
		list.remove(1);
		System.out.println(list);
		
		
		//4. set(int index, E e) : 수정용 메소드 / 기존의 데이터를 새로운값(set)으로 수정해주는 메소드 / 기존 껀 사라짐 
		
		list.set(0, new Music("술이 달다","에픽하이"));
		System.out.println(list);
		
		
		//5. size() : 리스트의 사이즈를 반환시켜주는 메소드(즉, 몇개의 데이터가 담겨있는지)
		System.out.println("list의 사이즈 : " + list.size()); // 배열의 length같은 느낌
		
		//6. get(int index) : 해당 인덱스위치의 객체를 반환시켜주는 메소드 
		
		System.out.println(list.get(0));
		
		Music m = (Music)list.get(0); //어떤 타입인지 모르기때문에 다운사이즈해서 형변환해줘야함
		String s = (String)list.get(3);
		
		System.out.println(m);
		System.out.println(s);
		System.out.println(((Music)list.get(1)).getTitle());
		// Music 객체로 바꿔주고 그다음 제목만을 출력한다. 
		
		
		//7. subList(int index1, int index2) : List => 추출해서 새로운 List로 반환 
		List sub = list.subList(0,2); //java.util (interface)로 import 
		//2번은 포함되지 않고 그 전index만 추출됨  0번 index 이상, 2번 index 미만
		
		System.out.println(sub);
		//추출하면 0,1 index가 추출됨 
		
		//8. addAll(collection c) : 컬렉션을 통째로 뒤에 추가시켜주는 메소드 
		
		list.addAll(sub);
		System.out.println(list); // collection 3개 + 앞에 2개  총 5개의 값이 출력된다.
		
		
		//9. list.isEmpty() : boolean 해당 컬렉션이 비어있는지 알려주는 메소드 (true or false)
		
		System.out.println(list.isEmpty());
		//비어있지 않으므로 false 
		
		
		//10. clear() : 변수(리스트)의 값을 비워주는 메소드 
		
		//list.clear(); // 호출만 가능함 
		//for문 쓸거라 주석처리함 
		
		System.out.println(list);
		System.out.println(list.isEmpty()); 
		//clear() 진행 후, 값이 비어있으므로 true가 출력됨 
		
		
		//반복문을 통해 순차적으로 출력
		
		System.out.println("=======================");
		
		
		// 1) for loop문
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("=======================");
		
		// 2) for each문
		
		for(Object o : list) { // o = list.get(0); => o = list.get(1);...
		//Music type(X) -> object type으로 반환됨 변수들이 여러개(배열,문자열..등) 섞여있기 때문에 
			
			System.out.println(o);
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
