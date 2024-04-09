package genericLibraryOrUtility;
/**
 * this is the base class contains with all the common features of this application
 * @author Sasmita
 *
 */

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public WebDriver driver = null;
	public PropertiesUtility PUTIL = new PropertiesUtility();
	public ExcelUtility EUTIL = new ExcelUtility();
	public JavaUtility JUTIL = new JavaUtility();
	
	@BeforeSuite(alwaysRun = true)
	public void establishJDBCConnection()
	{
		System.out.println("connection established successfully");
	}
	
	@BeforeClass(alwaysRun = true)
	public void launchBrowser() throws Exception
	{
		String URL = PUTIL.getDataFromProperties("url");
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		System.out.println("browser launched successfully");
	}
	
	@BeforeMethod(alwaysRun = true)
	public void loginOperation() throws Exception
	{
		String USERNAME = PUTIL.getDataFromProperties("username");
		String PASSWORD = PUTIL.getDataFromProperties("password");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
		System.out.println("login successfull");
	}
	
	@AfterMethod(alwaysRun = true)
	public void logoutOperation()
	{
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		System.out.println("logout successfully");
	}
	
	@AfterClass(alwaysRun = true)
	public void closeWindow()
	{
		driver.close();
		System.out.println("window closed");
	}
	
	@AfterSuite(alwaysRun = true)
	public void closeJDBCConnection()
	{
		System.out.println("database connection closed");
	}

}








