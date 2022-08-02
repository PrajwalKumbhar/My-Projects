package org.encapsulationEx;
       
     class Parent4 {
    	 private int a;      // global variables
    	 public void setA (int a) {    // local variables
    		this. a=a;
    		 
    	 }
    	 public int getA () {
    		 return a;
    	 }		 
         }
 
    public class Ex4 {

	public static void main(String[] args) {
		Parent4 obj = new Parent4 ();
		System.out.println(obj. getA ());
		obj.setA (200);
		System.out.println(obj. getA ());

	}

}
