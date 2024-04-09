package javaPractice;

public class BaseAndPower {
	public static void main(String[] args) {
		int base = 3;
		int pow = 4;
		int pdt = 1;
		for(int i=1; i<=pow; i++)
		{
			pdt *= base;
		}
		System.out.println(pdt);
	}

}
