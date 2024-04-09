package popUps;

import org.openqa.selenium.chrome.ChromeDriver;

public class AuthanticationPopup {
	static
	{
		System.setProperty("WebDriver.chromedriver", "./Software/chromedriver.exe");
	}

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}
}
