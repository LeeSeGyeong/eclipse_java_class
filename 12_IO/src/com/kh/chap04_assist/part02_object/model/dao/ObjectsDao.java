package com.kh.chap04_assist.part02_object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectsDao {

	
	public void fileSave() {
	
	Phone[] arr = new Phone[3];
	
	arr[0] = new Phone("아이폰",1300000);
	arr[1] = new Phone("갤럭시",1200000); 
	arr[2] = new Phone("플립",1500000);
	
	try(ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("e_Phones.txt"))){
		
		for(int i=0;i<arr.length;i++) {
			ois.writeObject(arr[i]);
		}
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	
	

	}//fileSave
	
		public void fileRead() {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e_phones.txt"))) {
			
			/*
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			
			System.out.println(ois.readObject()); // 파일의 끝을 만나는 순간 EOFException 예외 발생!!
			*/
			
			while(true) {
				System.out.println(ois.readObject());
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) { //EndOfFile 
			System.out.println("파일을 다 읽어들였습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램이 종료됩니다.");
		
	}
	


	
	
}//class

	