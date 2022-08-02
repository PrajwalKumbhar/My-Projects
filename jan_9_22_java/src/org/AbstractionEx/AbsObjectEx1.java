package org.AbstractionEx;

   abstract class Abs5 {
	 
	   public void testMethod () {
		   System.out.println("Test Method");
	   }
   }
	 
     public class AbsObjectEx1 {
	public static void main(String[] args) {
	//	Abs4 obj = new Abs4 ();  // ERROR
		// defined constractor body
		Abs5 obj = new Abs5() { };
		obj.testMethod();
		
	}
}
