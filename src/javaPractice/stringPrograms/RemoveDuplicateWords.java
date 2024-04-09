package javaPractice.stringPrograms;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class RemoveDuplicateWords {
	public static void main(String[] args) {
		
		String s = "i am from am Berhampur city city";
		String str[] = s.split(" ");
		
//		LinkedHashSet set = new LinkedHashSet<>();
//		for(int i=0; i<str.length; i++)
//		{
//			set.add(str[i]);
//		}
//		System.out.println(set);
		
		//2nd
		for(int i=0; i<str.length; i++)
		{
			for(int j=i+1; j<str.length; j++)
			{
				if(str[i].equals(str[j]))
				{
					str[j]=" ";
				}
			}
			if(str[i]!=" ")
					System.out.print(str[i]+" ");
		}
		
		//3rd
//		LinkedHashMap<String, Object> map = new LinkedHashMap<>();
//		for(int i=0; i<str.length; i++)
//		{
//			map.put(str[i], 0);
//		}
//		System.out.println(map);
	}

}
