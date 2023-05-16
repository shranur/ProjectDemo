package MethodOverriding;

/*public class Test1 extends Test {
	void show() {
		System.out.println("Test1 class method");
	}
	public static void main(String[] args) {
		 creating object of Test1 class
		Test1 t=new Test1();
		t.show(); // Test1 class method
		
		 creating object of Test class
		Test t=new Test();
		t.show(); // Test class method
		
	}
}
*/


		/*do overriding method must have same return type?
		   Till java 1.4 same return type is recommended but after that
		 * we cane use covariant return type means it is possible to have different return type for a overriding method in child class, 
		 * but child's return type should be sub-type of parent return type.
		 *  object class has String, StringBuffer, StringBuilder, Number, Character, Boolean. Viod etc child class
         * sub classes- Byte, Short, Integer, Long, Float, Double.
		 */
/*public class Test1 extends Test {
	 String show() {  // here we are defining return type as child of object class type 
		System.out.println("Test1 class method");
		return(null);
	}
	public static void main(String[] args) {
		Test1 t=new Test1();
		t.show(); 
		
		Test t1=new Test();
		t1.show(); 
		
		// now in this method if we change the return type to string in test class and object in test1 class then it will throw compile time error.
	}
}*/


/* method overriding and Access modifiers------->
 * The access modifier for an overriding method(child class method) can allow more than over ridden method (parent class method)
 * parent class method- default, protected, public-----child class method-Public
 */



// over riding and exception handling, there are 2 rules screen short in Tab.



// over riding and abstraction



//  Invoking overridden method from sub-class----> we can call parent class method in overriding method using Super keyword.


public class Test1 extends Test {
	 void show() {
		 super.show();
		 //System.out.println("Test1 method");
	 }
	 public static void main(String[] args) {
		Test1 t=new Test1();
		t.show();
	}
}
