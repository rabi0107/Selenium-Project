package Selenium_Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowhandles {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Automation Program Important Drivers\\Drivers\\Geckodrivers\\geckodriver.exe");
		WebDriver w =new FirefoxDriver();
		w.get("https://demoqa.com/browser-windows");  // Main window
		w.findElement(By.id("windowButton")).click(); //Child window
		
		// Get window handles
		
		String Mainwindowid =w.getWindowHandle();//return id of main window
		System.out.println("Main windwo id :"+Mainwindowid); 
		Set<String> allwindow =w.getWindowHandles(); //return id of multiple browser
		Iterator<String> it = allwindow.iterator();//return id of all child window
		String parentWindowid =it.next();
		String Childwindowid =it.next();
		System.out.println("Parent window id :"+parentWindowid);
		System.out.println("Child window id :"+Childwindowid);
		
		// How to use window id for switching
		
		w.switchTo().window(parentWindowid);
		Thread.sleep(2000);
		System.out.println("Parent Window tittle :"+w.getTitle());
		w.switchTo().window(Childwindowid);
		System.out.println("Child Window Tittle :"+w.getTitle());
		Thread.sleep(2000);
	    w.quit();
		
	}

}
