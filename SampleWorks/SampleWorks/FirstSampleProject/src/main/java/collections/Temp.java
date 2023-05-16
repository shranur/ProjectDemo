package collections;

public class Temp extends Employee {
	public Temp(String empName, int empId, long empSal) {
		super(empName, empId, empSal);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Temp t = new Temp("ABC", 1234 , 292899);
		System.out.println(t.getEmpName());
		System.out.println(t.getEmpId());
	}

}
