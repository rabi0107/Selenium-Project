package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testprioritytestng 
{
  @Test(priority =2)
  public void f2() throws InterruptedException 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\Automation Program Important Drivers\\Drivers\\Geckodrivers\\geckodriver.exe");
		WebDriver w = new FirefoxDriver();
		w.get("https://www.facebook.com/");
		w.manage().window().maximize();
		w.findElement(By.cssSelector("input.inputtext[data-testid=royal_email]")).sendKeys("ravism.365@rediffmail.com");
		Thread.sleep(2000);
		w.close();
	  
  }
  @Test(priority=1)
  public void f1() throws InterruptedException
  {

	  System.setProperty("webdriver.gecko.driver", "D:\\Automation Program Important Drivers\\Drivers\\Geckodrivers\\geckodriver.exe");
		WebDriver w = new FirefoxDriver();
		w.get("http://www.automationpractice.pl/index.php");
		w.findElement(By.xpath("//input[@name='search_query']")).sendKeys("t-shirts");
		Thread.sleep(2000);
		w.close();
  }
}
