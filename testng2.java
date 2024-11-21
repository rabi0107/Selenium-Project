package Selenium_Practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class testng2 
{
  @Test
  public void f()
  {
	  System.out.println("f");
  }
  @BeforeMethod
  public void beforeMethod1() 
  {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("After Method");
  }

  @BeforeClass
  public void beforeClass1()
  {
	  System.out.println("bc");
	  
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("after class");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("before test");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("after test");
  }

  @BeforeSuite
  public void beforeSuite()
  {
	  System.out.println("before suite");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("after suite");
  }

}
