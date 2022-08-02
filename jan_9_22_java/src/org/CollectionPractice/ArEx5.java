package org.CollectionPractice;

 import java.util.ArrayList;

public class ArEx5 {

	public static void main(String[] args) {
		 ArrayList <String> ar = new ArrayList <String> ();
		 ar.add("Pune");
		 ar.add("Delhi");
      	 ar.add("Mumbai");
		 ar.add("Jalgaon");
		 ar.add("Nashik");
		 ar.add("Aurangabad");
		 ar.add("Amravati");
		 ar.add("Nanded");
		 System.out.println(ar);
		 System.out.println("********************");
		 ar.add(2, "USA");
		 System.out.println(ar);
		 System.out.println("********************");
		 
 }

}
