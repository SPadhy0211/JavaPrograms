package sample_tc_repo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericLibraryOrUtility.ExcelUtility;
import genericLibraryOrUtility.PropertiesUtility;

public class Login_with_genericProperties_Method2 {
	public static void main(String args[]) throws Exception {
   //read data from excel
	ExcelUtility EUTIL = new ExcelUtility();
	String FIRSTNAME = EUTIL.getDataFromExcel("Users", 1, 1);
	String LASTNAME = EUTIL.getDataFromExcel("Users", 1, 2);
	String EMAILID = EUTIL.getDataFromExcel("Users", 1, 3);
	
	//read data from properties
	PropertiesUtility PUTIL = new PropertiesUtility();
	String USERNAME = PUTIL.getDataFromProperties("username");
	String PASSWORD = PUTIL.getDataFromProperties("password");
	String URL = PUTIL.getDataFromProperties("url");
	
	//launching browser
	WebDriver dvr = new ChromeDriver();
	dvr.get(URL);
    System.out.println("browser launched successfully");
	dvr.manage().window().maximize();
	
	//login operation
	dvr.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
	System.out.println("login done successfully");
	Thread.sleep(3000);
	
	//user module operation
	dvr.findElement(By.xpath("//div[@id='container_users']")).click();
	Thread.sleep(3000);
	dvr.findElement(By.xpath("//div[text()='New User']")).click();
	Thread.sleep(3000);
	dvr.findElement(By.xpath("(//input[@class='firstNameField inputFieldWithPlaceholder'])[2]")).sendKeys(FIRSTNAME);
	Thread.sleep(3000);
	dvr.findElement(By.xpath("(//input[@name='lastName'])[2]")).sendKeys(LASTNAME);
	Thread.sleep(3000);
	dvr.findElement(By.xpath("(//input[@placeholder='Email'])[3]")).sendKeys(EMAILID);
	Thread.sleep(3000);
	dvr.findElement(By.xpath("//div[text()='Save & Send Invitation']")).click();
	Thread.sleep(3000);
	dvr.findElement(By.xpath("(//span[text()='Close'])[1]")).click();
	Thread.sleep(3000);
	dvr.findElement(By.xpath("//a[@class='logout']")).click();
	Thread.sleep(3000);
	dvr.close();
	
	
	} 
}
