package Selenium_Practice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class wwhandles {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Automation Program Important Drivers\\Drivers\\Geckodrivers\\geckodriver.exe");
		WebDriver w =new FirefoxDriver();
		w.navigate().to("https://www.hyrtutorials.com/p/window-handles-practice.html");
		w.manage().window().maximize();
		String parenti =w.getWindowHandle();
		System.out.println("parent window - " +parenti);
		Set<String> parnetchild=w.getWindowHandles();
		System.out.println("parnetchildid - " +parnetchild);
		for(String parenti1 : parnetchild)
		{
			System.out.println(parenti1);
		}
		w.close();
		
		

	}

}
