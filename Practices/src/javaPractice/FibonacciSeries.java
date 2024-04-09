package javaPractice;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a=0, b=1, c;
//		System.out.print(a+" "+b+" ");
//		for(int i=0; i<10; i++)
//		{
//		c=a+b;
//		System.out.print(c+" ");
//		a=b;
//		b=c;
//		}
//		System.out.println();
		
		System.out.print(a+" "+b+" ");
		System.out.println();
		System.out.println(a+"+"+b);
		
		for(int i=0; i<=10; i++)
		{
			c = a+b;
			System.out.println(c+" ");
			a=b;
			b=c;
			System.out.println(a+"+"+b);
		}
	}

}
