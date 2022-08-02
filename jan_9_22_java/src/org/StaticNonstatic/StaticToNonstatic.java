package org.StaticNonstatic;

public class StaticToNonstatic {
	int a=10, b=20;  //non static global variables

	public static void main(String[] args) {  // static method
		System.out.println("**   Program Starts   **");
		// local variables: obj
		StaticToNonstatic obj = new StaticToNonstatic ();
		System.out.println("a ="+ obj.a);
		System.out.println("b ="+ obj.b);
		obj.test3 ();
		obj.test4 ();


		System.out.println("**  Program Ends     **");

	}
	public void test3 () {       // non-static method
		System.out.println("Test 3");
	}
	public void test4 () {      // non-static method
		System.out.println("Test 4");
	}




	public static void test1 () {    // static method
		System.out.println("Test 1");
	}
	public static void test2 () {     // static method
		System.out.println("Test 2"); 

	}

}
