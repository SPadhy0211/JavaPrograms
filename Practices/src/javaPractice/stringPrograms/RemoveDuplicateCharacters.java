package javaPractice.stringPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharacters {
	public static void main(String[] args) {
		
		String s = "Test engineer";
		char ch[] = s.toCharArray();
//		String s1 = "";
//		
//		for(char v : ch)
//		{
//			int i=s1.indexOf(v);
//			if(i==-1)
//			{
//				s1=s1+v;
//			}
//		}
//		System.out.println(s1);
		
		//2nd
		LinkedHashSet hs = new LinkedHashSet();
		for(int i=0; i<s.length(); i++)
		{
			hs.add(ch[i]);
		}
		System.out.println(hs);
		
		//3rd
		
	}

}
