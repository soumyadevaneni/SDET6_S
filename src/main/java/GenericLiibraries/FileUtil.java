package GenericLiibraries;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtil {

	
		// TODO Auto-generated method stub
public String readDatafromPropertyfile(String key) throws Throwable {
	FileInputStream  fis=new FileInputStream("D:\\KCSM12\\SDET6_S\\Vtiger.properties");
	Properties prop=new Properties();
	prop.load(fis);
	return prop.getProperty(key);
	
	
	}

}
