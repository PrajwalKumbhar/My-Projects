package org.ExceptionHandling;


public class NoFinallyExecuteEx2 {

	public static void main(String[] args) {
      System.out.println("**  Program Starts  **");
     
		try {
			System.out.println(" Inside try ");
			for (int i=1; i<=10; i++) {
				System.out.println(i);
			
			}
		} catch (Exception e) {
			System.out.println(" Inside catch ");
		} finally {
			System.out.println(" finally Starts ");
			int a=10, b=0;
			System.out.println("division = "+(a/b));
			System.out.println(" finally Ends ");
		
		}
		 System.out.println("**  Program Eands  **");
		
	}

}
