package org.method;

public class ReturnInt2 {
	public int addition () {
		int a=555, b=666;
		int sum = a+b;
		System.out.println("sum = "+sum);
		
		return sum;     // voild
		
		}
	
		public static void main(String[] args) {
			System.out.println("**     Program Starts    **");
			
			ReturnInt2 obj = new ReturnInt2 ();
			obj.addition();  
			
			System.out.println("**     Program Ends    **");
}
		
}