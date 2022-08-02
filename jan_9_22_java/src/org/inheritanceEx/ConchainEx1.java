package org.inheritanceEx;

     class A extends Object {
    	 public A() {
    		 // by default hidden
    		 System.out.println("Default Con A");
    	 }
     }
     class B extends A {
    	 public B() {
    		 // by default hidden
    		 System.out.println("Default Con B");
    	 }
     }
     class C extends B {
    	 public C() {
    		 // by default hidden
    		 System.out.println("Default Con C");
    	 }
     }
 public class ConchainEx1 extends Object {
	public static void main(String[] args) {
		System.out.println("**   Programs Starts   **");
		
		C cl = new C ();
		
		System.out.println("**   Programs Ends   **");

	}

}
