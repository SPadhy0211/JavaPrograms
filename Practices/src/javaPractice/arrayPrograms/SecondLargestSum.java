package javaPractice.arrayPrograms;

import java.util.Arrays;

public class SecondLargestSum {
	
	public static void main(String[] args) {
		int a[] = {1,-2, 3, -8, 15, -7, 10, 5, 7, 2};
		
//		int max = a[0], smax = a[1], tmax = a[2];
//		
//		for(int i=1; i<a.length; i++)
//		{
//			if(a[i]>max)
//			{
//				tmax = smax;
//				smax = max;
//				max = a[i];
//			}
//			else if(a[i]>smax)
//			{
//				tmax = smax;
//				smax = a[i];
//			}
//			else if(a[i]>tmax)
//			{
//				tmax = a[i];
//			}
//		}
//		System.out.println(max+" "+smax+" "+tmax);
//		System.out.println(max + tmax);
		
		Arrays.sort(a);

		System.out.println(a[a.length-1]);
		System.out.println(a[a.length-2]);
		System.out.println(a[a.length-3]);
		System.out.println(a[a.length-1]+a[a.length-3]);
		
		
	}

}
