package org.interfaceEx;

  interface Interf8 {
	  public int addition (int a, int b);
	  public int subtraction (int a, int b);

  }
  interface Interf9 {
	  public int multiplication (int a, int b);
	  public int division (int a, int b);
  }
  class Parent1 {
	  public void test1 () {
		  System.out.println("Test 1");
	  }
  }
      public class MultipleInheritEx2 extends Parent1 implements Interf8, Interf9 {
	    public int addition (int a, int b) {
	    	return a+b;
	    }
   	    public int subtraction (int a, int b) {
   	    	return a-b;
   	    }
     	public static void main(String[] args) {
     		MultipleInheritEx2 obj = new MultipleInheritEx2 ();
     		System.out.println(obj.addition(10, 20));
     		System.out.println(obj.subtraction(10, 20));
     		System.out.println(obj.multiplication(10, 20));
     		System.out.println(obj.division(10, 2));
     		obj.test1();
	}
		public int multiplication(int a, int b) {
			return a*b;
		}
		public int division(int a, int b) {
			return a/b;
		}

}
