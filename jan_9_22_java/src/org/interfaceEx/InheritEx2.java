package org.interfaceEx;

  interface Interf5 {
	  public int addition (int a, int b);
	  public int subtraction (int a, int b);

  }
      public class InheritEx2 implements Interf4 {
	    public int addition (int a, int b) {
	    	return a+b;
	    }
   	    public int subtraction (int a, int b) {
   	    	return a-b;
   	    }
     	public static void main(String[] args) {
     		InheritEx2 obj = new InheritEx2 ();
     		System.out.println(obj.addition(10, 20));
     		System.out.println(obj.subtraction(10, 20));
           
	}

}
