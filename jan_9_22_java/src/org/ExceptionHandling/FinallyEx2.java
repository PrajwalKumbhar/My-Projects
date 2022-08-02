package org.ExceptionHandling;

public class FinallyEx2 {

	public static void main(String[] args) {
		System.out.println("**  Program Satrts  **");
         
		try {
			System.out.println("1. inside try");
			System.out.println("2. inside try");
		} catch (Exception e) {
			e.printStackTrace();
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
