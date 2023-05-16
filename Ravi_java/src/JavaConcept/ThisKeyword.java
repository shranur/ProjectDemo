package JavaConcept;

public class ThisKeyword {
	// This keyword is a keyword that reference variable that refers to the current object.
	// if we provide same name to local variable parameter in method and global or instance variable the we use this keyword for reference. 
	//This refers to current class instance variable.
	int i;
	
	void setValues(int i) {
		this.i=i; // now it will print 10 after using this keyword in case of same name variable and parameter variable.
	}
	void display() {
		System.out.println(i);
	}
public static void main(String[] args) {
	ThisKeyword t=new ThisKeyword();
	t.setValues(10);
	t.display(); // output 0 ----> if we use this keyword in setValues method then it will print 10
}
}
