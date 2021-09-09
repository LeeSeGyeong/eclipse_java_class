package com.kh.chap04_assist.part02_object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectDao {

	// ���α׷� --> ���� ( ��� ) 
	
	public void fileSave() {
		
			
		//����� ������(Phone��ü)
		Phone ph = new Phone("������",1300000);
	
		//FileOutputStream   : ���ϰ� �����ؼ� 1����Ʈ ������ ����� �� �ִ� ��ݽ�Ʈ��
		//ObjectOutputStream : ��ü������ ����� �� �ֵ��� ������ �ִ� ������Ʈ��(ObjectWriter ����!)
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_phone.txt"))){
			
		oos.writeObject(ph); // ��� ��ü�� �޾Ƽ� ����ҰŴϱ� write + object�� �����ش�.
		
		
		// ū ������ ���� ��θ� ������ �� �ֵ��� '����ȭ'��� �� �ʿ��� 
		// Phone �Ű����� ������ ����ȭ�ڵ�(implements Serializable)�� �����ָ� �� (Phone Ŭ������)
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	// ���α׷� <-- ���� ( �Է� ) 
	
	public void fileRead() {
		
		
		//FileInputStream : ������ �Է��ؼ� 1����Ʈ ������ �Է��Ҽ� �ִ� ��ݽ�Ʈ�� 
		//ObjectInputStream : ��ü������ �Է��� �� �ֵ��� �����ִ� ������Ʈ��(ObjectReader �ƴ�!)
		
		//�о�� �� readObject();
		

		
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_Phone.txt"))){
					
			
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			
			System.out.println(ois.readObject()); 
			//������ ���� ������ ���� EOFException ���ܹ߻�!!
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	
}
