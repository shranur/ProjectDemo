package JavaConcept;

public class StaticDemo {
	int empid;
	String empname;
	static String companyname="Amazon";
	StaticDemo(int a, String b){
		this.empid=a;
		this.empname=b;
		
	}
	void display() {
		System.out.println(empid + empname + companyname);
	}
	public static void main(String[] args) {
		StaticDemo e1=new StaticDemo(101,"ravi");
		e1.display();
		StaticDemo e2=new StaticDemo(102,"madhav");
		e2.display();

	}
}
