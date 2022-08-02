package org.method;

public class ReturnInt {

	public int addition () {
		int a=555, b=666;
		int sum = a+b;
		float sumf = 99.99f + 77.10f;
		System.out.println("sum = "+sum);
		//return 30;
		// return sumf;     // ERROR
		// return sum;  // voild
		return a+b;     // voild
		// System.out.println(" Returning Control ");  // ERROR, Unrechabal code
		
		}
	
		public static void main(String[] args) {
			System.out.println("**     Program Starts    **");
			
			ReturnInt obj = new ReturnInt ();
			obj.addition();  
			
			System.out.println("**     Program Ends    **");

	}

}
