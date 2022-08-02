package org.interfaceEx;

  interface Interf6 {
	  public int addition (int a, int b);
	  public int subtraction (int a, int b);

  }
  interface Interf7 {
	  public int multiplication (int a, int b);
	  public int division (int a, int b);

  }
      public class MultipleInheritEx1 implements Interf6, Interf7 {
	    public int addition (int a, int b) {
	    	return a+b;
	    }
   	    public int subtraction (int a, int b) {
   	    	return a-b;
   	    }
     	public static void main(String[] args) {
     		MultipleInheritEx1 obj = new MultipleInheritEx1 ();
     		System.out.println(obj.addition(10, 20));
     		System.out.println(obj.subtraction(10, 20));
     		System.out.println(obj.multiplication(10, 20));
     		System.out.println(obj.division(10, 2));
	}
		public int multiplication(int a, int b) {
			return a*b;
		}
		public int division(int a, int b) {
			return a/b;
		}

}
