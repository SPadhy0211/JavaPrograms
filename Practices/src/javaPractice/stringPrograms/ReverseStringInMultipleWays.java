package javaPractice.stringPrograms;

public class ReverseStringInMultipleWays {
	public static void main(String[] args) {
		
		String s = "Sasmita";
		char ch[] = s.toCharArray();
		String rev = "";
		//1st
//		for(int i=s.length()-1; i>=0; i--)
//		{
//			rev = rev + ch[i];
////			System.out.print(s.charAt(i));
//		}
//		System.out.println(rev);
		
		//2nd
//		int length = s.length()-1;
//		while(length>=0)
//		{
//			rev+= s.charAt(length);
//			length--;
//		}
//		System.out.println(rev);
		
		//3rd
		int length = s.length()-1;
		do
		{
			rev+=ch[length];
			length--;
		}
		while(length>=0);
		System.out.println(rev);
	
	}

}
