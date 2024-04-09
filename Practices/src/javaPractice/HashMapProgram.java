package javaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Vector;

import com.google.common.collect.ImmutableMap;

public class HashMapProgram {
	public static void main(String[] args) {                              //fetch the value of string
//		HashMap<String, Integer> map = new HashMap<>();
//		map.put("a", 3);
//		map.put("b", 2);
//		map.put("c", 6);
//		map.put("d", 5);
////		System.out.println(ImmutableMap.of("a",1,
////				"b",2,
////				"c",5,
////				"d",9));
//		for(Entry<String, Integer> eachMap : map.entrySet())
//		{
//			if(eachMap.getKey()=="c")
//			{
//				System.out.println(eachMap.getValue());
//			}
//		}
		ArrayList list = new ArrayList<>();
	    list.add(10);
	    list.add(20);
	    list.add(30);
//	    System.out.println(list);
//	    System.out.println(list.get(0)+list.get(1));
	    
//	    int i = (Integer)list.get(0);
//	    int j = (Integer)list.get(1);
//	    System.out.println(i+j);
	    
//	    Integer i = (Integer)list.get(0);
//	    Integer j = (Integer)list.get(1);
//	    int f = i;
//	    int s = j;
//	    System.out.println(f+s);
	    
//	    Integer i = 10;
//	    Integer j = 20;
//	    System.out.println(i+j);
	    
	    ArrayList list2 = new ArrayList<>();
	    list2.add(50);
	    list2.add(60);
	    System.out.println(list2);
	    list2.add(list);
	    System.out.println(list2);
	    
	    Vector v = new Vector<>();
	    ListIterator ls = v.listIterator();
	    
	    HashSet h = new HashSet<>();
	    h.iterator();
	    
	}

}
