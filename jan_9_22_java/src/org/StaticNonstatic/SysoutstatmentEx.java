package org.StaticNonstatic;

public class SysoutstatmentEx {
	int a=10;
	static SysoutstatmentEx obj = new SysoutstatmentEx ();
	public static ArithmeticClassEx ac = new ArithmeticClassEx ();
	public static void main(String[] args) {
		System.out.println("**   Program Starts   **");
		
	//	SysoutstatmentEx obj = new SysoutstatmentEx ();
		SysoutstatmentEx.obj.test1();
		SysoutstatmentEx.obj.test2();
		SysoutstatmentEx.obj.test3();
		SysoutstatmentEx.obj.test4();
		System.out.println("***********************");
		SysoutstatmentEx.ac.addition(100, 200);
		SysoutstatmentEx.ac.division(10,2);
		
		System.out.println("**   Program Ends   **");
		
	}
	public void test1 () {
		System.out.println(" Test 1 ");
	}
	public void test2 () {
		System.out.println(" Test 2 ");
	}
	public static void test3 () {
		System.out.println("* Test 3 *");
	//	SysoutstatmentEx obj = new SysoutstatmentEx ();
		SysoutstatmentEx.obj.test1();
		SysoutstatmentEx.obj.test2();
	}
	public static void test4 () {
		System.out.println("* Test 4 *");
	//	SysoutstatmentEx obj = new SysoutstatmentEx ();
		SysoutstatmentEx.obj.test1();
		SysoutstatmentEx.obj.test2();
	}
	

}
