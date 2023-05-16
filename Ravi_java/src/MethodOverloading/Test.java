package MethodOverloading;

public class Test {
	int a;
	int b;
	void sum() {
		a=10;
		b=20;
		System.out.println(a+b);
	}
	void sum(int x,int y) {
		int a=x;
		int b=y;
		System.out.println(a+b);
	}
	void sum(String n) {
		System.out.println("String method");
	}

	public static void main(String[] args) {
		Test t=new Test();
		t.sum(); //30
		t.sum("abc"); // String method
		t.sum(23, 25); //48
		

	}

}
