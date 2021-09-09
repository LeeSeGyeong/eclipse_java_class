package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class MapRun {
	public static void main(String[] args) {
		
		//Map�� ���� �� �ΰ�������! �ö󰡺���׷��� generic�����ϴ� �͵� <key , value> �ΰ��� ������ �����������! (����ȯ�� ���ŷο��� ���� �� ����)
		
		 HashMap<String, Snack> hm = new HashMap<>(); // = >  K == String , V == Snack 
		 
		 //���������� ���� 
		 //List�迭 , Set�迭�� Ŭ�������� Collection ������ Ŭ������. 
		 // => ��ü�� �߰��ϰ��� �Ҷ� ���������� add�޼ҵ� �̿�!
		 
		 
		 //Map�迭�� Collection�� ������ Ŭ������ �ƴ�! 
		 // => �߰��ϰ��� �� �� put�޼ҵ� �̿�!(�̶�, key�� + value�� ��Ʈ�� ��ƾߵ�!) //�̷��� : HashMap<K,V> K=key, V= value 
		 
		 /*
	         * Map<K,V> : Ű�� ��
	         * Ű�� �ߺ��� ������� �ʴ´�.
	         * �⺻������ �Է¼����� �������� �ʴ´�.(Linked�� ����ϸ� ����o)
	         * Iterator�� �������� �ʴ´�. : �ݺ��ڰ� ���� ���� for�� ��� �Ұ�
	         * ����Ŭ���� : Hashtable(���ü� ����), HashMap(���ü� ����x)
	         * �޼ҵ� : 
	         * ������ �߰� -> put(Ű, ��)
	         * ������ ��ȯ -> get(Ű) = > �� ��ȯ
	         * ������ ���� -> remove(Ű)
	         */
		 
		 
		
		 // 1. put(K key, V value) : �÷��ǿ� Ű ���� set�� �߰������ִ� �޼ҵ�
		 hm.put("������",new Snack("���ڸ�",1500)); //key�� : ������ , value : snack��ü(��,Į�θ�) �̷��� ����� 
		 //key���� ������ ������ü�� ���������ְ�, �ĺ����ش�.
		 
		 hm.put("ĭ��",new Snack("�ܸ�",600));
		 hm.put("�����",new Snack("§��",500));
		 hm.put("��������Ĩ",new Snack("§��",500));
		 
		 System.out.println(hm); //{Ű=��� , Ű=���, ... }
		 
		//������κ��� Map�� Ư��
		 //1. ���� ���� ���� �ȵ� 
		 //2. value���� �ߺ��Ǵ���, key���� �ٸ��� �� ����� (key���� �����ؾ���. �ĺ��� ����)
		
		 
		 hm.put("�����",new Snack("�ſ��",700));
		 //������� �߰��ϰ�(������ �ԷµǾ����� == ���� �ִ� key���� ����), ����(value���� �ٸ���) �Է��غ��ٸ�?
		 //������ ���� key��(�����)���� �߰��ϴ� ���, value���� �������(�ߺ��� Ű���� ������ �� ���⶧����)
		 
		 System.out.println(hm); 
		 
		 
		 //2. get(Object key) : V(value) => �÷��ǿ��� �ش� Ű���� ������ value���� ��ȯ�����ִ� �޼ҵ� 
		 //   List�� �����ִ°� �ƴ�! �쿬�� ���� ���� �� ������ (�Ű������� �ٸ�!) List�� get(int index)<- �̰��� List�� �ȿ� ���ڽ����!
		
		 Snack s = /*(Snack)*/hm.get("������"); //generic���� ���߱� ������ Snack type�� ������ؼ� ��������ȯ ������� 
		 
		 System.out.println(s); // key�� �Է��ϴϱ� value���� ��µȴ�.
		 
		 //3. size() : �÷��ǿ� ����ִ� ��ü���� ����(��Ʈ�� ����) ��ȯ 
		 System.out.println("� : " + hm.size());
		 
		 //4. replace(K key, V value) : �÷����ؼ� �ش� Ű ��ã�Ƽ� �ٽ������� value������ ���������ִ� �޼ҵ� 
		 hm.replace("��������Ĩ", new Snack("�̳�§��",1000));
		 
		 System.out.println(hm);
		 
		 //5. remove(Object key) : �÷��ǿ��� �ش� Ű�� ã�Ƽ� Ű��� ��Ʈ�� ���������ִ� �޼ҵ� 
		 
		 hm.remove("��������Ĩ");
		 System.out.println(hm);
		 
		 //6. map������ ��� ��� Ű���� ��� �� ��� ����ϰ��� �� �� (map���� for�� �ȵ�, for-each�� �ȵ�)
		 
		 // �õ�1) for( : hm) {} : ���� for������ set�� �������� ������ ���� 
		 // �õ�2) ArrayList list = new ArrayList(hm); : �÷���Ÿ���� list�� set�� �����Ƿ� ��Ӱ��谡 �޶� ArrayList�� �ȵȴ� 
		 
		 // �õ�3 ) Iterator�ݺ��ڸ� ����! (map����)
		 
		 //Iterator it = hm.Iterator(); //������ ��ٷ� Iterator()ȣ�� ���� ! 
		 							    //why? Iterator()�� list�迭 or Set�迭������ �� ���ִ� �޼ҵ��̱� ����
		 
		 // �ذ���1) �������� map�� set�迭�� �ٲ��� �� �ִ�(2���� ����̳� ����!)
		 // ��, Map�� => Set���� ��ȯ => Iterator�� ���
		 
		 
		 // (1) Map�迭�� Set�迭�� �ٲٱ�(2����)
		 
		 
		 // (1-A) 1) KeySet�̿��ϴ� ��� : Key������ ����� �� 
		 //		  hm�� KeySet() �̿��ϸ� Set������ ��ȯ�ǰ�, key���鸸 ����� �ȴ�. 
		 //		  hm�� �ִ� key�鸸 Set�� ���(Ű���� ��������)
		 
		 		  
		 		  Set<String> keySet = hm.keySet(); //Set���� 1���� generic���� �����Ƿ�, String���� ���׸��������� 
		 		  
		 //  	  2) 1���������� �۾��� KeySet�� Iterator�� ��� 
		 		  // ������� : keySet.iterator(); : Iterator�� ��ȯ�� 
		 		
		 		  Iterator<String> itKey = keySet.iterator(); 
		 		  
		 //		  3) �ݺ����� ���ؼ� �̱� 
		 		  
		 		  while(itKey.hasNext()) {
		 			 String key = /*(String)*/itKey.next(); //String���� ����ȯ ������� (�ٵ� ���� set���� String���� ���׸��������� -> ���ص���)
		 			 Snack value = /*(Snack)*/hm.get(key);  //Snack���� ��������ȯ ������� (�ٵ� ���� Map�� Snack���� ���׸������Ƿ� ����ȯ ���ص���)
		 			 System.out.println(key + "=" + value);
		 		  }
		 		  
		 		  
		 		  	
		 // (1-B) entrySet() �̿��ϴ� ��� 
		 	System.out.println("==== entrySet ====");
		 // (1) hm�� entrySet()���� Set��ȯ�ϸ� (key��+value��) ��� ��µ�
		 		  
		 		// (1) hm.entrySet() : Set 
		 		  Set<Entry<String, Snack>> entrySet = hm.entrySet(); //(key + value ��)
		 		  //generic == key+value == Entry������ �ο����� , �ٵ� �� Entry�� generic���� ���ʿ� �� �����������<String, Snack>�ΰ��� 
		 	    
		 		// (2) iterator()�� ��� 		  
		 		  Iterator<Entry<String, Snack>> itEntry = entrySet.iterator();
		 		 //generic == key+value == Entry������ �ο����� , �ٵ� �� Entry�� generic���� ���ʿ� �� �����������<String, Snack>�ΰ��� 
		 		  
		 		  
		 		// (3) �ݺ����� ���� �������� 
		 		  while(itEntry.hasNext()) {			  
		 			 Entry<String, Snack> entry = /*(Entry)*/itEntry.next(); //������ Object�� �Ǿ������ϱ� EntryŸ���� ������ ��������ȯ //�� �ȿ� key,value�� �� ������� ! 
		 			 		//
		 			 String key = /*(String)*/entry.getKey(); //key�� ��ȯ�ϴ� �޼ҵ� 
		 			 Snack value = /*(Snack)*/entry.getValue(); //value�� ��ȯ�ϴ� �޼ҵ� 
		 			 
		 		
		 			 System.out.println(key + "=" + value);
		 			 
		 			 
		 		  }
		 		  
		 		  
		 		  
		 		  
		 		  
		 		  
		 		  
		 
		 
	}
}
