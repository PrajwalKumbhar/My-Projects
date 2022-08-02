package org.narrowingWidening;

public class CharToIntViceversa {

	public static void main(String[] args) {
		char ch = 'A';
		int i = ch;     // implicit
		int k = (int)ch;    // explicit
		System.out.println("i = "+i);
		System.out.println("k = "+k);

		char ch3 = 'Z';
		int i3 = ch3;    
		int k3 = (int)ch3;   
		System.out.println("i3 = "+i3);
		System.out.println("k3 = "+k3);

		//ascii value of char
		// A TO Z = 65 to 90
		// a To z = 97 to 122    

		char ch1 = 'a';
		int i1 = ch1;     
		int k1 = (int)ch1;    
		System.out.println("i1 = "+i1);
		System.out.println("k1 = "+k1);

		char ch2 = 'z';
		int i2 = ch2;     
		int k2 = (int)ch2;    
		System.out.println("i2 = "+i2);
		System.out.println("k2 = "+k2);

		char ch4 = 'D';
		int i4 = ch4;     
		int k4 = (int)ch4;    
		System.out.println("i4 = "+i4);
		System.out.println("k4 = "+k4);		
		



	}

}
