package org.DropDownHandling;


import org.Utilites.BaseUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectEx1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("**   Program Starts  **");
		BaseUtility bu = new BaseUtility ();
		String url="https://demoqa.com/select-menu";
		WebDriver driver = bu.StartUp("ch", url);
		
		driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
	    Thread.sleep(1000);
	    WebElement multiDDL = driver.findElement(By.id("cars"));
	    Select sel = new Select (multiDDL);
	    sel.selectByVisibleText("Volvo");
	    sel.selectByIndex(3);
	    sel.selectByValue("opel");
	  
	 //   driver.close();
	    
	    	System.out.println("**   Program Ends  **");
	
	}
	}
          


