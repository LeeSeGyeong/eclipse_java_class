package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// dao(Data Access Object) : 데이터를 기록할만한 외부매체와 직접적으로 접근해서 값을 처리하는 것들을 말함 

public class FileByteDao {
	
	/*
	 * "바이트 기반 스트림"을 가지고 데이터 입출력해보기
	 * 
	 * - 바이트 스트림 : 외부매체에 데이터를 1바이트 단위로 전송하는 통로(좁은통로,1바이트면 한글이 깨진다)
	 * - 기반 스트림 : 외부매체를 선정하고 그 외부매체와 직접적으로 연결되는 통로! 
	 * 
	 * 
	 *  XXXInputStream : XXX매체로 부터 데이터를 입력받는 통로(외부매체로부터 데이터를 읽어 오겠다)
	 * XXXOutputStream : XXX매체로 부터 데이터를 출력하는 통로(외부매체로 데이터를 내보내겠다. 쓰겠다)
	 * 
	 * 
	 * 
	 */
	
	
	
	//프로그램(자바 또는 메모리) --> 외부매체(파일)
	//(출력 : 프로그램 상의 데이터를 파일로 내보내기, 즉 파일로 저장)
	
	public void fileSave() {
		
		//파일이라는 외부매체로 출력을 진행할 것이기 때문에 
		//FileOutputStream : 파일이라는 외부매체와 직접적으로 연결해서 1바이트 단위로 출력하는 기본스트림
		
		//스트림을 먼저 만들고 -> 메소드를 이용해서 통로로부터 데이터를 출력해주면 됨 
		//스트림은 하나의 자원, 자원은 한정적이고 잠시 빌려쓰는 것이다. 그러므로 사용 후에는 반납을 해줘야한다. 
		
		//<출력하는 방법>
		//1. 스트림 생성(통로 만들기) 
		//2. 스트림으로 데이터를 출력(메소드 활용)
		//3. 다 사용한 후에 스트림 반납 ( 특히 , 웹사이트 제작시 스트림이 부족할수도 있음 )
		
		
		
		
		// ** 구체적으로 출력하는 방법을 자세히 알아보자 
				FileOutputStream fout = null;
		//	1. 스트림 생성 
		//	1.FileOutputStream 객체 생성 => 해당 파일과의 연결통로가 만들어짐 
				
				/*
				 * true 미작성시(false 기본값임 ) => 해당파일이 존재할 경우 기존의 데이터 덮어씌워짐 (기본값이 false)
				 * true 작정 시   => 해당파일이 존재할 경우 기존의 데이터에 이어서 작성 
				 */
				
				try {
				fout = new FileOutputStream("a_byte.txt"/*,true*/); //직접적으로 연결하는 통로 
				//매개변수로 어떤파일과 소통하는지 연결통로(파일명)를 적어줘야함
				//예외처리를 필수로 해줘야함 (아니면 FileNouFoundException 이라는 에러가 뜨거든요)
				//예외처리 : 파일이 있으면 통로를 연결만 해주거나, 없다면 파일을 직접 새로 만들어줌 (혹은 존재하지 않는 경로를 제시했을 때)
				
				// 파일들은 실행시키면 값이 새로고침 되는게 아니라 값이 덮여쓰여진다(중첩되면서 쌓이는 거임)
				// 파일명,true라고 적는다면 값이 쌓이지 않고 뒤에 연결되서 출력됨,run버튼을 누른만큼 중첩되지 않고 
				// 뒤에 연결되서 값들이 출력됨
				
			
		// 2. 데이터 출력을 진행해보자 (데이터를 출력하고자 할 때 write 메소드 사용)	
			// 	    숫자를 출력하던, 문자를 출력하던, 실상 파일에 기록되는건 모두 '문자'로 기록됨 (아스키 코드표 참조)
			//	    숫자(0~127)
			
			//(1) 문자출력
			fout.write(97); //'a'라는 문자가 저장 (아스키 코드)
			fout.write('b');//'b'라는 문자를 저장 ,실제로 문자를 입력해서 저장해도됨
			
			// fout.write('강');
			// 한글(ㄱ,ㄴ,ㄷ,강...)같은 경우 2byte라서 깨져서 저장됨 -> 바이트스트림으로는 제한이 있음 
			// ㄱ,ㄴ,ㄷ...한글 값들은 무슨 값이 나올지 모르기 때문에 깨진다고 표현한다.
			// 얘도 외부매체를 통해 값을 처리하기 때문에, IOException 예외처리를 필수로 해야한다! (그래서 try-catch문에 넣어둠) 
			
			//(2) 바이트 배열출력해보기 				
			byte[] arr = {99, 100, 101}; //byte배열을 작성해보았음 
			//매개변수로 바이트 배열도 전달 가능한가요? 가능하다.
			fout.write(arr); //인덱스 순차적으로 데이터가 출력됨(c, d, e)
	
			
			//write(byte[] b, int off, int len) : byte배열의 off인덱스에서부터 len 갯수만큼 출력 
			fout.write(arr, 1, 2); //즉 , arr배열에서 1번인덱스에서 부터 2개의 값을 출력하겠다 
			//(100, 101이 출력) 
			//(== d, e가 저장 )
			
		
		//3. 스트림 다 이용했으면 반납하기! (반드시!!) 
			
			//fout.close(); 
			
			//반납하는 코드 (IOException예외 발생가능 , 이미 처리되어있음)
			//그런데 중간에 혹시 예외가 발생하는 순간 
			//catch블럭으로 넘어가서 종료되고 그 뒤의 코드(반납)가 실행되지 않고 종료되어버린다.
			//어떤 예외가 발생하던 반납이라도 꼭 해주고 싶다면!!? 
			//반드시 실행해야만 하는 구문이기 때문에, 제일 뒤에 finally로 반납문을 적어주면 됨 
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { //이 안에 작성된 코드는 어떤 예외가 발생하던간에 마지막에 무조건 실행하고 빠져나갈 거임 
					//반드시 실행해야만 하는 구문이기 때문에, 제일 뒤에 finally로 반납문을 적어주면 됨 
			try {
				fout.close(); //스트림 다 이용했으면 반납하기! (반드시!!) 
			} catch (IOException e) {
				e.printStackTrace();
			} 	//fout은 try블럭안에서만 쓸수있어서 fout을 try구문 밖에 null로 정의해주기 
				//번거롭지만, 내부의 catch블럭과 finally 뒤의 close()의 예외처리는 다르기 때문에 예외처리를 한번 더 적어줘야만 합니다.
			
		}
		
	}
	
	
	//프로그램 <-- 파일 (입력 : 파일로부터 데이터 가져오기 )
	
	public void fileRead() {
		
		// FileInputStream : 파일로부터 데이터를 1바이트 단위로 입력받는 스트림 
		
		//1. 스트림 생성(통로 만들기)
		//2. 스트림 통해서 입력받아옴(메소드 활용)
		//3. 사용이 끝난 스트림 반납 
		
		
		//1. 스트림 생성(입력 통로 만들기)
		
		FileInputStream fin = null;
		
		try { 
			
			// 1) FileInputStream 객체 생성 => 해당 파일과 연결통로 만들어짐
			fin = new FileInputStream("a_byte.txt"); 
			//늘 예외처리 해줘야함 !!(입력받으려고 하니, 실제로 존재하지 않았을 때)
			//출력과 달리 자동으로 만들어주지 않아서 실제로 예외가 일어날 수 있음 
			
		//2. 파일로부터 데이터를 읽어들이고자 할때 read메소드 사용 
		//	 1byte단위로 하나씩 읽어옴 , 숫자로 읽어들임 (반환형이 int로 되어있기 때문에)
			//반환된 숫자를 문자로 보고싶다면 char형으로 강제형변환 해줘야함 (뒷 부분에 할 예정)
		//   그러면 하나씩이니까 총 7문장으로 출력문을 붙여넣기해야함 
		
			//	  실제로 파일에 데이터가 얼마나 있는지 모르잖아요? 그러니 반복문을 이용해서 문장들을 읽어오기 
			
			// (1) 노가다로 출력해보기 
			/*
			System.out.println(fin.read()); 
			System.out.println(fin.read()); 
			System.out.println(fin.read()); 
			System.out.println(fin.read()); 
			System.out.println(fin.read()); 
			System.out.println(fin.read()); 
			
			System.out.println(fin.read()); */
			//파일의 끝을 만나는 순간(출력이 완료되면) -1이 출력되는 것을 확인!
			
			//반복문을 활용해서 모든 데이터를 읽어오기 
			
			// (2) while문으로 출력해보기 => 반복문 수행시 read()두번씩 실행되기 때문에 퐁당퐁당 읽어들여짐 => 잘못됨 
			
			/*while(fin.read() != -1) { 
				// -1이 아니면 출력문을 출력되게끔 반복조건을 설정해줌 
				// 반복조건확인할때 이미 실행 1번 되고, 출력할때 2번이 실행되는것임 
				// 그래서 6개의 값 중 다시읽어들인 값 3개만 출력된다.
				
				System.out.println(fin.read()); 
			}*/ 
			
			// read()호출은 반복문 수행시 매번 한번씩 실행되도록 
			// 해결방법 1. 무한반복을 돌려놓고 매번 조건검사
			/*
			while(true) {
				int value = fin.read();
				
				if(value == -1) { //조건문으로 조건 걸어놓기 
					break;
				}
				
				System.out.println(value);
			} */
			
			//해결방법 2. (권장) 값은 대입해서 그 대입값으로 출력하기 
			
			int value = 0;
			
			while((value = fin.read()) != -1) { //read()를 value라는 변수에 담는다
				System.out.println(value); 
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 3. finally블럭으로 사용한 Stream 반납
			try{fin.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
			}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
