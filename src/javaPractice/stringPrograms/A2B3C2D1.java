package javaPractice.stringPrograms;

public class A2B3C2D1 {
	public static void main(String[] args) {
		String s = "a2b3c2d1";
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				System.out.print(s.charAt(i));
			}
			else
			{
				int a = s.charAt(i)-48;
				for(int j=1; j<a; j++)
				{
					System.out.print(s.charAt(i-1));
				}
			}
		}
	}

}
