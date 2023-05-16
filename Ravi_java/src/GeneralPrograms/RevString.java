package GeneralPrograms;
// we can also check for palindrome string by using.equals() method.  palindrome means same as original when we write in reverse.
public class RevString {

	public static void main(String[] args) {
      String s= "madam";
      String rev= "";
      
      for(int i=s.length()-1;i>=0;i--) {
    	  
    	  rev=  rev+s.charAt(i);
    	  
      }  // now checking for palindrome string
      if(rev.equals(s)) {
    	  System.out.println("Given string is a palindrome string");
      }
      else {
    	  System.out.println("Given string is not a palindrome string");

      }
      System.out.println(rev);

	}

}
