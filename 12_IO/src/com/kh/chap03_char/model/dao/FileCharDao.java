package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {

	
	/*
	 * "���� ��� ��Ʈ��"�� ������ ������غ��� 
	 * 
	 * - ���ڽ�Ʈ�� : �����͸� 2����Ʈ ������ �����ϴ� ��δ�(2byte)
	 * - ��ݽ�Ʈ�� : �ܺθ�ü�� ���������� ����Ǵ� ��δ�
	 * 
	 * 
	 *   XXXReader : �Է¿� ��Ʈ�� 
	 *   XXXWriter : ��¿� ��Ʈ�� 
	 * 
	 */
	
	//#1) ���α׷� --> ���� (���)
	public void fileSave() {
		
		//FileWriter : ���Ϸ� �����͸� 2����Ʈ ������ ����� �� �ִ� ��Ʈ�� 
		
		FileWriter fw = null;
		
		
		try {
			//1. FileWriter ��ü ����
			fw = new FileWriter("b_char.txt");
			// �ش������� ������ ���� ����� �ְ� ���� , ������ �׳� �������� 
			
			//2. ��� 
			// 	 write �޼ҵ带 �̿��ؼ� �����͸� 2byte������ ������ ���� 
			
			fw.write("��! IO��մ�...��;;"); 
			//��ü ������ 2byte�� �ƴ϶� �ѱ��� �ѱ��ڰ� ���� 2byte��
			//�׷��� �����δ� �ش� ���ڿ��� ���ڰ� �ϳ��� �ϳ��� ���۵Ǵ� �����̴�.
			fw.write(' ');
			fw.write('A');
			fw.write("\n");
			
			char[] arr = {'a', 'p','p','l','e'};
			fw.write(arr); //������ �ڹٲ�� ��� ���� ! �ֳĸ� ������� ��µǴϱ��
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 3. �ݳ��ϴ� ���� 
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
	
	// ���α׷� <-- ����(�Է�)

	public void fileRead() {
		
		// FileReader : ���Ϸκ��� �����͸� 2����Ʈ ������ �Է¹��� �� �ִ� ��Ʈ�� 
		
		FileReader fr = null;
		
		try {// 1. FileReader��ü ���� 
			
			fr = new FileReader("b_char.txt"); 
			//������ �����ϴ� ���Ϸθ� �����ϱ� 
			
			
			
			//2. �Է�
			// : read �޼ҵ� �̿��ؼ�(���������� ���ƿ� , ������ char������ ����ȯ�ؾ���)
			//	 ������ ���� ������ ���� -1�� ��ȯ 
			
			int value =0;
			
			while((value=fr.read()) != -1) {
				System.out.print((char)value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally { //3.��ȯ
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
