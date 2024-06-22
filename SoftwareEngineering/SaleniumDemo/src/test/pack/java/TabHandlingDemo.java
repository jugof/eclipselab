package test.pack.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabHandlingDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd = new ChromeDriver();
		
		String parWin = wd.getWindowHandle();
		wd.get("https://www.codehelp.in/");
		wd.switchTo().newWindow(WindowType.TAB);
		
		String childWin = wd.getWindowHandle();
		wd.get("https://www.spacex.com/");
		
		wd.switchTo().window(parWin);
		
		//WebElement we = wd.findElement(By.xpath("//input[@name='uid']"));
		
	}

}
