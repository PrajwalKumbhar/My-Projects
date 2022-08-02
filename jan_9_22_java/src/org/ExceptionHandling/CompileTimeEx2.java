package org.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CompileTimeEx2 {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.out.println("path = "+path);
		try {
		FileInputStream fis =
		   new FileInputStream (path +"\\files\\TextData.txt");
		//new FileInputStream ("D:\\Acceleration\\jan_9_22_java\\files\\TextData.txt");

		
		fis.read();
	
	} catch (IOException e) {
		e.printStackTrace();
	}/* catch (FileNotFoundException e) {      //Unrechable Code
		e.printStackTrace();
	}*/
		
	}

}
