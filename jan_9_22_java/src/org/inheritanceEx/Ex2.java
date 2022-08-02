package org.inheritanceEx;

  class Parent2 {       // Multiple-level Inheritance
	   public void test1 () {
		  System.out.println(" Test 1 ");
	  }
  }
  class Parent3 extends Parent2 {
	  public void test2 () {
		  System.out.println(" Test 2 ");
	  }
  }
    public class Ex2 extends Parent3 {
	
	public static void main(String[] args) {
             Ex2 obj = new Ex2 ();
             obj.test1 ();
             obj.test2();
	}

}
