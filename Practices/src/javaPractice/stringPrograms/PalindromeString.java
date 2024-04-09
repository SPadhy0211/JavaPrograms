package javaPractice.stringPrograms;

public class PalindromeString {
	public static void main(String[] args) {
		
		String s = "radar";
		char ch[] = s.toCharArray();
		String rev = "";
		
		//1st
//		for(int i=s.length()-1; i>=0; i--)
//		{
//			rev+=s.charAt(i);
//		}
//		System.out.println(rev);
//		if(rev.equals(s))
//			System.out.println("palindrome string");
//		else
//			System.out.println("not a palindrome");
		
		//2nd
//		int length = s.length()-1;
//		while(length>=0)
//		{
//			rev+=ch[length];
//			length--;
//		}
//		System.out.println(rev);
//		if(rev.equals(s))
//			System.out.println("palindrome string");
//		else
//			System.out.println("not a palindrome");
		
		//3rd
		int length = ch.length-1;
		do
		{
			rev+=ch[length];
			length--;
		}
		while(length>=0);
		System.out.println(rev);
		if(rev.equals(s))
			System.out.println("palindrome string");
		else
			System.out.println("not a palindrome");
	}

}
