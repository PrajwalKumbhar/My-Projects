package org.ExceptionHandling;

public class Ex2 {

	public static void main(String[] args) {
       System.out.println("**  Program Satrts  **");
       int a = 10, b = 5, div = 0;
       try {
    	   System.out.println("1");
    	   div= a/b;
    	   System.out.println("2");
    	   System.out.println("3");
       } catch (ArithmeticException obj) {          //not exicute
    	   System.out.println("4");
    	   System.out.println("5");
       }
       System.out.println("division = "+div);
       System.out.println("**  Program Ends  **");

	}

}
