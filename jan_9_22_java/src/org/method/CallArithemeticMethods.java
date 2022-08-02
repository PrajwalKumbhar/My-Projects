package org.method;

public class CallArithemeticMethods {

	public static void main(String[] args) {
		ArithemeticCoperations obj = new ArithemeticCoperations ();
		int sum = obj. addition (10,20);
		System.out.println("sum = "+sum);
		
		float sub = obj. subtraction (88, 10);
		System.out.println("subtraction = "+sub);
		 
		float mul = obj.multiplication (55.44f, 10.11f);
		System.out.println("multiplication = "+mul);
		
		float div = obj.division (70, 2.5f);
		System.out.println("division = "+div);
		
		obj.test1 ('A' , true);
		
		
	}
     
}
