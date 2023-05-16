package programs;

public class CountsLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I love my India tii every last breath 121";
		int count =0;
		for(int i =0; i< str.length();i++) {
			
			if(str.charAt(i) != ' ') 
			count++;
		}
		
		System.out.println(count);
	}

}
