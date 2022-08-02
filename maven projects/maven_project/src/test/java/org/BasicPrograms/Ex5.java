package org.BasicPrograms;


import org.Utilites.BaseUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ex5 {

	public static void main(String[] args) {
		System.out.println("**   Program Starts  **");
		BaseUtility bu = new BaseUtility ();
		String url="http://localhost:90/user/submit_tt.do";
		WebDriver driver = bu.StartUp("ch", url);
		String expTitle = "actiTIME - Login";
		String actTitle = driver.getTitle();
		if (expTitle.equals(actTitle)) {
			System.out.println("Login Title matched");
		} else {
			System.out.println("Login Title Not matched");
		}
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		
	    bu.WaitForVisibilityofLocatedBy(driver, "xpath","//a[@id='logoutlink']",10);
	    
	    WebElement tabName = driver.findElement(By.xpath("//a[div[text ()='TIME-TRACK'] ]"));
	   
	    String attribvalue = tabName.getAttribute("class");
	    	if (attribvalue.contains("selected")) {
	    		System.out.println("selected ele :"+tabName.getText());
	    	}
	    
	//	driver.findElement(By.id("logoutLink")).click();
	    	driver.close();
	    	System.out.println("**   Program Ends  **");
	
	}
	}
          


