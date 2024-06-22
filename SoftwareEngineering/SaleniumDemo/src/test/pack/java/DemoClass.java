package test.pack.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoClass {
	public static void main(String[] args) {
		WebDriver wd1 = new FirefoxDriver();
//		WebDriver wd2 = new ChromeDriver();
		
		//maximize the Web Page
		wd1.manage().window().maximize();
	
		//open two website into one Browser
//		wd1.get("https://www.zomato.com/mumbai");
		//wd2.get("https://github.com/");
		wd1.navigate().to("https://github.com/");
		wd1.navigate().to("https://in.linkedin.com/in/prasad-deshpande-98361067");
		//minimize the web page
//		wd2.manage().window().minimize();
		
		//how to get title of any web page
//		String title1 = wd1.getTitle();
//		String title2 = wd1.getTitle();
//		if( title1.equals(title2)) {
//			System.out.println(" both titles are same ");
//		} 
//		else
//			System.out.println("Comparing both titles different ");
//		
//		System.out.println( wd2.getTitle());
//		System.out.println( wd1.getCurrentUrl());
//		System.out.println( wd1.getPageSource());
//		System.out.println( wd1.getWindowHandle());
	}
}