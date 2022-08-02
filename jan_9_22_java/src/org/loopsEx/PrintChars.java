package org.loopsEx;

public class PrintChars {

	public static void main(String[] args) {
		for (char ch = 'A'; ch<='Z'; ch++) {
			System.out.println(ch);
			
		}
		System.out.println("*********");
		for (char ch = 'A'; ch<='Z'; ch++) {
			System.out.println(ch + "= "+(int)ch);
		}
			

	}

}
