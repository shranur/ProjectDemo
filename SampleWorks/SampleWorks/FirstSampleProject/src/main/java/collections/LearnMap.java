package collections;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
	
	
	public static void main(String args[]) {
		String [] sArr = {"Anurag","Rahul","Akash","Ravi","Baba"};
		int i = 1;
		Map<Integer, String> map = new HashMap<>();
	
	for(String name:sArr)
	{
		
		map.put(i, name);
		i++;
	}
	System.out.println(map);
	}
	
}


		

