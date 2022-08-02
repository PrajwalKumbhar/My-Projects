package org.DropDownHandling;


import org.Utilites.BaseUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WithoutSelectSingleEx {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("**   Program Starts  **");
		BaseUtility bu = new BaseUtility ();
		String url="https://demoqa.com/select-menu";
		WebDriver driver = bu.StartUp("ch", url);
		
	    WebElement ddlEle = driver.findElement(By.cssSelector("#withOptGroup, css-1hwfws3"));
	    ddlEle.click();
	    Thread.sleep(1000);
	    System.out.println(driver.getPageSource());
	    
	    driver.findElement(By.xpath("//*[text()='Group 2, option 2']")).click();
	    driver.close();
	    
	    	System.out.println("**   Program Ends  **");
	
	}
	}
          


