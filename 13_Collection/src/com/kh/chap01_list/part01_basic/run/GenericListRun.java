package com.kh.chap01_list.part01_basic.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_basic.model.vo.Music;


public class GenericListRun {

	public static void main(String[] args) {
	//generic을 사용한 ArrayList 
	//제한이 있는 ArrayList	
		
	
		
		ArrayList<Music> list = new ArrayList<Music>();
		//<Music>이라는 값만 배열할 수 있도록 generic 설정 => E == Music 
		//배열 앞과 뒤에 똑같은 값이 오도록 배열식 작성 
		
		list.add(new Music("Good bye","박효신"));
		list.add(new Music("이 밤","양다일"));
		//list.add("끝"); 오로지 Music객체만 담을 수 있음 
		
		System.out.println(list);
		
		list.add(1,new Music("진심이 담긴 노래","케이시"));
		//이밤은 한칸 뒤로밀려나고, 케이시 노래가 1번 index에 담긴다 
		
		System.out.println(list);
		
		//set
		list.set(0, new Music("술이 달다","에픽하이"));
		System.out.println(list);
		//0번 index값이 수정되어 출력됨 
		
		//subList 
		
		List<Music> sub = list.subList(0, 2); //0~1번 index 추출 
		//subList 변수 설정할때도 제네릭설정가능
		
		//addAll
		
		list.addAll(sub);
		
		System.out.println(list);
		
		Music m = list.get(0);
		System.out.println(m);
		
		
		System.out.println(list.get(1).getTitle());
		
		for(Music o : list) { 
			//ListRun 메소드와 다르게 generic 처리로 Music객체 사용이 가능해짐
			System.out.println(o);
		}
		
		/*
		 * 
		 *  * 제네릭<> 을 사용하는 이유 
		 *  
		 *  1. 명시된 타입의 객체만 저장하도록 제한을 둘 수 있음 
		 *  2. 컬렉션에 저장된 객체를 꺼내서 사용할 때 매번 형변환하는 절차를 없애기위해 
		 *  (형변환하기 귀찮아서)
		 */
	}
}