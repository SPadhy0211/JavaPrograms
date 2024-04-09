package javaPractice.arrayPrograms;

public class SumOf_n_Num {

	public static void sumData(int... values)
	{
		int sum = 0;
		for(int val : values)
		{
		  sum = sum + val;
		}
		System.out.println(sum);
	}
	
	public static void multiplicationData(int... nums)
	{
		int multi = 1;
		for(int num : nums)
		{
			multi = multi*num;
		}
		System.out.println(multi);
	}
	public static void main(String[] args) {
        sumData(20,30,20,50);
        multiplicationData(10,50,10,10);
	}

}
