package genericLibraryOrUtility;

import java.util.Random;
/**
 * this class is to generate random number
 * @author Sasmita
 *
 */
public class JavaUtility {
/**
 * this is a generic method for random number	
 * @return
 */
	public int getRandomNumber() {
		
	Random r= new Random();
	int num = r.nextInt(1000);
	return num;

}
}