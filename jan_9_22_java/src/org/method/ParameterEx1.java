package org.method;

public class ParameterEx1 {

	public static void main(String[] args) {
		System.out.println("**    Program Starts    **");
		ParameterEx1 obj = new ParameterEx1 ();
		obj.addition (10,20);
		obj.addition (30,40);	
		obj.addition (70,90);
		obj.addition (500,900);
		
		System.out.println("**    Program Ends    **");
	}
     public void addition (int a, int b) {
     // int a=10,b=20;   // define
    	 int sum = a+b;
    	 System.out.println("sum = "+sum);
}
     
}