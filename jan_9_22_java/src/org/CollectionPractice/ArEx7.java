package org.CollectionPractice;

 import java.util.ArrayList;

public class ArEx7 {

	public static void main(String[] args) {
		 ArrayList <Integer> ar1 = new ArrayList <Integer> ();
		 ar1.add(80);
		 ar1.add(77);
      	 ar1.add(10);
		 ar1.add(77);
		 ar1.add(new Integer (50));
		 ar1.add(88);
		 ar1.add(78);
		 ar1.add(10);
		 ar1.add(80);
		 ar1.add(55);
		 ar1.add(-100);
		 ar1.add(77);
		 ar1.add(80);
		 System.out.println("ar1 : "+ar1);
	//	 ar1.remove(5);
		 ar1.remove(new Integer (10));
	//	 System.out.println("ar1 : "+ar1);
		 
		 ArrayList <Integer> ar2 = new ArrayList <Integer> ();
		 ar2.add(80);
      	 ar2.add(77);
		 ar2.add(78);
		 ar2.add(123);
		 ar1.add(80);
		 System.out.println("ar2 : "+ar2);
		 System.out.println("********************");
	//	 ar1.removeAll(ar2);
		 ar1.retainAll(ar2);
		 System.out.println("********************");
		 System.out.println("ar1 : "+ar1);
		 System.out.println("ar2 : "+ar2);
		 
 }

}
