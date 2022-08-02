package org.ExceptionHandling;

public class FinallyEx1 {

	public static void main(String[] args) {
		System.out.println("**  Program Satrts  **");
         
		try {
			System.out.println("1. inside try");
			System.out.println("2. inside try");
		} finally {
			System.out.println("inside FINALLY");
		}
		System.out.println("Outside try-finally");
		test1 ();
		System.out.println("**  Program Satrts  **");

	}
	public static void test1 () {
		System.out.println("* Test 1 *");
	}
	

}
