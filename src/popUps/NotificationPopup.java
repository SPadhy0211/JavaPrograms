package popUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {

	public static void main(String[] args) {
		
//		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("--disable-notifications");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.yatra.com");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://facebook.com");

	}

}
