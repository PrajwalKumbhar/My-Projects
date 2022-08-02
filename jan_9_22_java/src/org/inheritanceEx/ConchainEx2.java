package org.inheritanceEx;

     class A1 extends Object {
    	 public A1() {
    		super ();    // by default hidden
    		 System.out.println("Default Con A");
    		 return; //by default hidden
    	 }
     }
     class B1 extends A1 {
    	 public B1() {
    		super ();   // by default hidden
    		 System.out.println("Default Con B");
    	 }
     }
     class C1 extends B1 {
    	 public C1() {
    		super ();   // by default hidden
    		 System.out.println("Default Con C");
    	 }
     }
 public class ConchainEx2 extends Object {
	public static void main(String[] args) {
		System.out.println("**   Programs Starts   **");
		
		C1 cl = new C1 ();
		
		System.out.println("**   Programs Ends   **");

	}

}
