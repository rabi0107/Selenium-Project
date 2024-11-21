package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class enableddislpayed {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Automation Program Important Drivers\\Drivers\\Geckodrivers\\geckodriver.exe");
		WebDriver w =new FirefoxDriver();
		w.get("https://demo.nopcommerce.com/");
		// Is Displayed Is Enabled for checking element is disabled /enabled
		WebElement dis= w.findElement(By.xpath("//input[@id='small-searchterms']"));
		System.out.println("displayed status :"+dis.isDisplayed());
		System.out.println("Enabled or not :"+dis.isEnabled());
		
		// Is Selected for selecting radio checkbox and dropdown
		w.findElement(By.linkText("Register")).click();
		
		WebElement male =w.findElement(By.xpath("//input[@id='gender-male']")); 
		WebElement female =w.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println("selecting radio male :"+male.isSelected()); //false
		System.out.println("selecting radio female :"+female.isSelected()); //false
		
		male.click();
		System.out.println("selecting radio male :"+male.isSelected()); //true
		System.out.println("selecting radio female :"+female.isSelected()); //false
		
		female.click();
		
		System.out.println("selecting radio male :"+male.isSelected()); //false
		System.out.println("selecting radio female :"+female.isSelected()); //true
		
		
		Thread.sleep(2000);
		w.close();
		

	}

}
