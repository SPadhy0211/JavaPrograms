package tddFrameworkTestNG;

import org.testng.annotations.Test;

public class Sample3 {
  @Test(priority = 1 , invocationCount = 10 , enabled = true)
  public void createUser()
  {
	  System.out.println("user created");
  }
  @Test(priority = 2 ,dependsOnMethods = "createUser")
  public void modifyUser()
  {
	  System.out.println("user modified");
  }
  @Test(priority = 3)
  public void deleteUser()
  {
	  System.out.println("user deleted");
  }
}
