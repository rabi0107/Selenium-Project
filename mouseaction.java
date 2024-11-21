package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class mouseaction {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Automation Program Important Drivers\\Drivers\\Geckodrivers\\geckodriver.exe");
		WebDriver w =new FirefoxDriver();
		// right click operation
		w.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement button =w.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions act =new Actions(w);
		act.contextClick(button).perform();
		
		// Double click
		/*w.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement button1 =w.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
		Actions act =new Actions(w);
		act.doubleClick(button1).perform();
		Thread.sleep(2000);
		w.switchTo().alert().accept(); // Alert option*/
		
		//Drag and Drop
		
		/*w.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement s1=w.findElement(By.id("box6")); //source element
		WebElement t1 =w.findElement(By.id("box106")); // Target element
		
		Actions act =new Actions(w);
		act.dragAndDrop(s1, t1).perform();
		Thread.sleep(2000);
		WebElement s2=w.findElement(By.id("box4"));
		WebElement t2 =w.findElement(By.id("box103"));
		act.dragAndDrop(s2, t2).perform();*/
		
		// Mouse Hover
		
		w.get("https://www.opencart.com/");
		WebElement resource =w.findElement(By.xpath("//header/nav[1]/div[1]/div[2]/ul[1]/li[6]/a[1]")); //main menu
		WebElement contactus= w.findElement(By.xpath("//body[1]/header[1]/nav[1]/div[1]/div[2]/ul[1]/li[6]/ul[1]/li[2]/a[1]")); //subelement of menu
		Actions act =new Actions(w);
		act.moveToElement(resource).moveToElement(contactus).click().perform();
		
		
		
		
		

	}

}
