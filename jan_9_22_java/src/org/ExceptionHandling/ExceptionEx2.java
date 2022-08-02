package org.ExceptionHandling;

import java.io.FileNotFoundException;

public class ExceptionEx2 {

	public static void main(String[] args) {
		System.out.println("**  Program Satrts  **");
		
		try {
			System.out.println("* Division code *");
			int a = 10, b = 0, div = 0;
			div = a / b;
			System.out.println("division = " + div);
		}/* catch (Throwable e) {
			e.printStackTrace();
		}*/ catch (Exception e) {
			e.printStackTrace();
		} /*  catch (Error e) {
			e.printStackTrace();
		}   catch (Throwable e) {
			e.printStackTrace();
		}*/
		System.out.println("**  Program Ends  **");

	}
}

