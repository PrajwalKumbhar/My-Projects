package org.method;

public class ReturnInt3 {
	public int addition () {
		int a=10, b=20;
		return a+b;     // voild

	}

	public static void main(String[] args) {
		System.out.println("**     Program Starts    **");

		ReturnInt3 obj = new ReturnInt3 ();
		int sum = obj.addition();  
		System.out.println("Addition = "+sum);
		int result = sum-5;

		System.out.println("**     Program Ends    **");
	}
	 public int subtraction () {
		int a=50, b=30;
		return a-b;

	}
}