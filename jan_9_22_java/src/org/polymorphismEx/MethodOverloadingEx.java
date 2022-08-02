package org.polymorphismEx;

public class MethodOverloadingEx {
     
	    // 1. change number of parameters
	   public void addition () {
		   int a=10, b=20;
		   int sum = a+b;
		   System.out.println("sum ="+sum);
		   
		   }
               public int addition (int a) {
            	   return a+10;
            	   
               }
               public int addition (int a, int b) {
            	   return a+b;
            	   
               }
               public int addition (int a, int b, double c) {
            	   return (int) (a+b+c);
            	   
               }


}
