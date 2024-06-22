package test.pack.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMsgDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://demo.guru99.com/v4/");
		
		WebElement we = wd.findElement(By.xpath("//input[@name='uid']"));
		we.click();
		we.sendKeys("juned");
		we.clear();
		we.click();
		
		WebElement msgWe = wd.findElement(By.xpath("//label[@id='message23']"));
		String msg = msgWe.getText();
		System.out.println(msg);
		
		
		
		WebElement we1 = wd.findElement(By.xpath("//input[@name='password']"));
		we1.click();
		we1.sendKeys("juned");
		we1.clear();
		we1.click();
		
		WebElement passWe = wd.findElement(By.xpath("//label[@id='message18']"));
		String passMsg = passWe.getText();
		System.out.println(passMsg);
	}

}
