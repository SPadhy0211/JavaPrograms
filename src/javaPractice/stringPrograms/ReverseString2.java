package javaPractice.stringPrograms;

public class ReverseString2 {
	public static void main(String[] args) {
		
		String s = "Advanced Selenium"; //decnavdA muineleS
		String str[] = s.split(" ");
		String rev = "";
		
		for(int i=0; i<str.length; i++)
		{
			for(int j=str[i].length()-1; j>=0; j--)
			{
				rev+=str[i].charAt(j);
			}
			rev+=" ";
		}
		System.out.println(rev.toString());
	}

}
