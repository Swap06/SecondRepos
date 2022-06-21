package Testclass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class TC_01 extends BaseClass{
	WebDriver driver;
	
	@BeforeTest
	@Parameters("Browser")
	public void Bro(String browser) {
		System.out.println("value of browser=" + browser);
		driver= Start2(browser);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	public void Checkurl() {
		String a=driver.getCurrentUrl();
		System.out.println(a);
	}
	
	

}
