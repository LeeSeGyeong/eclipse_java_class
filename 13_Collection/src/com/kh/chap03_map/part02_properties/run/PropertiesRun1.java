package com.kh.chap03_map.part02_properties.run;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class PropertiesRun1 {
		
	public static void main(String[] args) {
		
		
		// Properties : Map계열의 Collection => Key+Value 셋트로 저장 
		// HashMap과의 차이점 : Properties에는 키값도 String, 밸류값도 String으로 담음 ! 
		//generic설정 안함
		
		
		Properties prop = new Properties();
		
		// Map계열이기 때문에 put메소드 이용해서 키+밸류 세트 담기 가능 ! 
	/*	
		prop.put("다이제",new Snack("초코맛",1500));
		prop.put("새우깡",new Snack("짠 맛",700));
		
		System.out.println(prop);
		System.out.println(prop.get("다이제")); //get메소드 사용가능! 
		
		// 하지만, Properties 사용하는 경우는 주로 properties에 담긴 것들을 파일로 출력 또는 입력받아 올때 사용함! 
		// 즉, Properties에서 제공하는 store(), load() 메소드를 사용하기 위해서 
		
		try { 								  //store(출려통로("파일명") , 문자열)
			prop.store(new FileOutputStream("test.properties"), "propertiesTest"); 
			//ClassCastException발생
			//내부적으로 store실행시 Properties에 담겨있는 키+밸류 세트들을 String으로 형변환해서 출력함! 
			//Snack객체를 String으로 강제로 형변환하다보니 생기는 예외(두개는 서로 관계가 전혀 없으니까 형변환 안되지)
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		*/
		
		
		// Properties 키+밸류 세트로 추가할 때 
		// 1. setProperty(String key, String value)
		
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop); // Map특징 : 저장순서 유지 안됨 , key값 중복되면 마지막 값으로 덮어씌워짐
		
		// 2. getProperty(String key) : String값 Value로 return
		System.out.println(prop.getProperty("List"));
		System.out.println(prop.getProperty("새우깡")); //존재하지 않는 key값 제시하면 "null"값 반환/예외발생하진않구
		
		try {
			//3. store(OutputStream os , String comments ) : Properties에 담겨있는 key-value값들을 파일로 출력 
			// 											   : 내부적으로 다 String으로 변환해서 전달됨 
			prop.store(new FileOutputStream("test.properties"), "propertiesTest");
			
			//4. storeToXML(OutputStream os , String comments) , xml파일로 출력(web에서 자주사용)
			prop.storeToXML(new FileOutputStream("test.xml"), "propertiesTest");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
