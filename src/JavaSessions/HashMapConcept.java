package JavaSessions;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {
		//hashmap is based on key,value format
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"Java");
		map.put(2,"Ruby");
		map.put(3,"python");
		
		System.out.println(map.get(1));
		System.out.println(map.get(4));
		
		//To print all the values in hashmap
		/*for(Map.Entry<Integer, String> entry:map.entrySet()) {
			
			System.out.println("key="+entry.getKey()+"value="+entry.getValue())	;
					}*/
map.forEach((x,y)->System.out.println("key=" +x+"value="+y));
		
		HashMap<Integer,Integer> map1=new HashMap<Integer,Integer>();
		map1.put(1,100);
		map1.put(2,200);
		System.out.println(map1.get(1));
		System.out.println(map1.get(2));
		//System.out.println(map1.get(3));//output is null
		//map1.put(2,300);
		//System.out.println(map1.get(2));//here the value of key2 is overwritten to300    
		
		
		map1.put(3,100);
		map1.put(4,200);
		System.out.println(map1.get(2));
		System.out.println(map1.get(4));//we can have duplicate values for keys but when we duplicate keys,its value gets overwritten
		//we can have null values
		map1.put(5,null);
		map1.put(6,null);
		
		System.out.println(map1.get(5));//null
		System.out.println(map1.get(6));//null
		
		//we can have null key and null values
		map1.put(null,null);
		//System.out.println(map1.get(null));//null
		map1.put(null,600);
		System.out.println(map1.get(null));//600
		map1.put(null,700);//the value is overwritten to 700
		//
		
		
	}

}
