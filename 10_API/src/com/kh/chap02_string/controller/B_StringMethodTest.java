package com.kh.chap02_string.controller;

public class B_StringMethodTest {

	
	public void method() {
		
		// (1) ���� ���� 
		String str1 = "Hello World";
		
		// �޼ҵ��(�Ű�����) : ��ȯ�� 
		
		// 1. ���ڿ�.charAt(int index) : char (���� 1�� , ex. 'A' , '��' )
		//	    ���ڿ����� ���޹��� index��ġ�� ���ڸ��� �����ؼ� ���� 
		
		char ch = str1.charAt(8);
		System.out.println("ch : " + ch);
		
		
	
		// (2) ���ڿ�.concat(String str) : String
		//	  '���ڿ�'�� ���޵� '�� �ٸ� ���ڿ�'�� �ϳ��� ���ļ� ���ο� ���ڿ��� return
		
		String str2 = str1.concat(" !!!"); 	   // a) ��, Hello World(str1) + !!! �� ��ġ�� ���̴�.
		System.out.println("str2 : "+str2);	   //		  ���ڿ�(str1)    +  �Ǵٸ� ���ڿ�(!!!)
		
		String str3 = str1 + " !!!";		   // b) ���ڿ��� �������� ��ĥ ���� ���� 
		System.out.println("str3 : " + str3);
		
		System.out.println("str2�� str3�� ��ġ�մϱ�? : " + (str2 == str3)); //false
		// str2�� str3�� ���ڿ��� ��ġ������ , ���� ����ִ� �ּҰ��� �ٸ���.
		
		
		// (3) ���ڿ�.equals(Object obj) : boolean  //Object�� ��� �ڷ����� �θ�?�ϱ� ��簪�� �ޱ� ����
		//	      ���ڿ��� ���޵� �Ǵٸ� ���ڿ��� ������ �ּҰ� �񱳰� �ƴ� '���� ���ڿ� ��'�� ������ ��������� 
		
		System.out.println("str2�� str3�� ��ġ�մϱ�? : " + str2.equals(str3)); //true
		
		
		// (4) ���ڿ�.contains(CharSequence s) : boolean 
		System.out.println("str1�� Hello��� ���ڿ��� ���ԵǾ� �ֽ��ϱ�? : " + str1.contains("Hello"));
		System.out.println("str1�� Bye��� ���ڿ��� ���ԵǾ� �ֽ��ϱ�? : " + str1.contains("Bye"));
		
		// (5) ���ڿ�.length : int 
		
		System.out.println("str1�� ���� : "+ str1.length());
		
		// (6) ���ڿ�.substring(int beginIndex) : String => ���ڿ��� biginIndex��ġ�������� ������ ���ڿ��� �����ؼ� ����
		//	      ���ڿ�.substring(int beginIndex , int endIndex) : String
		//					==> ���ڿ��� beginIndex��ġ���� ���� endIndex-1 ��ġ������ ���ڿ��� �����ؼ� ���� 
		
		System.out.println(str1.substring(6));
		System.out.println(str1.substring(0,5)); //begin <= substring < end
		
		
		// (7) ���ڿ�.replace(char oldChar, char newChar) : String 
		//	      ���ڿ������� oldChar���ڵ��� newChar�� �ٲ� �� ���ڿ� ����
		
		String str4 = str1.replace('l','c');
		System.out.println("str4 : " + str4 ); // l�� ���� c�κ�ȯ��(replace) �� ���ڿ��� return 
		System.out.println("str1�� ����ѳ�? : "+str1); //replace�Ŀ� str1�� ���� ����������� 
		
		
		// (8) ���ڿ�.toUpperCase() : String => ���ڿ��� �� '�빮��'�� ������ �� ���ڿ� ���� 
		//	      ���ڿ�.toLowerCase() : String => ���ڿ��� �� '�ҹ���'�� ������ �� ���ڿ� ����
		
		String str5 = str1.toUpperCase();//��� �빮�� 
		System.out.println("str5 : " + str5); 
		System.out.println("Lower : " + str1.toLowerCase()); //��� �ҹ��� 
		
		
		/*
		 * System.out.println("��� �Է��Ͻðڽ��ϱ�? (y/n) : ");
		 * char ch = sc.nextInt().toUpperCase().charAt(0); // �빮�ڿ� �ش��ϴ� ���� ����(toUpperCase) //'N' 'Y'
		 * 
		 * 			// �޼ҵ� ���̾ ȣ�� == �޼ҵ� ü�̴� 
		 * 
		 * 	if(ch == 'N'){ // �Էµ� ���ڸ� �빮�ڷ� �ٲ��ִϱ� 
		 * 		//���α׷� ���� 
		 * 	}
		 * 		
		 * 		
		 */
		
		
		
		// (9) ���ڿ�.trim() : String 
		//	      ���ڿ��� '�� ��'������ �����ϰ� �����ڿ��� ����
		
		String str6 = "   JAV  A   "; //�߰��� ������ ������� ���� 
		System.out.println(str6.trim());
		
		
		// (10) ���ڿ�.toCharArray() : char[] ��ȯ 
		//							   �� �迭�� index�� ���ڸ� �ϳ� �ϳ� �������ִ� ���� 
		
		char[] arr = str1.toCharArray();
		System.out.println(arr[0]);
		
	
		// (11) string.valueOf(char[] data) : String���� ��ȯ 
		//									  (10)������ �� �����ߴ� ���ڵ��� �����ִ� �޼ҵ� 
		
		System.out.println(String.valueOf(arr));
		//������ ���� ��µȴ�. 
		
		
		
	}//method
}//class
