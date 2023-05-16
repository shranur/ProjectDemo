package Array;

public class Array2Dimensional {

	public static void main(String[] args) {
       int[][] s= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
      
       for(int i=0;i<s.length;i++) {
    	   for(int j=0;j<s[i].length;j++) {
    		   System.out.print(s[i][j]);
    	   }
    	   System.out.println();
        }
       
       }
	
	}
