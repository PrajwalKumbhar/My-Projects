package org.Utilites;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseUtility {

	public WebDriver StartUp (String bName, String url) {
		String path = System.getProperty("user.dir");

		WebDriver driver= null;
		if (bName.equalsIgnoreCase("ch")||bName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver",path+"\\Driver\\chromedriver.exe");
		driver = new ChromeDriver (); 
		
		} else if(bName.equalsIgnoreCase("ff")||bName.equalsIgnoreCase("Firefox")) {
     System.setProperty("webdriver.gecko.driver",path+"\\Driver\\geckodriver.exe");
     driver = new FirefoxDriver ();   // upcasting
	} 
	else if(bName.equalsIgnoreCase("edge")) {
    System.setProperty("webdriver.edge.driver",path+"\\Driver\\msedgedriver.exe");
    driver = new EdgeDriver (); // upcasting
	}
	else {
		System.err.println("Invalid Browser !!!");
	}
		driver.manage() .window().maximize();
		//selenium 4 onwords
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//upto selenium 3
	//	driver.manage().window().maximize();  // selenium 4
	//	driver.manage().window().setSize(new Dimension(400,400));
		
	  driver.get(url);
	return driver;
   }
	public void WaitForVisibilityofWebElement(WebDriver driver,WebElement ele, int time) {
		WebDriverWait wt = new WebDriverWait (driver, Duration.ofSeconds(time));
		wt.until(ExpectedConditions.visibilityOf(ele));
	}
	public void WaitForVisibilityofLocatedBy(WebDriver driver, String locType, String locator, int time) {
		WebDriverWait wt = new WebDriverWait (driver, Duration.ofSeconds(time));
		switch (locType) {
		case "xpath": wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
		   break;
		case "css": wt.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
		   break;
		case "id": wt.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
		   break;
		case "clss": wt.until(ExpectedConditions.visibilityOfElementLocated(By.className(locator)));
		   break;
		}
	}

	}


