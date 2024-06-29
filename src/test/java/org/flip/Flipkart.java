package org.flip;

import org.base.BaseClass1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Flipkart extends BaseClass1
{

	@Given("To validate login the firefox browser and maximize windows.")
	public void to_validate_login_the_firefox_browser_and_maximize_windows()
    {
	   lauchBrowser();
	   windowMaximize();
    }
	@When("To launch the URL of the flipkart application")
	public void to_launch_the_URL_of_the_flipkart_application()
	{
	   launchUrl("https://www.flipkart.com/");
	}

	@When("To pass valid phonenumber in the field")
	public void to_pass_valid_phonenumber_in_the_field()
	{
		WebElement loginbtn = driver.findElement(By.xpath("//a[text()='Login']"));
	    loginbtn.click();
	    WebElement phonenum = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	    passText("8489280515", phonenum);
	}

	@When("To click the otp button")
	public void to_click_the_otp_button()
	{
	  WebElement otpbtn = driver.findElement(By.xpath("//button[text()='Request OTP']"));
	  otpbtn.click();
	 
	  		
	}
	@Then("To close the browser")
	public void to_close_the_browser() {
	    closeEntireBrowser();
	}



}
