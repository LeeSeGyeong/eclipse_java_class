package com.kh.chap04_assist.part02_object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectDao {

	// 프로그램 --> 파일 ( 출력 ) 
	
	public void fileSave() {
		
			
		//출력할 데이터(Phone객체)
		Phone ph = new Phone("아이폰",1300000);
	
		//FileOutputStream   : 파일과 연결해서 1바이트 단위로 출력할 수 있는 기반스트림
		//ObjectOutputStream : 객체단위로 출력할 수 있도록 도움을 주는 보조스트림(ObjectWriter 없음!)
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_phone.txt"))){
			
		oos.writeObject(ph); // 모든 객체를 받아서 출력할거니까 write + object를 적어준다.
		
		
		// 큰 값들이 좁은 통로를 지나갈 수 있도록 '직렬화'라는 게 필요함 
		// Phone 매개변수 생성시 직렬화코드(implements Serializable)를 적어주면 됨 (Phone 클래스에)
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	// 프로그램 <-- 파일 ( 입력 ) 
	
	public void fileRead() {
		
		
		//FileInputStream : 파일을 입력해서 1바이트 단위로 입력할수 있는 기반스트림 
		//ObjectInputStream : 객체단위로 입력할 수 있도록 도와주는 보조스트림(ObjectReader 아님!)
		
		//읽어올 땐 readObject();
		

		
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_Phone.txt"))){
					
			
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			
			System.out.println(ois.readObject()); 
			//파일의 끝을 만나는 순간 EOFException 예외발생!!
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
	
	
}
