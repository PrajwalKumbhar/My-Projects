package org.encapsulationEx;
       
     class Parent3 {
    	 private int a=10;
    	 private char ch= 'A';
    	 public int getA () {
    		 return a;
    		 
    	 }
    	 public char getch () {
    		 return ch;
    	 }		 
         }
 
    public class Ex3 {

	public static void main(String[] args) {
		Parent3 obj = new Parent3 ();
		System.out.println(obj. getA ());
		System.out.println(obj. getch ());

	}

}
