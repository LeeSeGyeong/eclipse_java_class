package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {
		public static void main(String[] args) {
			
			// 파일(file) 만들어지는 과정 
			// java.io.file 클래스를 가지고 (외부매체 , 예외처리가 필수가 될 거임)
			
			
			
			
			  // (1) 경로지정을 딱히 하지 않은상태로 파일생성하면 => 현재 작업중인 project 폴더에 파일이 생성됨
				File f1 = new File("test.txt"); // 1) 파일 객체를 만들고, 파일명을 매개(괄호안)에 작성해줘야함
					try{ 						// 2) 메소드까지 실행해야만 실제파일이 만들어짐 근데 예외처리를 미리 해줘야하므로 
					f1.createNewFile();			// 3) try - catch문으로 작성해줘야 한다.
					} catch(IOException e) {	// 4) catch문 아래 e.printStackTrace(); 추적한 내용을 볼 수 있도록 자동완성됨   
					e.printStackTrace();
					System.out.println("프로그램을 종료합니다."); 
				}
														
								
					
			
			
			 // (2) 존재하는 폴더에 파일 생성 => 해당 경로를 지정해주면 됨 
					 
				File f2 = new File("D:\\test.txt"); // D:\ 경로를 지정해줬지만 \는 이스케이프문자이므로 \\두번 써줘야한다.
				// \t는 탭을 해주는 개행문자이므로 잘못 인식해서 탭처리가 될 수도 있기 떄문에
				//존재하지 않는 경로 제시시 IOException 발생 
				
				//File f3 = new File("D:\\temp\\test.txt");
				//f3.createNewFile();
		
			
			// (3) 폴더먼저 만들고 파일까지 만들어지게 하기 
			//	File tempFolder = new File("D:\\temp");
			//	tempFolder.mkdir(); //폴더를 만들어지게 하는 메소드 (make directory의 약자 : dir)
				
				/*
				File f3 = new File("D:\\temp\\test.txt");
				try {
					f3.createNewFile();
					
					} catch (IOException e) {
					e.printStackTrace();
				}
			
					System.out.println(f1.exists()); //f1파일이 존재하는지? 알려주는 메소드 (boolean형으로 반환)
					System.out.println(new File("ttt.txt").exists()); //존재하지 않는 파일은 false로 return
					System.out.println(tempFolder.isFile());//tempFolder가 파일인가요? */
					
					//-----------------------------------------
					
					File folder = new File("parent");//parent라는 폴더 객체 생성 
					folder.mkdir();			//parent 폴더를 만들어줌
					
					File file = new File("parent\\person.txt"); //parent 폴더 안에 person파일 생성하는 객체 (경로지정)
					try {
						file.createNewFile(); 	//파일을 만들어줌 
						
						System.out.println("파일명 : " + file.getName());
						System.out.println("절대경로 : " + file.getAbsolutePath());
						System.out.println("파일의 용량 : " + file.length());
						System.out.println("상위폴더를 알아보자 : " + file.getParent());
						
					} catch (IOException e) {
						e.printStackTrace();
					}
					
					System.out.println("프로그램을 종료합니다.");
					
				}
				
		
				/*
				 * 프로그램 상의 데이터를 외부매체로부터 입력도 받아오고 그 값을 외부매체로 출력도 해보기 
				 * 
				 * 외부매체 : 키보드, 모니터, 오디오, 프로그램, 파일...등 
				 * 프로그램 상 : 프로그램 , 자바코드 , 메모리 <---- 연결의 기준이 됨
				 *  (기준으로부터 내보낸다 : 출력, 기준으로 값을 가져온다 :입력)
				 * 
				 * 입력과 출력을 어떻게 해야할까? 일단 입력할 때와 출력할때 각각의 통로(2개)를 만들어
				 * 프로그램과 외부매체와의 연결통로를 연결시켜줘야한다. == 그걸 '스트림'이라고 함
				 * 
				 *  ** 스트림(데이터의 통로)의 특징 
				 *  -단방향 : 입력이면 입력만 , 출력이면 출력만 가능하다 ! (강처럼 한곳으로 흐르기 때문에)
				 *  => 입력용스트림 , 출력용스트림 따로 열어야됨 
				 *  
				 *  -선입선출(FIFO) : 값이 들어간 순서대로 출력됨 ( 먼저들어간 값이 먼저 출력됨 )
				 *  => 파이프에서 나오는 것 처럼 
				 *  - 시간지연(delay)라는 문제가 생길 수 있음 ! (앞에 문제가 생기면 뒤에는 값이 머물러 있으므로 시간이 지연됨)
				 * 
				 * 
				 * * 스트림의 구분 
				 * 
				 *  > 통로의 사이즈 (1byte짜리 / 2byte짜리 파이프 통로)
				 *  - 바이트 스트림 : 1byte통로는 1byte짜리만 가능함 매우 좁은통로 (나머지는 값이 다 깨짐 ) => 입력(InputStream) / 출력(outputStream)
				 *  			: 1byte 문자가 옮길 수 있는 것들(대문자,소문자,특수문자,숫자..)
				 *  
				 *  - 문자 스트림  :  2byte통로 왔다갔다 할 수 있는 정도의 사이즈 한글같은(넓은 통로) => 입력(Reader) / 출력(Writer)
				 *  		   :  2byte 문자가 옮길 수 있는 것들 (한글, 문자...)
				 *  
				 *  * 출력 : 자바 프로그램 기준으로 값이 외부매체로 나가는 것 
				 *  좁은 통로의 출력(1byte정도의 크기) : XXXoutputStream 
				 *  넓은 통로의 출력(2byte정도의 크기) : XXXWriter
				 * 
				 *  * 입력 : 프로그램을 기준으로 값을 외부매체로부터 가져오는 것 
				 *  좁은 통로의입력(1byte의 크기) :XXXInputStream
				 *  넓은 통로의입력(2byte의 크기) : XXXReader
				 * 
				 *  상속구조를 가지고 있으며 file이라면 fileReader, DBInputStream...등의 이름이 붙는다.
				 * 
				 * 외부매체와 직접 연결하는 유무 
				 * 
				 * - 기반(기본)스트림 : 외부매체와 직접적으로 연결되는 통로(필수!!) 무조건 깔고가야하는 데이터를 필수적으로 주고받는 곳 
				 * - 보조스트림 : 직접적으로 연결되지는 않지만, 보조역할을 하는 통로(속도를 빠르게 한다거나, 그외의 유용한 기능들을 제공하는)
				 * 			 : 중간에 끼워줘서 효율을 높여주는 역할을 한다. 보조스트림 단독으로는 사용 불가하다. 
				 * 
				 *  
				 *  
				 *  
				 *  
				 *   
				 */
				
				
				
				
				
				
			
				

		}