package ExceptionHandling;

public class Test {

	public static void main(String[] args) {
		try {
		int a=100,b=0,c;
		c=a/b;
		System.out.println(c);
		}
		catch(Exception e){
			//System.out.println(e); 
			System.out.println("you can not divide by zero");
			}
	}

}
