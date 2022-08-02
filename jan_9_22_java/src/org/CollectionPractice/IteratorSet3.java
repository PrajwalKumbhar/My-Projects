package org.CollectionPractice;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorSet3 {

	public static void main(String[] args) {
		System.out.println("**    Program Starts  **");
		HashSet <String> s1 = new HashSet <String> ();
		s1.add("USA");
		s1.add("Austrelia");
		s1.add(new String ("Akshay"));
		s1.add("Pune");
		s1.add("UK");
		s1.add("India");
		System.out.println("s1 : "+s1);
		Iterator <String> itr = s1.iterator();
	//	itr.remove();    // ERROR
		itr.next();
		itr.remove();
	//	itr.remove();    // ERROR
		System.out.println("s1 : "+s1);
		System.out.println("**    Program Ends  **");
    
	}

}
