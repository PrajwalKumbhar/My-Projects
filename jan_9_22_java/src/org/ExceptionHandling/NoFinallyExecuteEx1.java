package org.ExceptionHandling;


public class NoFinallyExecuteEx1 {

	public static void main(String[] args) {
      System.out.println("**  Program Starts  **");
     // System.exit(0);
     
      System.out.println("**  Program Eands  **");
	}
	public void test1 () {
		
		try {
			System.out.println(" Inside try ");
			for (int i=1; i<=10; i++) {
				System.out.println(i);
			//	System.exit(0);
			}
		} catch (Exception e) {
			System.out.println(" Inside catch ");
		} finally {
		//	System.exit(0);
			System.out.println(" inside finally ");
		//	System.exit(0);
		}
		
	}

}
