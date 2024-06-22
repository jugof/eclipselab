package test.pack.ng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Demo1 {
	
	//WebDriver wd;
	//= new FirefoxDriver();
  @Test
  public void Login() 
  {
	  //System.out.println("I'm in Login");
	
	//wd.get("https://demo.automationtesting.in/Register.html");
	//wd.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Bhagyashri");
	//wd.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Barhate");

  }
  
  //add one
//  @Test
//  public void Register() 
//  {
//	  System.out.println("I'm in Register");
//  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("I'm in beforeMethod");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("I'm in afterMethod");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("I'm in beforeClass");
  }

  @AfterClass
  public void afterClass()
  {
	  System.out.println("I'm in afterClass");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("I'm in beforeTest");
	//WebDriver wd = new FirefoxDriver();
		
		//wd.get("https://demo.automationtesting.in/Register.html");
		
		//wd.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Junedd");
		//wd.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Aslam");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("I'm in afterTest");
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("I'm in beforeSuite");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("I'm in afterSuite");
  }

}
