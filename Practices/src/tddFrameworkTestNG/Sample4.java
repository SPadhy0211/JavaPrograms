package tddFrameworkTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample4 {
	@Test
	public void hardAssertionStrictComparision()
	{
		String actual = "Sasmita";
		String expected = "sasmita";
		Assert.assertEquals(actual, expected);
		System.out.println("assert pass or fail");
	}
	
	@Test
	public void hardAssertContainsComparision()
	{
		String actual = "Sasmita";
		String expected = "smita";
		Assert.assertTrue(actual.contains(expected));
		System.out.println("contains level");
	}

}
