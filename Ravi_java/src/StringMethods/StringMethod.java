package StringMethods;

public class StringMethod {
	/*public static void main(String[] args) {
		String name= "abc"; // length method executes well for literals but for "null" it will throw exception //NullPointerException, which we have to handle
		String email = "abc@gmail.com";
		String pass = "abc123";
		System.out.println(name.length());// length method to check the count of characters. provides output in integers
		int i=name.length();
		if(i==0) {
			System.out.println("name is empty");
		}
		else {
			System.out.println("field is not empty");
		}
	}*/
	
	
/*//-----> isEmpty method
	public static void main(String[] args) {
		String name="abc"; // for String name = ""; it provide true.
		String email="abc@gmail.com";
		String pass="abc123";
		System.out.println(name.isEmpty());  // it returns boolean value true or false
	}*/
	
	
	
	
	//----->> trim method
	
	/*public static void main(String[] args) {
		String name="  abc  "; 
		System.out.println(name);
		String email="    ";
		String s= name.trim();
		System.out.println(s);
		if(email.trim().length()==0) { // we can use 2 methods at the same time but we have to check output for each method. 
			System.out.println("empty string");
		}
        //String e= email.trim();
      //  System.out.println(e.length());
        String full_name= "  Ravi Tomar  ";
        String g=full_name.trim();
        System.out.println(g);
      }*/
	
	
	
//------>>Comparison category methods
	// .equals();  and .equalsIgonreCase();
	
	/*public static void main(String[] args) {
		String s1= "deepak";
		String s2="Deepak";
		System.out.println(s1.equals(s2));// here this method will compare and it also differentiate upper and lower cases
		System.out.println(s1.equalsIgnoreCase(s2)); // here upper and lower cases will be ignored
		System.out.println(s1.equals("0"));
		
	}*/
	
	
	
	
	
	//------> compareTo()   and   compareToIgnoreCsae()
	
	
	/*public static void main(String[] args) {
		String s1= "aBc";
		String s2= "Abc";
		System.out.println(s1.compareTo(s2));// 32 //  aBc, Abc//32 abc, Abc // 32 >compare decimal value return type integer
		System.out.println(s1.compareToIgnoreCase(s2)); // here it will ignore upper and lower case letters.
	}*/
	
	
	
	//----->> subSequence(int begin index, int end index)
	
	public static void main(String[] args) {
		String s= "My name is ravi tomar";
		System.out.println(s.length());
		System.out.println(s.subSequence(0, 21));
		System.out.println(s.subSequence(0, 20));
		System.out.println(s.substring(5));
		String s1=s.substring(5);
		System.out.println(s1);
		
	}
}
