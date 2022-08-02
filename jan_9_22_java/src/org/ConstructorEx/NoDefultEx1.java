package org.ConstructorEx;

public class NoDefultEx1 {

	public static void main(String[] args) {
		NoDefultEx1 obl1 = new NoDefultEx1 (10,20); 
	//	NoDefultEx1 obl1 = new NoDefultEx1 (); // ERROR
			
	}
	public NoDefultEx1 (int a, int b) {
		System.out.println("Para Con- int,int");
	}

}
