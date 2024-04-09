package javaPractice.arrayPrograms;

public class SumOfOddNo {
	public static void main(String[] args) {
	//	int a[] = {5,7,8,2,90,4,6};
		int sum =0;
		for(int i=10; i<=50; i++)
		{
			if(i%2!=0)
			{
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
