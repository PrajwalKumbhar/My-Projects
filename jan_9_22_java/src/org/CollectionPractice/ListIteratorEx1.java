package org.CollectionPractice;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx1 {

	public static void main(String[] args) {
		ArrayList <Integer> ar = new ArrayList <Integer> ();
		ar.add(10);
		ar.add(5);
		ar.add(30);
		ar.add(-20);
		ar.add(50);
		System.out.println("ar = "+ar);
		ListIterator<Integer> itr = ar.listIterator();
		System.out.println(itr.next());
		System.out.println(itr.hasPrevious());    //true
		System.out.println(itr.previous());

	}

}
