package popUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup {
	static
	{
		System.setProperty("WebDriver.chromedriver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		String win = driver.getWindowHandle();
		System.out.println(win);
		driver.close();

	}

}
