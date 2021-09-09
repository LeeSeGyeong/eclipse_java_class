package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Person;
import com.hw1.model.vo.Student;

public class Run extends Person{

	public static void main(String[] args) {
			
		Student[] stu = new Student[3];
		
		 stu[0] = new Student("홍길동",20,178.2,70.0,1,"정보시스템공학과");
		 stu[1] = new Student("김말똥",21,187.3,80.0,2,"경영학과");
		 stu[2] = new Student("강개순",23,167.0,45.0,4,"정보통신공학과");
		
		for(Student s : stu) {
			System.out.println(s);
		}
	

		 Employee[] e = new Employee[10];
		 
		 int count = 0;
		 
		 while(true) {
			 
			
				 
				 Scanner sc = new Scanner(System.in);
				 
				 System.out.print("이름 : " );
				 String name = sc.nextLine();
				 System.out.print("나이 : ");
				 int age = sc.nextInt();
				 System.out.print("키 : ");
				 double height = sc.nextDouble();
				 System.out.print("몸무게 : ");
				 double weight = sc.nextDouble();
				 System.out.print("급여 : " );
				 int salary = sc.nextInt();
				 sc.nextLine();
				 System.out.print("부서 : ");
				 String dept = sc.nextLine();
				 
				 e[count++] = new Employee(name,age,height,weight,salary,dept);
				 
				 
				 System.out.print("계속 입력하시겠습니까?(y/n) : ");
				 char ch = sc.nextLine().toUpperCase().charAt(0);
				 //toUpperCase()는 소문자를 대문자로 바꿔주는 것
				 //toLowerCase()는 대문자를 소문자로 바꿔주는 것 
				 
				 if ( ch == 'y' || ch == 'Y') {
					
				 } else if (ch == 'n' || ch == 'N') {
					 	break;
				 }  
			 	
		 }//while문의 끝 
		
		 
		 for(Employee emp: e) {
		 		System.out.println(emp);
		 	}  
		 System.out.println("직원들의 수 :: "+count);
				
	}
}
		
	
		
		
				
	



	
