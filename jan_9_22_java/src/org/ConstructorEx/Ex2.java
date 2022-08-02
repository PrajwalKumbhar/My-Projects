package org.ConstructorEx;

public class Ex2 {      //  Multiple Constroctor in Class
	     int a;
	     public Ex2 () {
	    	 System.out.println("Defult constructor");
	     }
	     public Ex2 (int a) {
	    	 this.a=a;
	    	 System.out.println("Para Con-int");
	     }
	     public Ex2 (char a,boolean flag) {
	    	 System.out.println("Para Con-char, boolean");
	     }
	     public Ex2 (float a,int b,double c) {
	    	 System.out.println("Para Con-float, int, double");
	     }
	     public Ex2 (double a,int b,float c) {
	    	 System.out.println("Para Con-double, int, float");
	     }

	public static void main(String[] args) {
		   Ex2 obj1 = new Ex2 ();  // defult con
		   System.out.println("obj1.a= "+obj1.a);
		   Ex2 obj2 = new Ex2 (100);  // para con
		   System.out.println("obj2.a= "+obj2.a);
		   Ex2 obj3 = new Ex2 ('R', true ); 
		   Ex2 obj4 = new Ex2 (4.5f,60,44.2);
		   Ex2 obj5 = new Ex2 (44.2,60,4.5f);
			   
             
	}

}
