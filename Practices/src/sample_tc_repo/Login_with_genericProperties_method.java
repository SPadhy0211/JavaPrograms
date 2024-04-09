package sample_tc_repo;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import genericLibraryOrUtility.PropertiesUtility;

public class Login_with_genericProperties_method {

	public static void main(String[] args) throws Exception {
          PropertiesUtility PUTIL =new PropertiesUtility();
          String USERNAME = PUTIL.getDataFromProperties("username");
          String PASSWORD = PUTIL.getDataFromProperties("password");
          String URL = PUTIL.getDataFromProperties("url");
         // ChromeOptions opt = new ChromeOptions();
         // opt.addArguments("--remote-allow-origins=*");
         // System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          driver.get(URL);
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          driver.manage().window().maximize();
          driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(USERNAME,Keys.TAB,PASSWORD,Keys.ENTER);
          
          
          
	}
}	