package javaPractice;

public class NearestPalindrome {

	public static boolean isPalindrome(int num)
	{
		//boolean var;
		int rev=0, rem, cnum=num;
		while(num!=0)
		{
			rem = num%10;
			num = num/10;
			rev = rev*10+rem;
		}
		if(cnum==rev)
		{
		 return true;
	      //System.out.println("palindrome no");
		}
		else
		{
			return false;
			//System.out.println("not palindrome");
		}
		//return var;
	}
	
	public static int sub(int val1)
	{
//	    int count=0;
	    while(true)
	    {
	    	if(isPalindrome(val1))
	    	{
	    		return val1;
	    	}
	    	val1--;
	    }
	}
	
	public static int add(int val2)
	{
//		int count=0;
		while(true)
		{
			if(isPalindrome(val2))
			{
				return val2;	
			}
			val2++;
		}
	}
	
	public static void main(String[] args)
	{
	     int n=54;
	     int  larger=add(n);
	    int smaller= sub(n);
	    
	    if(larger-n>n-smaller)
	    {
	    	System.out.println(smaller);
	    }
	    else
	    {
	    	System.out.println(larger);
	    }
	}

}
