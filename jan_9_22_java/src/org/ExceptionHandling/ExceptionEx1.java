package org.ExceptionHandling;

import java.io.FileNotFoundException;

public class ExceptionEx1 {

	public static void main(String[] args) {
		System.out.println("**  Program Satrts  **");
		
		try {
			System.out.println("* Division code *");
			int a = 10, b = 0, div = 0;
			div = a / b;
			System.out.println("division = " + div);
			
			System.out.println("* Array code *");
			int[] ar = { 50, 20, 70 };
			System.out.println(ar[2]);
			
			System.out.println("* String code *");
			String str = "Pune";
			System.out.println(str.charAt(1));
		} catch (Exception e) {
			e.printStackTrace();
		}/* catch (ArithmeticException e) {
			 e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			 e.printStackTrace();
		} catch (StringIndexOutOfBoundsException e) {
			 e.printStackTrace();
		}*/ // ERROR unreachable code
	     /* catch (FileNotFoundException e) {
		     e.printStackTrace();
	    } */ // ERROR as compile time and Not thrown by code
		System.out.println("**  Program Ends  **");

	}
}

