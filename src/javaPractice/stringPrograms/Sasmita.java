package javaPractice.stringPrograms;

public class Sasmita {
	public static void main(String[] args) {
		String s = "Shasmitha";
		char[] ch = s.toCharArray();
	
		for(int i=0; i<=s.length()-1; i++)
		{
			if(i==0 || i==1)
			{
				System.out.print(ch[i]);
			}
			else if(i==ch.length-1 || i==ch.length-2)
			{
				System.out.print(ch[i]);
			}
			else
			{
				for(int j=s.length()-3; j>=2; j--)
				{
					System.out.print(ch[j]);
				}
			}
		}
		
//		for(int i=0; i<=1; i++)
//		{
//			System.out.println(s.charAt(i));
//		}
//		for(int i=s.length()-3; i>=2; i--)
//		{
//			System.out.println(s.charAt(i));
//		}
//		for(int i=s.length()-2; i<=s.length()-1; i++)
//		{
//			System.out.println(s.charAt(i));
//		}
	}
}
