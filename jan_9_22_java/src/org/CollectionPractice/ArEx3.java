package org.CollectionPractice;

import java.util.ArrayList;

public class ArEx3 {

	public static void main(String[] args) {
		 ArrayList <Object> ar = new ArrayList <Object> ();
		 ar.add(50);
		 ar.add('F');
		 ar.add("Pune");
		 ar.add(55.9);
		 ar.add(50);
		 ar.add(null);
		 ar.add(55.9);
		 ar.add('F');
		 ar.add(null);
		 ar.add("Pune");
		 int size = ar.size();
		 System.out.println("size : "+size);
		 System.out.println(ar);
		 System.out.println(ar.get(5));
		 System.out.println("********************");
		 for (Object obj : ar) {
			 System.out.println(obj);
			 
		// for (int i=0; i<ar.size(); i++) {
		//	 System.out.println(ar.get(i));
		// }
		 }

	}

}
