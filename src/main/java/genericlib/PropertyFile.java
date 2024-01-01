package genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile implements AutoConstant {
	
	public void getPropertyData(String key) throws IOException
	{
		Properties p= new Properties();
		
		FileInputStream fis;
		try {
			fis = new FileInputStream(propertyFilePath);
			p.load(fis);
		} catch (FileNotFoundException e) {
			System.out.println("File is not present at defined path"+e);
			
		}
		p.getProperty(key);
	}

}
