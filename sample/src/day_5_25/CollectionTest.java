package day_5_25;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CollectionTest {
	
	public static void main(String[] args){
		Map<String,String> map = new HashMap();
		map.put("id","java01");
		map.put("pw","1234");
		map.put("url","fdsafd");
		map.put("id","java04");
		System.out.println(map);
		
		Iterator<String> i = map.keySet().iterator();
		while(i.hasNext()){
			System.out.println(map.get(i.next()));
		}
	}

}
