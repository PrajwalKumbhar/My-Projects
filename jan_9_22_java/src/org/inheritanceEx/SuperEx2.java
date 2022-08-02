package org.inheritanceEx;

     class A3  {
    	 public A3(char ch) {
    		 System.out.println("Para Con A3-char");
    	 }
      public A3 (char ch, float f) {
    	 this (ch);
    	 System.out.println("Para Con A3-char,float");
     }
     }
     class B3 extends A3 {
    	 public B3(int a) {
    		super ('D',70.88f);  
    		 System.out.println("Para Con B3-int");
    	 }
     public B3 (int a, int b) {
    	 this (a);
		 System.out.println("Para Con B3-int,int");
     }
     }
     public class SuperEx2 extends B3 {
           public SuperEx2 (double d) {
        	   super (10,20);
      		 System.out.println("Para Con SuperEx2-double");
           }
           public SuperEx2 (int a, int b) {
        	   this (a);
        		 System.out.println("Para Con SuperEx2-int,int");
           }
	public static void main(String[] args) {
		System.out.println("**   Programs Starts   **");
		
		SuperEx2 obj = new SuperEx2 (50,60);
		
		System.out.println("**   Programs Ends   **");

	}

}
