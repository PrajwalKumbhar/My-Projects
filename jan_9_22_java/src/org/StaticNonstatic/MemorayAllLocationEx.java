package org.StaticNonstatic;

public class MemorayAllLocationEx {
	int a=10, b=20;  //non static global variables
	static int x=50, y=60;  // static global variables
	public static void main(String[] args) {  // static method
		System.out.println("**   Program Starts   **");
          MemorayAllLocationEx obj = new MemorayAllLocationEx ();
         
		System.out.println("**  Program Ends     **");

	}
	public static void test1 () {    // static method
		System.out.println("Test 1");
	}
	public static void test2 () {     // static method
		System.out.println("Test 2");        
	}
	public void test3 () {       // non-static method
		System.out.println("Test 3");
	}
	public void test4 () {      // non-static method
		System.out.println("Test 4"); 
	}
}
