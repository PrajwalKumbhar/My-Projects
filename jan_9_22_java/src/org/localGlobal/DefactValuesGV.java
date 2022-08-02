package org.localGlobal;

public class DefactValuesGV {
	byte b;       // delered all golobal variables
	int i;
	long l;
	float f;
	double  d;
	double value ;
	char ch;
	boolean flag ;
	public static void main(String[] args) {
		System.out.println("**    Program Satrts   **");
		DefactValuesGV obj1 = new DefactValuesGV ();
		System.out.println(obj1.b);
		System.out.println(obj1.i);
		System.out.println(obj1.l);
		System.out.println(obj1.f);
		System.out.println(obj1.d);
		System.out.println(obj1.value);
		System.out.println(obj1.ch);
		System.out.println(obj1.flag);
		System.out.println("**      Program End    **");
		
	}

}
