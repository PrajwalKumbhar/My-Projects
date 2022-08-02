package org.ExceptionHandling;


public class ContinueBreakEx {

	public static void main(String[] args) {
      System.out.println("**  Program Starts  **");
      ContinueBreakEx obj = new ContinueBreakEx ();
      obj.test1();
      System.out.println("**  Program Eands  **");

	}
	public void test1 () {
		
		try {
			System.out.println(" Inside try ");
			for (int i=1; i<=10; i++) {
				if (i==5) {
				//	break ;
					continue ;
				}
				System.out.println(i);
			}
		} catch (Exception e) {
			System.out.println(" Inside catch ");
		} finally {
			System.out.println(" inside finally ");
		}
		System.out.println(" Test1 Ends");
	}

}
