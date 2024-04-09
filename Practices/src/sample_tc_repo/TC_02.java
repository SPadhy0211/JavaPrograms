package sample_tc_repo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericLibraryOrUtility.BaseClass;

public class TC_02 extends BaseClass {
    @Test
    public void tasksModule()
    {
    	driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
	
		

	}

}
