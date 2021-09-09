package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Person;
import com.hw1.model.vo.Student;

public class Run extends Person{

	public static void main(String[] args) {
			
		Student[] stu = new Student[3];
		
		 stu[0] = new Student("ȫ�浿",20,178.2,70.0,1,"�����ý��۰��а�");
		 stu[1] = new Student("�踻��",21,187.3,80.0,2,"�濵�а�");
		 stu[2] = new Student("������",23,167.0,45.0,4,"������Ű��а�");
		
		for(Student s : stu) {
			System.out.println(s);
		}
	

		 Employee[] e = new Employee[10];
		 
		 int count = 0;
		 
		 while(true) {
			 
			
				 
				 Scanner sc = new Scanner(System.in);
				 
				 System.out.print("�̸� : " );
				 String name = sc.nextLine();
				 System.out.print("���� : ");
				 int age = sc.nextInt();
				 System.out.print("Ű : ");
				 double height = sc.nextDouble();
				 System.out.print("������ : ");
				 double weight = sc.nextDouble();
				 System.out.print("�޿� : " );
				 int salary = sc.nextInt();
				 sc.nextLine();
				 System.out.print("�μ� : ");
				 String dept = sc.nextLine();
				 
				 e[count++] = new Employee(name,age,height,weight,salary,dept);
				 
				 
				 System.out.print("��� �Է��Ͻðڽ��ϱ�?(y/n) : ");
				 char ch = sc.nextLine().toUpperCase().charAt(0);
				 //toUpperCase()�� �ҹ��ڸ� �빮�ڷ� �ٲ��ִ� ��
				 //toLowerCase()�� �빮�ڸ� �ҹ��ڷ� �ٲ��ִ� �� 
				 
				 if ( ch == 'y' || ch == 'Y') {
					
				 } else if (ch == 'n' || ch == 'N') {
					 	break;
				 }  
			 	
		 }//while���� �� 
		
		 
		 for(Employee emp: e) {
		 		System.out.println(emp);
		 	}  
		 System.out.println("�������� �� :: "+count);
				
	}
}
		
	
		
		
				
	



	
