package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Automation Program Important Drivers\\Drivers\\Geckodrivers\\geckodriver.exe");
		WebDriver w =new FirefoxDriver();
		/*w.get("http://www.automationpractice.pl/index.php");
		w.manage().window().maximize();
		w.findElement(By.xpath("//input[@class='search_query form-control ac_input']")).sendKeys("t-shirts");
		w.findElement(By.xpath("//button[@name='submit_search']")).click();*/
		
		w.get("https://www.facebook.com/");
		w.manage().window().maximize();
		//w.findElement(By.cssSelector("#email")).sendKeys("9120289011");  tag and Id
		w.findElement(By.cssSelector(".inputtext")).sendKeys("9130289011"); //tag and class
		w.findElement(By.cssSelector("#pass")).sendKeys("123");
		w.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
