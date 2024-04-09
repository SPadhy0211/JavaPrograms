package sample_tc_repo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericLibraryOrUtility.ExcelUtility_task;
import genericLibraryOrUtility.JavaUtility;
import genericLibraryOrUtility.PropertiesUtility;

public class Login_actitime_task {

	public static void main(String[] args) throws Exception {
		//get random no
		JavaUtility ju = new JavaUtility();
		int num = ju.getRandomNumber();
		
		//read data from properties
		PropertiesUtility pu = new PropertiesUtility();
		String UserName = pu.getDataFromProperties("username");
		String PassWord = pu.getDataFromProperties("password");
		String Url = pu.getDataFromProperties("url");
		
		//read data from excel
		ExcelUtility_task eut = new ExcelUtility_task();
		String Name = eut.getDataFromExcel("Task", 1, 1);
		String desc = eut.getDataFromExcel("Task", 1, 2);
		
		//launching browser
		WebDriver dvr = new ChromeDriver();
		dvr.get(Url);
		dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dvr.manage().window().maximize();
		System.out.println("browser launched");
		
		//login
		dvr.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(UserName, Keys.TAB, PassWord, Keys.ENTER);
		System.out.println("login successfully");
		
		//task operation
		dvr.findElement(By.xpath("//div[@id='container_tasks']")).click();
		dvr.findElement(By.xpath("//div[@class='addNewButton']")).click();
		dvr.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
		dvr.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys(Name+num);
		dvr.findElement(By.xpath("(//textarea[@class='textarea'])[9]")).sendKeys(desc);
		dvr.findElement(By.xpath("//div[text()='Create Customer']")).click();
		dvr.findElement(By.xpath("//a[@id='logoutLink']")).click();
		System.out.println("logout successfully");
		dvr.quit();
	
		

	}

}
