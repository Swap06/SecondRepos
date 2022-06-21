package Testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	WebDriver driver;

	public  void Start1 () {
		System.setProperty("webdriver.chrome.driver","E:\\java.Workspace\\facebook\\Driver\\chromedriver.exe" );
		driver=new ChromeDriver();

	}
	public WebDriver Start2(String a) {
		if(a.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","E:\\java.Workspace\\facebook\\Driver\\chromedriver.exe" );
				return driver= new ChromeDriver();
		
		
		
	}
		else if (a.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver","E:\\java.Workspace\\facebook\\Driver\\geckodriver.exe" );
			return driver= new FirefoxDriver();
	
			
		}
		return driver;
		

}
}
