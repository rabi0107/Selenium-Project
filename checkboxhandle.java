package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkboxhandle {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Automation Program Important Drivers\\Drivers\\Geckodrivers\\geckodriver.exe");
		WebDriver w =new FirefoxDriver();
		w.get("https://artoftesting.com/samplesiteforselenium");
		w.findElement(By.className("Automation")).click(); //For check box
		w.findElement(By.className("Performance")).click();
		
		WebElement rr=w.findElement(By.name("gender")); //for Radio
		rr.click();
		
		

	}

}
