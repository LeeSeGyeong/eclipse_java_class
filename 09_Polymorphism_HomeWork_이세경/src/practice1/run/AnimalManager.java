package practice1.run;

import practice1.model.vo.Animal;
import practice1.model.vo.Cat;
import practice1.model.vo.Dog;

public class AnimalManager {
	
	public static void main(String[] args) {
		
		Animal[] am = new Animal[5];
		
		am[0] = new Cat("±Ý´óÀÌ","¼ô","°­ºÏ","È²±Ý»ö");
		am[1] = new Cat("»ï»öÀÌ","ÅÎ½Ãµµ","±èÆ÷","°ËÁ¤»ö");
		am[2] = new Dog("Æ÷¹Ì","½ºÇÇÃ÷",7);
		am[3] = new Dog("¸Á°í","½ºÇÇÃ÷",8);
		am[4] = new Dog("µÕÀÌ","Çªµé",5);
										
		
		for(int i=0;i<am.length;i++) {
			am[i].speak();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}//main
}//class
