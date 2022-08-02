package org.polymorphismEx;

public class MethodOverloadingEx2 {

	// 2. change type of parameters
	public int addition(float a, float b, float c) {
		return (int) (a + b + c);

	}

	public int addition(short a, short b, byte c) {
		return a + b + c;

	}

	public int addition(int a, int b, double c) {
		return (int) (a + b + c);

	}

	public int addition (char a, char b, char c) {
            	   return a+b+c;
            	   
	}

}
