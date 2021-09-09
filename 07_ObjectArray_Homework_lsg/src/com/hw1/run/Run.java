package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
			 
		Employee[] em = new Employee[3];
		//3명의 정보를 배열 생성
		
		em[0] = new Employee();
		em[1] = new Employee(1,"홍길동", 19,'M',"01022223333","서울 잠실");
		em[2] = new Employee(2,"강말순","교육부","강사",20,'F',1000000,0.01,"01011112222","서울마곡");
		
		System.out.println(em[0].information());
		System.out.println(em[1].information());
		System.out.println(em[2].information());
		System.out.println("=========================================================");
		
		//setter메소드를 통해 수정한 뒤 다시 출력 
		
		em[0] = new Employee(0,"김말똥","영업부","팀방",30,'M',3000000,0.2,"01055559999","전라도 광주");
		em[1] = new Employee(1,"홍길동","기획부","부장",19,'M',4000000,0.3,"01022223333","서울 잠실");
		
		System.out.println(em[0].information());
		System.out.println(em[1].information());
		System.out.println("=========================================================");
		
		//보너스가 적용된 연봉을 계산 , 출력하고 
		
		int total = 0;
		
		
		for(int i=0;i<3;i++) {
			int sumSalary = (int)(em[i].getSalary() + (em[i].getSalary() * em[i].getBonusPoint())) *12;
			
			System.out.println(em[i].getEmpName() + "의 연봉" + sumSalary + "원");
			
			total += sumSalary;
		}
		

		//총 직원 연봉의 평균을 구하세요 
		System.out.println("직원들의 평균연봉 : " + (total/em.length) +"원");
		
	} 
	
	
	
}
