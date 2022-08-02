package org.ThreadingEx;

public class Ex1 extends Thread {

	public static void main(String[] args) {
		System.out.println("**    Program Starts  **");
		Ex1 obj = new Ex1 ();
		obj.test1();
		System.out.println("*******************");
		for (int k=1; k<11; k++) {
			System.out.println("k = "+k);
		}
		System.out.println("**    Program Ends  **");
	}
	public void test1 ()  {
		System.out.println("*   test1 Starts  *");
		for (int i=1; i<11; i++) {
			System.out.println("i = "+i);
		}
		System.out.println("*   test1 Ends  *");
	}
	

}
