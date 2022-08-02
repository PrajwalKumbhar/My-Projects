package org.interfaceEx;
  
     interface Interf1 {
    	// public Interf1 () { // ERROR
    	//	 
    	 //}
    	 abstract public void test1 ();
     }
     interface Interf2 {      // abstract keyword is hidden
    	 public void test2 (); // abstract keyword is hidden
     }
     abstract class a {
    	 abstract public void test1 ();
     }
     public class Ex1 {
	public static void main(String[] args) {
	//	Interf1 obj = new Interf1 (); //ERROR
         
	}

}
