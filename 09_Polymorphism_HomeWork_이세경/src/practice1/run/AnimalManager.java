package practice1.run;

import practice1.model.vo.Animal;
import practice1.model.vo.Cat;
import practice1.model.vo.Dog;

public class AnimalManager {
	
	public static void main(String[] args) {
		
		Animal[] am = new Animal[5];
		
		am[0] = new Cat("�ݴ���","��","����","Ȳ�ݻ�");
		am[1] = new Cat("�����","�νõ�","����","������");
		am[2] = new Dog("����","������",7);
		am[3] = new Dog("����","������",8);
		am[4] = new Dog("����","Ǫ��",5);
										
		
		for(int i=0;i<am.length;i++) {
			am[i].speak();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}//main
}//class
