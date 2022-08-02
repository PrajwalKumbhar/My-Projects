package org.ExceptionHandling;


public class ThrowEx1 {

	public static void main(String[] args) { 
     System.out.println("**  Program Starts  **");
     ThrowEx1 obj = new ThrowEx1 ();
     obj.Practice(10,0);
     System.out.println("**  Program Ends  **");
     
     }
	public void Practice (int a, int b) {
		System.out.println("Practice Starts");
		if (b==0) {
			throw new ArithmeticException ("Please enter b value other than 0");
		}
		int div = a/b;
		System.out.println("div = "+div);
		System.out.println("Practice Ends");

		
		
	}
	
}

