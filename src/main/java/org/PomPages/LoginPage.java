package org.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public WebDriver driver;

	@FindBy (id="username")
	private WebElement UField;
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement PSW;
	@FindBy (id="loginButton")
	private WebElement LoginBt;
	
	public LoginPage(WebDriver driver){
		 PageFactory.initElements(driver,this);
		  this.driver=driver;
	}

	public void Ufield_displayed() {
		UField.isDisplayed();
	}
	public void Ufield_Cred() {
		UField.sendKeys("admin");
	}
	
	public void Pfield_cred() {
		PSW.sendKeys("manager");
	}
	public void Click() {
		LoginBt.click();
	}
}
