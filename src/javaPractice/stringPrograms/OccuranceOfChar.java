package javaPractice.stringPrograms;

import org.testng.annotations.Test;

public class OccuranceOfChar {
	
	@Test
	public void countOfCharacter() {
		
		String s = "aabbccddaaaa"; //a2b2c2d2a4
		char ch[] = s.toCharArray();
		int j=0;
		for(int i=0; i<s.length(); i=j)
		{
			int count = 1;
			for(j=i+1; j<s.length(); j++)
			{
				if(ch[i]==ch[j])
				   count++;
				else
					break;
			}
			System.out.print(ch[i]+""+count+"");
		}
	}

}
