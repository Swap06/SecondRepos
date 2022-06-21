package org.login.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(xpath="//*[@id=\"email\"]")
	private WebElement username;
	@FindBy(xpath="//*[@id=\"pass\"]")
	private WebElement password;
	@FindBy(xpath="//*[@id=\"u_0_d_3E\"]")
	private WebElement login;
	@FindBy(xpath="//*[@id=\"u_0_2_o2\"]")
	private WebElement createacc;
	
	public void sendusername() {
		username.sendKeys("9545160728");
	}
	public void sendpaas() {
		password.sendKeys("bng@123");
	}
	public void clicklogin() {
		login.click();
	}
	public void acc() {
		 createacc.click();
	}
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	

}

