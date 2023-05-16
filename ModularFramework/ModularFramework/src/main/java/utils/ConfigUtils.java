package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigUtils {
	
	
	public static Properties readPropreties(String filename) throws IOException {
		filename = filename.trim();
		
		InputStream filereader = new FileInputStream(filename);
		Properties property = new Properties();
		property.load(filereader);
		return property;	
	}

}
