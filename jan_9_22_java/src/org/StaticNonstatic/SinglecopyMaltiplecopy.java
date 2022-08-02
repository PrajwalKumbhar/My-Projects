package org.StaticNonstatic;

public class SinglecopyMaltiplecopy {
    int a = 10;  // non static golobal variables
    long AccNum ;
    static int b = 77; //static global variables
   
	public static void main(String[] args) {
		SinglecopyMaltiplecopy obj1 = new SinglecopyMaltiplecopy ();
		SinglecopyMaltiplecopy obj2 = new SinglecopyMaltiplecopy ();
		System.out.println("obj1.a = "+obj1.a);
		obj1.a = 1000;
		System.out.println("obj1.a = "+obj1.a);
		System.out.println("obj2.a = "+obj2.a);
		System.out.println("b = "+SinglecopyMaltiplecopy.b);
		SinglecopyMaltiplecopy.b = 99;
		System.out.println("b = "+b);
		System.out.println("obj1.b = "+obj1.b);
		System.out.println(SinglecopyMaltiplecopy.b);
		
		
		


	}

}
