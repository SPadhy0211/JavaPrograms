package popUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllWindowHandles {
	static
	{
		System.setProperty("WebDriver.chromedriver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@id='apple-signin-button']")).click();
		//driver.findElement(By.id("login-facebook-button")).click();
		//driver.findElement(By.xpath("//a[@id='iforgot-link']")).click();
		Set<String> allWin = driver.getWindowHandles();
		int count = allWin.size();
		System.out.println(count);
		for(String all:allWin)
		{
			System.out.println(all);
		}
	}

}
