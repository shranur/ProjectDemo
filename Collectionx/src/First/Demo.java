package First;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
public class Demo {
	
		public static void main(String[] args) {

			ArrayList <Integer> ar	= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
//			ar.removeIf(num -> num%2 == 0);
//			System.out.println(ar);


			
			ar.removeIf(num -> num%2 != 0);
			System.out.println(ar);
			
			ArrayList <String> list	= new ArrayList<String>(Arrays.asList("ABC" ,"DEF" ,"GHI" , "JKL" ,"MNO" ,"JKL"));
			System.out.println(list);
			
			list.retainAll(Collections.singleton("JKL"));
			System.out.println(list);
		}

	}


