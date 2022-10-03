package org.stepdef;

import org.PomPages.LoginPage;
import org.applicationHook.Hooks;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	static WebDriver driver;
	LoginPage lp_obj=new LoginPage(Hooks.driver);
	
		@Given("User is on login page")
		public void user_is_on_login_page(){
		  	
		}
		@Then("user name field should be display")
		public void user_name_field_should_be_display() {
		lp_obj.Ufield_displayed();   
		}
		
		@When("user enters valid credential")
		public void user_enters_valid_credential() {
		    lp_obj.Ufield_Cred();
		    lp_obj.Pfield_cred();
		}
		@When("user click on login button")
		public void user_click_on_login_button() {
		 lp_obj.Click();   
		}
		@Then("user should navigate to home page")
		public void user_should_navigate_to_home_page() {
		    
		}








}




