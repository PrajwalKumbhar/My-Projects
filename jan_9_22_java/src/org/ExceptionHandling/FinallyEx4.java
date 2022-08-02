package org.ExceptionHandling;

public class FinallyEx4 {

	public static void main(String[] args) {
		System.out.println("**  Program Satrts  **");
         
		try {
			System.out.println("1. inside try");
			int a=10, b=0, div=0;
			div= a/b;
			System.out.println("division = "+div);
			System.out.println("2. inside try");
		
		} finally {
			System.out.println("inside FINALLY");
		}
		System.out.println("Outside try-Catch-finally");
		test1 ();
		System.out.println("**  Program Satrts  **");

	}
	public static void test1 () {
		System.out.println("* Test 1 *");
	}
	

}
