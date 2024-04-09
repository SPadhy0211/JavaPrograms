package sample_tc_repo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericLibraryOrUtility.BaseClass;

public class TC_01 extends BaseClass {
	
	@Test
	public void userModule()
	{
		driver.findElement(By.xpath("//div[@id='container_users']")).click();
	}

}
