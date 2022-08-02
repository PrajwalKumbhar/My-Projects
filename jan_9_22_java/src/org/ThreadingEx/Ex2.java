package org.ThreadingEx;

public class Ex2 extends Thread {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("**    Program Starts  **");
		Ex2 obj = new Ex2 ();
		obj.start();
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
