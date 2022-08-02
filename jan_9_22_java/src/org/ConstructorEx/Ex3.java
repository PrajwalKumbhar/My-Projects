package org.ConstructorEx;

public class Ex3 {      //  this() statment
	     
	     public Ex3 () {
	    	 this (500);
	    	 System.out.println("Defult constructor");
	    	 return;   //hidden
	     }
	     public Ex3 (int a) {
	    	 System.out.println("Para Con-int");
	    	 return;
	     }
	     public Ex3 (char a,boolean flag) {
	    	 this ();
	    	 System.out.println("Para Con-char, boolean");
	     }
	     public Ex3 (float a,int b,double c) {
	    	 this ('R', true);
	    	 System.out.println("Para Con-float, int, double");
	     }
	     public Ex3 (double a,int b,float c) {
	    	 this (c,b,a);
	    	 System.out.println("Para Con-double, int, float");
	    	//  this(4.5f,60,44.2);  // ERROR
	     }

	public static void main(String[] args) {
		   Ex3 obj5 = new Ex3 (44.2,60,4.5f);
			   
             
	}

}
