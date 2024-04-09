package javaPractice.stringPrograms;

public class SortInAlphabeticalOrder {
	public static void main(String[] args) {
		
		String[] s = {"Sasmita", "Abhi", "Abhishek", "Ravi", "Vinit", "Chaithanya", "Datta"};
//	    String a = "";
//		for(int i=0; i<s.length; i++)
//		{
//			a = s[i].toLowerCase();
//			 System.out.println(a);
//		}
	
		for(int i=0; i<s[i].length(); i++)
		{
			for(int j=0; j<s[j].length(); j++)
			{
				if(s[i].charAt(i)>s[j].charAt(j))
				{
					s[i]=s[j];
				}
			}
			System.out.println(s[i]);
		}
	}

}
