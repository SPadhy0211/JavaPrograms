
public class Demo2 {
	public static void main(String[] args) {
		int a[] = {28,30,5,8,39,90};
		int largest = a[0];
		int smallest = a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>largest)
			{
				largest=a[i];
			}
			else if(a[i]<smallest)
			{
				smallest = a[i];
			}
		}
		System.out.println(largest);
		System.out.println(smallest);
		System.out.println(largest+smallest);
	}

}
