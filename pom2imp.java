package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pom2imp 
{
	WebDriver w;
	
	By user =By.id("user-name");
	By pwd = By.id("password");
	By log = By.id("login-button");
	By cart = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	By menu =By.xpath("//button[@id='react-burger-menu-btn']");
	By about = By.xpath("//a[@id='about_sidebar_link']");
	
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
	public void linkopen(String link)
	
	{
		w.get(link);
	}
	public void username(String usern)
	{
		w.findElement(user).sendKeys(usern);
		System.out.println("username typed");
	}
	public void password(String pass)
	{
		w.findElement(pwd).sendKeys(pass);
		System.out.println("password is typed");
	}
	public void login()
	{
		w.findElement(log).click();
		System.out.println("click on sumbit button");
	}
	public void caroption()
	{
		w.findElement(cart).click();
	}
	public void menuoption()
	{
		w.findElement(menu).click();
	}
	public void about()
	{
		w.findElement(about).click();
	}
	
	

	public static void main(String[] args) throws InterruptedException 
	{
		pom2imp p =new pom2imp();
		p.openbrowser("D:\\Automation Program Important Drivers\\Drivers\\Geckodrivers\\geckodriver.exe");
		p.linkopen("https://www.saucedemo.com/");
		p.username("standard_user");
		p.password("secret_sauce");
		p.login();
		Thread.sleep(2000);
		p.caroption();
		Thread.sleep(2000);
		p.menuoption();
		Thread.sleep(2000);
		p.about();
	

	}

}
