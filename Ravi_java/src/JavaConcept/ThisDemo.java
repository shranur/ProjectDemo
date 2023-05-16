package JavaConcept;

public class ThisDemo {

	/*// uses of this keyword
// this keyword can be used to invoke current class method(implicilty).
 * 
 * 
 * 
 * void display() {
		System.out.println("hello");
	}
	void show() {
		this.display(); // display(); // both are same thing, compiler automatically put this keyword,
	}
	public static void main(String[] args) {
		ThisDemo td=new ThisDemo();
		td.show();
	}

}*/
	
/*	
	
	//    2---> this keyword can be used to invoke current class constructor.
	ThisDemo(){
		this(10);
		System.out.println("No argument constructor");
	}
    ThisDemo(int x){     // here we adding this(); so thjs keyword is invoking no arg constructor first then parameterized constructor as output. we can do reverse also
		//this();
		System.out.println("parameterized contructor");
	}
	public static void main(String[] args) {
		ThisDemo t=new ThisDemo(); // no argument constructor
		//ThisDemo t=new ThisDemo(10);// Parameterized constructor
	}
}*/
	
	
	
	
/*//----->>> 3rd use of this keyword
	// this keyword can be used to pass as an argument in the method call.
	//
	void m1(ThisDemo td) {
		System.out.println("i am in m1 method");
		}
	void m2() {
		m1(this);
	}
	public static void main(String[] args) {
		ThisDemo td=new ThisDemo();
		td.m2();
	}
}*/
	
	
	
	//----->>> 4th use of this keyword
		// this keyword can be used to pass as an argument in the constructor call.
	
	
	ThisDemo(ThisDemo td){
		System.out.println("this demo constructor");
	}
	
	void m1(){
		ThisDemo t=new ThisDemo(this);
		
	}
	public static void main(String[] args) {
		ThisDemo t=new ThisDemo();
		t.m1(td);
	}
}