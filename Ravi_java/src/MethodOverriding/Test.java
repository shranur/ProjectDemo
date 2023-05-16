package MethodOverriding;

/*public class Test {
	void show() {
		System.out.println("Test class method");
	}

}*/


/*do overriding method must have same return type?
Till java 1.4 same retrun type is recommended but after that
* we cane use covarent return type means it is possible to have different return type for a overriding method in child class, 
* but child's return type should be sub-type of parent return type.
* object class has String, StringBuffer, StringBuilder, Number, Character, Boolean. Viod etc child class
* sub classes- Byte, Short, Integer, Long, Float, Double.
*/

/*public class Test {
	 Object show() { // here we are defiing return type as object class type so it will return an object.
		System.out.println("Test class method");
		return(null);
	}

}*/




public class Test {
	 void show() {
		 System.out.println("Test method");
	 }
}