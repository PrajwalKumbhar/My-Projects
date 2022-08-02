package org.CollectionPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapEx2 {

	public static void main(String[] args) {
		HashMap<Integer, String> m1 = new HashMap<Integer, String>();
		m1.put(80, "Akshay Kumar");
		m1.put(40, "Katrina Kaif");
		m1.put(90, "Salman Khan");
		m1.put((int) 'A', "Ajay Devgan");
		System.out.println(m1);
		System.out.println(m1.get(65));
		Set<Integer> s1 = m1.keySet();
		System.out.println("s1 "+s1);
		Collection<String> c = m1.values();
		System.out.println(c);
		for (String S : c) {
			System.out.println(S);
		}
		
	}

}
