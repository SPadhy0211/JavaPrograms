package javaPractice.arrayPrograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class ZigZagProgram {
	@Test
	public void zigZagArray()
	{
		int a[] = {1,2,3,4,5};
		int b[] = {6,7,8,9};
		int ab[] = new int[a.length + b.length];
		int j = 0, k = 0;
		for(int i=1; i<ab.length; i++)
		{
			if(i%2 != 0)
			{
				ab[i-1] = a[j];
				j++;
			}
			else
			{
				ab[i-1] = b[k];
				k++;
			}
				
		}
		System.out.println(Arrays.toString(ab));
	}

}
