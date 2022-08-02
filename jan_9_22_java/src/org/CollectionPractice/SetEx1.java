package org.CollectionPractice;

import java.util.HashSet;

public class SetEx1 {

	public static void main(String[] args) {
		SetEx1 obj1 = new SetEx1 ();
		HashSet <Object> s1 = new HashSet <Object> ();
		s1.add(10);
		s1.add(new Integer (-900));
		s1.add('R');
		s1.add(true);
		s1.add(new SetEx1 ());
		s1.add(obj1);
		s1.add("Pune");
		s1.add(new String ("Mumbai"));
		s1.add('R');
		s1.add(true);
		s1.add("Mumbai");
		s1.add("Pune");
		System.out.println(s1);
		System.out.println("size : "+s1.size());
		
	}

}
