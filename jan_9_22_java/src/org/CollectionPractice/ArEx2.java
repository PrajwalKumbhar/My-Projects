package org.CollectionPractice;

import java.util.ArrayList;

public class ArEx2 {

	public static void main(String[] args) {
         // homogeneous array list
	 ArrayList <String> ar1 = new ArrayList <String> ();
	 ar1.add("Pune");
	// ar1.add(10);     //ERROR
	 ArrayList <Float> ar2 = new ArrayList <Float> ();
	 ar2.add(6.9f);
	// ar2.add('D');     // ERROR
	 ArrayList <Integer> ar3 = new ArrayList <Integer> ();
	 ArrayList <Character> ar4 = new ArrayList <Character> ();

	 // heterogeneous array list
	 ArrayList <Object> ar5 = new ArrayList <Object> ();
	 ar5.add(50);
	 ar5.add('F');
	 ar5.add("Pune");

	 

	}

}
