package org.ExceptionHandling;

import java.util.Scanner;

public class FinallyuseEx {

	public static void main(String[] args) {
      System.out.println("**  Program Starts  **");
      FinallyuseEx obj = new FinallyuseEx ();
      System.out.println("sum = "+obj.test1 ());
      System.out.println("**  Program Eands  **");

	}
	public int test1 () {
		Scanner scn = new Scanner (System.in);
		int a=0, b=0;
		try {
			System.out.println("enter value of a: ");
			a = scn.nextInt();
			System.out.println("enter value of b: ");
			b = scn.nextInt();
			//scn.close();
			return a+b;
		} catch (Exception e) {
			//scn.close();
		} finally {
			System.out.println(" inside finally ");
			scn.close();
		}
		return b; 
	}

}
