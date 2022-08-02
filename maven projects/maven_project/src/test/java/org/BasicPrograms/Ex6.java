package org.BasicPrograms;


import org.Utilites.BaseUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Ex6 {

	public static void main(String[] args) {
		System.out.println("**   Program Starts  **");
		BaseUtility bu = new BaseUtility ();
		String url="http://localhost:90/user/submit_tt.do";
		WebDriver driver = bu.StartUp("ch", url);
		String expUrl = "http://localhost:90/login.do";
		String actUrl = driver.getCurrentUrl();
		if (expUrl.equals(actUrl)) {
			System.out.println("Login URL matched");
		} else {
			System.out.println("Login URL Not matched");
		}
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		
	    bu.WaitForVisibilityofLocatedBy(driver, "xpath","//a[@id='logoutlink']",10);
	    
	    expUrl = "http://localhost:90/user/submit_tt.do";
	    actUrl = driver.getCurrentUrl();
		if (expUrl.equals(actUrl)) {
			System.out.println("DashBord URL matched");
		} else {
			System.out.println("DashBord URL Not matched");
		}
	  
	//	driver.findElement(By.id("logoutLink")).click();
	    	driver.close();
	    	System.out.println("**   Program Ends  **");
	
	}
	}
          


