package org.loopsEx;

public class NestedForloop2 {

	public static void main(String[] args) {
		System.out.println("** Program Starts");
		for (int i=1; i<=3; i++) 
		{
		   for (int k=1; k<=3; k++)
		   {
			   System.out.println(i+ " "+k);
		   }
		   System.out.println();
		   }
		System.out.println("** Program Ends");
	}

}
