package org.BasicPrograms;


import org.Utilites.BaseUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Basic3Methos {

	public static void main(String[] args) {
		System.out.println("**   Program Starts  **");
		BaseUtility bu = new BaseUtility ();
		String url="https://demoqa.com/radio-button";
		WebDriver driver = bu.StartUp("ch", url);
		
		WebElement noBtn = driver.findElement(By.id("noRadio"));
		System.out.println("enabled = "+noBtn.isEnabled());
		
		WebElement yesLabel = driver.findElement(By.cssSelector("label[for='yesRadio']"));
		System.out.println("dislayed = "+yesLabel.isDisplayed());
		yesLabel.click();
		
		WebElement yesBtn = driver.findElement(By.id("yesRadio"));
		System.out.println("selected = "+yesBtn.isSelected());
	       
		   driver.close();
	 
	    	System.out.println("**   Program Ends  **");
	
	}
	}
          


