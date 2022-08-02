package org.SingleToClassEx;

  class ClassB {
	  int a=10;
	  static ClassB obj = null;  // default value = null
	  private ClassB () { }   // constrctor
	  public static ClassB getInstanceofClassB() {
		  if (obj == null) {
		   obj = new ClassB ();
	  }
		  return obj;
	  }
	  }
 
public class Ex2 {

	public static void main(String[] args) {
	//	ClassB obj1 = new ClassB ();
		ClassB obj1 = ClassB.getInstanceofClassB();  // new
		System.out.println("obj1.a = "+obj1.a);
		obj1.a = 500;
		System.out.println("obj1.a = "+obj1.a);
		
		ClassB obj2 = ClassB.getInstanceofClassB();  // new
		System.out.println("obj2.a = "+obj2.a);

	}

}
