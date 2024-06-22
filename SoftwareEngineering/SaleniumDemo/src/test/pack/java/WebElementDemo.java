package test.pack.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://demo.guru99.com/v4/");
		
		WebElement we = wd.findElement(By.xpath("//input[@name='uid']"));
		we.click();
		
		we.sendKeys("juned");
		Thread.sleep(8000);
		we.clear();
	
		we.sendKeys("bhagyaaa");
		
		String str = we.getAttribute("value");
		System.out.println(str);

	}

}
