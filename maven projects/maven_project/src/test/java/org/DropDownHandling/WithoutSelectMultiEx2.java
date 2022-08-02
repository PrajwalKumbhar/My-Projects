package org.DropDownHandling;


import org.Utilites.BaseUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WithoutSelectMultiEx2 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("**   Program Starts  **");
		BaseUtility bu = new BaseUtility ();
		String url="https://demoqa.com/select-menu";
		WebDriver driver = bu.StartUp("ch", url);
		// Scroll till dropdown
		
		driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
	    Thread.sleep(1000);

	    WebElement ddlEle = driver.findElement(By.xpath("//div[p[b[text()='Multiselect drop down']]]//div[@class= ' css-1hwfws3']"));

	    ddlEle.click();
	    Thread.sleep(1000);
	    System.out.println(driver.getPageSource());
	    
	    driver.findElement(By.xpath("//div[text()='Green']")).click();
	  //  Thread.sleep(2000);
	    driver.findElement(By.xpath("//[text()='Red']")).click();
	  //  Thread.sleep(2000);


	  //  driver.close();
	    
	    	System.out.println("**   Program Ends  **");
	
	}
	}
          


