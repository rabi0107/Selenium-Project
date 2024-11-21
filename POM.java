package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class POM
{
	WebDriver w;
	By un = By.name("userName");
	By pwd = By.name("password");
	By submit =By.name("submit");
	By Flight = By.linkText("Flights");
	
	public void openbrowser(String location)
	{
		if(location.contains("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", location);
			w =new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.gecko.driver", location);
			w= new FirefoxDriver();
		}
		
	}
	public void loginproces(String link, String user, String password)
	{
		w.get(link);
		System.out.println("website is opened");
		w.findElement(un).sendKeys(user);
		System.out.println("username typed");
		w.findElement(pwd).sendKeys(password);
		System.out.println("Password is typed");
		w.findElement(submit).click();
		
		
	}
	public void flightprcoess()
	{
		w.findElement(Flight).click();
		System.out.println("Flight option");
	}
	public void closeall()
	{
		w.quit();
	}
	

	public static void main(String[] args) 
	{
		POM w =new POM();
		w.openbrowser("D:\\Automation Program Important Drivers\\Drivers\\Geckodrivers\\geckodriver.exe");
		w.loginproces("https://demo.guru99.com/test/newtours/", "test1", "test1");
		w.flightprcoess();
		w.closeall();

	}

}
