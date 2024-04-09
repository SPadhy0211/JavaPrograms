package javaPractice;

public class PalindromeNo {
	public static void main(String[] args) {
		
		int num = 14541;
		int rev=0, rem, cnum=num;
		
		while(num>0)
		{
			rem = num%10;
			num/=10;
			rev = rev*10+rem;
		}
		System.out.println(rev);
		if(cnum==rev)
			System.out.println("palindrome no");
		else
			System.out.println("not a palindrome no");
	}

}
