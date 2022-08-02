package org.CollectionPractice;

import java.util.HashSet;

public class SetEx2 {

	public static void main(String[] args) {
		HashSet <Object> s1 = new HashSet <Object> ();
		s1.add("USA");
		s1.add("Austrelia");
		s1.add("Akshay");
		s1.add("Pune");
		s1.add("UK");
		s1.add("India");
		HashSet <Object> s2 = new HashSet <Object> ();
		s2.add("Akshay");
		s2.add("Pune");
		s2.add(new String ("Mumbai"));
		s2.add("Banglore");
		s2.add("Austrelia");
		s2.add("UK");
		s2.add("Hydrabad");
		System.out.println(s2);
		System.out.println("***************");
	//	s1.addAll(s2);
	//	s2.remove("Banglore");
		s1.removeAll(s2);
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
