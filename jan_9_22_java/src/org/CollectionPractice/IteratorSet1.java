package org.CollectionPractice;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorSet1 {

	public static void main(String[] args) {
		HashSet <String> s1 = new HashSet <String> ();
		s1.add("USA");
		s1.add("Austrelia");
		s1.add("Akshay");
		s1.add("Pune");
		s1.add("UK");
		s1.add("India");
		System.out.println(s1);
		Iterator <String> itr = s1.iterator();
    	System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next()); 
	//	System.out.println(itr.next());    // ERROR
		
	}

}
