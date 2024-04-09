package javaPractice.stringPrograms;

import java.util.Arrays;

public class AnagramString {
	public static void main(String[] args) {
		
		String s = "nasa";
		String s1 = "sana";
		char[] ch = s.toCharArray();
		char ch1[] = s1.toCharArray();
		
		if(ch.length!=ch1.length)
		{
			System.out.println("not anagram");
		}
		else
		{
			Arrays.sort(ch);
			Arrays.sort(ch1);
			s = new String(ch);
			s1 = new String(ch1);
			if(s.equals(s1))
				System.out.println("anagram string");
			else
				System.out.println("not anagram string");
		}
	}

}
