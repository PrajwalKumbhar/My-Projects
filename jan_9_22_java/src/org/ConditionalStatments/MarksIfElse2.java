package org.ConditionalStatments;

public class MarksIfElse2 {

	public static void main(String[] args) {
		  // marks < 40 --> Fail
		  // marks < 50 --> Pass
		  // marks < 60 --> Second Class
		  // marks < 66 --> First Class
		  // marks > 66 --> Distinction
		
		int marks = 55;
		if (marks >=40) {
			if (marks >=50) {
				if (marks >=60) {
					if (marks >=66) {
						System.out.println("Distintion");
					}else {
						System.out.println(" Fist Class");
					}
					}else {
						System.out.println("Second Class");
					}
					}else {
						System.out.println("Pass Class");
					}
					}else {
						System.out.println("fail");
					}
				}
}
						
					
					
		
	


