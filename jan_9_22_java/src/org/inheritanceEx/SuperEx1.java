package org.inheritanceEx;

     class A2  {
    	 public A2(char ch) {
    		 System.out.println("Default Con A2");
    	 }
     }
     class B2 extends A2 {
    	 public B2(int a) {
    		super ('D');  
    		 System.out.println("Para Con B2-int");
    	 }
     }
     public class SuperEx1 extends B2 {
           public SuperEx1 (double d) {
        	   super (10);
           }
	public static void main(String[] args) {
		System.out.println("**   Programs Starts   **");
		
		SuperEx1 obj = new SuperEx1 (80.11);
		
		System.out.println("**   Programs Ends   **");

	}

}
