package org.BasicPrograms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("**   Program Strats   **");
		String path = System.getProperty("user.dir");
		
	  System.setProperty("webdriver.chrome.driver",path+"\\Driver\\chromedriver.exe");
			 //  webDriverManeger.Chromedriver().setup();	
		
		ChromeDriver obj = new ChromeDriver ();
		Ex1 obj1 = new Ex1();
		obj1.testFF();

		System.out.println("**   Program Ends   **");
	}
	 public void testFF () {
		 String path = System.getProperty("user.dir");
		 System.setProperty("webdriver.gecko.driver",path+"\\Driver\\geckodriver.exe");
	//	 WebDriverManager.Firefoxdriver().setup();
		 FirefoxDriver obj = new FirefoxDriver();
		 
	 }
	 public void testEdge () {
		 String path = System.getProperty("user.dir");
		 System.setProperty("webdriver.edge.driver",path+"\\Driver\\msedgedriver.exe");
	//	 WebDriverManager.egdedriver().setup();
		 EdgeDriver obj = new EdgeDriver();
		 
	 }


}
