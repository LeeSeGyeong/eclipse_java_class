package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class MapRun {
	public static void main(String[] args) {
		
		//Map은 값이 꼭 두개여야함! 올라가보면그래서 generic설정하는 것도 <key , value> 두개의 값으로 지정해줘야함! (형변환의 번거로움을 피할 수 있음)
		
		 HashMap<String, Snack> hm = new HashMap<>(); // = >  K == String , V == Snack 
		 
		 //계층구조를 보면 
		 //List계열 , Set계열의 클래스들은 Collection 구현한 클래스다. 
		 // => 객체를 추가하고자 할때 공통적으로 add메소드 이용!
		 
		 
		 //Map계열은 Collection을 구현한 클래스가 아님! 
		 // => 추가하고자 할 때 put메소드 이용!(이때, key값 + value값 셋트로 담아야됨!) //이렇게 : HashMap<K,V> K=key, V= value 
		 
		 /*
	         * Map<K,V> : 키와 값
	         * 키는 중복을 허용하지 않는다.
	         * 기본적으로 입력순서를 유지하지 않는다.(Linked를 사용하면 순서o)
	         * Iterator가 존재하지 않는다. : 반복자가 없고 향상된 for문 사용 불가
	         * 구현클래스 : Hashtable(동시성 지원), HashMap(동시성 지원x)
	         * 메소드 : 
	         * 데이터 추가 -> put(키, 값)
	         * 데이터 반환 -> get(키) = > 값 반환
	         * 데이터 삭제 -> remove(키)
	         */
		 
		 
		
		 // 1. put(K key, V value) : 컬렉션에 키 벨류 set로 추가시켜주는 메소드
		 hm.put("다이제",new Snack("초코맛",1500)); //key값 : 다이제 , value : snack객체(맛,칼로리) 이렇게 담아줌 
		 //key값이 각각의 스낵객체를 구분지어주고, 식별해준다.
		 
		 hm.put("칸쵸",new Snack("단맛",600));
		 hm.put("새우깡",new Snack("짠맛",500));
		 hm.put("포테이토칩",new Snack("짠맛",500));
		 
		 System.out.println(hm); //{키=밸류 , 키=밸류, ... }
		 
		//출력으로보는 Map의 특성
		 //1. 저장 순서 유지 안됨 
		 //2. value값이 중복되더라도, key값이 다르면 잘 저장됨 (key값은 고유해야함. 식별자 역할)
		
		 
		 hm.put("새우깡",new Snack("매운맛",700));
		 //새우깡을 추가하고(기존에 입력되어있음 == 전에 있던 key값과 같게), 스낵(value값은 다르게) 입력해본다면?
		 //기존과 같은 key값(새우깡)으로 추가하는 경우, value값이 덮어씌워짐(중복된 키값은 공존할 수 없기때문에)
		 
		 System.out.println(hm); 
		 
		 
		 //2. get(Object key) : V(value) => 컬렉션에서 해당 키값을 가지는 value값을 반환시켜주는 메소드 
		 //   List와 연관있는건 아님! 우연히 값이 같은 것 뿐이지 (매개변수도 다름!) List는 get(int index)<- 이거임 List는 안에 숫자써야함!
		
		 Snack s = /*(Snack)*/hm.get("다이제"); //generic설정 안했기 때문에 Snack type에 담기위해서 강제형변환 해줘야함 
		 
		 System.out.println(s); // key값 입력하니까 value값만 출력된다.
		 
		 //3. size() : 컬렉션에 담겨있는 객체들의 갯수(셋트당 기준) 반환 
		 System.out.println("몇개 : " + hm.size());
		 
		 //4. replace(K key, V value) : 컬렉션해서 해당 키 값찾아서 다시전달한 value값으로 수정시켜주는 메소드 
		 hm.replace("포테이토칩", new Snack("겁나짠맛",1000));
		 
		 System.out.println(hm);
		 
		 //5. remove(Object key) : 컬렉션에서 해당 키값 찾아서 키밸류 셋트를 삭제시켜주는 메소드 
		 
		 hm.remove("포테이토칩");
		 System.out.println(hm);
		 
		 //6. map공간에 담긴 모든 키값과 밸류 값 모두 출력하고자 할 때 (map에선 for문 안됨, for-each문 안됨)
		 
		 // 시도1) for( : hm) {} : 향상된 for문에선 set를 담을만한 변수가 없음 
		 // 시도2) ArrayList list = new ArrayList(hm); : 컬렉션타입은 list와 set만 받으므로 상속관계가 달라서 ArrayList도 안된다 
		 
		 // 시도3 ) Iterator반복자만 가능! (map에선)
		 
		 //Iterator it = hm.Iterator(); //하지만 곧바로 Iterator()호출 못함 ! 
		 							    //why? Iterator()는 list계열 or Set계열에서만 쓸 수있는 메소드이기 때문
		 
		 // 해결방법1) 다행히도 map을 set계열로 바꿔줄 수 있다(2가지 방법이나 제공!)
		 // 즉, Map을 => Set으로 변환 => Iterator로 출력
		 
		 
		 // (1) Map계열을 Set계열로 바꾸기(2가지)
		 
		 
		 // (1-A) 1) KeySet이용하는 방법 : Key값만을 출력할 때 
		 //		  hm을 KeySet() 이용하면 Set값으로 변환되고, key값들만 출력이 된다. 
		 //		  hm에 있는 key들만 Set에 담기(키들의 집합형태)
		 
		 		  
		 		  Set<String> keySet = hm.keySet(); //Set값은 1개만 generic설정 했으므로, String으로 제네릭설정해줌 
		 		  
		 //  	  2) 1번과정에서 작업된 KeySet을 Iterator에 담기 
		 		  // 담는형식 : keySet.iterator(); : Iterator로 반환됨 
		 		
		 		  Iterator<String> itKey = keySet.iterator(); 
		 		  
		 //		  3) 반복문을 통해서 뽑기 
		 		  
		 		  while(itKey.hasNext()) {
		 			 String key = /*(String)*/itKey.next(); //String으로 형변환 해줘야함 (근데 위에 set값을 String으로 제네릭설정했음 -> 안해도됨)
		 			 Snack value = /*(Snack)*/hm.get(key);  //Snack으로 강제형변환 해줘야함 (근데 위에 Map을 Snack으로 제네릭했으므로 형변환 안해도됨)
		 			 System.out.println(key + "=" + value);
		 		  }
		 		  
		 		  
		 		  	
		 // (1-B) entrySet() 이용하는 방법 
		 	System.out.println("==== entrySet ====");
		 // (1) hm을 entrySet()으로 Set변환하면 (key값+value값) 모두 출력됨
		 		  
		 		// (1) hm.entrySet() : Set 
		 		  Set<Entry<String, Snack>> entrySet = hm.entrySet(); //(key + value 값)
		 		  //generic == key+value == Entry값으로 싸여있음 , 근데 그 Entry의 generic값을 안쪽에 또 설정해줘야함<String, Snack>두개로 
		 	    
		 		// (2) iterator()에 담기 		  
		 		  Iterator<Entry<String, Snack>> itEntry = entrySet.iterator();
		 		 //generic == key+value == Entry값으로 싸여있음 , 근데 그 Entry의 generic값을 안쪽에 또 설정해줘야함<String, Snack>두개로 
		 		  
		 		  
		 		// (3) 반복문을 통해 가져오기 
		 		  while(itEntry.hasNext()) {			  
		 			 Entry<String, Snack> entry = /*(Entry)*/itEntry.next(); //지금은 Object로 되어있으니까 Entry타입의 변수로 강제형변환 //이 안에 key,value값 다 담겨있음 ! 
		 			 		//
		 			 String key = /*(String)*/entry.getKey(); //key값 반환하는 메소드 
		 			 Snack value = /*(Snack)*/entry.getValue(); //value값 반환하는 메소드 
		 			 
		 		
		 			 System.out.println(key + "=" + value);
		 			 
		 			 
		 		  }
		 		  
		 		  
		 		  
		 		  
		 		  
		 		  
		 		  
		 
		 
	}
}
