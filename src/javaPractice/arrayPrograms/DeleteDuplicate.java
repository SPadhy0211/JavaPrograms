package javaPractice.arrayPrograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class DeleteDuplicate {
	
	@Test
	public void deleteDuplicate()
	{
		int a[] = {9, 4, 3, 6, 4, 3, 8, 1, -9, 9};
		int aa[] = new int[a.length-1];
		Arrays.sort(a);
		
		int k=0;
		for(int i=0; i<a.length-1; i++)
		{
			if(a[i]!=a[i+1])
			{
				aa[k] = a[i];
				k++;
			}
		}
		
		aa[k] = a[a.length-1];
		for(int i=0; i<=k; i++)
		{
			System.out.println(aa[i]);
		}
	}
}
