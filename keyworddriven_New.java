package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class keyworddriven_New
{
	static WebDriver w;
	public WebElement locators(String locator, String value)
	{
		WebElement we;
		switch(locator)
		{
		case "id" : we =w.findElement(By.id(value));
		break;
		case "name" : we= w.findElement(By.name(value));
		break;
		case "linkText" : we=w.findElement(By.linkText(value));
		break;
		default : we =null;
		System.out.println("locator not found");
		
		}
		return we;
		
		
	}

	public static void main(String[] args) throws InterruptedException 
	{
		keyworddriven_New j = new keyworddriven_New();
		System.setProperty("webdriver.gecko.driver", "D:\\Automation Program Important Drivers\\Drivers\\Geckodrivers//geckodriver.exe");
		w= new FirefoxDriver();
		w.get("https://www.saucedemo.com/");
		j.locators("id", "user-name").sendKeys("standard_user");
		j.locators("id", "password").sendKeys("secret_sauce");
		j.locators("id", "login-button").click();
		if(w.getTitle().contains("Swag Labs"))
		{
			j.locators("linkText","stylesheet").click();
			System.out.println("succesffully log in");
		}
		else
		{
			System.out.println("not log in");
		}
		Thread.sleep(2000);
		w.close();

	}

}
