package org.BasicPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex2 {
	
	WebDriver driver;
	String path = System.getProperty("user.dir");

	public static void main(String[] args) {
		System.err.println("**   Program starts   **");
		
		
		
		System.err.println("**   Program Ends   **");
	}
	public WebDriver OpenBrowser (String bName) {
		switch (bName) {
		case "ch":
		case "CH":
		case "chrome":
		System.setProperty("webdriver.chrome.driver",path+"\\Driver\\chromedriver.exe");
	//	ChromeDriver objH = new ChromeDriver (); 
		driver = new ChromeDriver (); // upcasting
		break;
		
		case "ff":
		case "FF":
		case "fireFox":
	    System.setProperty("webdriver.gecko.driver",path+"\\Driver\\geckodriver.exe");
	//    FirefoxDriver objff = new  FirefoxDriver ();
	    driver = new FirefoxDriver ();   // upcasting
	    break ; 
		case "edge":
		case "EDGE":
	    System.setProperty("webdriver.edge.driver",path+"\\Driver\\msedgedriver.exe");
	 //   EdgeDriver objEdge = new EdgeDriver ();
	    driver = new EdgeDriver (); // upcasting
	    break;
	    default : System.out.println("Invalid Browser !!!");
		}
		return driver;
	}

}
