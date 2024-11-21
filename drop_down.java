package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class drop_down {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Automation Program Important Drivers\\Drivers\\Geckodrivers\\geckodriver.exe");
		WebDriver w =new FirefoxDriver();
		w.get("https://demo.guru99.com/test/newtours/");
		w.findElement(By.name("userName")).sendKeys("test1");
		w.findElement(By.name("password")).sendKeys("test1");
		w.findElement(By.name("submit")).click();
		w.findElement(By.linkText("Flights")).click();
		w.navigate().refresh();
		w.findElement(By.linkText("Flights")).click();
		Thread.sleep(2000);
		Select s;
		
		s =new Select(w.findElement(By.name("fromPort")));
		s.selectByValue("Portland");
		Thread.sleep(2000);
		s.selectByValue("London");
		s= new Select(w.findElement(By.xpath("//select[@name='fromMonth']")));
		s.selectByIndex(1);
		
		s =new Select(w.findElement(By.name("toPort")));
		
		s.selectByVisibleText("Paris");
		
		w.findElement(By.cssSelector("input[value='Business']")).click();
		

	}
	

}
