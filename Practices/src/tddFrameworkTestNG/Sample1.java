package tddFrameworkTestNG;

import org.testng.annotations.Test;

public class Sample1 {

  @Test
  public void createUser()
  {
	  System.out.println("user created successfully");
	
	}
  @Test
  public void modifyUser()
  {
	  System.out.println("user modified successfully");
  }
  @Test
  public void deleteUser()
  {
	  System.out.println("user deleted successfully");
  }
  

}
