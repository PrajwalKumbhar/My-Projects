package org.StaticNonstatic;

public class StaticToStatic {
	static int x=50, y=60;  // static global variables

	public static void main(String[] args) {  // static method
		System.out.println("**   Program Starts   **");
		// way 1: call directly by name 
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		test1 ();
		test2 ();
		// way 2: call by object
		StaticToStatic obj = new StaticToStatic ();
		System.out.println("x = "+obj.x);
		System.out.println("y = "+obj.y);
		obj.test1 ();
		obj.test2 ();
		// way 3: by using class name 
		System.out.println("x = "+StaticToStatic.x);
		System.out.println("y = "+StaticToStatic.y);
		StaticToStatic.test1 ();
		StaticToStatic.test2 ();

		System.out.println("**  Program Ends     **");

	}
	public static void test1 () {    // static method
		System.out.println("Test 1");
	}
	public static void test2 () {     // static method
		System.out.println("Test 2"); 

	}

}
