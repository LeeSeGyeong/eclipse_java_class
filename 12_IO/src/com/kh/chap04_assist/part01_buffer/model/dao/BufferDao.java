package com.kh.chap04_assist.part01_buffer.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDao {
	
	
	/*
	 * ������Ʈ�� : ��ݽ�Ʈ�������� �����ߴ� ������ ���� �������ִ� ��Ʈ�� 
	 * 			  ��ݽ�Ʈ������ �������� �ʴ� �߰����� �޼ҵ� ����(������ ���� �ӵ� ��� ��..)
	 * 
	 * 		>>  �ܺθ�ü�� ���� ����Ǵ� ��Ʈ�� �ƴ�! 
	 * 			�ܵ� ��� �Ұ�( �ݵ�� ��ݽ�Ʈ���� �Բ� ���)
	 * 
	 * 
	 */
	
	// ���α׷� --> ���� (���)
	public void fileSave() {
		
		// FileWriter : ��¿� ��ݽ�Ʈ��(2byte) - ���ϰ� ���� ����Ǵ� ��ݽ�Ʈ��
		// BufferedWriter : ���۶�� ������ �������ִ� ������Ʈ�� (�ӵ���� , ���ۿ� ���� �׾Ƴ��� �ѹ��� �Ҷ�� �������)
		
		//(1) ������Ʈ���� ����ؼ� ������غ��� 
		
		//(1-1) ������Ʈ���� ����ϱ��� , ��ݽ�Ʈ�� ���� �����ϱ�
		//FileWriter fw = new FileWriter("c_buffer.txt");
		
		//(1-2) ������Ʈ�� ���鶧, ��ݽ�Ʈ�� ��ü�� �����ϸ鼭 ����
		//BufferedWriter bw = new BufferedWriter(fw);
		
		
		//(2) ������Ʈ�� & (��ݽ�Ʈ��) ������ , ���ٿ� ����غ��� 
		
		//(2-1) ������Ʈ�� ��ȣ �ȿ� ��ݽ�Ʈ�� �����ֱ�
	/*	BufferedWriter bw = null; //finally�� �������� null�� �ʱ�ȭ�س���
		
		try {
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			
			//write�޼ҵ� �̿��ؼ� ������ ��� 
			bw.write("�ȳ��ϼ���.\n");
			bw.write("�ݰ����ϴ�.");
			bw.newLine(); //�߰����� �ٹٲ� �޼ҵ� Ȱ�밡�� (buffer)
			bw.write("����������");
			// ���۶�� ������ �׾Ƴ��ٰ� �ѹ��� ������� => �ӵ���� ����!
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{//3.�ݳ�(close)
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}*/
		
		
		
		
		//try-with-resource�������� �ڿ��ݳ����� �� �����ϰ� �۾��� �� ����
		//jdk7���� �̻���� ��밡��
		
		/*
		 * try(try�� ������ ����� ��Ʈ����ü ��������){ //�˾Ƽ� try�� ������ �ش� ��Ʈ�� �ݳ����� ���� 
		 * 
		 * } catch(����Ŭ���� e) {
		 * 
		 * }
		 * 
		 */
		
		//�ۿ� ���������ε� finally������ 
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))){
			
			bw.write("�ȳ��ϼ���.\n");
			bw.write("�ݰ����ϴ�.");
			bw.newLine(); //�߰����� �ٹٲ� �޼ҵ� Ȱ�밡�� (buffer)
			bw.write("����������");
			
		}catch(IOException e) {
			e.printStackTrace();
		} // �ݳ����� �Ƚ���ε�! �ڵ����� �ݳ����� 
		
		
		
		}
		
	
		//���α׷� <-- ����(�Է�)
		public void fileRead() {
			
			// FileReader : ���ϰ� �����ؼ� 2����Ʈ ������ �����͸� �Է¹��� �� �ִ� ��ݽ�Ʈ��
			// BufferedReader : �ӵ���� ������ �Ǵ� ������Ʈ�� 
			
			
			try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))){
				
				/*
				//br.readLine(); //���Ϸκ��� �� �پ� �������� �� (���� �� �ܾ �������µ� ) , ������Ʈ�������� ��밡��
				System.out.println(br.readLine());
				System.out.println(br.readLine());
				System.out.println(br.readLine());
				//�ٷιٷ� ������ �޾ƿ��ϱ� �ӵ��� ������ 
				
				
				System.out.println(br.readLine());
				System.out.println(br.readLine()); // readLine()�޼ҵ� ��½� 
												   // ������ �� ����ϰ� ���� null���� ��ȯ 
				*/
				
				String value = null;
				
				while((value = br.readLine()) != null) { //null�� ���Ҷ��� =�� ����, "���ڿ�"�� ���Ҷ��� .equals
					System.out.println(value);
				}
				
				
				
			} catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			
		
	
	
	
	
	
	
	
	
	
	
	
	
		}
}
	

