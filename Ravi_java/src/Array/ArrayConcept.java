package Array;

public class ArrayConcept {

	public static void main(String[] args) {
		
		// array concept is to store similar data type values in an array variable
		//
		
		int[] a=new int[4];
		a[0] = 20;
		a[1] = 30;
		a[2] = 40;
		a[3] = 50;
		//a[4] = 60;//>>>  ArrayIndexOutOfBoundsException
		System.out.println(a[0]);
		System.out.println(a[3]);
		
		//System.out.println(a[4]);   //>> ArrayIndexOutOfBoundsException.
		
		System.out.println(a.length);
		
		
	       for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	      // char[] c=new char[3];//>>
	       // boolean[] b=new boolean[2];
	        String[] s= new String[3];
	       s[0]= "test";
	     s[1]= "hello";
	     s[2]= "ravi";
	       System.out.println(s.length);
	       
	       // we can use similar data type in array so to over come this issue we use object array
	       // OBJECT ARRAY------> object is super class of all the classes, object is class
	       // object array is used to store different data type values.
	       Object[] ob=new Object[6];
           ob[0]= "Tom";
	       ob[1]= 25;
	       ob[2]= 12.33;
	       ob[3]= "1/1/1990";
	       ob[4]='M';
	       ob[5]="London";
	       System.out.println(ob[5]);
	       System.out.println(ob.length);
	       for(Object i:ob) {
	    	   System.out.println(i);
	       }
	       
	}

}
