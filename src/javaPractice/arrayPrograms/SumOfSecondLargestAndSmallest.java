package javaPractice.arrayPrograms;

public class SumOfSecondLargestAndSmallest {
	public static void main(String[] args) {
		
		int a[] = {28,45,36,102,102,87,62};
		int max = a[0], smax = a[1];
		int min = a[a.length-1], smin = a[a.length-2];
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				smax = max;
				max = a[i];
			}
			else if(a[i]>smax)
			{
				smax = a[i];
			}
			else if(a[i]<min)
			{
				smin = min;
				min = a[i];
			}
			else if(a[i]<smin)
			{
				smin = a[i];
			}
		}
		System.out.println(max+" "+smax+" "+min+" "+smin);
		
		
		
		
	}

}
