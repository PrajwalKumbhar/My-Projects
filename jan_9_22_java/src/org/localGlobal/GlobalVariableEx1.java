package org.localGlobal;

public class GlobalVariableEx1 {
	byte b=-120;
	int i=10;
	long l=9001;
	float f=11.22f;
	double  d=99.77;
	double value = 77.99;
	char ch='R';
	boolean flag = false;
   public static void main(String[] args) {
	System.out.println("**  Program Starts **");
	GlobalVariableEx1 obj1= new GlobalVariableEx1 ();
	System.out.println(obj1.b);
	System.out.println(obj1.i);
	System.out.println(obj1.l);
	System.out.println(obj1.f);
	System.out.println(obj1.d);
	System.out.println(obj1.value);
	System.out.println(obj1.ch);
	System.out.println(obj1.flag);
	
	System.out.println("**    Program End   **");
}
}
