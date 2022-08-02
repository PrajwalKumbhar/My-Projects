package org.method;

public class SysoutMethod {
	public int addition () {
		int a=10, b=20;
		return a+b;     // voild

	}

	public static void main(String[] args) {
		System.out.println("**     Program Starts    **");

		SysoutMethod obj = new SysoutMethod ();
		System.out.println( obj.addition() );
        System.out.println("sum = "+ obj.addition() );
     //   System.out.println(obj. test ()); // ERROR
        
		System.out.println("**     Program Ends    **");
}
	public void test () {
		System.out.println(" Test ");
	}
}