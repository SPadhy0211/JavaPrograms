package javaPractice.stringPrograms;

public class CountOfNumberOfOccurance {
	public static void main(String[] args) {
		
		String s = "wwwpretheew";
		char[] ch = s.toCharArray();
		
		int j=0;
		for(int i=0; i<ch.length; i=j)
		{
			int count = 1;
			for(j=i+1; j<ch.length; j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
				else
				{
					break;
				}
			}
			System.out.print(ch[i]+""+count+"");
		}
	}

}
