package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
			 
		Employee[] em = new Employee[3];
		//3���� ������ �迭 ����
		
		em[0] = new Employee();
		em[1] = new Employee(1,"ȫ�浿", 19,'M',"01022223333","���� ���");
		em[2] = new Employee(2,"������","������","����",20,'F',1000000,0.01,"01011112222","���︶��");
		
		System.out.println(em[0].information());
		System.out.println(em[1].information());
		System.out.println(em[2].information());
		System.out.println("=========================================================");
		
		//setter�޼ҵ带 ���� ������ �� �ٽ� ��� 
		
		em[0] = new Employee(0,"�踻��","������","����",30,'M',3000000,0.2,"01055559999","���� ����");
		em[1] = new Employee(1,"ȫ�浿","��ȹ��","����",19,'M',4000000,0.3,"01022223333","���� ���");
		
		System.out.println(em[0].information());
		System.out.println(em[1].information());
		System.out.println("=========================================================");
		
		//���ʽ��� ����� ������ ��� , ����ϰ� 
		
		int total = 0;
		
		
		for(int i=0;i<3;i++) {
			int sumSalary = (int)(em[i].getSalary() + (em[i].getSalary() * em[i].getBonusPoint())) *12;
			
			System.out.println(em[i].getEmpName() + "�� ����" + sumSalary + "��");
			
			total += sumSalary;
		}
		

		//�� ���� ������ ����� ���ϼ��� 
		System.out.println("�������� ��տ��� : " + (total/em.length) +"��");
		
	} 
	
	
	
}
