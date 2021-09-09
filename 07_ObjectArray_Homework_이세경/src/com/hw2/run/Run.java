package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {
			public static void main(String[] args) {
		
				while (true) {

					Student[] s = new Student[10];
					int count = 0;

					for (int i = 0; i < s.length; i++) {
						Scanner sc = new Scanner(System.in);

						System.out.print("학년 : ");
						int grade = sc.nextInt();
						System.out.print("반 : ");
						int classroom = sc.nextInt();
						sc.nextLine();
						System.out.print("이름 : ");
						String name = sc.nextLine();
						System.out.print("국어점수 : ");
						int kor = sc.nextInt();
						System.out.print("영어점수 : ");
						int eng = sc.nextInt();
						System.out.print("수학점수 : ");
						int math = sc.nextInt();
						sc.nextLine();

						s[i] = new Student(grade, classroom, name, kor, eng, math);

						System.out.print("계속하시겠습니까?(y/n) : ");
						char b = sc.nextLine().charAt(0);

						if (b == 'y' || b == 'Y') {
							
						} else if (b == 'n' || b == 'N') {
							break;
						}	count += 1;

					}
					for (int j = 0; j <=count; j++) {
						System.out.println(s[j].information());
					}
					System.out.println("총 학생들의 수 : " + (count+1));
					break;
				}
			}
}


