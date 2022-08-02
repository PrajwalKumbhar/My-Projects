package org.inheritanceEx;

  class Parent1 {       // single level Inheritance
	  public int a=10;
	  public void test1 () {
		  System.out.println(" Test 1");
	  }
  }

public class Ex1 extends Parent1 {
	//  public int a=10;
	 // public void test1 () {
		//  System.out.println(" Test 1");
	//  } 
	public static void main(String[] args) {
             Ex1 obj = new Ex1 ();
             obj.test1 ();
             System.out.println("a = "+obj.a);
	}

}
