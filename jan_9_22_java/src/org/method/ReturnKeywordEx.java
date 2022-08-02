package org.method;

public class ReturnKeywordEx {

	public void addition () {
	int a=10, b=20;
	int sum = a+b;
	System.out.println("sum = "+sum);
	return;     // by defult hidden
	}
	public static void main(String[] args) {
		System.out.println("**     Program Starts    **");
		ReturnKeywordEx obj = new ReturnKeywordEx ();
		obj.addition ();
		System.out.println("**     Program Ends    **");

	}

}
