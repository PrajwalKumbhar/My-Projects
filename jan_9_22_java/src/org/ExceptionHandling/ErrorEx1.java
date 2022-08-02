package org.ExceptionHandling;

public class ErrorEx1 {

	public static void main(String[] args) {
		System.out.println("**  Program Satrts  **");
		    test1(1);
		System.out.println("**  Program Ends  **");

	}
	public static void test1 (int a) {
		while (a<=10) {
			System.out.println(a);
			a--;
			test1(a);
		}
	}

}
