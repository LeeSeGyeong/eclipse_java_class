package kh.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice { 
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("1.�Է�\n2.����\n3.��ȸ\n4.����\n9.����\n�޴� ��ȣ�� �Է��ϼ��� : ");
		int menu = sc.nextInt();
		
		
		String result = " ";
		
		switch(menu) {
		
		case 1 : 
			result = "�Է�"; break;
		case 2 : 
			result = "����"; break;
		case 3 : 
			result = "��ȸ"; break; 
		case 4 : 
			result = "����"; break; 
		case 9 : 
			result = "����"; 
			System.out.println("���α׷��� ����˴ϴ�."); return;
		}
		
		System.out.println(result+" �޴��Դϴ�.");
		
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �� �� �Է��ϼ��� :");
		int num = sc.nextInt();
		
		if(num>0) {
			if(num%2 == 0) {
				System.out.println("¦����.");
			} else {
				System.out.println("Ȧ����.");
			}
		} else {
				System.out.println("����� �Է����ּ���.");
		}
	}
	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
			int kor = sc.nextInt();
		System.out.print("���� ���� : ");
			int meth = sc.nextInt();
		System.out.print("���� ���� : ");
			int eng = sc.nextInt();
			
			int avg = ((kor + meth + eng)/3);
			int sum = (kor+meth+eng);
			
			if(kor >= 40 && meth >= 40 && eng >= 40 && avg >= 60) {
				System.out.println("���� : " + kor);
				System.out.println("���� : " + meth);
				System.out.println("���� : " + eng);
				System.out.println("�հ� : "+sum);
				System.out.println("��� : "+avg);
				System.out.println("�����մϴ�, �հ��Դϴ�!");
			} else {System.out.println("���հ� �Դϴ�.");
						}
	
	}
	
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1�� 12������ �����Է� : ");
			int num1 = sc.nextInt();
			
			String result;
			
			switch(num1) {
			case 1 :
			case 2 :
			case 12 : System.out.print(num1+"���� �ܿ��Դϴ�."); break;
			case 3 :
			case 4 :
			case 5 : System.out.print(num1+"���� ���Դϴ�"); break;
			case 6 :
			case 7 :
			case 8 : System.out.print(num1+"���� �����Դϴ�."); break;
			case 9 :
			case 10 :
			case 11 : System.out.print(num1+"���� �����Դϴ�."); break;
			
			default : System.out.print(num1 + "���� �߸� �Էµ� ���Դϴ�."); 
			}
			
			
			
	}
	
	public void practice5() {
		//1. ���Ƿ� ���̵�� ��й�ȣ �����صα� 
		//String userid = "boram";
		//String userpwd ="1234";
		//����ڿ��� ���̵�� ��й�ȣ �Է¹ޱ� 
		
		//3.����ڿ��� �Է¹��� ���̵�� ��й�ȣ ������ ���ǰ˻��� ����� ���
		
			//Scanner sc = new Scanner(System.in);
		
			/*System.out.print("���̵� : ");
			String inputid = sc.nextLine();
			
			System.out.print("��й�ȣ : ");
			int password = sc.nextInt();
			
			if (inputid.equals("boram")) {
				if(userpwd.equals("1234")) {
					System.out.print("�α��� ����! ��ī��īǪ "); 
				} else {System.out.print("��й�ȣ�� Ʋ�Ƚ��ϴ�. ");	
					} 
				} else {
				System.out.print("���̵� Ʋ�Ƚ��ϴ�.");	
			}*/
			
				
			//1. ���Ƿ� ���̵�� ��й�ȣ �����صα� 
			String userid = "boram";
			String userpwd ="1234";
			//����ڿ��� ���̵�� ��й�ȣ �Է¹ޱ� 
			
				String userId = "boram";
				int userPwd = 1234;
				
				Scanner sc = new Scanner(System.in);
				
				System.out.print("���̵� : ");
				String inputid = sc.nextLine();
				System.out.print("��й�ȣ : ");
				int inputpwd = sc.nextInt();
				//3.����ڿ��� �Է¹��� ���̵�� ��й�ȣ ������ ���ǰ˻��� ����� ���		
				if(userId.equals(inputid) && userPwd == inputpwd) { //���̵� ��ġ�ϰ� ���ȣ ��ġ�� ���
					System.out.println("�α��� ����");
				}else if(userId.equals(inputid)) { //���̵�� ��ġ������ ����� Ʋ���� ���
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				}else if(userPwd == inputpwd) {
					System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
				} else { System.out.println("�Ѵ� Ʋ�Ƚ��ϴ�.");
				}
				
				}
			
			
	
	
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
		String lv = sc.nextLine();
		
		switch(lv) {
		
		case "������" : System.out.print("ȸ������ , �Խñ� ����"); break;
		case "ȸ��" : System.out.print("�Խñ� �ۼ�, ����ۼ�"); break;
		case "��ȸ��" : System.out.print("�Խñ� ��ȸ"); 
		break;
		
		default : System.out.print("�߸� �Է��߽��ϴ�."); 
		}
		
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Ű(cm) : ");
		double height = sc.nextDouble();
	
		System.out.print("������(kg) : ");
		double kg = sc.nextDouble();
		sc.nextLine();
		
		double bmi = kg/(height * height) ;
		System.out.println("BMI ���� : " + bmi);
		
		if(bmi<18.5) {
			System.out.println("��ü��");
		} else if (bmi <23) {
			System.out.println("����ü��");
		} else if (bmi < 25){
			System.out.println("��ü��");
		} else {
			System.out.println("����");
		}
		
	}
	
	
	public void practice8() {
		//1.����ڿ��� ��� �ΰ��� �����ȣ �Է¹ޱ�
		Scanner sc = new Scanner(System.in);

		System.out.print("�ǿ�����1 �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ǿ�����2 �Է� : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�����ڸ� �Է�(+,-,*,/,%) : ");
		char ch = sc.nextLine().charAt(0);
		
		/* 1. if-else if�� �̿��ؼ� ==============================================
		if (num1 > 0 && num2 > 0 && ch == '+') {
			System.out.printf("%d %s %d = %d", num1, ch, num2, (num1 + num2));
			
		} else if (num1 > 0 && num2 > 0 && ch == '-') {
			System.out.printf("%d %s %d = %d", num1, ch, num2, (num1 - num2));
			
		} else if (num1 > 0 && num2 > 0 && ch == '*') {
			System.out.printf("%d %s %d = %d", num1, ch, num2, (num1 * num2));
			
		} else if (num1 > 0 && num2 > 0 && ch == '/') {
			System.out.printf("%d %s %d = %d", num1, ch, num2, (num1 / num2));
			
		} else if (num1 > 0 && num2 > 0 && ch == '%') {
			System.out.printf("%d %s %d = %d", num1, ch, num2, (num1 % num2));
			
		} else {
			System.out.println("�߸��Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
		}
		=====================================================================*/
		
		
		
		
		/* 2. ���� ������ ���׷��̵� (��ø if�� ��� : ����� ������ ���� �˻��ϰ� �����Ѵ�!)===
		
		if(num1 > 0 && num2 > 0) { // 1_1) �ΰ��� ���� ��� ����� ���
			
			// 2) �����ȣ�� ������ ��
			if(ch == '+') {
				
			}else if(ch == '-') {
				
			}else if(ch == '*') {
				
			}else if(ch == '/') {
				
			}else if(ch == '%') {
				
			}else { // �ΰ��� ������ ��� ����� ������ �����ȣ�� �߸� �Է����� ���
				
			}
		}else {  // 1_2) ����� �ƴ� ���� �Է����� ���
			
		}
		
		================================================================*/
		
		
		
		// 3. ���� ���뿡�� �� ���׷��̵� =======================================
		if(num1 > 0 && num2 > 0) {
			
			int result=0; // �����ȣ�� ���缭 ��� ������ ����� ����� ���� ����!
			
			// �����ȣ�� ������ ������ϴ� �� switch������ �ٲ۳���
			switch(ch) {
			case '+': result = num1 + num2; break;
			case '-': result = num1 - num2; break;
			case '*': result = num1 * num2; break;
			case '/': result = num1 / num2; break;
			case '%': result = num1 % num2; break;
			default: System.out.println("�����ڸ� �߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�."); return; // �޼ҵ� �����������ֵ���
			}

			// ��¹��� ���⿡ �� �ѹ��� ����Ҳ���
			System.out.printf("%d %c %d = %d", num1, ch, num2, result);
			
		}else {
			System.out.println("����� �ƴ� ���� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�."); 
		}
	}
	
		public void method9() {
			
			
		}
}

