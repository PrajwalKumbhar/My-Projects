package org.polymorphismEx;

public class MethodOverloadingEx3 {

	// 2. change position of parameters
	public int addition(int x, int y, int z) {
		System.out.println("int x= "+x);
		System.out.println("float y= "+y);
		System.out.println("double z= "+z);
		return (int) (x+y+z);

	}

	public int addition(float a, int b, double c) {
		System.out.println("int b= "+b);
		System.out.println("float a= "+a);
		System.out.println("double c= "+c);
		return (int)(a+b+c);

	}

	public int addition(double a, int b, float c) {
		System.out.println("int b= "+b);
		System.out.println("float c= "+c);
		System.out.println("double a= "+a);
		return (int)(a+b+c);

	}
       public static void main(String[] args) {
    	   MethodOverloadingEx3 obj = new MethodOverloadingEx3 ();
    	   obj.addition(99.77, 10, 88.44f);
    	//   obj.addition(10,88.44f, 99.77);
    	   obj.addition(88.44f, 10, 99.77);

       }
}
