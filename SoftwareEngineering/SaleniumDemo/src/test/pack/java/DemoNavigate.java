package test.pack.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoNavigate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver wd1 = new ChromeDriver();
		
		wd1.get("https://github.com/");
		wd1.navigate().to("https://in.linkedin.com/in/prasad-deshpande-98361067");
		Thread.sleep(5000);
		wd1.navigate().back();
		wd1.close();
	}

}
