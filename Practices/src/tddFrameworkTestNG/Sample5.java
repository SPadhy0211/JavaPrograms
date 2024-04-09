package tddFrameworkTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample5 {
	@Test
	public void softAssertStrictComparision()
	{
		String actual = "Sasmita";
		String expected = "sasmita";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
		System.out.println("strict comparision done");
		sa.assertAll();
	}
	
	@Test
	public void softAssertContainsComparision()
	{
		String actual = "Sasmita";
		String expected = "smita";
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(actual.contains(expected));
		System.out.println("contains comparision done");
		sa.assertAll();
	}
	
	

}
