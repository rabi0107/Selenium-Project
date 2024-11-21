package Selenium_Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowhamlesdd {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Automation Program Important Drivers\\Drivers\\Geckodrivers\\geckodriver.exe");
		WebDriver w =new FirefoxDriver();
		w.navigate().to("https://demo.automationtesting.in/Windows.html");
		String main =w.getWindowHandle();
		System.out.println("main window id is :"+main);
		String ss=w.getTitle();
		System.out.println("title of main window :"+ss);
		w.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]")).click();
		w.navigate().refresh();
		w.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]")).click();
		Set <String> windows =w.getWindowHandles();
		Iterator<String> iter =windows.iterator();
		String mainw=iter.next();
		String tab =iter.next();
		w.switchTo().window(tab);
		String tittle =w.getTitle();
		System.out.println("tittle of child :"+tittle);
		w.quit();
	}

}
