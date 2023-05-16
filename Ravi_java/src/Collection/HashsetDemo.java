package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {

	public static void main(String[] args) {
		// declaring the hashset
		HashSet hs=new HashSet();
		
		// declaring with size
		//HashSet hs1= new HashSet(100);
		//HashSet hs2=new HashSet(100, (float) .95);
		hs.add("kapil");
		hs.add("welcome");
		hs.add("home");
		hs.add(100);
		hs.add("madhav");
		hs.add(true);
		hs.add(false);
		hs.add('a');
		hs.add(null);
		System.out.println(hs);
		
	System.out.println(hs.size());	
	
	// to read element from hashset
	for(Object i:hs) {
		System.out.print(" "+i+" ");
		
	}
	System.out.println();
	Iterator it=hs.iterator();
	
	while(it.hasNext()) {
		System.out.print(" "+it.next()+" ");
	}
	
		
		
		
		
		
		
	}

}
