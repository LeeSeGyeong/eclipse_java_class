package com.kh.variable;

public class C_Printf { 
	//8��2�� �������� 
	public void PrintfTest() {
		
		//System.out.printf("����ϰ����ϴ�����(format)",����ϰ����ϴ� ��,��1,��2,...); ���⼭ f�� format
		//����ϰ����ϴ� ������ �ڿ� �޸��� ������ �� �ִ�.
		//����ϰ����ϴ� ������ ������ ���Ŀ� ���缭 ���'��'���� (�ٹٲ޾ȵ� ! print����ó��)
		
		/*
		 * (1) ���˾ȿ��� ���� �� �ִ� Ű����
		 * %d : ���� 
		 * %c : ���� 
		 * %s : ���ڿ�(���ڵ� ����)
		 * %f : �Ǽ� 
		 * 
		 */
		
		int iNum1 = 10;
		int iNum2 = 20;
		
		
		System.out.println(iNum1 + " " + iNum2+"%");
		System.out.printf("%d %d%%",iNum1, iNum2);
		//(tip!) %�� printf������ ��Ÿ������ %%�ι����ָ� �ȴ� 
		System.out.println( );
	
		
		//(2) %d���� %5d �ټ�ĭ�� ���� Ȯ�� �� ����������(������ ��������)	
		System.out.printf("%-5d\n",iNum1); 	
		System.out.printf("%-5d\n",250);
		System.out.printf("%-5d\n",3000);
		System.out.printf("%-5d\n",16);
		
		double dNum1 = 1.23456789;
		double dNum2 = 4.53;
		
		System.out.printf("%f\t %f\n",dNum1,dNum2); //������ �Ҽ��� �Ʒ� 6°�ڸ����� ������ 
		System.out.printf("%.2f %.1f\n",dNum1,dNum2); //%f.2d ó�� ���� ���ϴ� �Ҽ������� ������ �� �ִ�.

		// \t tab
		
		char ch = 'a';
		String str = "Hello";
		
		System.out.printf("%c %10s %s\n",ch,str,ch);
		System.out.printf("%C %S", ch,str); //�빮�ڷε� ��°��� 
		
	}

}
