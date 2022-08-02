package org.UpcastingDowncasting;

 class P {
	 public void test1() {
		 System.out.println(" Test 1");
	 }
 }
 class Q extends P {
	 public void test2() {
		 System.out.println(" Test 2");
	 }
 }
 class R extends Q {
	 public void test3() {
		 System.out.println(" Test 3");
	 }
 }
   public class DowncastingEx1 {
	   
	public static void main(String[] args) {
		P p1 = new P ();    // explicit up-casting
		p1.test1();
	//	p1.test2();     // ERROR
	//	p1.test3();     // ERROR
		System.out.println(" ************** ");
		Q q1 = (Q)p1;     // explicit down-casting
		q1.test1();
		q1.test2();
	//	q1.test3();      // ERROR
		System.out.println(" **************** ");
		R r1 = (R)p1;    // Explicit Down-casting
		r1.test1();
		r1.test2();
		r1.test3();
	}

}
