package org.CollectionPractice;

 import java.util.ArrayList;

public class ArEx6 {

	public static void main(String[] args) {
		 ArrayList <String> ar1 = new ArrayList <String> ();
		 System.out.println("ar1 is Empty : "+ar1.isEmpty());
		 ar1.add("Pune");
		 ar1.add("Delhi");
      	 ar1.add("Mumbai");
		 ar1.add("Jalgaon");
		 System.out.println("ar1 : "+ar1);
		 
		 ArrayList <String> ar2 = new ArrayList <String> ();
		 ar2.add("Pune");
      	 ar2.add("Mumbai");
		 ar2.add("Jalgaon");
		 ar2.add("Nashik");
		 System.out.println("ar2 : "+ar2);
		 System.out.println("********************");
	//	 ar1.addAll(ar2);
	//	 System.out.println(ar1);
	//	 System.out.println(ar2);
		 
	//	 System.out.println(ar1.contains(new String ("Pune")));
	//	 System.out.println(ar1.contains("Pune"));
		 
	//	 System.out.println(ar2.containsAll(ar1));
		 
	//	 System.out.println("ar1 is Empty : "+ar1.isEmpty());
	//	 System.out.println(ar1.size()>0);
	//	 if (ar1.size()>0) {  }
	//	 if (!ar1.isEmpty()) {  }
	//	 if (ar1.size()!=0) { }
		 
		 System.out.println("********************");
		 
 }

}
