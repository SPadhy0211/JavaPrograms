package javaPractice.stringPrograms;

import org.testng.annotations.Test;

public class ReverseTheSentence {
	
	@Test
	public void reverseWithSpace()
	{
		String s = "hi hello welcome"; //em oclew ollehih
		String rev = "";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			if(s.charAt(i)!=' ')
			{
				rev = rev+s.charAt(i);
			}
		}
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==' ')
			{
				rev = rev.substring(0, i)+" "+rev.substring(i, rev.length());
			}
		}
		System.out.println(rev);
	}
	
	@Test
	public void test()
	{
		int a[] = {3,2,8,5,1,6};
		int temp;
		 for(int i=0; i<a.length; i++)
		 {
		   for(int j=i+1; j<a.length; j++)
		   {
		     if(a[i]>a[j])
		     {
		       temp = a[i];
		       a[i] = a[j];
		       a[j] = temp;
		     }
		   }
		   System.out.println(a[i]);
		  }
	}
	
	@Test
	public void minNo1st()
	{
		int a[] = {3,2,8,5,1,6};
		  for(int i=0; i<a.length; i++)
		  {
		    for(int j=i+1; j<a.length; j++)
		    {
		     if(a[i]>a[j])
		     {
		       int temp = a[i];
		       a[i] = a[j];
		       a[j] = temp;
		     }
		    }
		  }
		  System.out.println(a[0]); 
	}

}

