package org.ConstantsEx;
 
   class B {
	   final public int x=77;
	   final public void test1 () {
		   System.out.println("Test 1");
	   }
   }
   public class Ex2 {  // extends B {  //ERROR
	   final public int a=10;
	   
	public static void main(String[] args) {
		Ex2 obj = new Ex2 ();
		System.out.println(obj.a);
	//	obj.a=5000; // ERROR
	}
    

}
