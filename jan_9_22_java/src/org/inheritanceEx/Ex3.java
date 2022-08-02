package org.inheritanceEx;

class Parent4 {       //Inheritance happends through chain of constructor
	public static int Method1 (int a, int b) {
		return a+b;
	}
	   public void test1 () {
		  System.out.println(" Test 1 ");
	  }
}
class Parent5 extends Parent4 {
	  public void test2 () {
		  System.out.println(" Test 2 ");
	  }
}
public class Ex3 extends Parent5 {
	public static void main(String[] args) {
		Parent4.Method1(10,20);
		

	}
}
