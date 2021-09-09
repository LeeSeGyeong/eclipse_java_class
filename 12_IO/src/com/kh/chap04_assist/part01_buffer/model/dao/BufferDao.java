package com.kh.chap04_assist.part01_buffer.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDao {
	
	
	/*
	 * 보조스트림 : 기반스트림만으로 부족했던 성능을 보다 향상시켜주는 스트림 
	 * 			  기반스트림에서 제공하지 않는 추가적인 메소드 제공(데이터 전송 속도 향상 등..)
	 * 
	 * 		>>  외부매체와 직접 연결되는 스트림 아님! 
	 * 			단독 사용 불가( 반드시 기반스트림과 함께 사용)
	 * 
	 * 
	 */
	
	// 프로그램 --> 파일 (출력)
	public void fileSave() {
		
		// FileWriter : 출력용 기반스트림(2byte) - 파일과 직접 연결되는 기반스트림
		// BufferedWriter : 버퍼라는 공간을 제공해주는 보조스트림 (속도향상 , 버퍼에 값을 쌓아놓고 한번에 촤라락 출력해줌)
		
		//(1) 보조스트림을 사용해서 입출력해보기 
		
		//(1-1) 보조스트림을 사용하기전 , 기반스트림 먼저 생성하기
		//FileWriter fw = new FileWriter("c_buffer.txt");
		
		//(1-2) 보조스트림 만들때, 기반스트림 객체를 전달하면서 생성
		//BufferedWriter bw = new BufferedWriter(fw);
		
		
		//(2) 보조스트림 & (기반스트림) 두줄을 , 한줄에 출력해보기 
		
		//(2-1) 보조스트림 괄호 안에 기반스트림 적어주기
	/*	BufferedWriter bw = null; //finally를 쓰기위해 null로 초기화해놓기
		
		try {
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			
			//write메소드 이용해서 데이터 출력 
			bw.write("안녕하세요.\n");
			bw.write("반갑습니다.");
			bw.newLine(); //추가적인 줄바꿈 메소드 활용가능 (buffer)
			bw.write("저리가세요");
			// 버퍼라는 공간에 쌓아놨다가 한번에 출력해줌 => 속도향상에 좋다!
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{//3.반납(close)
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}*/
		
		
		
		
		//try-with-resource구문으로 자원반납까지 더 간단하게 작업할 수 있음
		//jdk7버전 이상부터 사용가능
		
		/*
		 * try(try블럭 내에서 사용할 스트림객체 생성구문){ //알아서 try다 끝나면 해당 스트림 반납까지 해줌 
		 * 
		 * } catch(예외클래스 e) {
		 * 
		 * }
		 * 
		 */
		
		//밖에 선언안해줘두됨 finally때문에 
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))){
			
			bw.write("안녕하세요.\n");
			bw.write("반갑습니다.");
			bw.newLine(); //추가적인 줄바꿈 메소드 활용가능 (buffer)
			bw.write("저리가세요");
			
		}catch(IOException e) {
			e.printStackTrace();
		} // 반납구문 안써줘두됨! 자동으로 반납해줌 
		
		
		
		}
		
	
		//프로그램 <-- 파일(입력)
		public void fileRead() {
			
			// FileReader : 파일과 연결해서 2바이트 단위로 데이터를 입력받을 수 있는 기반스트림
			// BufferedReader : 속도향상에 도움이 되는 보조스트림 
			
			
			try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))){
				
				/*
				//br.readLine(); //파일로부터 한 줄씩 가져오는 것 (원래 한 단어씩 가져오는데 ) , 보조스트림에서만 사용가능
				System.out.println(br.readLine());
				System.out.println(br.readLine());
				System.out.println(br.readLine());
				//바로바로 한줄을 받아오니까 속도가 빨라짐 
				
				
				System.out.println(br.readLine());
				System.out.println(br.readLine()); // readLine()메소드 출력시 
												   // 문장을 다 출력하고 나면 null값을 반환 
				*/
				
				String value = null;
				
				while((value = br.readLine()) != null) { //null과 비교할때는 =도 가능, "문자열"과 비교할때만 .equals
					System.out.println(value);
				}
				
				
				
			} catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			
		
	
	
	
	
	
	
	
	
	
	
	
	
		}
}
	

