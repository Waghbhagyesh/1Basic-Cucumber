package org.applicationHook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;

public class Hooks {
	public static WebDriver driver;
@Before
	public void hook() {
		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
	}
	
}
