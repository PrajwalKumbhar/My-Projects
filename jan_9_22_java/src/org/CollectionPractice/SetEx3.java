package org.CollectionPractice;

import java.util.HashSet;

public class SetEx3 {

	public static void main(String[] args) {
		HashSet <String> s1 = new HashSet <String> ();
		s1.add("USA");
		s1.add("Austrelia");
		s1.add("Akshay");
		s1.add("Pune");
		s1.add("UK");
		s1.add("India");
		System.out.println(s1);
		for (String s: s1) {
			System.out.println(s);
		}
	}

}
