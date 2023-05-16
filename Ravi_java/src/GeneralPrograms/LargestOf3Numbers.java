package GeneralPrograms;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		int a=20, b=30, c=50;
		
		// approach 1
		if(a>b&& a>c) {
			System.out.println(a+"is largest");
		}
		else if(b>a&&b>c) {
			System.out.println(b+"is largest");
		}
		else {
			System.out.println(c+"is largest");
		}
	}

}
