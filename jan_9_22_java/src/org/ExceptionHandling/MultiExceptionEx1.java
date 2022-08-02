package org.ExceptionHandling;

public class MultiExceptionEx1 {

	public static void main(String[] args) {
		System.out.println("**  Program Satrts  **");
		int a = 10, b = 0, div = 0;
		try {
			div = a / b;
		} catch (ArithmeticException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("division = " + div);
		int[] ar = { 50, 20, -44, 0 };
		try {
			System.out.println(ar[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
		try {
			String str = "Pune";
			System.out.println(str.charAt(5));
		} catch (StringIndexOutOfBoundsException e) {
			// e.printStackTrace();
			 System.out.println(e.getMessage());
		}
		System.out.println("**  Program Ends  **");

	}

}
