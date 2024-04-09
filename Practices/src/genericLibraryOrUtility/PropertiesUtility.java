package genericLibraryOrUtility;

import java.io.FileInputStream;
import java.util.Properties;
/**
 * this is a generic class for properties utility
 * @author SASMITA
 *
 */
public class PropertiesUtility {
	/**
	 * this is a generic method for properties data
	 * @param data
	 * @return
	 * @throws Exception
	 */
    public String getDataFromProperties(String data) throws Exception
    {
    	FileInputStream fis = new FileInputStream("D:\\Selenium\\LoginCredentials.properties");
    	Properties pobj = new Properties();
    	pobj.load(fis);
		String Data = pobj.getProperty(data);
		return Data;
		
    	
    }
}
