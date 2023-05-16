package ExceptionHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileCloseDemoFinally {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=null;
		try {
			 fis=new FileInputStream("c:/abc.txt");
		}
		catch(Exception e) {
			System.out.println("file not found");
		}
		finally {
			if(fis!=null)
			{
				fis.close(); // this will throw exception as well so we can use throws and try catch block in finally
			}
			System.out.println("file is closed");
		}
	}

}
