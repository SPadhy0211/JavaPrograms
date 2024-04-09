package javaPractice.arrayPrograms;

public class FetchCommonWord {
	public static void main(String[] args) {
		
		String a[] = {"xAypplicationzz","yApplezzsx","Apzxzpleynd"};
		
		//initialize a stringbuilder to store the common letters
		StringBuilder sb = new StringBuilder();
//		String sb = new String();
		
		//iterate through the characters of the first string
		for(int i=0; i<a[0].length(); i++)
		{
			char ch = a[0].charAt(i);
			//check if the character is present in all the strings
			boolean flag = true;
			for(int j=0; j<a.length; j++)
			{
				if(a[j].indexOf(ch)==-1)
				{
					//if the character is not present in any of the other string, its not common
					flag = false;
					break; //no need to check further
				}
			}
			
			//if the character is common, add it to the result string
			if(flag)
			{
				sb.append(ch);
//				sb=sb+ch;
			}
		}
		System.out.println("common word: "+ sb.toString());
//		System.out.println("common word: "+ sb);
 
 
		
//		String c = "";
//		for(int i=0; i<a.length; i++)
//		{
//			int count = 0;
//			String b = a[i].toLowerCase();
//			for(int j=0; j<a.length; j++)
//			{
//				String d = a[j].toLowerCase();
//				if(b.charAt(j)==d.charAt(j))
//				{
//					c=c+b.charAt(i);
//					count++;
//				}
//			}
//			if(count>1)
//			{
//				System.out.println(c);
//				break;
//			}
//		}
		
	}

}
