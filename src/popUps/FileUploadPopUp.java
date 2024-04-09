package popUps;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {
     static 
    {
     	System.setProperty("WebDriver.chromedriver", "./driver/chromedriver.exe");
    }
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:\\C:\\Users\\ADMIN\\Desktop\\naukri.html");
		File f = new File(".\\data\\Resume.docx");
		String absolutePath = f.getAbsolutePath();
		driver.findElement(By.id("cv")).sendKeys(absolutePath);
	}
}
