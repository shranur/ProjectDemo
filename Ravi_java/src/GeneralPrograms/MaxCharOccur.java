package GeneralPrograms;

public class MaxCharOccur {

	public static void main(String[] args) {
			String s1="madhav is good boy";
			String s=s1.replaceAll("\\s", "");  //replacing the spaces with empty string so string become madhavisgoodboy
			System.out.println(s);
			int[] a=new int[127];
			
			for(int i=0;i<s.length();i++) {
				a[s.charAt(i)]=a[s.charAt(i)]+1;	
			}
			int max=-1;
			char c=' ';
			for(int i=0;i<s.length();i++) {
				if(max<a[s.charAt(i)]) {
					max=a[s.charAt(i)];
							c=s.charAt(i);
							
				}
				
			}
			System.out.println("max no of character is "+c+" and it appers "+max+" times");
	}

}
