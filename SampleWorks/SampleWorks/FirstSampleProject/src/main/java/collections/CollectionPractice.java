package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionPractice {
	
//	static List<String> empName = new ArrayList<String>();
//	static List<String> empId = new ArrayList<String>();
	
	
	
	
		public static void main(String[] args) {
			
			String[] list1 = {"A","B","C","D"};
			String[] list2 = {"1","2","3","4"};
			
			List<String> empName = null;
			List<String> empId = null;
			Map<List<String>, List<String>> empDetails = new HashMap<List<String>, List<String>>();
			
			for(int i=0; i<list1.length; i++) {
				empName.add(list1[i]);
				System.out.println(empName);
			}
			
			for(int j=0; j<list1.length; j++) {
				empId.add(list2[j]);
				System.out.println(empId);
			}
			//System.out.println(empDetails.put(list1, list2));
			
			
		}

}
