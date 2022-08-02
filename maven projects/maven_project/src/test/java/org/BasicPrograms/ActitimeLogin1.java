package org.BasicPrograms;

import org.Utilites.BaseUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActitimeLogin1 {

	public static void main(String[] args) {
		System.out.println("**   Program Starts  **");
		BaseUtility bu = new BaseUtility ();
		String url="http://localhost:90/user/submit_tt.do";
		WebDriver driver = bu.StartUp("ch", url);
		
		WebElement uNamefiled = driver.findElement(By.id("username"));
		uNamefiled.sendKeys("admin");
		
		WebElement pwdfiled=driver.findElement(By.cssSelector("input[name='pwd']"));
		pwdfiled.sendKeys("manager");
		
		WebElement loginBtn=driver.findElement(By.cssSelector("#loginButton>div"));
		loginBtn.click();
		
		driver.findElement(By.id("logoutLink")).click();
		driver.close();
		
		System.out.println("**   Program Ends  **");


	}

}
