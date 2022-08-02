package org.ExceptionHandling;

public class Ex1 {

	public static void main(String[] args) {
       System.out.println("**  Program Satrts  **");
       int a = 10, b = 0, div = 0;
       try {
    	   System.out.println("1");
    	   div= a/b;
    	   System.out.println("2");      // not exicute
    	   System.out.println("3");      // not exicute
       } catch (ArithmeticException obj) {
    	   System.out.println("4");
    	   System.out.println("5");
       }
       System.out.println("division = "+div);
       System.out.println("**  Program Ends  **");

	}

}
