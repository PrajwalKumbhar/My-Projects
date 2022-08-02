package org.loopsEx;

public class EvenOrOddFor {

	public static void main(String[] args) {
		for (int i=0; i<=10; i+=2) {
			System.out.println(i);     //even numbers 
			
		}
		System.out.println("*********");
		for (int i=1; i<=10; i+=2) {
			System.out.println(i);     //odd numbers
		}
		System.out.println("***********");
		for (int i=0; i<=10; i++) {
			if ((i%2)==0) {
				System.out.println(i);   // ifelse conditon even numbers
			}
		}
	}

}
