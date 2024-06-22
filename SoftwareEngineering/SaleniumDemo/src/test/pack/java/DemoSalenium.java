package test.pack.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSalenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new ChromeDriver();
		
//		wd.navigate().to("https://demo.guru99.com/v4/");
//		wd.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr575552");
//		wd.findElement(By.xpath("//input[@name='password']")).sendKeys("hYremyr");
//		wd.findElement(By.xpath("//input[@name='btnLogin']")).click();
//		wd.findElement(By.xpath("//a[normalize-space()='here']")).click();
		
		wd.navigate().to("https://demo.guru99.com/v4/");
		wd.findElement(By.name("uid")).sendKeys("mngr575552");
		wd.findElement(By.name("password")).sendKeys("hYremyr");
		wd.findElement(By.name("btnLogin")).click();
		
//		wd.navigate().to("https://demo.guru99.com/");
//		wd.findElement(By.xpath("//input[@name='emailid']")).sendKeys("jugisoff@gmail.com");
//		wd.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
	}

}
