package org.CollectionPractice;

import java.util.ArrayList;

public class ArEx4 {

	public static void main(String[] args) {
		 ArrayList <String> ar = new ArrayList <String> ();
		 ar.add("Pune");
		 ar.add("Delhi");
		 ar.add("Pune");
		 ar.add("Mumbai");
		 ar.add("Jalgaon");
		 ar.add("Nashik");
		 ar.add("Aurangabad");
		 ar.add("Amravati");
		 ar.add("Nanded");
		 ar.add("Mumbai");
		 System.out.println("********************");
		 for (int i=0; i<ar.size(); i++) {
		//	 String str = ar.get(i);
			 if (ar.get(i)== null) {
				 continue;
			 }
			 if (ar.get(i).equals("Nashik")) {
				 break;
			 }
			 System.out.println(ar.get(i));
		 }
		
	}

}
