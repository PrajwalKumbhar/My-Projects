package org.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CompileTimeEx1 {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.out.println("path = "+path);
		try {
		FileInputStream fis =
			//	new FileInputStream ("D:\\Acceleration\\jan_9_22_java\\files\\TextData.txt");
		    new FileInputStream (path +"\\files\\TextData.txt");
		fis.read();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
		
	}

}
