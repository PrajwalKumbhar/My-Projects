package org.ConstantsEx;
 
   class A {
	   final public int x=77;
	   final public void test1 () {
		   System.out.println("Test 1");
	   }
   }
   public class Ex1 extends A {
	   final public int a=10;

	public static void main(String[] args) {
		Ex1 obj = new Ex1 ();
		System.out.println(obj.a);
	//	obj.a=5000; // ERROR
	//	obj.x=554;  // ERROR
	}
    // public void test1 () {
    //	 System.out.println("Test 1");
    // }

}
