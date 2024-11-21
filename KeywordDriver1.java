package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeywordDriver1
{
	static WebDriver w;
	public WebElement locators(String locator, String value)
	{
		WebElement we;
		switch(locator)
		{
		case "id" : we =w.findElement(By.id(value));
		break;
		case "name" : we =w.findElement(By.id(value));
		break;
		case "linktext" :we =w.findElement(By.id(value));
		break;
		case "className" : we =w.findElement(By.className(value));
		break;
		case "partialLinkText" : we =w.findElement(By.partialLinkText(value));
		break;
		default :we =null;
		System.out.println("Invalid locator");	
		}
		return we;
		
	}

	public static void main(String[] args) 
	{
		KeywordDriver1 k =new KeywordDriver1();
		System.setProperty("webdriver.gecko.driver", "D:\\Automation Program Important Drivers\\Drivers\\Geckodrivers//"
				+ "geckodriver.exe");
		 w =new FirefoxDriver();
		 w.get("https://demo.guru99.com/test/newtours/");
		 k.locators("name", "userName").sendKeys("test1");
		 k.locators("name", "password").sendKeys("test1");
		 k.locators("name", "submit").click();
		 if(w.getTitle().contains("Login: Mercury Tours"))
		 {
			 k.locators("linkText","SIGN-OFF").click();
			 System.out.println("sign in");
		 }
		 else
		    {
		    	System.out.println("not log in");
		    }
		    w.close();
		 
		 
	} 

}
