package com.kh.chap03_map.part02_properties.run;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun2 {

	public static void main(String[] args) {

		
		Properties prop = new Properties(); // 비어있음
		
		try {
			//5.load(InputStream is)
			//prop.load(new FileInputStream("test.properties"));
			
			//6.xml입력 : loadFromXML(InputStream is)
			prop.loadFromXML(new FileInputStream("test.xml"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(prop);
	}

	
	/*
	 *  .properties파일을 사용하는 경우 
	 *  프로그램상에 필요한 기본 환경설정(서버의 ip주소, dbms경로..) 관련한 구문을 기술할거임!
	 *  파일을 따로 가져와서 쓸거임
	 *  (코드상에 있으면 일반 user들은 수정할수 없으니까)
	 *  일반인이 다루기 쉽도록 파일을 따로 빼놓고 읽어들이는 방식으로 진행
	 *  
	 *  => 모두 문자열이기 때문에 개발자가 아닌 일반인관리자가 해당 문서를 수정하기쉬움
	 *  
	 *  .xml파일의 특징
	 * 	프로그래밍 언어들간에 있어서 호환이 쉽다! 
	 * 
	 */
}
