package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		//HashMap m=new HashMap();
		HashMap<Integer,String> m=new HashMap<Integer,String>();
		// adding pair to hashmap
		
		m.put(101, "david");
		m.put(102, "john");
		m.put(103, "kavya");
		m.put(104, "madhav");
		m.put(105, "ravi");
		m.put(106, "kavya");
		System.out.println(m);
		System.out.println(m.get(105));
		//m.remove(106);
		
		// to get all the keys
		System.out.println(m.keySet());
		// this will return all the keys as a set so to read key one by one we use loop
	//	for(Object i:m.keySet()) {
	//		System.out.println(i+"   "+m.get(i));   // in this loop we are reading value as well
	//	}
		
		//to get all the values
	//	System.out.println(m.values());
		
		// to get all the entries
		System.out.println(m.entrySet());
		
		// Entry interface method
		for(Map.Entry entry:m.entrySet())
		{
			System.out.println(entry.getKey()+"       "+entry.getValue());
		}
		
		
	
	}

}
