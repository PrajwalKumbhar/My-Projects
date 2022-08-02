package org.loopsEx;

public class WhileExBreakContinue {

	public static void main(String[] args) {
          System.out.println("**  Programs Starts   **");
          int i=1;
          while (i<=10) 
          {
        	  if (i==5) {
        		//  break;
        		  i++;
        		  continue;
        	  }
        	  System.out.println(i);
        	  i++;
        	  
          }
	       System.out.println("**  Programs Ends  **");
	}
}
