package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {

	
	/*
	 * "문자 기반 스트림"을 가지고 입출력해보기 
	 * 
	 * - 문자스트림 : 데이터를 2바이트 단위로 전송하는 통로다(2byte)
	 * - 기반스트림 : 외부매체와 직접적으로 연결되는 통로다
	 * 
	 * 
	 *   XXXReader : 입력용 스트림 
	 *   XXXWriter : 출력용 스트림 
	 * 
	 */
	
	//#1) 프로그램 --> 파일 (출력)
	public void fileSave() {
		
		//FileWriter : 파일로 데이터를 2바이트 단위로 출력할 수 있는 스트림 
		
		FileWriter fw = null;
		
		
		try {
			//1. FileWriter 객체 생성
			fw = new FileWriter("b_char.txt");
			// 해당파일이 없으면 새로 만들어 주고 연결 , 있으면 그냥 연결해줌 
			
			//2. 출력 
			// 	 write 메소드를 이용해서 데이터를 2byte단위로 데이터 전송 
			
			fw.write("와! IO재밌다...ㅎ;;"); 
			//전체 문장이 2byte가 아니라 한글자 한글자가 각각 2byte임
			//그래서 실제로는 해당 문자열의 문자가 하나씩 하나씩 전송되는 개념이다.
			fw.write(' ');
			fw.write('A');
			fw.write("\n");
			
			char[] arr = {'a', 'p','p','l','e'};
			fw.write(arr); //순서가 뒤바뀌는 경우 없슴 ! 왜냐면 순서대로 출력되니까용
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 3. 반납하는 과정 
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
	
	// 프로그램 <-- 파일(입력)

	public void fileRead() {
		
		// FileReader : 파일로부터 데이터를 2바이트 단위로 입력받을 수 있는 스트림 
		
		FileReader fr = null;
		
		try {// 1. FileReader객체 생성 
			
			fr = new FileReader("b_char.txt"); 
			//무조건 존재하는 파일로만 정의하기 
			
			
			
			//2. 입력
			// : read 메소드 이용해서(정수값으로 돌아옴 , 보려면 char형으로 형변환해야함)
			//	 파일의 끝을 만나는 순간 -1을 반환 
			
			int value =0;
			
			while((value=fr.read()) != -1) {
				System.out.print((char)value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally { //3.반환
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
