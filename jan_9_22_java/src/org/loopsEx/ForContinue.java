package org.loopsEx;

public class ForContinue {

	public static void main(String[] args) {
        
		System.out.println("** Program Start");
		  for (int i=1; i<=10; i++) {
			  if (i==5 || i==3 || i==7) {
				  continue;
			  }
			  System.out.println(i);
	}
		  System.out.println("** Program Ends");
	

	}
	
}