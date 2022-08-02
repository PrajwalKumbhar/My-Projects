package org.StaticNonstatic;

public class NonStaticToNonStatic {
	int a=10, b=20;  //non static global variables

	public static void main(String[] args) {  // static method
		System.out.println("**   Program Starts   **");
		
		NonStaticToNonStatic obj = new NonStaticToNonStatic ();
		obj.test3 ();    // static to nonstatic
		
		System.out.println("**  Program Ends     **");

	}
	public void test3 () {       // non-static method
		System.out.println("Test 3");
		// a,b,test4 ()
		// way 1: call directly
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		test4 ();
		// way 2 : by using object
		NonStaticToNonStatic obj2 = new NonStaticToNonStatic ();
		System.out.println("a = "+obj2.a);
		System.out.println("b = "+obj2.b);
		obj2.test4();
		// way 3 : by using this keyword
		System.out.println("a = "+this.a);
		System.out.println("b = "+this.b);
		this.test4();
		System.out.println("Test 3 Ends");
	}
	public void test4 () {      // non-static method
		System.out.println("Test 4");
	}


	}


