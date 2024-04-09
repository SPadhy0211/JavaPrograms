package javaPractice.arrayPrograms;

import java.util.ArrayList;
import java.util.HashSet;

public class MissingArray {
	public static void main(String[] args) {
		
		int[] a = {1,5,8,9,6,3};
//		ArrayList<Integer> list = new ArrayList<>();
//		for(int al : a)
//		{
//			list.add(al);
//		}
//		for(int i=1; i<=10; i++)
//		{
//			if(!(list.contains(i)))
//			{
//				System.out.println(i+",");
//			}
//		}
		
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0; i<a.length; i++)
		{
			hs.add(a[i]);
		}
		for(int j=1; j<=10; j++)
		{
			if(!(hs.contains(j)))
			{
				System.out.println(j);
			}
		}
	}

}
