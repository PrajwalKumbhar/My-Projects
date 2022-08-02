package org.AbstractionEx;

   abstract class Abs2 {
	   abstract public void addition (int a, int b);
	   abstract public void subtraction (float a, float b);
   }

    public class AbsInheretanceEx2 extends Abs2 {
    	
	 public void addition (int a, int b) {
		 System.out.println("sum = "+ (a+b));
	 }
	 public void  subtraction (float a, float b) {
		 System.out.println("sub = "+ (a-b));
	 }
    
	public static void main(String[] args) {
		
      
	}

}
