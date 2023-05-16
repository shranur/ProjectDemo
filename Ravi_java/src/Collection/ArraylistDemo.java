package Collection;

import java.util.*;

public class ArraylistDemo {
	
	
public static void main(String[] args) {
	// declare array list object
	ArrayList al=new ArrayList();
	al.add("welcome");
	al.add("ravi");
	System.out.println(al);
	al.remove("welcome");
	System.out.println(al);
	al.add(1, "tomar");
System.out.println(al);	
	// restrict the arraylist with homogeneous data
	//ArrayList<Integer> al1=new ArrayList<Integer>();
	
	//ArrayList <String> al2=new ArrayList <String>();
	
	// add new elements in array list


// reading the data by for loop
System.out.println("reading dta by using for loop");
for(int i=0; i<al.size(); i++) {
	System.out.println(al.get(i));
}
	System.out.println("reading the data by using for each loop");
	for(Object e:al) {
		System.out.println(e);
	}
	
	System.out.println("reading element using iterator method");
	//Iterator is an interface, parent interface of collection interface
	Iterator it=al.iterator();     // applyied iterator method on al and stored it in Iterator reference variable
	while(it.hasNext()) {
		System.out.println(it.next());
	}
		
		// adding multiple and removing multiple elements 
		al.add("ab");
		al.add("cd");
		al.add("hu");
		al.add("hj");
		al.add("ll");
		al.add("jj");
		al.add("tom");
		
		
		//adding all these elements of al in to other collection
		ArrayList madhav=new ArrayList();
		madhav.addAll(al);
		System.out.println(madhav);
		
		//sorting array list by using collection class method
		
		//ascending order
		Collections.sort(al);
		System.out.println(al);
		
		// sorting in reverse order
		//for this same sort method used but after passing collection variable just pass one more argument of reverseOrder method 
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
		
		// shuffling the array list
		Collections.shuffle(al);
		System.out.println(al);
		
		// converting string array in to collection 
		//String[] s=new String[3];
		//s[0]="dog";
		String[] s= {"dog","cat","elephant"};
		for(String value:s) {
			System.out.println(value);
		}
		ArrayList st=new ArrayList(Arrays.asList(s));
		System.out.println(st);
	
}
//public void method(String args) {
//	ArrayList<String> list = new ArrayList<String>();
	//list.add("ravi");
	//List<String> listOne = Arrays.asList(args);
//}
}