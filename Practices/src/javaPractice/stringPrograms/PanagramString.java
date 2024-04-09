package javaPractice.stringPrograms;

import java.util.Arrays;

public class PanagramString {
	public static void main(String[] args) {
		String a="abcdefghijklmnopqrstuvwxyz";
		String s = "The quick brown fox jumps over the lazy dog".toLowerCase();
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		System.out.println(ch);
		
	    int count=0;
	    for(char x : a.toCharArray())
	    {
	    	  for(char y : s.toCharArray())
	    	  {
	    		  if(x==y)
	    		  {
	    			  count++;
	    			  break;
	    		  }
	     
	    	  }
	    }
	    if(count==26)
	    	System.out.println("panagram string");
	    else
	    	System.out.println("not a panagram");
	}

}
