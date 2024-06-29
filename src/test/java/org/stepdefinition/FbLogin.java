package org.stepdefinition;

import org.base.BaseClass1;
import org.pojo.Pojoclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbLogin extends BaseClass1
{
	Pojoclass f;
	

	@Given("To validate login the chrome browser and maximize windows.")
	public void to_validate_login_the_chrome_browser_and_maximize_windows() 
	{
	 lauchBrowser();
	  windowMaximize();
	 
	}

	@When("To launch the URL of the facebook application")
	public void to_launch_the_URL_of_the_facebook_application()
	{
	    launchUrl("https://www.facebook.com/");

	  	}
    
		
	@When("To pass valid username in the email field")
	public void to_pass_valid_username_in_the_email_field() 
	{
		f=new Pojoclass();
	    passText("seeellie", f.getEmail());
	}

	@When("To pass valid password in the password field")
	public void to_pass_valid_password_in_the_password_field()
	{
		f=new Pojoclass();

		passText("dddjjj",f.getPassword());

	}	

	@When("To click the login button")
	public void to_click_the_login_button()
	{
		f=new Pojoclass();

		clickBtn(f.getLoginbtn());

	}

	@When("To click whether navigate to the home page or not")
	public void to_click_whether_navigate_to_the_home_page_or_not()
	{
      System.out.println("To check your credentials");
                 }

	@Then("To close the browser")
	public void to_close_the_browser()
	{
        closeEntireBrowser();
	}


}
