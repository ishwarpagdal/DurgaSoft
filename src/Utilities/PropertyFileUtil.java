package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyFileUtil 
{

	public static String getValueForKey(String key) throws Throwable
	{
		Properties config=new Properties();
		
		FileInputStream fis=new FileInputStream("D:/SeleniumBatch8/SeleniumVASU/Environment.properties");

		config.load(fis);
		
		return config.getProperty(key);
	}
}
