package org.method;

public class Ex1 {
	int a=10;
	public void test1 () {   //non-static method
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");

	} 
	public static void test2 () {   // static method
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
	}
	public static void main(String[] args) {   // static
		System.out.println("Hii");
		Ex1 obj1 = new Ex1 ();
		//System.out.println("a=" +obj1.a);
		obj1.test1 ();
		System.out.println("Hello");
		obj1.test1 ();
		System.out.println("Good Morning");
		obj1.test1 ();
		obj1.addition ();
	}
	public void addition () {
		System.out.println("Hello From addition");
		int x=20, y=30;
		int sum = x+y;
		System.out.println(" sum ="+sum);

	}
}
