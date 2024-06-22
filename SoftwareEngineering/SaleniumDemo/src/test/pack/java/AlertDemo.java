package test.pack.java;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new ChromeDriver();
		
		wd.navigate().to("https://demo.guru99.com/v4/");
		wd.findElement(By.name("uid")).sendKeys("mngr575");
		wd.findElement(By.name("password")).sendKeys("huyh");
		wd.findElement(By.name("btnLogin")).click();
		
		Alert aalu = wd.switchTo().alert();
		aalu.accept();
		aalu.getText();
	}
}
