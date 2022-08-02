package org.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsEx1 {

	public static void main(String[] args) { //throws InterruptedException {
     System.out.println("**  Program Starts  **");
     ThrowsEx1 obj = new ThrowsEx1 ();
     try {
    	 obj.Practice();
     } catch (FileNotFoundException | InterruptedException e) {
    	 e.printStackTrace();
     }
     System.out.println("**  Program Ends  **");
     
     }
	public void Practice () throws InterruptedException, FileNotFoundException {
		
		for (int i=1; i<=10; i++) {
			System.out.println(i);
			if (i==5) {
			Thread.sleep(3000);
		}
	}
	String path = System.getProperty("user.dir");
	FileInputStream fis = 
			new FileInputStream(path +"\\files\\TextData1.txt");
    System.out.println("**  Practice Ends  **");
}
}

