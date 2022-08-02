package org.SingleToClassEx;

  class ClassA {
	  int a=10;
	  private ClassA () { }   // constrctor
	  public static ClassA getInstanceofClassA() {
		  ClassA obj = new ClassA ();
		  return obj;
	  }
	  }
 
public class Ex1 {

	public static void main(String[] args) {
	//	ClassA obj1 = new ClassA ();
		ClassA obj1 = ClassA.getInstanceofClassA();  // new
		System.out.println("obj1.a = "+obj1.a);
		obj1.a = 500;
		System.out.println("obj1.a = "+obj1.a);
		
		ClassA obj2 = ClassA.getInstanceofClassA();  // new
		System.out.println("obj2.a = "+obj2.a);

	}

}
