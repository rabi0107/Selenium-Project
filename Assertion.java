package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assertion
{
 WebDriver w;
  @BeforeMethod
  public void setup() 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\Automation Program Important Drivers\\Drivers\\Geckodrivers\\geckodriver.exe");
		WebDriver w =new FirefoxDriver();
		w.get("https://opensource-demo.orangehrmlive.com/");
}
  @Test(priority=2)
  public void logotest()
  {
	  WebElement logo =w.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"));
	  Assert.assertTrue(logo.isDisplayed());
	 
	  
	  
  }
  @Test(priority=1)
  public void tittle()
  {
	  String tittle =w.getTitle();
	  Assert.assertEquals("OrangeHRM", tittle);
  }
}
