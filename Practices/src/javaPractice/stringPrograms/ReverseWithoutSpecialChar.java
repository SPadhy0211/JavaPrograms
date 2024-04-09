package javaPractice.stringPrograms;

import java.util.HashMap;

public class ReverseWithoutSpecialChar {
	public static void main(String[] args) {
		
//		String s = "hi! am! arun!";
//		String[] str = s.split(" ");
//		String rev = "";
//		
//		for(int i=0; i<str.length; i++)
//		{
//			for(int j=str[i].length()-2; j>=0; j--)
//			{
//				rev = rev+str[i].charAt(j);
//			}
//			rev+="! ";
//		}
//		System.out.println(rev);
		
		String s = "java";
		char ch[] = s.toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=0; i<ch.length; i++)
		{
			map.put(ch[i], map.getOrDefault(ch[i], 0)+1);
		}
		System.out.println(map);
	}

}
