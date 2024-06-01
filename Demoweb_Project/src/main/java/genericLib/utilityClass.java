package genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;

public class utilityClass {
	
	FileInputStream filesrc;
	public String geturl(String key) throws IOException
	{
		filesrc=new FileInputStream("./src/test/resources/testdata/browserfile.properties");
		Properties pro = new Properties();
		pro.load(filesrc);
		return pro.getProperty(key);		
	}

}
