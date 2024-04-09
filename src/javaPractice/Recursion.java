package javaPractice;

class AA
{
	public void a1()
	{
		System.out.println("a1 method");
	}
}

class BB extends AA
{
	public static void b1(int num)
	{
		if(num<=0)
			System.out.println();
		else
		{
			System.out.println("hi");
			b1(num-1);
		}
	}
}

public class Recursion {
	public static void main(String[] args) {
		
		
		BB.b1(10);
	}
	
}
