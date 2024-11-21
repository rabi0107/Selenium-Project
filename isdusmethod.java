package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class isdusmethod {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Automation Program Important Drivers\\Drivers\\Geckodrivers\\geckodriver.exe");
		WebDriver w = new FirefoxDriver();
		w.get("https://demo.nopcommerce.com/");
		WebElement searchstore=w.findElement(By.xpath("//input[@id='small-searchterms']"));
		System.out.println("Display status:"+searchstore.isDisplayed());
		System.out.println("Enabled status :"+searchstore.isEnabled());
		Thread.sleep(1000);
		
		w.close();

	}

}
