package Collection;

import java.util.LinkedList;

public class LinkedlistDemo {

	public static void main(String[] args) {
		// declaring the linked list---> many ways
		LinkedList l=new LinkedList();
		// LinkedList<Integer> l=new LinkedList<Integer>();
		//LinkedList<String> l=new LinkedList<String>();
		
		//add elements in to linked list
		l.add(100);
		l.add("welcome");
		l.add(15.5);
		l.add(100);
		l.add('a');
		l.add("madhav");
		l.add("tomar");
		l.add(null);
		
		System.out.println(l);
		System.out.println(l.size());
		l.add(3, true);
		System.out.println("after adding new element in between list"+l);
		
		l.remove(15.5);
		System.out.println("after removing by object name"+l);
		
		l.remove(0);
		System.out.println("after removing by index position"+l);
		
		l.addFirst("Ravi");
		System.out.println("after adding at first place by using addFirst() method"+l);
		
		l.set(7, "morena");
		System.out.println("after replacing null with morena"+l);
		
		System.out.println("getting first object "+l.getFirst());
		
		System.out.println("getting last object "+l.getLast());
		System.out.println("getting index no 5 object "+l.get(5));
		
		// reading data from linked list
		System.out.println("reading data by using for loop");
		for(int i=0;i<l.size();i++) {
			System.out.print(l.get(i));
		}
		System.out.println();
		System.out.println("reading data by using for each loop");
		
		for(Object o:l) {
			System.out.print(o);
		}
		
	}

}
