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
	
	arr[0] = new Phone("������",1300000);
	arr[1] = new Phone("������",1200000); 
	arr[2] = new Phone("�ø�",1500000);
	
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
			
			System.out.println(ois.readObject()); // ������ ���� ������ ���� EOFException ���� �߻�!!
			*/
			
			while(true) {
				System.out.println(ois.readObject());
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) { //EndOfFile 
			System.out.println("������ �� �о�鿴���ϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("���α׷��� ����˴ϴ�.");
		
	}
	


	
	
}//class

	