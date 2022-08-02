package org.ConditionalStatments;

public class MarksIfElse1 {
	
	public static void main(String[] args) {
		  // marks < 40 --> Fail
		  // marks < 50 --> Pass
		  // marks < 60 --> Second Class
		  // marks < 66 --> First Class
		  // marks > 66 --> Distinction
		
		int marks = 55;
		if (marks <40) {
			System.out.println(" FALL");
		}else if (marks <50) {
			System.out.println("PASS Class");
		}else if (marks <60) {
			System.out.println("Second Class");
		}else if (marks <66) {
			System.out.println("First Class");
		}else {
			System.out.println("Distintion");
		}
	}
     
}
