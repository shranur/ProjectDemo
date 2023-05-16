package TestngDemo;

public class Demo {
	
	
	public void demoMethod(int i, float g) {
		System.out.println("int method");
	}
	
	public void demoMethod(float i, int g) {
		System.out.println("float method");
	}

	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.demoMethod(20, 20);
		d.demoMethod(20, 20);
		

		
		
	}

}
