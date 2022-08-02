package org.DropDownHandling;


import org.Utilites.BaseUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectEx1 {

	public static void main(String[] args) {
		System.out.println("**   Program Starts  **");
		BaseUtility bu = new BaseUtility ();
		String url="https://demoqa.com/select-menu";
		WebDriver driver = bu.StartUp("ch", url);
		
	    WebElement singleDDL = driver.findElement(By.id("oldSelectMenu"));
	    Select sel = new Select (singleDDL);
	    sel.selectByVisibleText("Purple");
	  //  sel.selectByIndex(7);
	 //   sel.selectByValue(10);
	  
	    driver.close();
	    
	    	System.out.println("**   Program Ends  **");
	
	}
	}
          


