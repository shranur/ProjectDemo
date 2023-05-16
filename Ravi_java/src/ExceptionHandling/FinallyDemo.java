package ExceptionHandling;

public class FinallyDemo {

	public static void main(String[] args) {
		
		try
		{
			int a=100,b=0,c;
			c=a/b;
			System.out.println(c);
		}
		//catch(Exception e) {
		//	System.out.println(e);
		//}
		finally {
			System.out.println("i am in finally blockl");
		}
		System.out.println("hello");
	}

}
