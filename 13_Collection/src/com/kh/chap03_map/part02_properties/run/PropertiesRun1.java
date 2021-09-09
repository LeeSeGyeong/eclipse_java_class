package com.kh.chap03_map.part02_properties.run;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class PropertiesRun1 {
		
	public static void main(String[] args) {
		
		
		// Properties : Map�迭�� Collection => Key+Value ��Ʈ�� ���� 
		// HashMap���� ������ : Properties���� Ű���� String, ������� String���� ���� ! 
		//generic���� ����
		
		
		Properties prop = new Properties();
		
		// Map�迭�̱� ������ put�޼ҵ� �̿��ؼ� Ű+��� ��Ʈ ��� ���� ! 
	/*	
		prop.put("������",new Snack("���ڸ�",1500));
		prop.put("�����",new Snack("§ ��",700));
		
		System.out.println(prop);
		System.out.println(prop.get("������")); //get�޼ҵ� ��밡��! 
		
		// ������, Properties ����ϴ� ���� �ַ� properties�� ��� �͵��� ���Ϸ� ��� �Ǵ� �Է¹޾� �ö� �����! 
		// ��, Properties���� �����ϴ� store(), load() �޼ҵ带 ����ϱ� ���ؼ� 
		
		try { 								  //store(������("���ϸ�") , ���ڿ�)
			prop.store(new FileOutputStream("test.properties"), "propertiesTest"); 
			//ClassCastException�߻�
			//���������� store����� Properties�� ����ִ� Ű+��� ��Ʈ���� String���� ����ȯ�ؼ� �����! 
			//Snack��ü�� String���� ������ ����ȯ�ϴٺ��� ����� ����(�ΰ��� ���� ���谡 ���� �����ϱ� ����ȯ �ȵ���)
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		*/
		
		
		// Properties Ű+��� ��Ʈ�� �߰��� �� 
		// 1. setProperty(String key, String value)
		
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop); // MapƯ¡ : ������� ���� �ȵ� , key�� �ߺ��Ǹ� ������ ������ �������
		
		// 2. getProperty(String key) : String�� Value�� return
		System.out.println(prop.getProperty("List"));
		System.out.println(prop.getProperty("�����")); //�������� �ʴ� key�� �����ϸ� "null"�� ��ȯ/���ܹ߻������ʱ�
		
		try {
			//3. store(OutputStream os , String comments ) : Properties�� ����ִ� key-value������ ���Ϸ� ��� 
			// 											   : ���������� �� String���� ��ȯ�ؼ� ���޵� 
			prop.store(new FileOutputStream("test.properties"), "propertiesTest");
			
			//4. storeToXML(OutputStream os , String comments) , xml���Ϸ� ���(web���� ���ֻ��)
			prop.storeToXML(new FileOutputStream("test.xml"), "propertiesTest");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
