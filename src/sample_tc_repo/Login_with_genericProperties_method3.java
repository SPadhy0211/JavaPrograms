package sample_tc_repo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericLibraryOrUtility.Assignment1;
import genericLibraryOrUtility.JavaUtility;
import genericLibraryOrUtility.PropertiesUtility;

public class Login_with_genericProperties_method3 {

	public static void main(String[] args) throws Exception {
		//fetch generic method from javautility
	    JavaUtility ju = new JavaUtility();
	    int num = ju.getRandomNumber();
	    
		//read data from properties
		PropertiesUtility pu = new PropertiesUtility();
		String UserName = pu.getDataFromProperties("username");
		String PassWord = pu.getDataFromProperties("password");
		String URL = pu.getDataFromProperties("url");
		
		//read data from excel
		Assignment1 eu = new Assignment1();
		String Name = eu.getDataFromExcel("Settings", 1, 1);
		String Bill = eu.getDataFromExcel("Settings", 1, 2);
		
		//launching browser
		WebDriver dvr = new ChromeDriver();
		dvr.get(URL);
		System.out.println("browser launched");
		Thread.sleep(3000);
		dvr.manage().window().maximize();
		
		//login operation
		dvr.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(UserName, Keys.TAB, PassWord, Keys.ENTER);
		System.out.println("login successfully");
		Thread.sleep(3000);
		
		//settings operation
		dvr.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		Thread.sleep(3000);
		dvr.findElement(By.xpath("//a[text()='Types of Work']")).click();
		Thread.sleep(3000);
		dvr.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		Thread.sleep(3000);
		dvr.findElement(By.xpath("//input[@name='name']")).sendKeys(Name + num);
		Thread.sleep(3000);
		dvr.findElement(By.xpath("//input[@id='billingRate_input']")).sendKeys(Bill);
		Thread.sleep(3000);
		dvr.findElement(By.xpath("//input[@value='   Create Type of Work   ']")).click();
		Thread.sleep(3000);
		dvr.findElement(By.xpath("//a[@id='logoutLink']")).click();
		System.out.println("logout successfully");
		dvr.close();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
