package org.ThreadingEx;

public class Ex3 implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("**    Program Starts  **");
		Ex3 obj = new Ex3 ();
		Thread obj1 = new Thread (obj);
		obj1.start();
	//	obj.run();
	//	Thread.sleep(2000);
		System.out.println("*******************");
		for (int k=1; k<11; k++) {
			System.out.println("k = "+k);
		}
		System.out.println("**    Program Ends  **");
	}
	public void run()  {
		System.out.println("*   test1 Starts  *");
		for (int i=1; i<11; i++) {
			System.out.println("i = "+i);
		}
		System.out.println("*   test1 Ends  *");
	}
	

}
