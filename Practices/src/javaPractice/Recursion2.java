package javaPractice;

public class Recursion2 {
	
	public static void printingTheName(int num)
	{
		if(num==0)
		{
			return;
		}
		System.out.println("Sasmita");
		printingTheName(num-1);
		return;
	}
	
	public static void main(String[] args) {
		printingTheName(5);
	}

}
