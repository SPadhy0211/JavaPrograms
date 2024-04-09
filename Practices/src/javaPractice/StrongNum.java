package javaPractice;

public class StrongNum {
	public static void main(String[] args) {
		int num = 145;
		int rem, cnum = num;
		int sum = 0;
		while(num>0)
		{
			rem = num%10;
			num = num/10;
			int fact =1;
			
			for(int i=rem; i>0; i--)
			{
				fact = fact*i;
			}
			System.out.println(fact);
			sum = sum+fact;
		}
		System.out.println(sum);
		if(sum==cnum)
		{
			System.out.println(sum + ": its a strong no");
		}
		else
			System.out.println(sum + ": not a strong no");
	}

}
