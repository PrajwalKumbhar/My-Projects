package org.AbstractionEx;

      abstract class Parent1 {      // contains all abstract methods
    	  abstract public void test1 ();
    	  abstract public void test2 ();

      }
      abstract class Parent2 {       // contains both abstarct & concrete
    	  public int addition (int a, int b) {
    		  return a+b;
    	  }
    	  abstract public int subtarction (int a, int b);
      }
      abstract class Parent3 {      // contains all concrete methods
    	  public int multiplication (int a, int b) {
    		  return a*b;
    	  }
    	  public int division (int a, int b) {
    		  return a/b;
    	  }
      }
      public class Ex1 {
       public static void main(String[] args) {
		
	}    	  
	

}
