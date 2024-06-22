package test.pack.ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Demo2 {
  @Test
  public void f() 
  {
	  
	    System.out.println("HHHHiiiiiiiiiii");
	    
	    
	  	WebDriver wd = new FirefoxDriver();
		
		wd.get("https://demo.automationtesting.in/Register.html");
		
		wd.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Junedd");
		wd.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Aslam");
				
		WebElement we = wd.findElement(By.xpath("//input[@value='Male']"));
		we.click();
		
		WebElement wb = wd.findElement(By.xpath("//input[@id='checkbox1']"));
		wb.click();
		
//		wd.findElement(By.xpath("//div[@id='msdd']")).click();
//		wd.findElement(By.xpath("//a[normalize-space()='Japanese']")).click();

		Select se = new Select(wd.findElement(By.xpath("//select[@id='Skills']")));
		se.selectByVisibleText("C++");

  }
}
