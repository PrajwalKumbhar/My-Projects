package org.BasicPrograms;

import org.Utilites.BaseUtility;
import org.openqa.selenium.WebDriver;

public class Ex3 {

	public static void main(String[] args) {
		System.err.println("**  Program Starts  **");
		BaseUtility bu = new BaseUtility ();
		String url="https://www.google.com";
		WebDriver driver = bu.StartUp("ch" , url);
	
		System.err.println("**  Program Ends  **");
	}
	
 
}
