package Testclass;

import org.login.POM.Login;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_02 extends BaseClass{
	WebDriver driver;
	Login log;
	@BeforeTest
	@Parameters("Browser")
	public void Bro(String browser) {
		System.out.println("value of browser=" + browser);
		driver= Start2(browser);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	
	}
	
	@BeforeClass
	public void object() {
		Login log=new Login(driver);
	}
	@Test
	public void Signin() throws InterruptedException {
		System.out.println("before method user sign in");
	    Thread.sleep(3000);
		log.sendusername();
		Thread.sleep(3000);
		log.sendpaas();
		Thread.sleep(3000);
		log.clicklogin();
	}
	
}
