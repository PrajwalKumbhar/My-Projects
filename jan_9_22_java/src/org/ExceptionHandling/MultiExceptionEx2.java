package org.ExceptionHandling;

public class MultiExceptionEx2 {

	public static void main(String[] args) {
		System.out.println("**  Program Satrts  **");
		
		try {
			System.out.println("* Division code *");
			int a = 10, b = 2, div = 0;
			div = a / b;
			System.out.println("division = " + div);
			
			System.out.println("* Array code *");
			int[] ar = { 50, 20, -44, 0 };
			System.out.println(ar[2]);
			
			System.out.println("* String code *");
			String str = "Pune";
			System.out.println(str.charAt(1));

		} catch (ArithmeticException e) {
			 e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			 e.printStackTrace();
		} catch (StringIndexOutOfBoundsException e) {
			 e.printStackTrace();
		}
		System.out.println("**  Program Ends  **");

	}

}
